<script>
import Header from "../components/Header.vue"
import Footer from "../components/Footer.vue"
import Chatbot from "../components/Chatbot.vue"
import "../assets/css/variaveis.css"

export default {
  components: {
    Header,
    Footer,
    Chatbot
  }
}
</script>

<template>
  <Header />

  <div class="conteudo-config">
    <div class="config-container">

      <h3>Informações do Seu Perfil</h3>

      <section class="info-conta">

        <div class="profile-edt">
          <img src="../assets/IMAGES/foto-perfil-temporaria.png" />
          <button>Ver Foto</button>
          <button>Mudar Foto</button>
        </div>

        <main class="config-box">

          <div class="titulo">
            <h4>Seus dados</h4>
          </div>

          <div class="setting-box">
            <p>Nome: {usuario}</p>
            <div class="change-box">
              <input type="text" placeholder="Alterar o nome de usuario" />
              <button>Mudar Nome</button>
            </div>
          </div>

          <div class="setting-box">
            <p>Email: {email}</p>
            <div class="change-box">
              <input type="text" placeholder="Alterar o email do usuario" />
              <button>Mudar Email</button>
            </div>
          </div>

          <div class="titulo">
            <h4>Mudar Senha</h4>
          </div>

          <div class="password-box">
            <p>Digite sua senha atual</p>
            <div class="password-config">
              <input type="text" placeholder="Senha Atual" />
            </div>
          </div>

          <div class="password-box">
            <p>Digite sua nova senha</p>
            <div class="password-config">
              <input type="text" placeholder="Nova Senha" />
            </div>
          </div>

          <div class="password-box">
            <p>Confirme sua senha</p>
            <div class="password-config">
              <input type="text" placeholder="Confirmar Senha" />
              <button>Salvar</button>
            </div>
          </div>

        </main>
      </section>

      <section></section>

    </div>
  </div>

  <Chatbot />
  <Footer />
</template>

<style>
.conteudo-config {
  width: 100%;
  height: 100vh;
  background-color: rgb(189, 219, 219);
  display: flex;
  justify-content: center;
  align-items: center;
}

.config-container {
  padding: 2%;
  width: 80%;

  background-color: #fff;
  border-radius: var(--radius-medio);
}

.info-conta {
  display: flex;
}

.config-container h3 {
  margin-bottom: 30px;
}

.profile-edt {
  padding: 10px;
  display: flex;
  justify-content: center;
  align-items: center;
  flex-direction: column;
  width: 30%;
  background-color: var(--branco2);
  border-radius: var(--radius-medio);
  border: 1px solid var(--cinza-claro);
}

.profile-edt img {
  max-width: 100px;
  width: 100%;
  height: 100px;
  border-radius: 50%;
  border: 1px solid var(--texto-sec);
  margin-bottom: 40%;
}

.profile-edt button {
  margin-top: 10px;
  width: 100%;
  padding: 10px;
  background: var(--laranja-btn);
  border: none;
  border-radius: var(--radius-pequeno);
  color: var(--brancoPadrao);
  font-weight: 700;
  cursor: pointer;
  transition: var(--trans);
}

.profile-edt button:hover,
.setting-box button:hover,
.password-config button:hover {
  background: var(--laranja-btn-hover);
  box-shadow: var(--shadowPadrao);
  text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
}

.config-box {
  display: flex;
  flex-direction: column;
  width: 100%;
}

.titulo h4 {
  margin-left: 2%;
  font-size: 20px;
  margin-top: 3%;
}

.setting-box,
.password-box {
  margin-left: 2%;
  background-color: var(--branco2);
  padding: 6px;
  border: 1px solid var(--cinza-claro);
  border-radius: var(--radius-pequeno);
  margin-top: 15px;
}

.setting-box p,
.password-box p {
  margin-left: 4px;
}

.change-box,
.password-config {
  display: flex;
  gap: 10px;
}

.change-box input,
.password-config input {
  padding-left: 10px;
  width: 80%;
  background: var(--brancoPadrao);
  border: 1px solid var(--cinza-claro);
  border-radius: var(--radius-pequeno);
}

.change-box button,
.password-config button {
  margin-left: auto;
  width: 100px;
  
  background: var(--laranja-btn);
  border: none;
  border-radius: var(--radius-pequeno);
  color: var(--brancoPadrao);
  font-weight: 500;
  cursor: pointer;
  transition: var(--trans);
  margin-right: 10px;
}
</style>