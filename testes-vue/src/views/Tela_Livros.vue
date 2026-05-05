<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import Chatbot from "../components/Chatbot.vue";
import "../assets/css/variaveis.css";

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
      livros: [
        {
          id: 1,
          imagem: "livro-dom-casmurro.PNG",
          categoria: "Comportamento",
          titulo: "Dom Casmurro - Machado de Assis",
          ano: 1899,
        },
        {
          id: 2,
          imagem: "livro-memoria-postumas.png",
          categoria: "Sociedade",
          titulo: "Memórias Póstumas de Brás Cubas - Machado de Assis",
          ano: 1881,
        },
        {
          id: 3,
          imagem: "livro-o-cortico.PNG",
          categoria: "Sociedade",
          titulo: "O Cortiço - Aluísio Azevedo",
          ano: 1890,
        },
        {
          id: 4,
          imagem: "livro-iracema.png",
          categoria: "Literatura Clássica",
          titulo: "Iracema - José de Alencar",
          ano: 1865,
        },
        {
          id: 5,
          imagem: "livro-os-lusiadas.png",
          categoria: "Literatura Clássica",
          titulo: "Os Lusíadas - Luís de Camões",
          ano: 1572,
        },
        {
          id: 6,
          imagem: "livro-o-auto-da-barga-do-inferno.png",
          categoria: "Filosofia e Ideias",
          titulo: "Auto da Barca do Inferno - Gil Vicente",
          ano: 1517,
        },
        {
          id: 7,
          imagem: "livro-a-moreninha.png",
          categoria: "Comportamento",
          titulo: "A Moreninha - Joaquim Manuel de Macedo",
          ano: 1844,
        },
        {
          id: 8,
          imagem: "livro-senhora.png",
          categoria: "Comportamento",
          titulo: "Senhora - José de Alencar",
          ano: 1875,
        },
        {
          id: 9,
          imagem: "livro-quincas-borba.png",
          categoria: "Filosofia e Ideias",
          titulo: "Quincas Borba - Machado de Assis",
          ano: 1891,
        },
        {
          id: 10,
          imagem: "livro-o-alienista.png",
          categoria: "Filosofia e Ideias",
          titulo: "O Alienista - Machado de Assis",
          ano: 1882,
        },
        {
          id: 11,
          imagem: "livro-casa-de-pensao.png",
          categoria: "Sociedade",
          titulo: "Casa de Pensão - Aluísio Azevedo",
          ano: 1884,
        },
        {
          id: 12,
          imagem: "livro-triste-fim-de-policarpo-quaresma.png",
          categoria: "Sociedade",
          titulo: "Triste Fim de Policarpo Quaresma - Lima Barreto",
          ano: 1915,
        },
      ],
    };
  },

  computed: {
    livrosFiltrados() {
      return this.livros.filter((livro) => {
        const bateTexto = livro.titulo
          .toLowerCase()
          .includes(this.filtroTexto.toLowerCase());
        const bateCategoria =
          this.filtroCategoria === "Todos" ||
          livro.categoria === this.filtroCategoria;

        return bateTexto && bateCategoria;
      });
    },
  },

  methods: {
    getImagemUrl(nome) {
      return new URL(`../assets/LIVROS/${nome}`, import.meta.url).href;
    },
  },
};
</script>

