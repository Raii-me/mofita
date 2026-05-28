<script>
import Header from "../../components/layout/Header.vue"
import Footer from "../../components/layout/Footer.vue"
import Chatbot from "../../components/features/Chatbot.vue"
import ModalCompetencias from "../../components/features/ModalCompetencias.vue";
import "../../assets/css/variaveis.css";

export default {
  components: { Header, Footer, Chatbot, ModalCompetencias},

  data() {
    return {
      modalRedacao: false,
      modalAberto: false,
      redacao: {
        titulo:
          "A importância da preservação das línguas e tradições indígenas para a cultura nacional",
        dataEntrega: "02/01/2025",
        notaGeral: 820,
        notaMaxima: 1000,
        texto: `A manutenção das línguas indígenas representa, antes de tudo, a preservação de cosmovisões únicas que enriquecem o patrimônio cultural da humanidade. No Brasil, país que abriga mais de 150 línguas nativas ainda ativas, a negligência histórica do Estado frente a esse universo linguístico configura uma das mais graves formas de apagamento cultural.

Nesse contexto, é fundamental compreender que cada língua carrega consigo uma forma singular de interpretar o mundo. O linguista Edward Sapir, ao desenvolver a hipótese da relatividade linguística, demonstrou que a estrutura de uma língua condiciona a percepção de seus falantes. Ao se perder uma língua indígena, perde-se, portanto, uma perspectiva irrecuperável sobre a natureza, as relações humanas e o tempo — conhecimentos que poderiam, inclusive, contribuir para soluções a problemas contemporâneos como as mudanças climáticas.

Ademais, a desvalorização das tradições indígenas impacta diretamente a autoestima e a saúde mental dos povos originários. Estudos do Conselho Indigenista Missionário (CIMI) apontam que comunidades com maior preservação cultural apresentam menores índices de suicídio entre jovens, evidenciando a relação entre identidade cultural e bem-estar psicológico. A escola, historicamente um espaço de imposição da cultura hegemônica, tem o papel de inverter essa lógica e tornar-se um ambiente de valorização e transmissão dos saberes ancestrais.

Diante do exposto, é imperativo que o Estado brasileiro, por meio do Ministério da Educação em parceria com a FUNAI, implemente políticas de educação bilíngue intercultural nas comunidades indígenas, garantindo a presença de professores falantes nativos e a produção de materiais didáticos nas línguas originárias. Tal medida visa assegurar a transmissão intergeracional desses saberes, contribuindo para que o Brasil honre seu compromisso constitucional com a diversidade cultural e cumpra os objetivos de desenvolvimento sustentável assumidos perante a ONU.`,
      },

      feedbacks: [
        {
          id: 1,
          competencia_n: "Competência 1",
          competencia:
            "Competência 1 — Domínio da modalidade formal da língua portuguesa",
          descricao: "Domínio da modalidade formal da língua portuguesa",
          nota: 200,
          max: 200,
          texto: `Bem trabalhado! Você demonstrou um bom conhecimento das normas gramaticais, mantendo ao longo de todo o texto uma escrita formal e adequada. Foram identificados apenas alguns pequenos desvios que não comprometeram a qualidade geral. Com atenção a esses detalhes, é possível alcançar a nota máxima nesta competência.`,
        },
        {
          id: 2,
          competencia_n: "Competência 2",
          competencia: "Competência 2 — Compreensão da proposta de redação",
          descricao: "Compreensão da proposta de redação",
          nota: 200,
          max: 200,
          texto: `Excelente! Você demonstrou plena compreensão do tema proposto, abordando com clareza e profundidade a importância da preservação das línguas e tradições indígenas para a cultura nacional. Sua redação manteve foco absoluto no tema, sem desvios ou tangenciamentos.`,
        },
        {
          id: 3,
          competencia_n: "Competência 3",
          competencia: "Competência 3 — Organização e Defesa do Ponto de Vista",
          descricao: "Organização e defesa do ponto de vista",
          nota: 180,
          max: 200,
          texto: `Boa estrutura argumentativa! Você apresentou um ponto de vista claro e buscou sustentá-lo com argumentos relevantes. No entanto, alguns argumentos poderiam ser mais aprofundados e melhor articulados entre si para tornar a defesa ainda mais convincente e coesa.`,
        },
        {
          id: 4,
          competencia_n: "Competência 4",
          competencia:
            "Competência 4 — Conhecimento dos Mecanismos Linguísticos",
          descricao: "Conhecimento dos mecanismos linguísticos",
          nota: 180,
          max: 200,
          texto: `Bom uso dos elementos de coesão! Você utilizou conectivos e recursos de referenciação de forma adequada em boa parte do texto. Ainda assim, em alguns momentos a progressão textual poderia ser mais fluida, com melhor encadeamento entre os parágrafos.`,
        },
        {
          id: 5,
          competencia_n: "Competência 5",
          competencia: "Competência 5 — Proposta de Intervenção",
          descricao: "Proposta de intervenção",
          nota: 170,
          max: 200,
          texto: `Sua proposta de intervenção precisa ser mais detalhada e específica. É fundamental indicar: o agente responsável, a ação a ser realizada, o meio de execução, a finalidade e o possível efeito. Desenvolva melhor sua proposta para conquistar pontuação mais alta nesta competência.`,
        },
      ],
    };
  },

  computed: {
    percentualNotaGeral() {
      return Math.round(
        (this.redacao.notaGeral / this.redacao.notaMaxima) * 100,
      );
    },
    notaGeralDashoffset() {
      const circunferencia = 2 * Math.PI * 54;
      return circunferencia - (this.percentualNotaGeral / 100) * circunferencia;
    },
  },

  watch: {
  modalRedacao(val) {
    this.travarScroll(val);
  },
  modalAberto(val) {
    this.travarScroll(val);
  }
},

  methods: {
    calcularPercentual(nota, max) {
      return Math.round((nota / max) * 100);
    },

    travarScroll(ativo) {
    document.body.style.overflow = ativo ? "hidden" : "";
  },

    formatarParagrafos(texto) {
  return texto
    .split(/\n+/)
    .map(p => p.trim())
    .filter(p => p.length > 0);
},

    getCorPorDesempenho(nota, max) {
      const pct = nota / max;
      if (pct >= 0.8) return "#22c55e";
      if (pct >= 0.65) return "#f97316";
      return "#ef4444";
    },

    getLabelPorDesempenho(nota, max) {
      const pct = nota / max;
      if (pct >= 0.8) return "Excelente";
      if (pct >= 0.65) return "Bom";
      return "Atenção";
    },
  },
};
</script>

