<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import Chatbot from "../components/Chatbot.vue";
import Grafico from "../components/Grafico.vue";
import Caixa_de_Acao from "../components/Caixa_de_Acao.vue";

/* importar coisa aq , essa é a base */

export default {
  components: {
    Header,
    Footer,
    Chatbot,
    Grafico,
    Caixa_de_Acao,
  },
};
</script>

<template>
  <Header />
  <Chatbot />

  <main>
    <section id="part-1" class="pagina-1">
      <div>
        <h1>Bem vindo, Usuario!!</h1>
        <p class="subTitulo">Plataforma de redação impulsionada por IA</p>
      </div>
      <div class="bloco-1">
        <Caixa_de_Acao />

        <div class="caixaDireita">
          <h3 class="titulo-Direita">Evolução</h3>

          <div class="Grafico-inicial">
            <Grafico />
          </div>
        </div>
      </div>
    </section>

    <section id="part-2" class="pagina-2">
      <div class="bloco-2">

        <div class="card-design">
          <div class="img-box">
            <img src="../assets/IMAGES/exemplo-biblioteca.png" alt="Redação" />
            <h2>Última Redação Feita</h2>
          </div>

          <div class="conteudo">
            <p>Desafios para a educação Inclusiva</p>

            <div class="informacaoCard">
              <span class="nota">920</span>
              <a class="link" href="#">Visualizar ↗</a>
            </div>
          </div>
        </div>

        <div class="card-design">
          <div class="img-box">
            <img src="../assets/IMAGES/exemplo-etarismo.png" alt="Redação" />
            <h2>Tema Quente</h2>
          </div>

          <div class="conteudo">
            <p>Desafios para o combate do Etarismo</p>

            <div class="informacaoCard">
              <span class="tag">ENEM</span>
              <button class="btn-Escrever">Escrever</button>
            </div>
          </div>
        </div>

        <div class="card-design">
          <div class="img-box">
            <img src="../assets/IMAGES/exemplo-Ambiente.png" alt="Redação" />
            <h2>Tema Quente</h2>
          </div>

          <div class="conteudo">
            <p>Os impactos do desmatamento</p>

            <div class="informacaoCard">
              <span class="tag">ENEM</span>
              <button class="btn-Escrever">Escrever</button>
            </div>
          </div>
        </div>

        <div class="card-design">
          <div class="img-box">
            <img src="../assets/IMAGES/exemplo-noticias.png" alt="Redação" />
            <h2>Tema Quente</h2>
          </div>

          <div class="conteudo">
            <p>Os perigos da desinformação digital nas Eleições</p>

            <div class="informacaoCard">
              <span class="tag">ENEM</span>
              <button class="btn-Escrever">Escrever</button>
            </div>
          </div>
        </div>

        <div class="card-design">
          <div class="img-box">
            <img src="../assets/IMAGES/exemplo-estudando.png" alt="Redação" />
            <h2>Tema Quente</h2>
          </div>

          <div class="conteudo">
            <p>Os desafios da valorização da educação no Brasil</p>

            <div class="informacaoCard">
              <span class="tag">ENEM</span>
              <button class="btn-Escrever">Escrever</button>
            </div>
          </div>
        </div>

        <div class="card-design">
          <div class="img-box">
            <img src="../assets/IMAGES/exemplo-mental.png" alt="Redação" />
            <h2>Tema Quente</h2>
          </div>

          <div class="conteudo">
            <p>A importância do cuidado com a saúde mental</p>

            <div class="informacaoCard">
              <span class="tag">ENEM</span>
              <button class="btn-Escrever">Escrever</button>
            </div>
          </div>
        </div>
      </div>
    </section>
  </main>
  <Footer />
</template>

<style scoped>
* {
  margin: 0px;
  padding: 0px;
  font-family: "Poppins", sans-serif;
  box-sizing: border-box;
}

main {
  scroll-behavior: smooth;
  overflow: auto;
  overflow-x: hidden;
  display: flex;
  flex-direction: column;
  background: var(--branco);
  min-height: 100vh;
  margin: 0;
}

.pagina-1 {
  flex: 1;
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  margin-bottom: 50px;
}

h1 {
  margin-top: 20px;
  margin-left: 40px;
}

.subTitulo {
  font-weight: 300;
  margin-left: 40px;
  margin-bottom: 40px;
}

.bloco-1 {
  flex: 1;
  display: flex;
  justify-self: flex-start;
  justify-content: center;
  width: 100%;
  gap: 10px;
  margin-left:50px;
  margin-right: 50px;
}

.caixaEsquerda {
  display: flex;
  justify-self: flex-start;
  flex: 2;
  flex-direction: column;
  text-align: center;
  max-width: 400px;
}