<template>
  <Header />

  <section>
    <header class="titulo">
      <h1>Livros</h1>
      <p>
        Tenha acesso a temas acompanhados de livros e orientações direcionadas
        para desenvolver sua escrita com estratégia e eficiência.
      </p>
    </header>

    <navbar class="fixar-search-bar">
      <div class="search-bar">
        <div class="caixa-search">
          <button class="search-btn">
            <img src="../assets/ICONS/icon-lupa.png" id="icon-search" />
          </button>
          <input v-model="filtroTexto" class="input-text" placeholder="Buscar um livro" />
        </div>

        <div class="btns">
          <div class="caixa-category">
            <img src="../assets/ICONS/icon-category-buscar.PNG" id="category-icon" />
            <select class="category" v-model="filtroCategoria">
              <option value="Todos">Todos</option>
              <option value="Sociedade">Sociedade</option>
              <option value="Comportamento">Comportamento</option>
              <option value="Literatura Clássica">Clássica</option>
              <option value="Filosofia e Ideias">Filosofia</option>
            </select>
          </div>
        </div>
      </div>
    </navbar>
  </section>

  <section>
    <main-content class="grid-modelos">
      <div v-for="livro in livrosFiltrados" :key="livro.id" class="card">
        <div class="imagem">
          <img :src="getImagemUrl(livro.imagem)" id="img-box" />

          <div class="tema-livro">
            <p>{{ livro.categoria }}</p>
          </div>
        </div>

        <div class="caixa-descricao-livro">
          <p>{{ livro.titulo }}</p>

          <div class="visualizar-detalhe-livro">
            <p>{{ livro.ano }}</p>
            <a href="#">
              <button>Baixar Arquivo ↗</button>
            </a>
          </div>
        </div>
      </div>
    </main-content>
  </section>

  <Chatbot />
  <Footer />
</template>

<style>
.fixar-search-bar {
  display: flex;
  justify-content: center;
  align-items: center;
}

.btns {
  display: flex;
  gap: 15px;
}

.search-bar {
  display: flex;
  justify-content: space-between;
  width: 90%;
  margin: 10px auto;
  align-items: center;
}

.caixa-search {
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
}

.input-text,
.search-btn,
.category,
#btn-random {
  border: none;
  background-color: transparent;
  outline: none;
}

#category-icon,
#icon-search,
#icon-dado {
  width: 18px;
  height: 18px;
  display: block;
}

.caixa-random {
  display: flex;
  align-items: center;
  gap: 6px;
  padding: 0 12px;
  height: 48px;
  background-color: var(--brancoPadrao);
  border: 1px solid var(--borda);
  border-radius: 10px;
  cursor: pointer;
}

#btn-random {
  margin-left: 10px;
}

.caixa-random p {
  display: flex;
  align-items: center;
  margin: 0 10px 0 3px;
  font-size: 14px;
}

.caixa-category {
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
  width: 120px;
  height: 38px;
  cursor: pointer;
}

.titulo {
  margin: 40px 0 0 5%;
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

.card {
  position: relative;
  width: 100%;
  height: 350px;
  overflow: hidden;
  background-color: var(--brancoPadrao);
  border-radius: 15px;
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.35);
  transition: var(--trans);
}

.card:hover {
  transform: translateY(-10px);
  box-shadow: var(--shadowPadrao);
}

.imagem {
  width: 100%;
  height: 70%;
}

#img-box {
  width: 100%;
  height: 100%;
  border-radius: 10px;
}

.tema-livro {
  position: absolute;
  top: 10px;
  left: 10px;
  padding: 5px;
  background-color: var(--branco);
  border-radius: 10px;
}

.caixa-descricao-livro {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 50%;
  background-color: var(--branco);
  border-radius: 0 0 10px 10px;
}

.caixa-descricao-livro p {
  margin: 2% 5%;
  font-size: 17px;
  text-align: justify;
}

.visualizar-detalhe-livro {
  position: absolute;
  bottom: 3px;
  display: flex;
  align-items: center;
  width: 100%;
  padding: 5px;
}

.visualizar-detalhe-livro p {
  margin: 0 auto 0 3%;
  padding: 5px 15px;
  border: 1px solid var(--borda);
  border-radius: 30px;
}

.visualizar-detalhe-livro button {
  width: 200px;
  height: 45px;
  font-size: 16px !important;
  margin-right: 10px;
  padding: 10px;
  background: var(--laranjaPadrao);
  border: none;
  border-radius: 12px;
  color: var(--branco);
  font-weight: 700;
  cursor: pointer;
  transition: var(--trans);
}

.visualizar-detalhe-livro button:hover {
  background: var(--laranjaEscuro);
  box-shadow: var(--shadowPadrao);
  text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
  transform: translateY(-4px);
}

#model-icon {
  width: 18px;
  height: 18px;
  margin: 2px 5% 0 0;
}
</style>