<template>
  <ModalCompetencias v-model="modalAberto" />
  <Header />

  <div class="detalhes-redacao-pagina">


    <section class="cabecalho-redacao">
      <div class="cabecalho-redacao__inner">

        <div class="cabecalho-redacao__texto">
          <h1 class="titulo-da-redacao">{{ redacao.titulo }}</h1>

          <div class="redacao-metadata">
            <span class="redacao-metadata__chip">
              Avaliação realizada em {{ redacao.dataEntrega }}
            </span>
          </div>

        <div class="hero-actions">
            <button class="botao-ver-redacao" @click="modalRedacao = true">Ver Texto Original ↗</button>
            <button class="botao-ver-redacao botao-ver-redacao botao-ver-redacao--outline" @click="modalAberto = true">Ver competencias ↗</button>
          </div>
        </div>

        <div class="nota-geral-card">
          <p class="nota-geral-card__titulo">Desempenho Geral</p>

          <div class="nota-geral-grafico">
            <svg class="nota-geral-grafico__svg" viewBox="0 0 120 120">
              <circle cx="60" cy="60" r="54" fill="none" stroke="#f0f0f0" stroke-width="10" />
              <circle
                cx="60" cy="60" r="54"
                fill="none"
                :stroke="getCorPorDesempenho(redacao.notaGeral, redacao.notaMaxima)"
                stroke-width="10"
                stroke-linecap="round"
                stroke-dasharray="339.3"
                :stroke-dashoffset="notaGeralDashoffset"
                transform="rotate(-90 60 60)"
                class="nota-geral-grafico__arco"
              />
            </svg>
            <div class="nota-geral-grafico__centro">
              <span
                class="nota-geral-grafico__valor"
                :style="{ color: getCorPorDesempenho(redacao.notaGeral, redacao.notaMaxima) }"
              >
                {{ redacao.notaGeral }}
              </span>
              <span class="nota-geral-grafico__maximo">/{{ redacao.notaMaxima }}</span>
            </div>
          </div>
        </div>

      </div>
    </section>


    <section class="secao-competencias">
      <div class="secao-competencias__inner">
        <h2 class="secao-titulo">Desempenho por competência</h2>
        <p class="secao-feedbacks__subtitulo">
          Tenha uma vista geral de seu desempenho nas competências.
        </p>

        <div class="competencias-grid">
          <div v-for="feedback in feedbacks" :key="feedback.id" class="competencia-card">
            <div class="competencia-card__cabecalho">
              <span class="competencia-card__numero">C{{ feedback.id }}</span>
              <span
                class="competencia-card__status"
                :style="{
                  color: getCorPorDesempenho(feedback.nota, feedback.max),
                  background: getCorPorDesempenho(feedback.nota, feedback.max) + '18',
                }"
              >
                {{ getLabelPorDesempenho(feedback.nota, feedback.max) }}
              </span>
            </div>

            <div class="competencia-card__nota">
              <span
                class="competencia-card__nota-valor"
                :style="{ color: getCorPorDesempenho(feedback.nota, feedback.max) }"
              >
                {{ feedback.nota }}
              </span>
              <span class="competencia-card__nota-maximo">/{{ feedback.max }}</span>
            </div>

            <div class="barra-progresso">
              <div
                class="barra-progresso__preenchimento"
                :style="{
                  width: calcularPercentual(feedback.nota, feedback.max) + '%',
                  background: getCorPorDesempenho(feedback.nota, feedback.max),
                }"
              ></div>
            </div>

            <p class="competencia-card__descricao">{{ feedback.descricao }}</p>
          </div>
        </div>
      </div>
    </section>

    <section class="secao-feedbacks">
      <div class="secao-feedbacks__inner">
        <h2 class="secao-titulo">Feedback das competências</h2>
        <p class="secao-feedbacks__subtitulo">
          Análise detalhada da sua performance em cada critério de avaliação.
        </p>

        <div class="feedbacks-lista">
          <div v-for="feedback in feedbacks" :key="feedback.id" class="feedback-card">
            <div
              class="feedback-card__barra-lateral"
              :style="{ background: getCorPorDesempenho(feedback.nota, feedback.max) }"
            ></div>

            <div class="feedback-card__corpo">
              <div class="feedback-card__linha-principal">
                <div class="feedback-card__texto-wrapper">
                  <p class="feedback-card__nome-competencia">
                    {{ feedback.competencia }}
                  </p>
                  <p class="feedback-card__texto">{{ feedback.texto }}</p>
                </div>

                <div class="feedback-card__nota-wrapper">
                  <div
                    class="feedback-card__nota-circulo"
                    :style="{ borderColor: getCorPorDesempenho(feedback.nota, feedback.max) }"
                  >
                    <span
                      class="feedback-card__nota-valor"
                      :style="{ color: getCorPorDesempenho(feedback.nota, feedback.max) }"
                    >
                      {{ feedback.nota }}
                    </span>
                    <span class="feedback-card__nota-maximo">/{{ feedback.max }}</span>
                  </div>
                  <span
                    class="feedback-card__percentual-pill"
                    :style="{
                      color: getCorPorDesempenho(feedback.nota, feedback.max),
                      background: getCorPorDesempenho(feedback.nota, feedback.max) + '18',
                    }"
                  >
                    {{ calcularPercentual(feedback.nota, feedback.max) }}%
                  </span>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

  </div>
  
  <Teleport to="body">
  <Transition name="fade">
    
    <div
      v-if="modalRedacao"
      class="overlay"
      @click.self="modalRedacao = false"
    >
      
      <div class="modal-redacao">

        <header class="modal-cabecalho">
          <div>
            <span class="badge">REDAÇÃO</span>
            <h2>{{ redacao.titulo }}</h2>
          </div>

          <button
            class="btn-fechar"
            @click="modalRedacao = false"
          >
            &times;
          </button>
        </header>

        <div class="modal-corpo">

          <div class="texto-redacao">
             <p v-for="(paragrafo, i) in formatarParagrafos(redacao.texto)" :key="i">
              {{ paragrafo }}
            </p>
          </div>

        </div>

      </div>

    </div>

  </Transition>
