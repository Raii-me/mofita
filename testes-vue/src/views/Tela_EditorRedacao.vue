<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import "../assets/css/variaveis.css";

const meusTemas = [
  {
    id: 1,
    titulo: "Perspectivas acerca do envelhecimento na sociedade brasileira",
  },
  {
    id: 2,
    titulo: "Desafios para a valorização da herança africana no Brasil",
  },
  {
    id: 3,
    titulo:
      "Desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil",
  },
  {
    id: 4,
    titulo:
      "Desafios para a valorização de comunidades e povos tradicionais no Brasil",
  },
  {
    id: 5,
    titulo:
      "Invisibilidade e registro civil: garantia de acesso a cidadania no Brasil",
  },
  {
    id: 6,
    titulo: "O estigma associado as doenças mentais na sociedade brasileira",
  },
  {
    id: 7,
    titulo: "O desafio de reduzir as desigualdade entre as regiões do Brasil",
  },
  { id: 8, titulo: "Democratização do acesso ao cinema no Brasil" },
  {
    id: 9,
    titulo:
      "Manipulação do comportamento do usuário pelo controle de dados na internet",
  },
  {
    id: 10,
    titulo: "Desafios para a formação educacional dos surdos no Brasil",
  },
  {
    id: 11,
    titulo:
      "Como os adolescentes podem usar as redes sociais sem prejudicar a saúde mental?",
  },
  {
    id: 12,
    titulo:
      "Gentrificação urbana - o processo de transformação de áreas urbanas",
  },
  {
    id: 13,
    titulo:
      "O combate a fome no Brasil: entre a responsabilidade do estado e a atuação da sociedade civil",
  },
  {
    id: 14,
    titulo: "Impacto da inteligência artificial nos alunos de escola pública",
  },
  { id: 15, titulo: "Inclusão social de pessoas com deficiências físicas" },
  { id: 16, titulo: "Desafios para manter um consumo consciente" },
  {
    id: 17,
    titulo: "Desafios para o ensino de qualidade sobre educação financeira",
  },
  {
    id: 18,
    titulo:
      "O impacto da inteligência artificial na precarização do trabalho e nas relações de consumo",
  },
  {
    id: 19,
    titulo:
      "Impacto da violência doméstica contra a criança e o adolescente no desenvolvimento social",
  },
  {
    id: 20,
    titulo:
      "A persistência da insegurança alimentar e seus reflexos na saúde nacional",
  },
];

export default {
  components: {
    Cabecalho: Header,
    Rodape: Footer,
  },

  data() {
    return {
      temaSelecionado: null,
      titulo: "",
      textoRedacao: "",
      mostrandoModal: false,
    };
  },

  mounted() {
    const id = Number(this.$route.params.temaId);
    this.temaSelecionado = meusTemas.find((t) => t.id === id) || null;
  },

  computed: {
    palavras() {
      const t = this.textoRedacao.trim();
      return t ? t.split(/\s+/).length : 0;
    },
    caracteres() {
      return this.textoRedacao.length;
    },
  },

  methods: {
    mostrarCarregamento() {
      if (!this.titulo.trim() || !this.textoRedacao.trim()) {
        alert("Preencha o título e a redação antes de enviar.");
        return;
      }
      this.mostrandoModal = true;
      document.body.style.overflow = "hidden";
    },
    sairSemSalvar() {
      this.$router.push({ name: "theme" });
    },

  },
};
</script>

