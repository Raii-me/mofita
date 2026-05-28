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
        {
          id: 13,
          imagem: "livro-macunaima.png",
          categoria: "Literatura Clássica",
          titulo: "Macunaíma - Mario Andrade",
          ano: 1928,
        },
        {
          id: 14,
          imagem: "livro-os-sertoes.png",
          categoria: "Literatura Clássica",
          titulo: "Os Sertões - Euclides da Cunha",
          ano: 1902,
        },
        {
          id: 15,
          imagem: "livro-vidas-secas.png",
          categoria: "Literatura Clássica",
          titulo: "Vidas Secas - Graciliano Ramos",
          ano: 1938,
        },
        {
          id: 16,
          imagem: "livro-Ursula.png",
          categoria: "Literatura Clássica",
          titulo: "Úrsula - Maria Firmina dos Reis",
          ano: 1859,
        }
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
      return new URL(`../../assets/LIVROS/${nome}`, import.meta.url).href;
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
            <img src="../../assets/ICONS/icons-outros/icon-lupa.png" id="icon-search" />
          </button>
          <input v-model="filtroTexto" class="input-text" placeholder="Buscar um livro" />
        </div>

        <div class="btns">
          <div class="caixa-category">
            <img src="../../assets/ICONS/icons-outros/icon-category-buscar.PNG" id="category-icon" />
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

  <section class="container-livros">
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
              <span class="ler-mais-btn">Baixar Arquivo →</span>
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
  transition: all 0.3s ease;
}

.caixa-search:focus-within {
  border-color: var(--azulPadrao);
  box-shadow: 0 0 0 3px rgba(96, 165, 250, 0.1);
}

.search-btn {
  width: 38px;
  height: 38px;
  cursor: pointer;
  border: none;
  background-color: transparent;
  outline: none;
  color: var(--texto-medio);
  transition: color 0.3s ease;
}

.search-btn:hover {
  color: var(--azulPadrao);
}

.input-text {
  width: 100%;
  height: 38px;
  margin-left: 5px;
  border: none;
  background-color: transparent;
  outline: none;
  color: var(--texto);
  font-size: 14px;
}

.input-text::placeholder {
  color: var(--texto-medio);
}

.category {
  width: 120px;
  height: 38px;
  cursor: pointer;
  border: none;
  background-color: transparent;
  outline: none;
  color: var(--texto);
  background: var(--branco);
}

#category-icon,
#icon-search {
  width: 18px;
  height: 18px;
  display: block;
  color: var(--texto-sec);
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
  transition: all 0.3s ease;
  cursor: pointer;
}

.caixa-category:hover {
  border-color: var(--laranjaPadrao);
}

.titulo {
  margin: 40px 0 0 5%;
  max-width: 60%;
}

.titulo p {
  margin: 5px;
  color: var(--texto);
}

.container-livros {
  width: 100%;
  display: flex;
  justify-content: center;
  padding: 20px 0 80px;
}

.grid-modelos {
  display: grid;
  width: 90%;
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

#img-box {
  width: 100%;
  height: 100%;
  object-fit: cover;
  transition: transform 0.8s ease;
  border-radius: 0;
}

.card:hover #img-box {
  transform: scale(1.05);
}

.tema-livro {
  position: absolute;
  top: 16px;
  left: 16px;
  background: var(--branco);
  color: var(--texto-forte);
  padding: 6px 12px;
  font-size: 11px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 1px;
  border-radius: 4px;
}

.tema-livro p {
  margin: 0;
}

.caixa-descricao-livro {
  padding: 24px;
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  background: var(--brancoPadrao);
  position: static;
  height: auto;
  bottom: auto;
  width: 100%;
  border-radius: 0;
}

.caixa-descricao-livro p {
  font-size: 18px;
  font-weight: 800;
  color: var(--texto);
  line-height: 1.3;
  margin: 0 0 auto 0;
  overflow: hidden;
  text-align: left;
}

.visualizar-detalhe-livro {
  display: flex;
  align-items: center;
  justify-content: space-between;
  margin-top: 20px;
  border-top: 1px solid var(--borda);
  padding-top: 16px;
  position: static;
  width: 100%;
  bottom: auto;
}

.visualizar-detalhe-livro > p {
  margin: 0;
  padding: 0;
  border: none;
  border-radius: 0;
  color: var(--laranjaPadrao);
  font-weight: 700;
  font-size: 14px;
  letter-spacing: 0.5px;
  text-transform: uppercase;
}

.visualizar-detalhe-livro a {
  text-decoration: none;
  color: var(--laranjaPadrao);
  transition: color 0.3s ease;
}

.visualizar-detalhe-livro a:hover {
  color: var(--laranjaEscuro);
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

@media (max-width: 768px) {
  .grid-modelos {
    grid-template-columns: 1fr;
  }

  .search-bar {
    flex-direction: column;
    align-items: stretch;
    gap: 12px;
  }

  .caixa-search {
    width: 100%;
  }

  .caixa-category {
    width: 100%;
  }

  .titulo {
    margin-left: 5%;
    max-width: 90%;
  }
}
</style>