</Teleport>
  
  <Chatbot />
  <Footer />
</template>

<style scoped>
.detalhes-redacao-pagina {
  min-height: 100vh;
  background: var(--surface);
  font-family: 'Poppins', "Segoe UI", sans-serif;
}

.cabecalho-redacao {
  background: var(--brancoPadrao);
  border-bottom: 1px solid var(--borda-clara);
  padding: 60px 0 40px;
}

.cabecalho-redacao__inner {
  width: 90%;
  max-width: 1200px;
  margin: 0 auto;
  display: flex;
  align-items: flex-start;
  gap: 48px;
}

.cabecalho-redacao__texto {
  flex: 1;
}

.titulo-da-redacao {
  font-size: clamp(1.1rem, 2.5vw, 1.55rem);
  font-weight: 800;
  color: var(--laranjaPadrao);
  line-height: 1.4;
  margin: 0 0 20px;
  letter-spacing: -0.3px;
  max-width: 640px;
}

.redacao-metadata {
  display: flex;
  gap: 10px;
  flex-wrap: wrap;
  margin-bottom: 28px;
}

.redacao-metadata__chip {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 0.78rem;
  font-weight: 500;
  color: var(--cinzaForte);
  background: var(--cinzaPadrao);
  padding: 5px 12px;
  border-radius: 30px;
  border: 1px solid var(--borda-clara);
}