h2 {
  color: var(--laranjaPadrao);
  text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
}

.btn-Funcoes {
  display: grid;
  justify-content: center;
  list-style: none;
}

.btn-Funcoes button {
  width: 100%;
  height: 60px;
  margin-top: 20px;
  margin-bottom: 10px;
}


/*pra q serve isso??? - Rai*/
#botoesdeAcao {
  background-color: var(--laranjaPadrao);
  color: var(--branco);
  font-size: 20px;
  border: 2px solid var(--laranjaEscuro);
  border-radius: 10px;
  padding: 0 20px 0 20px;
  text-align: center;
  text-shadow: 3px 3px 10px rgba(0, 0, 0, 0.4);
  box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
  cursor: pointer;
  transition: var(--delayCurto);
}

#botoesdeAcao:hover {
  background-color: #0b22b6;
  border: 2px solid #3248d5;
  font-weight: 700;
}

.caixaDireita {
  display: flex;
  justify-self: flex-start;
  flex: 3;
  flex-direction: column;
  width: 100%;
  margin-right: 100px;
}

.titulo-Direita {
  font-size: 30px;
  font-weight: 600;
  margin-left: 5px;
}

.Grafico-inicial {
  width: 100%;
  height: 300px;
}

.Grafico-inicial canvas {
  width: 100% !important;
  height: 100% !important;
}

.pagina-2 {
  flex: 1;
  display: flex;
  flex-wrap: wrap;
  flex-direction: column;
  align-items: center;
  margin-top: 50px;
}

.bloco-2 {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 25px;
  padding: 30px;
  margin-bottom: 30px;
}

.card-design {
  background: var(--branco);
  border-radius: 16px;
  margin: 20px;
  overflow: hidden;
  box-shadow: 0 6px 5px rgba(0, 0, 0, 0.15);
  transition: var(--delayCurto);
}

.card-design:hover {
  transform: translateY(-10px);
  box-shadow: rgba(0, 0, 0, 0.25) 0 14px 28px, rgba(0, 0, 0, 0.22) 0 10px 10px;
}

.img-box {
  position: relative;
  height: 200px;
  width: 100%;
}

.img-box img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.img-box::after {
  content: "";
  z-index: 1;
  position: absolute;
  inset: 0;
  background: rgba(0, 0, 0, 0.45);
}

.img-box h2 {
  position: absolute;
  top: 15px;
  left: 15px;
  color: var(--branco);
  font-size: 20px;
  z-index: 2;
}

.conteudo {
  padding: 15px;
}

.conteudo p {
  margin-bottom: 15px;
  font-size: 16px;
}

.informacaoCard {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.nota {
  background: var(--branco);
  border: 2px solid #0000000e;
  padding: 8px 20px;
  border-radius: 10px;
  font-weight: bold;
}

.link {
  color: #88898a;
  transition: var(--delayCurto);
  margin: 0px 10px;
}

.link:hover {
  color: var(--azulForte);
  font-weight: 700;
}

.tag {
  background: var(--branco);
  border: 2px solid #0000000e;
  padding: 8px 20px;
  border-radius: 10px;
}

.btn-Escrever {
  background: var(--azulPadrao);
  color: white;
  border: none;
  padding: 10px 20px;
  border-radius: 10px;
  cursor: pointer;
  transition: var(--delayMedio);
  text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
}

.btn-Escrever:hover {
  background: var(--laranjaPadrao);
  border: 2px solid var(--laranjaEscuro);
  font-weight: 700;
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.15);
  text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
}

@media (max-width: 1024px) {
  .caixaDireita {
    margin-right: 30px;
  }

  .bloco-2 {
    grid-template-columns: repeat(2, 1fr);
    padding: 20px;
  }
}

@media (max-width: 768px) {
  h1,
  .subTitulo {
    margin-left: 20px;
    text-align: center;
  }

  .pagina-1 {
    align-items: center;
  }

  .bloco-1 {
    flex-direction: column;
    margin-left: 20px;
    margin-right: 20px;
    gap: 40px;
  }

  .caixaDireita {
    margin-right: 0;
    width: 100%;
    align-items: center;
  }

  .titulo-Direita {
    text-align: center;
    margin-bottom: 10px;
  }

  .Grafico-inicial {
    height: 250px;
  }

  .bloco-2 {
    grid-template-columns: 1fr;
    gap: 15px;
    padding: 10px;
  }

  .card-design {
    margin: 10px;
  }
}

@media (max-width: 480px) {
  h1 {
    font-size: 26px;
  }

  .subTitulo {
    font-size: 14px;
  }

  .informacaoCard {
    flex-direction: column;
    gap: 15px;
  }

  .btn-Escrever,
  .nota {
    width: 100%;
    text-align: center;
  }
}
</style>
