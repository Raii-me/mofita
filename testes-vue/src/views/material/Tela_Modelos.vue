<script>
import Header from "../../components/layout/Header.vue";
import Footer from "../../components/layout/Footer.vue";
import Chatbot from "../../components/features/Chatbot.vue";
import "../../assets/css/variaveis.css";

export default {
  components: {
    Header,
    Footer,
    Chatbot,
  },

  data() {
    return {
      filtroTexto: "",
      filtroCategoria: "Todos",
      modelos: [
        {
          id: 1,
          imagem: "Temas_Envelhecimento_Sociedade.png",
          categoria: "ENEM",
          titulo:
            "Perspectivas acerca do envelhecimento na sociedade brasileira",
          nota: 1000,
        },
        {
          id: 2,
          imagem: "Temas_Herancas_Africanas.jpg",
          categoria: "ENEM",
          titulo: "Desafios para a valorização da herança africana no Brasil",
          nota: 1000,
        },
        {
          id: 3,
          imagem: "Temas_Invisibilidade_Mulheres.jpg",
          categoria: "ENEM",
          titulo:
            "Desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil",
          nota: 1000,
        },
        {
          id: 4,
          imagem: "Temas_Cominudades_Tradicionais.jpg",
          categoria: "ENEM",
          titulo:
            "Desafios para a valorização de comunidades e povos tradicionais no Brasil",
          nota: 1000,
        },
        {
          id: 5,
          imagem: "Temas_Reginstro_Civil.jpg",
          categoria: "ENEM",
          titulo:
            "Invisibilidade e registro civil: garantia de acesso a cidadania no Brasil",
          nota: 1000,
        },
        {
          id: 6,
          imagem: "Temas_Doenca_Mental.jpg",
          categoria: "ENEM",
          titulo:
            "O estigma associado as doenças mentais na sociedade brasileira",
          nota: 1000,
        },
        {
          id: 7,
          imagem: "Temas_Desigualdade_Social.jpg",
          categoria: "ENEM",
          titulo:
            "O desafio de reduzir as desigualdade entre as regiões do Brasil",
          nota: 1000,
        },
        {
          id: 8,
          imagem: "Temas_Democratizacao_Cinema.jpg",
          categoria: "ENEM",
          titulo: "Democratização do acesso ao cinema no Brasil",
          nota: 1000,
        },
        {
          id: 9,
          imagem: "Temas_Controle_Dados.jpg",
          categoria: "ENEM",
          titulo:
            "Manipulação do comportamento do usuário pelo controle de dados na internet",
          nota: 1000,
        },
        {
          id: 10,
          imagem: "Tema_Educacao_Surdos.jpg",
          categoria: "ENEM",
          titulo: "Desafios para a formação educacional dos surdos no Brasil",
          nota: 1000,
        },
        {
          id: 11,
          imagem: "Temas_Redes_Sociais_Adolecentes.jpg",
          categoria: "Provão Paulista",
          titulo:
            "Como os adolescentes podem usar as redes sociais sem prejudicar a saúde mental?",
          nota: 1000,
        },
        {
          id: 12,
          imagem: "Temas_Gentrificacao.jpg",
          categoria: "Provão Paulista",
          titulo:
            "Gentrificação urbana - o processo de transformação de áreas urbanas",
          nota: 1000,
        },
        {
          id: 13,
          imagem: "Temas_Fome_Brasil.jpg",
          categoria: "Provão Paulista",
          titulo:
            "O combate a fome no Brasil: entre a responsabilidade do estado e a atuação da sociedade civil",
          nota: 1000,
        },
        {
          id: 14,
          imagem: "Temas_IA_Escolas.jpg",
          categoria: "Autoral",
          titulo:
            "Impacto da inteligência artificial nos alunos de escola pública",
          nota: 1000,
        },
        {
          id: 15,
          imagem: "Temas_Resocializacao_Deficientes.jpg",
          categoria: "Autoral",
          titulo: "Inclusão social de pessoas com deficiências físicas",
          nota: 1000,
        },
        {
          id: 16,
          imagem: "Temas_Consumo_Consciente.jpg",
          categoria: "Autoral",
          titulo: "Desafios para manter um consumo consciente",
          nota: 1000,
        },
        {
          id: 17,
          imagem: "Temas_Educacao_Financeira.jpg",
          categoria: "Autoral",
          titulo:
            "Desafios para o ensino de qualidade sobre educação financeira",
          nota: 1000,
        },
        {
          id: 18,
          imagem: "Temas_Substituicao_IA.jpg",
          categoria: "Autoral",
          titulo:
            "O impacto da inteligência artificial na precarização do trabalho e nas relações de consumo",
          nota: 1000,
        },
        {
          id: 19,
          imagem: "Temas_Violencia_Criancas.jpg",
          categoria: "Autoral",
          titulo:
            "Impacto da violência doméstica contra a criança e o adolescente no desenvolvimento social",
          nota: 1000,
        },
        {
          id: 20,
          imagem: "Temas_Inseguranca_Alimentar.jpg",
          categoria: "Autoral",
          titulo:
            "A persistência da insegurança alimentar e seus reflexos na saúde nacional",
          nota: 1000,
        },
      ],
    };
  },

  computed: {
    modelosFiltrados() {
      return this.modelos.filter((modelo) => {
        const bateTexto = modelo.titulo
          .toLowerCase()
          .includes(this.filtroTexto.toLowerCase());

        const bateCategoria =
          this.filtroCategoria === "Todos" ||
          modelo.categoria === this.filtroCategoria;

        return bateTexto && bateCategoria;
      });
    },
  },

  methods: {
    getImagemUrl(nome) {
      return new URL(`../../assets/TEMAS/${nome}`, import.meta.url).href;
    },
  },
};
</script>