.hero-actions {
  display: flex;
  gap: 14px;
}

.botao-ver-redacao {
  padding: 12px 26px;
  background: var(--laranjaPadrao);
  color: #fff;
  border: none;
  border-radius: 10px;
  font-size: 14px;
  font-weight: 700;
  cursor: pointer;
  transition: all 0.25s ease;
  box-shadow: var(--laranjaShadow);
  white-space: nowrap;
}

.botao-ver-redacao--outline {
  background: transparent;
  color: var(--laranjaPadrao);
  border: 2px solid var(--laranjaPadrao);
  box-shadow: none;
}

.botao-ver-redacao:hover {
  background: var(--laranjaEscuro);
  transform: translateY(-2px);
  box-shadow: 0 0 20px rgba(245, 158, 11, 0.4);
}

.botao-ver-redacao--outline:hover {
  background: var(--laranjaPadrao);
  color: #fff;
  box-shadow: var(--laranjaShadow);
}

.nota-geral-card {
  background: var(--brancoPadrao);
  border: 1.5px solid var(--borda-clara);
  border-radius: 20px;
  padding: 30px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 12px;
  min-width: 200px;
  box-shadow: var(--sombra-sm);
}

.nota-geral-card__titulo {
  font-size: 0.78rem;
  font-weight: 700;
  color: var(--cinzaForte);
  text-transform: uppercase;
  letter-spacing: 0.8px;
  margin: 0;
}

.nota-geral-grafico {
  position: relative;
  width: 250px;
  height: 120px;
}

.nota-geral-grafico__svg {
  width: 100%;
  height: 100%;
}

.nota-geral-grafico__arco {
  transition: stroke-dashoffset 1.2s cubic-bezier(0.4, 0, 0.2, 1);
}

