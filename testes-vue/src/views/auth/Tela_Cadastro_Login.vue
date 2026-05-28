<template>
  <div class="cadastro-app">

    <div class="painel-principal">

      <div class="lado-esquerdo">
        <router-link to="/" style="text-decoration: none;">
          <div class="btn-voltar-login">
            <img src="../../assets/ICONS/icons-laranja/icon-voltar-laranja.svg"><p>Voltar</p>
          </div>
        </router-link>
        <header class="cabecalho">
          <nav class="links-navegacao">
            <router-link to="/login" :class="{ ativo: modo == 'login' }">Entrar</router-link>
            <router-link to="/cadastro" :class="{ ativo: modo == 'cadastro' }">Cadastrar</router-link>
          </nav>
        </header>

        <div class="conteudo">

          <div class="titulo">
            <h1>{{ modo === 'cadastro' ? 'Crie sua conta' : 'Bem-vindo de volta' }}</h1>
            <p v-if="modo === 'cadastro'">
              Registre-se e acompanhe sua evolução na redação.
            </p>
            <p v-else>
              Entre com a sua conta no Reda+.
            </p>
          </div>

          <div class="formulario" id="area-formulario">

            <form id="formulario" @submit.prevent="enviar">

              <div class="linha" v-if="modo === 'cadastro'">
                <input type="text" v-model="form.nome" placeholder="Nome" required>
                <input type="text" v-model="form.sobrenome" placeholder="Sobrenome" required>
              </div>

              <input type="email" v-model="form.email" placeholder="E-mail" required>

              <div class="linha">
                <input type="password" v-model="form.senha" ref="senha" placeholder="Senha" required>
                <button type="button" @click="mostrarSenha('senha')">👁</button>
              </div>

              <div v-if="modo == 'login'" class="esqueceu-senha">
                <router-link to="/recuperar" class="forgot-password">
                  Esqueci minha senha
                </router-link>
              </div>

              <div class="linha" v-if="modo === 'cadastro'">
                <input type="password" v-model="form.confirmarSenha" ref="confirmarSenha" placeholder="Repetir senha"
                  required>
                <button type="button" @click="mostrarSenha('confirmarSenha')">👁</button>
              </div>

              <p v-if="mensagemErro" class="mensagemErro">{{ mensagemErro }}</p>

              <div class="botoes">
                <button type="submit" :disabled="carregando">
                  {{ carregando ? 'Aguarde...' : modo === 'cadastro' ? 'Cadastrar' : 'Entrar' }}
                </button>
                <p>ou</p>
                <button type="button" id="botao-google" @click="loginGoogle">
                  <img src="https://fonts.gstatic.com/s/i/productlogos/googleg/v6/24px.svg" alt="Google">
                  {{ modo === 'cadastro' ? 'Cadastrar-se com Google' : 'Entrar com Google' }}
                </button>
              </div>
            </form>
          </div>
        </div>
      </div>

      <div class="lado-direito">

        <div class="imagem-destaque">
          <img :src="logoUrl" alt="">
        </div>

        <div class="texto-informativo">
          <h2>Treine hoje. Conquiste a nota 1000 amanhã.</h2>
          <p>Faça parte da nossa comunidade.</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>


export default {
  //import { enviarForm } from '../../services/forms/form.js'
  //exporta o props com o modo padrão cadastro
  props: {
    modo: {
      type: String,
      default: 'cadastro'
    }
  },
  data() {
    return {
      form: {
        nome: '',
        sobrenome: '',
        email: '',
        senha: '',
        confirmarSenha: ''
      },
      mensagemErro: '',
      carregando: false,

      logoUrl: new URL("../../assets/IMAGES/logo-redamais.png", import.meta.url).href
    }
  },
  methods: {
    mostrarSenha(refNome) {
      const input = this.$refs[refNome]
      input.type = input.type === "password" ? "text" : "password"
    },/*
         enviar() {
            enviarForm(this)// this aqui são os dados do data()
        },
        loginGoogle() {
            window.location.href = "http://localhost:3000/auth/google";
        }*/
  }
}

</script>

