<script>
import Header from "../components/Header.vue"
import Footer from "../components/Footer.vue"
import Chatbot from "../components/Chatbot.vue"
import "../assets/css/variaveis.css";

export default {
  components: { Header, Footer, Chatbot },

  data() {
    return {
      redacao: {
        titulo: "A importância da preservação das línguas e tradições indígenas para a cultura nacional",
        dataEntrega: "02/01/2025",
        notaGeral: 910,
        notaMaxima: 1000,
      },

      feedbacks: [
        {
          id: 1,
          competencia_n: "Competência 1",
          competencia: "Competência 1 — Domínio da modalidade formal da língua portuguesa",
          descricao: "Domínio da modalidade formal da língua portuguesa",
          nota: 180,
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
          competencia: "Competência 4 — Conhecimento dos Mecanismos Linguísticos",
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
    }
  },

  computed: {
    percentualNotaGeral() {
      return Math.round((this.redacao.notaGeral / this.redacao.notaMaxima) * 100);
    },
    notaGeralDashoffset() {
      const circunferencia = 2 * Math.PI * 54;
      return circunferencia - (this.percentualNotaGeral / 100) * circunferencia;
    },
  },

  methods: {
    calcularPercentual(nota, max) {
      return Math.round((nota / max) * 100);
    },

    getCorPorDesempenho(nota, max) {
      const pct = nota / max;
      if (pct >= 0.8) return '#22c55e';
      if (pct >= 0.65) return '#f97316';
      return '#ef4444';
    },

    getLabelPorDesempenho(nota, max) {
      const pct = nota / max;
      if (pct >= 0.8) return 'Excelente';
      if (pct >= 0.65) return 'Bom';
      return 'Atenção';
    },
  },
}
</script>

<template>
  <Header />

  <div class="detalhes-redacao-pagina">

    <section class="cabecalho-redacao">
      <div class="cabecalho-redacao__inner">

        <div class="cabecalho-redacao__texto">


          <h1 class="titulo-da-redacao">{{ redacao.titulo }}</h1>

          <div class="redacao-metadata">
            <span class="redacao-metadata__chip">
              Entregue em {{ redacao.dataEntrega }}
            </span>

          </div>
        </div>

        <div class="nota-geral-card">
          <p class="nota-geral-card__titulo">Nota Geral</p>

          <div class="nota-geral-grafico">
            <svg class="nota-geral-grafico__svg" viewBox="0 0 120 120">
              <circle cx="60" cy="60" r="54" fill="none" stroke="#f0f0f0" stroke-width="10" />
              <circle cx="60" cy="60" r="54" fill="none"
                :stroke="getCorPorDesempenho(redacao.notaGeral, redacao.notaMaxima)" stroke-width="10"
                stroke-linecap="round" stroke-dasharray="339.3" :stroke-dashoffset="notaGeralDashoffset"
                transform="rotate(-90 60 60)" class="nota-geral-grafico__arco" />
            </svg>
            <div class="nota-geral-grafico__centro">
              <span class="nota-geral-grafico__valor"
                :style="{ color: getCorPorDesempenho(redacao.notaGeral, redacao.notaMaxima) }">
                {{ redacao.notaGeral }}
              </span>
              <span class="nota-geral-grafico__maximo">/{{ redacao.notaMaxima }}</span>
            </div>
          </div>

          <button class="botao-ver-redacao">Ver Redação ↗</button>
        </div>

      </div>
    </section>

    <section class="secao-competencias">
      <div class="secao-competencias__inner">
        <h2 class="secao-titulo">Desempenho por competência</h2>
        <p class="secao-feedbacks__subtitulo">Tenha uma vista geral de seu desempenho nas competencias.</p>

        <div class="competencias-grid">
          <div v-for="feedback in feedbacks" :key="feedback.id" class="competencia-card">
            <div class="competencia-card__cabecalho">
              <span class="competencia-card__numero">C{{ feedback.id }}</span>
            </div>

            <div class="competencia-card__nota">
              <span class="competencia-card__nota-valor"
                :style="{ color: getCorPorDesempenho(feedback.nota, feedback.max) }">
                {{ feedback.nota }}
              </span>
              <span class="competencia-card__nota-maximo">/{{ feedback.max }}</span>
            </div>

            <p class="competencia-card__descricao">{{ feedback.descricao }}</p>
          </div>
        </div>
      </div>
    </section>

    <section class="secao-feedbacks">
      <div class="secao-feedbacks__inner">
        <h2 class="secao-titulo">Feedback das competências</h2>
        <p class="secao-feedbacks__subtitulo">Análise detalhada da sua performance em cada critério de avaliação.</p>

        <div class="feedbacks-lista">
          <div v-for="feedback in feedbacks" :key="feedback.id" class="feedback-card">
            <div class="feedback-card__barra-lateral"
              :style="{ background: getCorPorDesempenho(feedback.nota, feedback.max) }"></div>

            <div class="feedback-card__corpo">
              <div class="feedback-card__linha-principal">
                <div class="feedback-card__texto-wrapper">
                  <p class="feedback-card__nome-competencia">{{ feedback.competencia }}</p>
                  <p class="feedback-card__texto">{{ feedback.texto }}</p>
                </div>

                <div class="feedback-card__nota-wrapper">
                  <div class="feedback-card__nota-circulo"
                    :style="{ borderColor: getCorPorDesempenho(feedback.nota, feedback.max) }">
                    <span class="feedback-card__nota-valor"
                      :style="{ color: getCorPorDesempenho(feedback.nota, feedback.max) }">
                      {{ feedback.nota }}
                    </span>
                    <span class="feedback-card__nota-maximo">/{{ feedback.max }}</span>
                  </div>

                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

  </div>

  <Chatbot />
  <Footer />
</template>

<style scoped>
.detalhes-redacao-pagina {
  min-height: 100vh;
  background: #f7f7f5;
  font-family: 'Segoe UI', sans-serif;
}

.cabecalho-redacao {
  background: #fff;
  border-bottom: 1px solid #ebebeb;
  padding: 48px 0 40px;
}

.cabecalho-redacao__inner {
  width: 90%;
  max-width: 1100px;
  margin: 0 auto;
  display: flex;
  align-items: flex-start;
  gap: 48px;
}

.cabecalho-redacao__texto {
  flex: 1;
}

.navegacao-breadcrumb {
  display: flex;
  align-items: center;
  gap: 6px;
  font-size: 0.78rem;
  color: #9ca3af;
  margin-bottom: 18px;
  font-weight: 500;
  letter-spacing: 0.3px;
}

.navegacao-breadcrumb__separador {
  opacity: 0.5;
}

.navegacao-breadcrumb__pagina-atual {
  color: var(--laranjaPadrao);
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
}

.redacao-metadata__chip {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 0.78rem;
  font-weight: 500;
  color: #6b7280;
  background: #f3f4f6;
  padding: 5px 12px;
  border-radius: 30px;
  border: 1px solid #e5e7eb;
}

.redacao-metadata__chip--corrigida {
  color: #16a34a;
  background: #f0fdf4;
  border-color: #bbf7d0;
}

.nota-geral-card {
  background: #fff;
  border: 1.5px solid #ebebeb;
  border-radius: 20px;
  padding: 24px 28px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 12px;
  min-width: 430px;
  box-shadow: 0 4px 20px rgba(0, 0, 0, 0.06);
}

.nota-geral-card__titulo {
  font-size: 0.78rem;
  font-weight: 700;
  color: #9ca3af;
  text-transform: uppercase;
  letter-spacing: 0.8px;
  margin: 0;
}

.nota-geral-grafico {
  position: relative;
  width: 120px;
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
  color: #111827;
  line-height: 1;
}

.nota-geral-grafico__maximo {
  font-size: 0.72rem;
  color: #9ca3af;
  font-weight: 600;
}

.botao-ver-redacao {
  padding: 9px 22px;
  background: var(--laranjaPadrao);
  color: #fff;
  border: none;
  border-radius: 12px;
  font-size: 0.82rem;
  font-weight: 700;
  cursor: pointer;
  transition: all 0.2s;
  white-space: nowrap;
}

.botao-ver-redacao:hover {
  background: var(--laranja-escuro);
  transform: translateY(-2px);
  box-shadow: 0 4px 14px rgba(249, 115, 22, 0.35);
}

.secao-competencias,
.secao-feedbacks {
  padding: 48px 0;
}

.secao-feedbacks {
  background: #fff;
  border-top: 1px solid #ebebeb;
}

.secao-competencias__inner,
.secao-feedbacks__inner {
  width: 90%;
  max-width: 1100px;
  margin: 0 auto;
}

.secao-titulo {
  font-size: 1.15rem;
  font-weight: 800;
  margin: 0 0 6px;
  letter-spacing: -0.2px;
}

.secao-feedbacks__subtitulo {
  font-size: 0.88rem;
  color: #9ca3af;
  margin: 0 0 28px;
}

.competencias-grid {
  display: grid;
  grid-template-columns: repeat(5, 1fr);
  gap: 16px;
  margin-top: 24px;
}

@media (max-width: 900px) {
  .competencias-grid {
    grid-template-columns: repeat(3, 1fr);
  }

  .cabecalho-redacao__inner {
    flex-direction: column;
  }
}

@media (max-width: 560px) {
  .competencias-grid {
    grid-template-columns: repeat(2, 1fr);
  }
}

.competencia-card {
  background: #fff;
  border: 1.5px solid #ebebeb;
  border-radius: 16px;
  padding: 18px 16px;
  display: flex;
  flex-direction: column;
  gap: 10px;
  transition: all 0.2s;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.04);
}

.competencia-card:hover {
  transform: translateY(-3px);
  box-shadow: 0 8px 24px rgba(0, 0, 0, 0.09);
}

.competencia-card__cabecalho {
  display: flex;
  align-items: center;
  justify-content: space-between;
}

.competencia-card__numero {
  font-size: 0.72rem;
  font-weight: 800;
  color: #6b7280;
  background: #f3f4f6;
  padding: 3px 8px;
  border-radius: 6px;
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
}

.competencia-card__nota-maximo {
  font-size: 0.8rem;
  color: #9ca3af;
  font-weight: 600;
}

.barra-progresso {
  width: 100%;
  height: 5px;
  background: #f0f0f0;
  border-radius: 10px;
  overflow: hidden;
}

.barra-progresso__preenchimento {
  height: 100%;
  border-radius: 10px;
  transition: width 1s cubic-bezier(0.4, 0, 0.2, 1);
}

.competencia-card__descricao {
  font-size: 0.72rem;
  color: #9ca3af;
  line-height: 1.4;
  margin: 0;
}

.feedbacks-lista {
  display: flex;
  flex-direction: column;
  gap: 16px;
  margin-top: 28px;
}

.feedback-card {
  display: flex;
  background: #fafaf9;
  border: 1.5px solid #ebebeb;
  border-radius: 16px;
  overflow: hidden;
  transition: all 0.2s;
}

.feedback-card:hover {
  box-shadow: 0 6px 20px rgba(0, 0, 0, 0.07);
  transform: translateX(2px);
}

.feedback-card__barra-lateral {
  width: 5px;
  flex-shrink: 0;
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
  color: #374151;
  margin: 0 0 8px;
  letter-spacing: -0.1px;
}

.feedback-card__texto {
  font-size: 0.88rem;
  color: #6b7280;
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
  border: 3px solid;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  background: #fff;
}

.feedback-card__nota-valor {
  font-size: 1.25rem;
  font-weight: 900;
  line-height: 1;
}

.feedback-card__nota-maximo {
  font-size: 0.62rem;
  color: #9ca3af;
  font-weight: 600;
}

.feedback-card__percentual-pill {
  font-size: 0.72rem;
  font-weight: 700;
  padding: 3px 10px;
  border-radius: 20px;
  letter-spacing: 0.3px;
}
</style>
