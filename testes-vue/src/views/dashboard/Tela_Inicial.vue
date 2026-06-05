<script>
import Header from "../../components/layout/Header.vue";
import Footer from "../../components/layout/Footer.vue";
import Chatbot from "../../components/features/Chatbot.vue";
import Grafico from "../../components/layout/Grafico.vue";
import Caixa_de_Acao from "../../components/features/Caixa_de_Acao.vue";
import ModalApoio from "../../components/features/ModalTema.vue";

export default {
  components: {
    Header,
    Footer,
    Chatbot,
    Grafico,
    Caixa_de_Acao,
    ModalApoio

  },
  data() {
    return {
      temaSelecionado: null,

      //não coloquei os textos apoiadores aqui para poupar codigo ja que e simulação do banco mas e o mesmo esquema da tela de escolher
      temasHome: [
        {
          id: 6,
          imagem: "Temas_Doenca_Mental.jpg",
          categoria: "ENEM",
          titulo: "O estigma associado às doenças mentais na sociedade brasileira",
          subcategoria: "Tema Quente",
        },
        {
          id: 9,
          imagem: "Temas_Controle_Dados.jpg",
          categoria: "ENEM",
          titulo: "Manipulação do comportamento do usuário pelo controle de dados na internet",
          subcategoria: "Tema Quente",
        },
        {
          id: 10,
          imagem: "Tema_Educacao_Surdos.jpg",
          categoria: "ENEM",
          titulo: "Desafios para a formação educacional dos surdos no Brasil",
          subcategoria: "Tema Quente",
        },
        {
          id: 14,
          imagem: "Temas_IA_Escolas.jpg",
          categoria: "Autoral",
          titulo: "Impacto da inteligência artificial nos alunos de escola pública",
          subcategoria: "Novo",
        },
      ],
    };
  },

  methods: {
    getImagemUrl(nome) {
      return new URL(`../../assets/TEMAS/${nome}`, import.meta.url).href;
    },

  }
};
</script>

<template>
  <Header />
  <Chatbot />

  <main>
    <section id="part-1" class="pagina-1">
      <div class="hero-text">
        <h1>Bem-vindo, <span class="subcategoria">Usuário!</span></h1>
        <p class="subTitulo">Plataforma de redação impulsionada por IA</p>
      </div>

      <div class="bloco-1">
        <div class="painel-esquerdo">
          <Caixa_de_Acao />
        </div>

        <div class="painel-direito">
          <div class="grafico-header">
            <h3 class="titulo-Direita">Evolução</h3>
          </div>
          <div class="Grafico-inicial">
            <Grafico />
          </div>
        </div>
      </div>
    </section>

    <div class="separador">
      <span></span>
      <p>Temas recomendados</p>
      <span></span>
    </div>

    <section id="part-2" class="pagina-2">

      <div class="grid-modelos">



        <div v-for="tema in temasHome" :key="tema.id" class="card" @click="temaSelecionado = tema">
          <div class="imagem">
            <img :src="getImagemUrl(tema.imagem)" :alt="tema.titulo" />

            <div class="tema-da-modelo">
              <p>{{ tema.categoria }}</p>
            </div>
          </div>

          <div class="caixa-descricao-modelo">
            <p>{{ tema.titulo }}</p>

            <div class="visualizar-detalhe-modelo">
              <p class="tag-categoria">
                {{ tema.subcategoria }}
              </p>

              <a href="#">
                <span class="ler-mais-btn">
                  Ler textos de apoio →
                </span>
              </a>
            </div>
          </div>
        </div>

      </div>
    </section>
  </main>
  <Footer />
  <ModalApoio :tema="temaSelecionado" @fechar="temaSelecionado = null" />
</template>

<style scoped>
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

main {
  display: flex;
  flex-direction: column;
  background: var(--brancoPadrao);
  min-height: 100vh;
  overflow-x: hidden;
}

.pagina-1 {
  display: flex;
  flex-direction: column;
  padding: 40px 5% 60px;
}

.hero-text {
  margin-bottom: 32px;
}

h1 {
  font-size: 32px;
  font-weight: 700;
  color: var(--texto);
  margin-bottom: 6px;
}

.subcategoria {
  color: var(--laranjaPadrao);
}


.subTitulo {
  font-size: 15px;
  font-weight: 300;
  color: var(--texto-sec);
}

.bloco-1 {
  display: flex;
  gap: 28px;
  width: 100%;
  align-items: stretch;
}