.nota-geral-grafico__centro {
  position: absolute;
  inset: 0;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

.nota-geral-grafico__valor {
  font-size: 1.6rem;
  font-weight: 900;
  color: var(--texto);
  line-height: 1;
}

.nota-geral-grafico__maximo {
  font-size: 0.72rem;
  color: var(--cinzaForte);
  font-weight: 600;
  margin-top: 2px;
}

.secao-competencias {
  padding: 52px 0;
  background-color: var(--surface-2);
}

.secao-competencias__inner {
  width: 90%;
  max-width: 1200px;
  margin: 0 auto;
}

.secao-titulo {
  font-size: 1.15rem;
  font-weight: 800;
  margin: 0 0 6px;
  letter-spacing: -0.2px;
  color: var(--texto);
}

.secao-feedbacks__subtitulo {
  font-size: 0.88rem;
  color: var(--cinzaForte);
  margin: 0 0 28px;
}

.competencias-grid {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  gap: 16px;
  margin-top: 24px;
}

.competencia-card {
  background: var(--branco);
  border: 1.5px solid var(--borda-clara);
  border-radius: var(--radius-grande);
  padding: 18px 16px;
  display: flex;
  flex-direction: column;
  gap: 10px;
  background: var(--branco);
  transition: all var(--trans);
  box-shadow: var(--sombra-sm);
}

.competencia-card:hover {
  transform: translateY(-4px);
  box-shadow: var(--sombra-md);
  border-color: var(--laranjaPadrao);
}

.competencia-card__cabecalho {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.competencia-card__numero {
  font-size: 0.72rem;
  font-weight: 800;
  color: var(--cinzaForte);
  background: var(--surface-3);
  padding: 3px 8px;
  border-radius: var(--radius-pequeno);
  letter-spacing: 0.4px;
}

.competencia-card__status {
  font-size: 0.65rem;
  font-weight: 700;
  padding: 2px 8px;
  border-radius: 20px;
  letter-spacing: 0.3px;
}

.competencia-card__nota {
  display: flex;
  align-items: baseline;
  gap: 2px;
}

.competencia-card__nota-valor {
  font-size: 1.7rem;
  font-weight: 900;
  line-height: 1;
  color: var(--texto);
}

.competencia-card__nota-maximo {
  font-size: 0.8rem;
  color: var(--cinzaForte);
  font-weight: 600;
}

.barra-progresso {
  width: 100%;
  height: 5px;
  background: var(--cinzaPadrao);
  border-radius: 10px;
  overflow: hidden;
}

.barra-progresso__preenchimento {
  height: 100%;
  border-radius: 10px;
  background: var(--laranjaPadrao);
  transition: width 1.2s cubic-bezier(0.4, 0, 0.2, 1);
}

.competencia-card__descricao {
  font-size: 0.72rem;
  color: var(--cinzaForte);
  line-height: 1.4;
  margin: 0;
}

.secao-feedbacks {
  background: var(--brancoPadrao);
  border-top: 1px solid var(--borda-clara);
  padding: 52px 0;
}

.secao-feedbacks__inner {
  width: 90%;
  max-width: 1200px;
  margin: 0 auto;
}

.feedbacks-lista {
  display: flex;
  flex-direction: column;
  gap: 16px;
  margin-top: 28px;
}

.feedback-card {
  display: flex;
  background: var(--surface-2);
  border: 1.5px solid var(--borda-clara);
  border-radius: var(--radius-medio);
  overflow: hidden;
  transition: all var(--trans);
}

.feedback-card:hover {
  box-shadow: var(--sombra-md);
  transform: translateX(2px);
  border-color: var(--laranjaPadrao);
}

.feedback-card__barra-lateral {
  width: 5px;
  flex-shrink: 0;
  background: var(--laranjaPadrao);
}

.feedback-card__corpo {
  flex: 1;
  padding: 20px 24px;
  display: flex;
  flex-direction: column;
  gap: 14px;
}

.feedback-card__linha-principal {
  display: flex;
  align-items: flex-start;
  gap: 20px;
}

.feedback-card__texto-wrapper {
  flex: 1;
}

.feedback-card__nome-competencia {
  font-size: 0.82rem;
  font-weight: 700;
  color: var(--texto);
  margin: 0 0 8px;
  letter-spacing: -0.1px;
}

.feedback-card__texto {
  font-size: 0.95rem;
  color: var(--texto-sec);
  line-height: 1.75;
  margin: 0;
  text-align: justify;
}

.feedback-card__nota-wrapper {
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 8px;
  flex-shrink: 0;
}

.feedback-card__nota-circulo {
  width: 72px;
  height: 72px;
  border-radius: 50%;
  border: 3px solid var(--laranjaPadrao);
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background: var(--brancoPadrao);
}

.feedback-card__nota-valor {
  font-size: 1.25rem;
  font-weight: 900;
  line-height: 1;
  color: var(--laranjaPadrao);
}

.feedback-card__nota-maximo {
  font-size: 0.62rem;
  color: var(--cinzaForte);
  font-weight: 600;
}

.feedback-card__percentual-pill {
  font-size: 0.72rem;
  font-weight: 700;
  padding: 3px 10px;
  border-radius: 20px;
  letter-spacing: 0.3px;
  background: var(--laranjaPadrao);
  color: var(--texto-forte);
}

.overlay {
  position: fixed;
  inset: 0;
  z-index: 1000;
  background: rgba(0, 0, 0, 0.5);
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 1rem;
}

.modal-redacao {
  background: var(--branco);
  width: 100%;
  max-width: 45%;
  max-height: 95vh;
  border-radius: var(--radius-grande);
  display: flex;
  flex-direction: column;
  overflow: hidden;
  box-shadow: var(--shadowPadrao);
}

.modal-cabecalho {
  padding: 1.5rem 2rem;
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  gap: 16px;
  border-bottom: 1px solid var(--borda-clara);
  flex-shrink: 0;
}

.badge {
  display: block;
  font-size: 0.7rem;
  font-weight: 700;
  letter-spacing: 1px;
  text-transform: uppercase;
  color: var(--laranjaPadrao);
  margin-bottom: 6px;
}

.modal-cabecalho h2 {
  font-size: 1rem;
  font-weight: 800;
  color: var(--texto);
  margin: 0;
  line-height: 1.4;
}

.btn-fechar {
  background: none;
  border: none;
  font-size: 1.75rem;
  line-height: 1;
  cursor: pointer;
  color: var(--cinzaForte);
  flex-shrink: 0;
  transition: color var(--trans);
}

.btn-fechar:hover {
  color: var(--texto);
}

.modal-corpo {
  flex: 1;
  overflow-y: auto;
  padding: 0;
  scrollbar-width: thin;
  scrollbar-color: var(--borda-clara) transparent;
}

.texto-redacao {
  padding: 0px 30px 20px;
  font-family: 'Lora', serif;
  font-size: 0.95rem;
  line-height: 42px;
  color: var(--texto);
  background-image: linear-gradient(var(--azulPadraoClaro) 1px, transparent 1px);
  background-size: 100% 42px;
  background-attachment: local;
  min-height: 100%;
}

.texto-redacao p {
  margin: 0 0 2.8em;
  text-align: justify;
}

.texto-redacao p:last-child {
  margin-bottom: 0;
}

.modal-rodape {
  padding: 1rem 2rem;
  display: flex;
  align-items: center;
  justify-content: space-between;
  border-top: 1px solid var(--borda-clara);
  background: var(--cinzaPadrao);
  flex-shrink: 0;
}

.rodape-nota {
  font-size: 0.85rem;
  color: var(--cinzaForte);
  font-weight: 600;
}

.rodape-nota strong {
  font-size: 1rem;
  color: var(--texto);
}

.btn-primario {
  padding: 9px 20px;
  background: var(--laranjaPadrao);
  color: var(--texto-forte);
  border: none;
  border-radius: var(--radius-pequeno);
  font-size: 13px;
  font-weight: 700;
  cursor: pointer;
  font-family: inherit;
  transition: var(--trans);
}

.btn-primario:hover {
  background: var(--laranjaEscuro);
  transform: translateY(-2px);
}

@media (max-width: 900px) {
  .cabecalho-redacao__inner {
    flex-direction: column;
  }

  .nota-geral-card {
    width: fit-content;
    min-width: unset;
  }

  .competencias-grid {
    grid-template-columns: repeat(3, 1fr);
  }
}

@media (max-width: 560px) {
  .competencias-grid {
    grid-template-columns: repeat(2, 1fr);
  }

  .feedback-card__linha-principal {
    flex-direction: column;
  }

  .feedback-card__nota-wrapper {
    flex-direction: row;
    width: 100%;
    justify-content: flex-start;
  }
}
</style>