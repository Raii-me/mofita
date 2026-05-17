<script>
import "../../assets/js/chatbot.js";
import "../../assets/css/variaveis.css";



export default {
  data() {
    return {
      fechado: false
    }
  },
  methods: {
    toggleMenuChatbot() {
      this.fechado = !this.fechado
    }
  }
}


</script>

<template>
  <div class="fixo-Chat">
    <div class="botao-fixo">
      <a href="#">
        <div class="chat-content" @click="toggleMenuChatbot">
          <img
            src="../../assets/ICONS/icons-azul/icon-conversa-chatbot-azul.svg"
            class="chat-icon"
          />
          <div class="chat-text">ChatBot</div>
        </div>
      </a>
    </div>

    <div class="fixar">
      <div class="box" :class="{ 'open-menu': fechado }">
        <div class="header">
          <img src="../../assets/ICONS/icons-outros/icon-perfil-chatbot.png" id="perfilChat" />

          <ul>
            <h3>Ajuda</h3>
            <p>Suporte</p>
          </ul>

          <div class="botaoFechar">
            <button type="button" id="fecharChat" @click="toggleMenuChatbot">
              Fechar
            </button>
          </div>
        </div>

        <div id="historic"></div>

        <p id="status"></p>

        <div class="footer_ChatBot">
          <input type="text" placeholder="Digite..." id="msg-input" />
          <button id="btn-submit" @click="sendMessage()">
            <img src="../../assets/ICONS/icons-azul/icon-enviar-azul.svg" class="chat-icon" />
          </button>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.fixo-Chat {
  position: fixed;
  right: 20px;
  bottom: 20px;
  z-index: 99999;
}

.botao-fixo a {
  text-decoration: none;
  transition: 0.08s;
}

.chat-content {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  border: 3px solid #d9d9d9;
  border-radius: 30px;
  padding: 10px;
  font-weight: 500;
  background-color: #fff;
  margin-right: 4px;
  box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 3px;
}

.chat-content :hover {
  color: #000;
  font-weight: 700;
}

.chat-text {
  color: #000;
}

/*mudei isso daq */
.botao-fixo {
  position: fixed;
  right: 10%;
  /*mudei isso daq */
  bottom: 10px;
  /*mudei isso daq */
}

/*mudei isso daq */
.chat-icon {
  margin-left: 4px; /*mudei isso daq */
  margin-right: 4px; /*mudei isso daq */
  width: 24px;
  height: 24px;
}

/*mudei isso daq */
.fixar {
  position: fixed;
  right: 10px;
  bottom: 5px;
  pointer-events: none;
  /*mudei isso daq */
  z-index: 9999;
}

/*mudei isso daq */

.box {
  z-index: 10; /*mudei isso daq */
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  width: 400px;
  height: 60px;
  margin-top: 3rem;
  border-radius: 10px;
  overflow: hidden;
  transition: 0.4s;
  text-align: center;
  color: black;
  position: relative; /* importante */
}

.box.open-menu {
  height: 60vh;
  max-height: 800px;
  box-shadow: var(--shadowPadrao);
  background: #fff;
}

.header {
  background: var(--branco);
  border-radius: 10px 10px 0 0;
  padding: 10px;
  display: flex;
  border-bottom: 2px solid rgb(164, 162, 162);
}

#perfilChat {
  width: 38px;
  height: 38px;
}

.header h3,
.header p {
  margin-left: 15px;
  text-align: start;
  color: #000;
}

.botaoFechar {
  display: flex;
  justify-content: center;
  align-items: center;
  margin-left: auto;
}

.botaoFechar button {
  width: 70px;
  height: 38px;
  background-color: #f44336c1;
  border: 3px solid #ff1100;
  border-radius: 8px;
  color: #fff;
  cursor: pointer;
  transition: 0.2s;
  box-shadow: var(--shadowPadrao);
}

.botaoFechar button:hover {
  transform: translateY(4px);
  background-color: #ff1500;
  color: black;
  font-weight: 700;
  box-shadow: var(--shadowPadrao);
}

.footer_ChatBot {
  border-top: 2px solid rgb(164, 162, 162);
  display: flex;
  background: var(--branco);
  padding: 1px;
  border-radius: 0 0 10px 10px;
}

.footer_ChatBot input {
  outline: none;
  width: 100%;
  font-size: 1rem;
  border: none;
  padding: 11px;
  background: var(--branco);
  border-radius: 10px;
}

#btn-submit {
  background-color: var(--branco);
  margin-left: auto;
  border-radius: 101px;
  font-size: 1rem;
  border: none;
  padding: 10px;
}

#btn-submit:hover {
  background-color: rgb(178, 178, 179);
  cursor: pointer;
}

#historic {
  overflow: auto;
  display: flex;
  flex-direction: column;
  gap: 1rem;
  height: 100%;
}

.box-my-message {
  justify-content: flex-end;
}

.box-response-message {
  justify-content: flex-start;
}

.my-message {
  background-color: var(--azulPadrao);
}

.chat-message {
  background-color: var(--laranjaPadrao);
}

.my-message,
.chat-message {
  margin: 5px;
  max-width: 300px;
  padding: 10px;
  color: aliceblue;
  text-align: start;
}

/* ANIMAÇÃO ABRIR */
.header,
#historic,
.footer_ChatBot,
#status {
  opacity: 0;
  pointer-events: none;
  transition: 0.3s;
}

.box.open-menu .header,
.box.open-menu #historic,
.box.open-menu .footer_ChatBot,
.box.open-menu #status {
  opacity: 1;
  pointer-events: auto;
}
</style>