<template>
  <Header />

  <section>
    <header class="titulo">
      <h1>Modelos</h1>
      <p>
        Acesse os temas disponíveis na plataforma com textos de apoio e
        orientações específicas para desenvolver sua produção textual com
        estratégia e foco.
      </p>
    </header>

    <navbar class="fixar-search-bar">
      <div class="search-bar">
        <div class="caixa-1">
          <button class="search-btn">
            <img src="../../assets/ICONS/icon-lupa.png" id="icon-search" />
          </button>

          <input type="text" v-model="filtroTexto" class="input-text" placeholder="Buscar um tema" />
        </div>

        <div class="caixa-2">
          <img src="../../assets/ICONS/icon-category-buscar.PNG" id="category-icon" />

          <select class="category" v-model="filtroCategoria">
            <option value="Todos">Todos</option>
            <option value="ENEM">ENEM</option>
            <option value="Provão Paulista">Provão Paulista</option>
            <option value="Autoral">Autoral</option>
          </select>
        </div>
      </div>
    </navbar>
  </section>

  <section>
    <main-content class="grid-modelos">
      <div v-for="modelo in modelosFiltrados" :key="modelo.id" class="caixa-tema">
        <div class="imagem">
          <img :src="getImagemUrl(modelo.imagem)" :alt="modelo.titulo" id="img-box" />

          <div class="tema-da-modelo">
            <p>{{ modelo.categoria }}</p>
          </div>
        </div>

        <div class="caixa-descricao-modelo">
          <p>{{ modelo.titulo }}</p>

          <div class="visualizar-detalhe-modelo">
            <p>{{ modelo.nota }}</p>

            <a href="#">
              <button>Ver modelo ↗</button>
            </a>
          </div>
        </div>
      </div>
    </main-content>
  </section>

  <Chatbot />
  <Footer />
</template>

<style scoped>
.fixar-search-bar {
  display: flex;
  justify-content: center;
  align-items: center;
}

.search-bar {
  display: flex;
  justify-content: space-between;
  width: 90%;
  margin: 10px auto;
  align-items: center;
}

.caixa-1 {
  display: flex;
  width: 60%;
  align-items: center;
  height: 48px;
  padding: 0 10px;
  background-color: var(--brancoPadrao);
  border: 1px solid var(--borda);
  border-radius: 10px;
}

.search-btn {
  width: 38px;
  height: 38px;
  cursor: pointer;
}

.input-text {
  width: 100%;
  height: 38px;
  margin-left: 5px;
  color: var(--texto);
}

.input-text,
.search-btn,
.category {
  border: none;
  background-color: transparent;
  outline: none;
}

#icon-search {
  cursor: pointer;
  margin-top: 2px;
  width: 18px;
  height: 18px;
}

#category-icon {
  margin-left: 10px;
  margin-top: 10px;
  width: 18px;
  height: 18px;
}

.caixa-2 {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 0 10px;
  height: 48px;
  background-color: var(--brancoPadrao);
  border: 1px solid var(--borda);
  border-radius: 10px;
}

.category {
  cursor: pointer;
  width: 98px;
  height: 38px;
}

.titulo {
  margin-top: 40px;
  margin-left: 5%;
  max-width: 60%;
}

.titulo p {
  margin: 5px;
}

.grid-modelos {
  display: grid;
  width: 90%;
  max-width: 90%;
  margin: 3% auto;
  gap: 40px;
  grid-template-columns: repeat(auto-fill, minmax(360px, 1fr));
}

.caixa-tema {
  width: 100%;
  overflow: hidden;
  position: relative;
  background-color: #fff;
  width: 100%;
  height: 350px;
  border-radius: 15px;
  transition: 0.5s;
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.35);
}

.caixa-tema:hover {
  transform: translateY(-10px);
  box-shadow:
    rgba(0, 0, 0, 0.25) 0 14px 28px,
    rgba(0, 0, 0, 0.22) 0 10px 10px;
}

.imagem {
  width: 100%;
  height: 70%;
}

#img-box {
  border-radius: 10px;
  width: 100%;
  height: 100%;
}

.tema-da-modelo {
  position: absolute;
  top: 10px;
  left: 10px;
  background-color: #fff;
  padding-left: auto;
  padding-right: auto;
  padding: 5px;
  border-radius: 10px;
}

.caixa-descricao-modelo {
  height: 50%;
  width: 100%;
  background-color: #fff;
  position: absolute;
  bottom: 0;
  border-radius: 0 0 10px 10px;
  z-index: 999;
}

.caixa-descricao-modelo p {
  margin: 2% 5%;
  font-size: 17px;
  text-align: justify;
}

.visualizar-detalhe-modelo {
  position: absolute;
  bottom: 3px;
  display: flex;
  align-items: center;
  width: 100%;
  padding: 5px;
}

.visualizar-detalhe-modelo p {
  margin-left: 3%;
  padding: 5px 15px 5px 15px;
  border-radius: 30px;
  border: 1px solid rgb(161, 161, 161);
}

.visualizar-detalhe-modelo button {
  width: auto;
  height: auto;
  border: none;
  background-color: transparent;
  cursor: pointer;
  font-size: small;
  color: var(--texto-sec);
  transition: var(--trans);
  margin: 0 18px;
}

.visualizar-detalhe-modelo button:hover {
  color: #3248d5;
  font-weight: 700;
  border-radius: 10px;
  font-size: 15px;
  text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
}

.visualizar-detalhe-modelo a {
  margin-left: auto;
}

#model-icon {
  width: 18px;
  height: 18px;
  margin-right: 5%;
  margin-top: 2px;
}
</style>
