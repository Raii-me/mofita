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
      filtrostatus: "Todos",
      redacoes: [
        {
          id: 1,
          imagem: "Temas_Envelhecimento_Sociedade.png",
          status: "rascunho",
          titulo: "Minha Primeira Redação",
          data: "03/09/2025",
        },
        {
          id: 2,
          imagem: "Temas_Herancas_Africanas.jpg",
          status: "concluida",
          titulo: "Treinando Tema atual",
          data: "09/10/2025",
        },
        {
          id: 3,
          imagem: "Temas_Invisibilidade_Mulheres.jpg",
          status: "concluida",
          titulo: "Tema Enem",
          data: "20/11/2025",
        },
        {
          id: 8,
          imagem: "Temas_Democratizacao_Cinema.jpg",
          status: "rascunho",
          titulo: "Não aguento mais redação",
          data: "07/09/2025",
        },
    
      ],
    };
  },

  computed: {
    redacoesFiltrados() {
      return this.redacoes.filter((modelo) => {
        const bateTexto = modelo.titulo
          .toLowerCase()
          .includes(this.filtroTexto.toLowerCase());

        const batestatus =
          this.filtrostatus === "Todos" ||
          modelo.status === this.filtrostatus;

        return bateTexto && batestatus;
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
      <h1>Todas Minhas Redações</h1>
      <p>
        Veja todas as suas redações concluídas ou salvas com antecedência e continue de onde parou, 
      </p>
    </header>

    <navbar class="fixar-search-bar">
      <div class="search-bar">
        <div class="caixa-search">
          <button class="search-btn">
            <img src="../../assets/ICONS/icons-outros/icon-lupa.png" id="icon-search" />
          </button>
          <input type="text" v-model="filtroTexto" class="input-text" placeholder="Buscar Redação" />
        </div>

        <div class="caixa-category">
          <img src="../../assets/ICONS/icons-outros/icon-category-buscar.PNG" id="category-icon" />
          <select class="category" v-model="filtrostatus">
            <option value="Todos">Todos</option>
            <option value="rascunho">Rascunho</option>
            <option value="concluida">Concluida</option>
          </select>
        </div>
      </div>
    </navbar>
  </section>

  <section class="container-redacoes">
    <main-content class="grid-redacoes">
      <div v-for="modelo in redacoesFiltrados" :key="modelo.id" class="card">

        <div class="imagem">
          <img :src="getImagemUrl(modelo.imagem)" :alt="modelo.titulo" id="img-box" />
          <div class="tema-da-modelo" :class="modelo.status.toLowerCase()">
            <p>{{ modelo.status }}</p>
          </div>
        </div>

        <div class="caixa-descricao-modelo">
          <p>{{ modelo.titulo }}</p>
          <div class="visualizar-detalhe-modelo">
            <p>{{ modelo.data }}</p>
            <a href="#">
              <span class="ler-mais-btn">Visualizar →</span>
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
  background: var(--branco) ;
  color: var(--texto);
}

#icon-search,
#category-icon {
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

.container-redacoes {
  width: 100%;
  display: flex;
  justify-content: center;
  padding: 20px 0 80px;
}

.grid-redacoes {
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
  transition: transform 0.8s ease, filter 0.4s ease;
  border-radius: 0;
}

.card:hover #img-box {
  transform: scale(1.05);
}

.tema-da-modelo {
  position: absolute;
  top: 16px;
  left: 16px;
  padding: 6px 12px;
  font-size: 12px;
  font-weight: 700;
  border: 1px solid;
  text-transform: uppercase;
  letter-spacing: 1px;
  border-radius: 4px;
}

.tema-da-modelo.rascunho {
  background: var(--vermelhoClaro);
  border-color: var(--vermelho);
  color: var(--vermelho);
}

.tema-da-modelo.concluida {
  background: var(--azulPadraoClaro);
  border-color: var(--azul-escuro);
  color: var(--azulPadrao);
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
  position: static;
  height: auto;
  width: 100%;
  border-radius: 0;
}

.caixa-descricao-modelo > p {
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
  position: static;
  width: 100%;
}

.visualizar-detalhe-modelo p {
  margin: 0;
  padding: 0;
  border: none;
  border-radius: 0;
  border: 1px solid var(--laranjaPadrao);
  padding: 5px 10px;
  border-radius: 10px;
  color: var(--laranjaPadrao);
  font-weight: 700;
  font-size: 15px;
  letter-spacing: 0.5px;
  text-transform: uppercase;
}

.visualizar-detalhe-modelo a {
  text-decoration: none;
  color: var(--laranjaPadrao);
  transition: color 0.3s ease;
}

.visualizar-detalhe-modelo a:hover {
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
  .grid-redacoes {
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