.painel-esquerdo {
  flex: 1;
  min-width: 0;
}

.painel-direito {
  flex: 3.5;
  min-width: 0;
  display: flex;
  flex-direction: column;
  background: var(--brancoPadrao);
  border: 1px solid var(--borda);
  border-radius: 16px;
  padding: 24px;
  box-shadow: var(--sombra-md);
}

.grafico-header {
  margin-bottom: 16px;
}

.titulo-Direita {
  font-size: 20px;
  font-weight: 600;
  color: var(--texto);
}

.Grafico-inicial {
  flex: 1;
  min-height: 260px;
  width: 100%;
}

.Grafico-inicial canvas {
  width: 100% !important;
  height: 100% !important;
}

.separador {
  display: flex;
  align-items: center;
  gap: 16px;
  margin: 0px 0 30px;
}

.separador span {
  flex: 1;
  height: 1px;
  background: var(--borda);
}

.separador p {
  color: var(--texto-sec);
  font-size: 14px;
  font-weight: 500;
}


.pagina-2 {
  padding: 20px 5% 80px;
}

.secao-titulo {
  margin-bottom: 28px;
}

.secao-titulo h2 {
  font-size: 22px;
  font-weight: 700;
  color: var(--texto);
  margin-bottom: 4px;
}

.secao-titulo p {
  font-size: 14px;
  color: var(--texto-sec);
  font-weight: 300;
}

.grid-modelos {
  display: grid;
  gap: 32px;
  grid-template-columns: repeat(auto-fill, minmax(340px, 1fr));
}

.card {
  background: var(--surface-2);
  border: 1px solid var(--borda);
  border-radius: 16px;
  overflow: hidden;
  display: flex;
  flex-direction: column;
  cursor: pointer;
  transition: all 0.4s cubic-bezier(0.4, 0, 0.2, 1);
  box-shadow: var(--sombra-md);
  height: 400px;
  position: relative;
}

.card:hover {
  transform: translateY(-6px);
  border-color: var(--laranjaPadrao);
}

.imagem {
  position: relative;
  height: 55%;
  overflow: hidden;
}

.imagem img {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 0.8s ease;
}

.card:hover .imagem img {
  transform: scale(1.05);
}

.tema-da-modelo {
  position: absolute;
  top: 16px;
  left: 16px;
  background: var(--branco);
  color: var(--texto-forte);
  padding: 6px 12px;
  font-size: 12px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 1px;
  border-radius: 4px;
}

.tema-da-modelo p {
  margin: 0;
}

.caixa-descricao-modelo {
  padding: 24px;
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  background: var(--brancoPadrao);
}

.caixa-descricao-modelo>p {
  font-size: 17px;
  font-weight: 800;
  color: var(--texto);
  line-height: 1.3;
  margin: 0 0 auto 0;
  overflow: hidden;
  text-align: left;
}

.visualizar-detalhe-modelo {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: 20px;
  border-top: 1px solid var(--borda);
  padding-top: 16px;
}


.tag-categoria {
  margin: 0;
  padding: 0;
  border: none;
  border-radius: 0;
  color: var(--laranjaPadrao);
  font-weight: 700;
  font-size: 14px;
  letter-spacing: 0.5px;
}

.visualizar-detalhe-modelo a {
  text-decoration: none;
}

.ler-mais-btn {
  color: var(--texto-medio);
  font-size: 13px;
  font-weight: 600;
  transition: color 0.3s ease;
}

.card:hover .ler-mais-btn {
  color: var(--laranjaPadrao);
}


@media (max-width: 1024px) {
  .grid-modelos {
    grid-template-columns: repeat(2, 1fr);
  }
}

@media (max-width: 768px) {

  .pagina-1,
  .pagina-2 {
    padding-left: 5%;
    padding-right: 5%;
  }

  .bloco-1 {
    flex-direction: column;
    gap: 24px;
  }

  .painel-direito {
    padding: 20px;
  }

  h1 {
    font-size: 26px;
    text-align: center;
  }

  .subTitulo {
    text-align: center;
  }

  .hero-text {
    text-align: center;
  }

  .grid-modelos {
    grid-template-columns: 1fr;
    gap: 20px;
  }
}

@media (max-width: 480px) {
  .visualizar-detalhe-modelo {
    flex-direction: column;
    align-items: flex-start;
    gap: 12px;
  }
}
</style>