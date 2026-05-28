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

      <div class="icon-auth">
        <img src="../../assets/ICONS/icons-azul/icon-cadeado-fechado-azul.svg">
      </div>
    </div>

    <h1>Esqueceu a senha?</h1>
    <p class="subtitulo">Digite seu e-mail para receber as instruções.</p>

    <form @submit.prevent="enviar">

      <div class="grupo-input">
        <input v-model="email" type="email" placeholder="Digite seu e-mail" required>
      </div>

      <router-link to="/codigo">
        <button type="submit" class="botao-enviar" :disabled="carregando">
          {{ carregando ? 'Aguarde...' : 'Receber Código' }}
        </button>
      </router-link>

      <p v-if="mensagemErro" class="mensagemErro">{{ mensagemErro }}</p>

    </form>

  </div>
</template>

<script>
//import { enviarFomEmail } from '../../services/forms/formRecuperacao.js';

export default {
  data() {
    return {
      email: '',

      mensagemErro: '',
      carregando: false,

      logo: new URL('../../assets/IMAGES/logo-redamais.png', import.meta.url).href
    }
  },
  methods: {
    enviar() {
      //  enviarFomEmail(this);
    }
  }
}

import "../../assets/css/variaveis.css";

</script>

<style scoped>
.painel-principal {
  width: 100%;
  max-width: 450px;
  padding: 40px 20px;
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: #ffffff;
  border-radius: 20px;
  box-shadow: 0 10px 40px rgba(0, 0, 0, 0.1);
  animation: aparecerCima 0.8s ease;
  margin: 20px auto;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.area-logo {
  width: 150px;
  margin-bottom: 40px;
}

.area-logo img {
  width: 100%;
  height: auto;
  object-fit: contain;
  display: block;
}

.barra-progresso {
  display: flex;
  gap: 6px;
  margin-bottom: 50px;
}

.etapa {
  width: 45px;
  height: 6px;
  border-radius: 4px;
  border: 1px solid var(--borda-clara);
  background-color: transparent;
}

.etapa.ativa {
  background-color: var(--indigo);
  border-color: var(--indigo);
}

.caixa-icone {
  width: 70px;
  height: 70px;
  background-color: var(--indigo-bg);
  border-radius: 16px;
  display: flex;
  justify-content: center;
  align-items: center;
  margin-bottom: 20px;
}

.caixa-icone i {
  font-size: 28px;
  color: var(--indigo);
}

.caixa-icone .fa-key {
  transform: rotate(-45deg);
}

h1 {
  font-size: 20px;
  color: var(--texto);
  margin-bottom: 8px;
  font-weight: 700;
}

.subtitulo {
  font-size: 13px;
  color: var(--laranjaPadrao);
  margin-bottom: 40px;
  text-align: center;
}

form {
  width: 100%;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.grupo-input {
  width: 100%;
  max-width: 300px;
  margin-bottom: 25px;
}

input[type="email"],
input[type="password"] {
  width: 100%;
  border: none;
  border-bottom: 2px solid #aaa;
  padding: 10px 0;
  font-size: 14px;
  color: var(--texto);
  outline: none;
  transition: border-bottom-color 0.3s ease;
  background: transparent;
}

input[type="email"]:focus,
input[type="password"]:focus {
  border-bottom-color: var(--indigo);
}

input::placeholder {
  color: #b0b0b0;
}

.inputs-codigo {
  display: flex;
  gap: 15px;
  margin-bottom: 40px;
}

.inputs-codigo input {
  width: 65px;
  height: 65px;
  font-size: 24px;
  text-align: center;
  border: 2px solid var(--borda-clara);
  border-radius: 12px;
  outline: none;
  color: var(--texto);
  transition: border-color 0.3s, box-shadow 0.2s;
}

.inputs-codigo input:focus,
.inputs-codigo input.preenchido {
  border-color: var(--laranjaPadrao);
  box-shadow: 0 4px 12px rgba(255, 115, 0, 0.1);
}

.botao-enviar {
  width: 100%;
  max-width: 300px;
  background-color: var(--laranjaPadrao);
  color: white;
  border: none;
  padding: 14px;
  border-radius: var(--radius-pequeno);
  font-size: 14px;
  font-weight: 600;
  cursor: pointer;
  transition: background-color 0.2s;
  margin-top: 15px;
}

.botao-enviar:hover {
  background-color: var(--laranjaEscuro);
}

.icon-auth{
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>