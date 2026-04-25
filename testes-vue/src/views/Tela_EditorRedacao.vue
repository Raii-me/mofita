<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";
import "../assets/css/variaveis.css";

export default {
  components: {
    Cabecalho: Header,
    Rodape: Footer,
  },

  data() {
    return {
      temaAtualIndex: 0,
      temas: [
        "Vou corrigir a rotas dps para puxar o tema que foi realmente escolhido pelo usuario",
      ],
      titulo: "",
      textoRedacao: "",
      temaVisivel: true,
      mostrandoModal: false,
    };
  },

  computed: {
    temaAtual() {
      return this.temas[this.temaAtualIndex];
    },
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
      this.mostrandoModal = true;
      document.body.style.overflow = "hidden";
    },
    fecharModal() {
      this.mostrandoModal = false;
      document.body.style.overflow = "auto";
    }
};
</script>

<template>
  <Cabecalho />

  <main class="editor-pagina">
    <div class="conteiner">
      <div class="cartao-editor">

        <header class="cabecalho-editor">
          <div class="caixa-tema">
            <Transition name="esmaecer">
              <p v-if="temaVisivel" class="texto-tema">{{ temaAtual }}</p>
            </Transition>
            <button class="btn-trocar" @click="trocarTema">
              Trocar Tema
            </button>
          </div>
        </header>

        <section class="secao-titulo">
          <label class="rotulo-titulo">Título da Redação</label>
          <input
            v-model="titulo"
            type="text"
            class="entrada-titulo"
            placeholder="Digite seu título aqui..."
            maxlength="100"
          />
        </section>

        <div class="barra-ferramentas">
          <span class="item-estatistica">Caracteres: <b>{{ caracteres }}</b></span>
          <span class="item-estatistica">Palavras: <b>{{ palavras }}</b></span>
        </div>

        <section class="area-escrita">
          <textarea
            v-model="textoRedacao"
            id="editor-texto"
            placeholder="Comece seu texto aqui..."
          ></textarea>
        </section>

        <footer class="rodape-controles">
          <button class="btn btn-voltar" @click="sairSemSalvar">Sair sem salvar</button>
          <div class="grupo-botoes">
            <button class="btn btn-salvar" @click="salvarRascunho">Salvar Rascunho</button>
            <button class="btn btn-enviar" @click="mostrarCarregamento">
              Enviar Redação
              <svg width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2.5"
                stroke-linecap="round" stroke-linejoin="round">
                <line x1="22" y1="2" x2="11" y2="13" />
                <polygon points="22 2 15 22 11 13 2 9 22 2" />
              </svg>
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
        <div class="rodape-modal">
          <span></span> Dados Seguros
        </div>
      </div>
    </div>
  </Teleport>

  <Rodape />
</template>

<style scoped>
@import "../assets/css/variaveis.css";

.editor-pagina {
  background-color: var(--branco2);
  color: var(--texto);
  padding: 40px 20px;
  display: flex;
  justify-content: center;
  min-height: 100vh;
}

.conteiner {
  width: 100%;
  max-width: 900px;
  animation: surgir 0.8s ease-out;
}

@keyframes surgir {
  from { opacity: 0; transform: translateY(10px); }
  to   { opacity: 1; transform: translateY(0); }
}

.cartao-editor {
  background: var(--brancoPadrao);
  border-radius: var(--raio-lg);
  box-shadow: var(--shadowPadrao);
  border: 1px solid var(--borda-clara);
  overflow: hidden;
}

.cabecalho-editor {
  background: linear-gradient(145deg, var(--azul-escuro) 0%, var(--azulPadrao) 100%);
  padding: 20px 40px;
  text-align: center;
  color: var(--brancoPadrao);
}

.caixa-tema {
  padding: 20px 30px;
  border-radius: 20px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 15px;
  min-height: 100px;
  justify-content: center;
}

.texto-tema {
  font-size: 15px;
  font-weight: 500;
  max-width: 600px;
  line-height: 1.5;
  color: var(--texto-claro);
}

.btn-trocar {
  background: var(--laranja-btn);
  color: white;
  border: none;
  padding: 10px 20px;
  border-radius: var(--radius-pequeno);
  font-size: 13px;
  font-weight: 700;
  cursor: pointer;
  display: flex;
  align-items: center;
  gap: 8px;
  transition: var(--trans);
  box-shadow: 0 4px 12px rgba(249, 115, 22, 0.3);
}

.btn-trocar:hover {
  background: var(--laranja-btn-hover);
  transform: translateY(-2px);
}

.secao-titulo {
  padding: 30px 50px;
  border-bottom: 1px solid var(--brancoLeve);
}

.rotulo-titulo {
  font-size: 12px;
  font-weight: 700;
  text-transform: uppercase;
  color: var(--azulPadrao);
  margin-bottom: 10px;
  display: block;
  letter-spacing: 1.5px;
}

.entrada-titulo {
  width: 100%;
  border: none;
  background: transparent;
  font-family:  "Poppins", sans-serif;
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
  padding: 12px 50px;
  background: #fdfdfd;
  border-bottom: 1px solid var(--brancoLeve);
  display: flex;
  justify-content: flex-end;
  gap: 25px;
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
  padding: 30px 50px;
}

#editor-texto {
  width: 100%;
  min-height: 550px;
  padding: 36px 32px 36px 32px; 
  font-family: 'Lora', serif;
  font-size: 1.2rem;
  line-height: 36px;
  border: 1px solid var(--borda);
  border-radius: var(--raio);
  resize: vertical;
  outline: none;
  color: var(--texto);
  background-image: linear-gradient(rgba(196, 212, 232, 0.6) 1px, transparent 1px);
  background-size: 100% 36px;
  background-attachment: local;
  
  transition: border-color var(--trans);
}

#editor-texto:focus {
  border-color: var(--azulPadrao);
}

.rodape-controles {
  padding: 30px 50px;
  display: flex;
  justify-content: space-between;
  background: #fafafa;
  border-top: 1px solid var(--borda-clara);
}

.grupo-botoes {
  display: flex;
  gap: 12px;
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

.btn-voltar {
  background: transparent;
  color: var(--texto-sec);
}

.btn-voltar:hover {
  color: var(--vermelho);
}

.btn-salvar {
  background: var(--brancoLeve);
  color: var(--azul-escuro);
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
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  display: flex;
  align-items: center;
  justify-content: center;
  z-index: 10000;
}

.conteudo-modal {
  background: var(--brancoPadrao);
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
  color: var(--laranja-escuro);
  padding: 15px 0;
  font-size: 0.85rem;
  font-weight: 700;
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 8px;
}

.esmaecer-enter-active,
.esmaecer-leave-active {
  transition: opacity 0.25s ease;
}

.esmaecer-enter-from,
.esmaecer-leave-to {
  opacity: 0;
}

@media (max-width: 768px) {
  .area-escrita,
  .secao-titulo,
  .barra-ferramentas,
  .rodape-controles {
    padding: 20px;
  }

  .rodape-controles {
    flex-direction: column;
    gap: 15px;
  }

  .grupo-botoes {
    flex-direction: column;
  }

  .btn {
    justify-content: center;
  }
}
</style>
