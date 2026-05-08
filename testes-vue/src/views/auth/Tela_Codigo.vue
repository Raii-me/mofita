<template>
  <div class="painel-principal">

    <div class="area-logo">
      <img :src="logo" alt="Logo Reda+">
    </div>

    <div class="barra-progresso">
      <div class="etapa ativa"></div>
      <div class="etapa ativa"></div>
      <div class="etapa"></div>
    </div>

    <div class="caixa-icone">
      <i class="fas fa-key"></i>
    </div>

    <h1>Digite o seu Código</h1>
    <p class="subtitulo">Insira o código recebido por e-mail</p>

    <form @submit.prevent="confirmarCodigo">
      <div class="inputs-codigo">

        <input
          v-for="(digito, index) in codigo"
          :key="index"
          ref="inputs"
          type="text"
          maxlength="1"
          inputmode="numeric"
          v-model="codigo[index]"
          @input="avancar(index)"
          @keydown.backspace="voltar(index)"
        />

      </div>

      <p v-if="mensagemErro" class="mensagemErro">{{ mensagemErro }}</p>
      
      <button type="submit" class="botao-enviar" :disabled="carregando">
        {{ carregando ? 'Validando...' : 'Confirmar' }}
      </button>
    </form>

  </div>
</template>

<script>
//import { verificarFormCodigo } from '../../services/forms/formRecuperacao.js';

export default {
  data() {
    return {
      codigo: ["", "", "", ""],
      email: '',

      carregando: false,
      mensagemErro: '', 
           
      logo: new URL('@/assets/IMAGES/logo-redamais.png', import.meta.url).href
    }
  },
  mounted() {
    /*this.email = sessionStorage.getItem('emailRecuperacao');

    if (!this.email) {
      alert("Sessão inválida. Comece novamente.")
      this.$router.push('/recuperar')
    }
    */
    this.$nextTick(() => {
      this.$refs.inputs[0]?.focus()
    })
  },
  methods: {
    avancar(index) {
      this.codigo[index] = this.codigo[index].replace(/\D/g, "")

      if (this.codigo[index] && index < this.codigo.length - 1) {
        this.$refs.inputs[index + 1].focus()
      }
    },
    voltar(index) {
      if (!this.codigo[index] && index > 0) {
        this.$refs.inputs[index - 1].focus()
      }
    },
    async confirmarCodigo(){
    //  await verificarFormCodigo(this);
    }
  }
}
</script>

<style scoped>
@import "../../assets/css/recuperar.css";


</style>