<style scoped>
*,
*::before,
*::after {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.cadastro-app {
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  width: 100%;
  background: #ffffff;
  font-family: "Inter", sans-serif;
}

@keyframes aparecerCima {
  from {
    opacity: 0;
    transform: translateY(20px);
  }

  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@keyframes aparecerCimaGrande {
  from {
    opacity: 0;
    transform: translateY(20px);
  }

  to {
    opacity: 1;
    transform: translateY(0);
  }
}

@keyframes animarForm {
  from {
    opacity: 0;
    transform: translateY(25px);
  }

  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.painel-principal {
  width: 90%;
  max-width: 1000px;
  min-height: 650px;
  background: white;
  display: flex;
  border-radius: var(--radius-grande);
  overflow: hidden;
  box-shadow: 0 10px 40px rgba(0, 0, 0, 0.12);
  padding: 8px;
  box-sizing: border-box;
}

.lado-esquerdo {
  width: 58%;
  padding: 40px 80px;
  display: flex;
  flex-direction: column;
  animation: aparecerCimaGrande 0.6s ease;
  min-width: 0;
  box-sizing: border-box;
}

.cabecalho {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 24px;
  padding: 32px;
}

.logotipo {
  display: flex;
  justify-content: center;
  align-items: center;
  max-width: 130px;
  margin: 0 auto;
}

.logotipo img,
.imagem-destaque img {
  width: 100%;
  height: auto;
  object-fit: contain;
  display: block;
}

.links-navegacao {
  display: flex;
  gap: 30px;
  font-size: 17px;
}

.links-navegacao a {
  position: relative;
  text-decoration: none;
  color: var(--texto);
  font-weight: 600;
  cursor: pointer;
  padding-bottom: 6px;
  transition: color 0.2s;
  white-space: nowrap;
}

.links-navegacao a::after {
  content: "";
  position: absolute;
  left: 50%;
  bottom: 0;
  width: 0;
  height: 2px;
  background: var(--azul);
  transform: translateX(-50%);
  transition: width 0.2s;
}

.links-navegacao a:hover,
.links-navegacao a.ativo {
  color: var(--azul);
}

.links-navegacao a:hover::after,
.links-navegacao a.ativo::after {
  width: 100%;
}

.conteudo {
  display: flex;
  flex-direction: column;
  gap: 20px;
  flex: 1;
  justify-content: center;
}

.titulo h1 {
  font-size: 26px;
  font-weight: 700;
  margin: 0 0 4px;
}

.titulo p {
  color: var(--texto-sec);
  font-size: 14px;
  margin: 0;
}

.formulario {
  margin-top: 8px;
}

.formulario input {
  width: 100%;
  padding: 12px;
  border: 1px solid var(--borda);
  border-radius: var(--radius-pequeno);
  margin-top: 10px;
  font-family: inherit;
  font-size: 14px;
  transition: 0.2s;
  box-sizing: border-box;
}

.formulario input:focus {
  outline: none;
  border-color: var(--laranja);
  box-shadow: 0 0 8px rgba(255, 140, 66, 0.35);
  transform: scale(1.01);
}

.linha {
  display: flex;
  gap: 10px;
  align-items: center;
}

.linha input {
  flex: 1;
  min-width: 0;
}

.linha button {
  padding: 12px;
  background: white;
  border: 1px solid var(--borda);
  border-radius: var(--radius-pequeno);
  cursor: pointer;
  margin-top: 10px;
}

.linha button:hover {
  background: #e8e8e8;
  transform: scale(1.05);
}

.linha button:active {
  transform: scale(0.95);
}

.esqueceu-senha {
  text-align: right;
  margin-top: 4px;
}

.esqueceu-senha a {
  font-size: 13px;
  color: var(--azul);
  text-decoration: none;
  transition: color 0.2s;
}

.esqueceu-senha a:hover {
  text-decoration: underline;
  color: var(--laranja);
}

.botoes {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 14px;
  margin-top: 24px;
  width: 100%;
}

.botoes button {
  width: 100%;
  padding: 14px;
  border: 1px solid var(--borda);
  border-radius: var(--radius-pequeno);
  background: var(--laranja);
  color: rgb(255, 94, 0);
  font-size: 15px;
  cursor: pointer;
  font-weight: 600;
  font-family: inherit;
  box-sizing: border-box;
  min-height: 48px;
  transition: 0.25s;
}

.botoes button:hover {
  background: var(--laranja-hover);
  transform: translateY(-2px);
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.13);
}

.botoes button:active {
  transform: translateY(0);
  box-shadow: none;
}

#botao-google {
  background: white;
  border: 1px solid var(--borda);
  color: var(--texto);
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 10px;
}

#botao-google img {
  width: 20px;
  height: 20px;
}

#botao-google:hover {
  background: var(--borda-clara);
  transform: translateY(-2px);
}

.lado-direito {
  width: 42%;
  background: linear-gradient(135deg, var(--azul), var(--azul-escuro));
  color: white;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  text-align: center;
  border-radius: var(--radius-grande);
  gap: 32px;
  position: relative;
  overflow: hidden;
}

.imagem-destaque {
  display: flex;
  justify-content: center;
  align-items: center;
  max-width: 200px;
  width: 100%;
  margin: 0;
}

.texto-informativo {
  display: flex;
  flex-direction: column;
  gap: 16px;
  max-width: 280px;
}

.texto-informativo h2 {
  font-size: 22px;
  font-weight: 700;
  line-height: 1.3;
}

.texto-informativo p {
  opacity: 0.88;
  font-size: 14px;
  line-height: 1.5;
}

.animar-formulario {
  animation: animarForm 0.35s ease;
}

.btn-voltar-login{
  width: fit-content;
  display: flex;
  align-items: center;
  transition: var(--delayCurto);
}

.btn-voltar-login p{
  color: var(--laranjaPadrao);
  text-decoration: none;
  font-size: 16px;

}

.btn-voltar-login img{
  margin-top: auto;
  width: 25px;
  height: 25px;
}

.btn-voltar-login:hover{
  padding-right: 10px;
  border-radius: var(--radius-grande);

  transform: translateX(-5px);
  text-shadow: var(--sombra-sm);
}




@media (max-width: 850px) {
  .painel-principal {
    flex-direction: column;
    height: auto;
    min-height: auto;
    width: 95%;
    margin: 20px auto;
  }

  .lado-esquerdo {
    width: 100%;
    padding: 30px 20px;
    order: 2;
  }

  .lado-direito {
    width: 100%;
    padding: 40px 20px;
    border-radius: 0;
    order: 1;
  }

  .imagem-destaque {
    max-width: 120px;
  }

  .texto-informativo h2 {
    font-size: 18px;
  }

  .links-navegacao {
    gap: 15px;
  }

  .linha {
    flex-direction: column;
    gap: 0;
  }
}
</style>