<template>
  <main class="editor-pagina">
    <div class="documento">
      <div class="cartao-editor">
        <header class="cabecalho-documento">
          <h1>Tema da <span>Redação</span></h1>
          <p class="texto-tema">
            {{ temaSelecionado?.titulo ?? "Nenhum tema selecionado" }}
          </p>
        </header>

        <div class="conteudo-documento">
          <div class="secao">
            <h2 class="secao-titulo">Título da Redação</h2>
            <input v-model="titulo" type="text" class="entrada-titulo" placeholder="Digite seu título aqui..."
              maxlength="100" />
          </div>

          <div class="barra-ferramentas">
            <span class="item-estatistica">Caracteres: <b>{{ caracteres }}</b></span>
            <span class="item-estatistica">Palavras: <b>{{ palavras }}</b></span>
          </div>

          <div class="secao area-escrita">
            <textarea v-model="textoRedacao" id="editor-texto" placeholder="Comece seu texto aqui..."></textarea>
          </div>
        </div>

        <footer class="rodape-documento">
          <button class="btn-voltar" @click="sairSemSalvar">
            Sair sem salvar
          </button>
          <div class="grupo-botoes">
            <button class="btn btn-salvar" @click="salvarRascunho">
              Salvar Rascunho
            </button>
            <button class="btn btn-enviar" @click="mostrarCarregamento">
              Enviar Redação
            </button>
          </div>
        </footer>
      </div>
    </div>
  </main>

  <Teleport to="body">
    <div v-if="mostrandoModal" class="sobreposicao-modal" @click.self="fecharModal">
      <div class="conteudo-modal">
        <img src="../assets/IMAGES/logo-redamais.png" alt="Reda+" class="logo-modal" />
        <img src="../assets/ICONS/loanding.gif" alt="Carregando" class="carregador-modal" />
        <div class="texto-modal">
          <h2>Avaliando sua Redação o mais rápido possível</h2>
          <p>Por favor, aguarde</p>
        </div>
        <div class="rodape-modal"><span></span> Dados Seguros</div>
      </div>
    </div>
  </Teleport>
</template>

<style scoped>
@import "../assets/css/variaveis.css";

.editor-pagina {
  background-color: var(--branco);
  color: var(--texto);
  padding: 40px 20px;
  display: flex;
  justify-content: center;
  min-height: 100vh;
}

.documento {
  width: 100%;
  max-width: 900px;
}

.cartao-editor {
  background: var(--branco);
  border-radius: var(--raio);
  box-shadow: var(--sombra-md);
  border: 1px solid var(--borda-clara);
  overflow: hidden;
}

.cabecalho-documento {
  background: linear-gradient(135deg,
      var(--azul-escuro) 0%,
      var(--azulPadrao) 100%);
  padding: 40px;
  text-align: center;
  color: var(--branco);
}

.cabecalho-documento h1 {
  font-size: 32px;
  font-weight: 800;
}

.cabecalho-documento h1 span {
  color: var(--laranjaPadrao);
}

.versao {
  font-size: 13px;
  margin-top: 10px;
  opacity: 0.4;
  color: var(--branco);
}

.texto-tema {
  font-size: 15px;
  font-weight: 500;
  width: 75%;
  line-height: 1.5;
  color: rgba(255, 255, 255, 0.85);
  margin: 20px auto 0;
  background: rgba(255, 255, 255, 0.1);
  border: 1px solid rgba(255, 255, 255, 0.18);
  border-radius: 12px;
  padding: 14px 20px;
}

.conteudo-documento {
  padding: 40px;
}

.secao {
  margin-bottom: 36px;
}

.secao-titulo {
  color: var(--azulPadrao);
  font-size: 18px;
  font-weight: 700;
  margin-bottom: 12px;
  display: flex;
  align-items: center;
  gap: 10px;
}

.secao-titulo::before {
  content: "";
  width: 4px;
  height: 18px;
  background: var(--laranjaPadrao);
  border-radius: 2px;
  flex-shrink: 0;
}

.entrada-titulo {
  width: 100%;
  border: none;
  background: transparent;
  font-family: "Poppins", sans-serif;
  font-size: 1.2rem;
  color: var(--texto);
  outline: none;
  padding: 5px 0;
  border-bottom: 2px solid var(--brancoLeve);
  transition: border-color var(--trans);
}

.entrada-titulo:focus {
  border-bottom-color: var(--azulPadrao);
}

.barra-ferramentas {
  padding: 12px 0;
  background: #fdfdfd;
  border-bottom: 1px solid var(--brancoLeve);
  border-top: 1px solid var(--brancoLeve);
  display: flex;
  justify-content: flex-end;
  gap: 25px;
  margin-bottom: 36px;
}

