<template>
  <div class="painel-principal">

    <div class="area-logo">
      <img :src="logo" alt="Logo Reda+">
    </div>

    <div class="barra-progresso">
      <div class="etapa ativa"></div>
      <div class="etapa ativa"></div>
      <div class="etapa ativa"></div>
    </div>

    <div class="caixa-icone">
      <i class="fas fa-lock"></i>
    </div>

    <h1>Digite sua Nova Senha</h1>

    <form @submit.prevent="validarNovaSenha">

      <div class="grupo-input">
        <input :type="mostrar1 ? 'text' : 'password'" v-model="novaSenha" placeholder="Nova senha"
          :class="{ preenchido: novaSenha }">
      </div>

      <div class="grupo-input">
        <input :type="mostrar2 ? 'text' : 'password'" v-model="confirmarSenha" placeholder="Repetir nova senha"
          :class="{ preenchido: confirmarSenha }">

      </div>
      
      <p v-if="mensagemErro" class="mensagemErro">{{ mensagemErro }}</p>

      <button type="submit" class="botao-enviar" :disabled="carregando">
        {{carregando? 'Aguarde...' : 'Confirmar Nova Senha'}}
      </button>

    </form>

  </div>
</template>

<script>
//import { novaSenhaForm } from '../../services/forms/formRecuperacao.js';

export default {
  data() {
    return {
      novaSenha: '',
      confirmarSenha: '',
      token: '',

      mensagemErro: '',
      carregando: false,

      mostrar1: false,
      mostrar2: false,

      logo: new URL('@/assets/IMAGES/logo-redamais.png', import.meta.url).href
    }
  },
  /*
  mounted() {
    this.token = localStorage.getItem('tokenRedefinicao');
    if (!this.token) {
      alert("Token de recuperação não encontrado.");
      this.$router.push('/recuperar')
    }
  },
  */
  methods: {
    validarNovaSenha(){
      //novaSenhaForm(this);
    }
  }
}
</script>

<style scoped>
@import "../../assets/css/recuperar.css";

</style>