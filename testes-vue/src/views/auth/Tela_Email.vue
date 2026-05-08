<template>
  <div class="painel-principal">

    <div class="area-logo">
      <img :src="logo" alt="Logo Reda+">
    </div>

    <div class="barra-progresso">
      <div class="etapa ativa"></div>
      <div class="etapa"></div>
      <div class="etapa"></div>
    </div>

    <div class="caixa-icone">
      <i class="fas fa-lock"></i>
    </div>

    <h1>Esqueceu a senha?</h1>
    <p class="subtitulo">Digite seu e-mail para receber as instruções.</p>

    <form @submit.prevent="enviar">

      <div class="grupo-input">
        <input v-model="email" type="email" placeholder="Digite seu e-mail" required>
      </div>

      <button type="submit" class="botao-enviar" :disabled="carregando">
        {{ carregando ? 'Aguarde...' : 'Receber Código'  }}
      </button>

      <p v-if="mensagemErro" class="mensagemErro">{{ mensagemErro }}</p>

    </form>

  </div>
</template>

<script>
//import { enviarFomEmail } from '../../services/forms/formRecuperacao.js';

export default {
  data() {
    return {
      email:'',

      mensagemErro: '',
      carregando: false,
      
      logo: new URL('@/assets/IMAGES/logo-redamais.png', import.meta.url).href
    }
  },
  methods: {
    enviar(){
    //  enviarFomEmail(this);
    }
  }
}
</script>

<style scoped>
@import "../../assets/css/recuperar.css";

</style>