.item-estatistica {
  font-size: 13px;
  color: var(--texto-sec);
  font-weight: 500;
}

.item-estatistica b {
  color: var(--azulPadrao);
  font-weight: 700;
}

.area-escrita {
  margin-bottom: 0;
}

#editor-texto {
  width: 100%;
  min-height: 550px;
  padding: 36px 32px;
  font-family: "Lora", serif;
  font-size: 1.2rem;
  line-height: 36px;
  border: 1px solid var(--borda);
  border-radius: var(--raio);
  resize: vertical;
  outline: none;
  color: var(--texto);
  background-image: linear-gradient(rgba(196, 212, 232, 0.6) 1px,
      transparent 1px);
  background-size: 100% 36px;
  background-attachment: local;
  transition: border-color var(--trans);
}

#editor-texto:focus {
  border-color: var(--azulPadrao);
}

.rodape-documento {
  background: #fafafa;
  padding: 20px 40px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  border-top: 1px solid var(--borda-clara);
}

.grupo-botoes {
  display: flex;
  gap: 12px;
}

.btn-voltar {
  background: var(--vermelho);
  color: var(--branco);
  padding: 14px 28px;
  border-radius: var(--radius-pequeno);
  font-weight: 600;
  font-size: 14px;
  cursor: pointer;
  transition: var(--trans);
  border: none;
  display: flex;
  align-items: center;
  gap: 10px;
  font-family: "Poppins", sans-serif;
}

.btn-voltar:hover {
  box-shadow: var(--sombra-md);
  transform: translateY(-1px);
}

.btn {
  padding: 14px 28px;
  border-radius: var(--radius-pequeno);
  font-weight: 600;
  font-size: 14px;
  cursor: pointer;
  transition: var(--trans);
  border: none;
  display: flex;
  align-items: center;
  gap: 10px;
  font-family: "Poppins", sans-serif;
}

.btn-salvar {
  background: var(--brancoLeve);
  color: var(--azul-escuro);
  border: 1px solid var(--borda-clara);
}

.btn-salvar:hover {
  background: var(--borda-clara);
  box-shadow: var(--sombra-sm);
}

.btn-enviar {
  background: var(--azulPadrao);
  color: white;
}

.btn-enviar:hover {
  background: var(--azul-escuro-hover);
  box-shadow: var(--sombra-md);
  transform: translateY(-1px);
}

.sobreposicao-modal {
  position: fixed;
  inset: 0;
  background: rgba(0, 0, 0, 0.5);
  display: flex;
  align-items: center;
  justify-content: center;
  z-index: 10000;
}

.conteudo-modal {
  background: var(--branco);
  width: 90%;
  max-width: 800px;
  height: 70vh;
  border-radius: var(--raio-lg);
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-between;
  padding-top: 50px;
  overflow: hidden;
  box-shadow: var(--shadowPadrao);
  text-align: center;
}

.logo-modal {
  width: 120px;
  height: auto;
}

.carregador-modal {
  width: 120px;
  height: auto;
}

.texto-modal h2 {
  font-size: 1.3rem;
  color: var(--texto);
  margin-bottom: 8px;
  max-width: 320px;
}

.texto-modal p {
  font-size: 0.9rem;
  color: var(--texto-sec);
}

.rodape-modal {
  width: 100%;
  background: #fff0e6;
  color: var(--laranjaEscuro);
  padding: 15px 0;
  font-size: 0.85rem;
  font-weight: 700;
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 8px;
}

@media (max-width: 768px) {
  .cabecalho-documento {
    padding: 30px 20px;
  }

  .cabecalho-documento h1 {
    font-size: 24px;
  }

  .conteudo-documento {
    padding: 20px;
  }

  .rodape-documento {
    flex-direction: column;
    padding: 20px;
    gap: 15px;
  }

  .grupo-botoes {
    flex-direction: column;
    width: 100%;
  }

  .btn {
    justify-content: center;
    width: 100%;
  }
}
</style>
