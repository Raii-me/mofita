<template>
  <Teleport to="body">
      <div v-if="modelValue" class="overlay" @click.self="fechar">

        <div class="modal" role="dialog" aria-modal="true">

          <header class="modal-cabecalho">
            <div>
              <span class="badge">ENEM • REDAÇÃO</span>
              <h2>As 5 Competências</h2>
              <p>Critérios oficiais de avaliação</p>
            </div>
            <button class="btn-fechar" @click="fechar" aria-label="Fechar">&times;</button>
          </header>

          <nav class="abas">
            <button v-for="(competencia, indice) in competencias" :key="competencia.id"
              :class="['aba', { ativa: indiceAtivo === indice }]" @click="indiceAtivo = indice">
              C{{ competencia.id }}
            </button>
          </nav>

          <div class="conteudo">
              <article :key="indiceAtivo">

                <div class="art-cabecalho">
                  <span class="art-numero">C{{ atual.id }}</span>
                  <div>
                    <small>Competência {{ atual.id }}</small>
                    <h3>{{ atual.titulo }}</h3>
                  </div>
                </div>

                <p class="art-descricao">{{ atual.descricao }}</p>

                <h4 class="art-secao-titulo">O QUE É AVALIADO</h4>
                <ul class="art-criterios">
                  <li v-for="(criterio, i) in atual.criterios" :key="i">{{ criterio }}</li>
                </ul>

                <div class="art-dica">
                  <strong>{{ atual.dica.label }}:</strong>
                  <span>{{ atual.dica.texto }}</span>
                </div>

              </article>
          </div>

        </div>
      </div>
  </Teleport>
</template>

<script>

  //organizei em array aqui apenas por melhor pratica e poder mexer de maneira mais facil futuramente, não e necessario tabela ou nada no banco de dados
const COMPETENCIAS = [
  {
    id: 1,
    titulo: "Domínio da Norma Culta",
    descricao:
      "Avalia o domínio da modalidade escrita formal da língua portuguesa, considerando a construção sintática, o uso adequado das convenções gramaticais, a escolha lexical e a capacidade de estruturar períodos claros, sofisticados e linguisticamente precisos. Essa competência analisa não apenas a ausência de erros, mas também o nível de controle da linguagem formal utilizado ao longo da redação.",

    criterios: [
      "Estrutura sintática fluida, organizada e bem articulada, evitando fragmentações ou períodos excessivamente confusos",
      "Conformidade com as normas de concordância verbal e nominal, regência e colocação pronominal",
      "Precisão vocabular, com uso de linguagem formal adequada ao contexto dissertativo-argumentativo",
      "Uso correto de pontuação, acentuação gráfica e ortografia conforme a norma-padrão",
      "Capacidade de construir períodos complexos sem comprometer a clareza textual",
      "Ausência de marcas excessivas de oralidade, informalidade ou vícios de linguagem",
      "Variedade estrutural nas frases, demonstrando domínio avançado da escrita formal"
    ],

    dica: {
      label: "Estratégia",
      texto:
        "Para atingir o nível máximo da Competência 1, não basta apenas evitar erros gramaticais. É necessário demonstrar domínio sofisticado da escrita formal, utilizando estruturas sintáticas variadas, vocabulário preciso e períodos bem articulados que transmitam clareza, maturidade linguística e segurança argumentativa."
    }
  },

  {
    id: 2,
    titulo: "Compreensão do Tema e Repertório",
    descricao:
      "Verifica a compreensão integral da proposta de redação e a capacidade de desenvolver o tema utilizando repertório sociocultural pertinente, produtivo e legitimado. Essa competência avalia se o participante consegue interpretar corretamente o tema, selecionar conhecimentos relevantes de diferentes áreas e utilizá-los estrategicamente para aprofundar sua argumentação.",

    criterios: [
      "Abordagem completa e precisa de todos os conceitos presentes nas palavras-chave do tema",
      "Uso de repertório sociocultural legitimado, pertinente ao debate e produtivamente articulado ao argumento",
      "Adesão rigorosa à estrutura dissertativo-argumentativa exigida pelo ENEM",
      "Desenvolvimento de ideias que extrapolem os textos motivadores sem se limitar a resumos",
      "Construção de uma tese clara e coerente com a problemática apresentada",
      "Capacidade de relacionar conhecimentos históricos, sociais, filosóficos ou culturais ao tema discutido",
      "Profundidade analítica na discussão do problema social apresentado"
    ],

    dica: {
      label: "Foco",
      texto:
        "O repertório sociocultural só gera pontuação elevada quando fortalece efetivamente a argumentação. Não basta citar filósofos, dados ou obras; é necessário explicar claramente como aquela referência comprova, contextualiza ou aprofunda o ponto de vista defendido no texto."
    }
  },

  {
    id: 3,
    titulo: "Projeto de Texto e Argumentação",
    descricao:
      "Avalia a capacidade de selecionar, relacionar, organizar e interpretar informações, fatos e argumentos em defesa de um ponto de vista. Essa competência analisa a construção estratégica do texto, a coerência da linha argumentativa e o desenvolvimento consistente das ideias ao longo da redação.",

    criterios: [
      "Presença de um projeto de texto estratégico, organizado e claramente identificável",
      "Tese explícita e defesa consistente de um ponto de vista ao longo de toda a redação",
      "Progressão temática lógica, garantindo avanço argumentativo entre os parágrafos",
      "Desenvolvimento aprofundado dos argumentos com explicações, justificativas e consequências",
      "Capacidade de estabelecer relações claras entre causas, impactos e desdobramentos sociais",
      "Articulação eficiente entre repertório, análise crítica e construção argumentativa",
      "Ausência de contradições internas ou repetições improdutivas de ideias"
    ],

    dica: {
      label: "Análise",
      texto:
        "Cada parágrafo de desenvolvimento deve aprofundar a discussão do problema apresentado. Para isso, procure responder constantemente perguntas como: 'Por que isso acontece?', 'Quais são os impactos sociais dessa situação?' e 'Como esse problema afeta a sociedade brasileira?'."
    }
  },

  {
    id: 4,
    titulo: "Coesão e Mecanismos Linguísticos",
    descricao:
      "Mede o domínio dos recursos coesivos responsáveis pela articulação lógica entre frases, períodos e parágrafos. Essa competência avalia a fluidez textual, a conexão entre ideias e a capacidade de organizar linguisticamente os argumentos de forma clara, progressiva e coerente.",

    criterios: [
      "Presença de operadores argumentativos adequados entre os parágrafos, garantindo progressão textual",
      "Uso variado e estratégico de conectivos dentro dos períodos e parágrafos",
      "Emprego correto de pronomes, sinônimos e mecanismos referenciais para evitar repetições excessivas",
      "Manutenção da coerência semântica por meio de transições bem construídas",
      "Capacidade de conectar causas, consequências, exemplificações e conclusões de forma lógica",
      "Uso equilibrado de elementos coesivos sem artificialidade ou excesso de repetição",
      "Organização textual fluida, favorecendo clareza e continuidade argumentativa"
    ],

    dica: {
      label: "Técnica",
      texto:
        "Utilize conectivos de maneira estratégica para orientar o leitor ao longo da argumentação. Iniciar parágrafos com expressões como 'Nesse contexto', 'Ademais', 'Sob essa perspectiva' ou 'Portanto' contribui significativamente para a fluidez, organização lógica e sofisticação textual."
    }
  },

  {
    id: 5,
    titulo: "Proposta de Intervenção",
    descricao:
      "Avalia a elaboração de uma proposta de intervenção detalhada, viável e relacionada ao problema discutido na redação, sempre respeitando os direitos humanos. Essa competência exige a construção de uma solução concreta, organizada e coerente com os argumentos desenvolvidos ao longo do texto.",

    criterios: [
      "Presença dos cinco elementos fundamentais: agente, ação, meio/modo, finalidade e detalhamento",
      "Articulação clara entre a proposta de intervenção e os problemas discutidos no desenvolvimento",
      "Exequibilidade da solução apresentada dentro da realidade social brasileira",
      "Detalhamento consistente de pelo menos um dos elementos da proposta",
      "Clareza na definição das responsabilidades dos agentes envolvidos",
      "Apresentação de ações concretas e socialmente relevantes",
      "Respeito aos direitos humanos e aos valores democráticos"
    ],

    dica: {
      label: "Checklist",
      texto:
        "O detalhamento é um dos fatores mais importantes para alcançar a pontuação máxima na Competência 5. Explique como a ação será executada, quais ferramentas serão utilizadas, quem participará do processo ou quais resultados concretos poderão ser alcançados com a intervenção proposta."
    }
  }
];

export default {
  name: "ModalCompetencias",

  props: {
    modelValue: { type: Boolean, required: true }
  },

  emits: ["update:modelValue"],

  data() {
    return {
      competencias: COMPETENCIAS,
      indiceAtivo: 0
    };
  },

  computed: {
    atual() { return this.competencias[this.indiceAtivo]; },
    isPrimeiro() { return this.indiceAtivo === 0; },
    isUltimo() { return this.indiceAtivo === this.competencias.length - 1; }
  },



  mounted() { window.addEventListener("keydown", this.aoTeclar); },
  beforeUnmount() {
    window.removeEventListener("keydown", this.aoTeclar);
    document.body.style.overflow = "";
  },

  methods: {
    fechar() { this.$emit("update:modelValue", false); },
    avancar() { this.isUltimo ? this.fechar() : this.indiceAtivo++; },
    voltar() { if (!this.isPrimeiro) this.indiceAtivo--; },
    aoTeclar(e) {
      if (!this.modelValue) return;
      if (e.key === "Escape") this.fechar();
      if (e.key === "ArrowRight") this.avancar();
      if (e.key === "ArrowLeft") this.voltar();
    }
  }
};
</script>

<style scoped>
@import "../../assets/css/variaveis.css";

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

.modal {
  background: var(--branco);
  width: 100%;
  max-width: 45%;
  max-height: 95vh;
  border-radius: var(--radius-grande);
  display: flex;
  flex-direction: column;
  overflow: hidden;
  box-shadow: var(--shadowPadrao);
  scrollbar-width: thin;
  scrollbar-color: var(--borda-clara) transparent;
}

.modal-cabecalho {
  padding: 1.5rem 2rem;
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  border-bottom: 1px solid var(--borda-clara);
}

.badge {
  color: var(--laranjaPadrao);
  font-size: 0.7rem;
  font-weight: 700;
  letter-spacing: 1px;
}

.modal-cabecalho h2 {
  font-size: 1.25rem;
  color: var(--texto);
  margin: 4px 0;
}

.modal-cabecalho p {
  font-size: 0.85rem;
  color: var(--cinzaForte);
  margin: 0;
}

.btn-fechar {
  background: none;
  border: none;
  font-size: 1.75rem;
  line-height: 1;
  cursor: pointer;
  color: var(--cinzaForte);
  transition: color var(--trans);
}

.btn-fechar:hover {
  color: var(--texto);
}

.abas {
  padding: 1rem 2rem;
  display: flex;
  gap: 0.5rem;
  background: var(--surface-2);
}

.aba {
  flex: 1;
  padding: 8px;
  border-radius: var(--radius-pequeno);
  border: 1px solid var(--borda-clara);
  background: var(--branco);
  color: var(--texto);
  font-weight: 700;
  font-size: 1rem;
  cursor: pointer;
  transition: var(--trans);
}

.aba.ativa {
  background: var(--laranjaPadrao);
  color: var(--branco);
  border-color: var(--laranjaPadrao);
}

.aba:hover:not(.ativa) {
  border-color: var(--laranjaPadrao);
  color: var(--laranjaPadrao);
}

.conteudo {
  flex: 1;
  padding: 1.5rem 2rem 4em;
  overflow-y: auto;
}

.art-cabecalho {
  display: flex;
  align-items: center;
  gap: 1rem;
  margin-bottom: 1.25rem;
}

.art-numero {
  background: #fff4ec;
  color: var(--laranjaPadrao);
  width: 56px;
  height: 56px;
  display: flex;
  font-size: 1.2em;
  align-items: center;
  justify-content: center;
  border-radius: var(--radius-medio);
  font-weight: 900;
  flex-shrink: 0;
}

.art-cabecalho small {
  font-size: 1rem;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.8px;
  color: var(--laranjaPadrao);
}

.art-cabecalho h3 {
  font-size: 1.3rem;
  color: var(--texto);
  margin: 3px 0 0;
}

.art-descricao {
  background: var(--surface-2);
  border-left: 3px solid var(--laranjaPadrao);
  padding: 0.875rem 1rem;
  border-radius: var(--radius-medio);
  font-size: 1rem;
  line-height: 1.65;
  color: var(--texto);
  margin: 0 0 1.25rem;
}

.art-secao-titulo {
  font-size: 0.9rem;
  font-weight: 700;
  letter-spacing: 0.8px;
  color: var(--cinzaForte);
  margin: 0 0 0.75rem;
}

.art-criterios {
  list-style: none;
  padding: 0;
  margin: 0 0 1.25rem;
  display: flex;
  flex-direction: column;
  gap: 6px;
}

.art-criterios li {
  padding: 8px 12px;
  border: 1px solid var(--borda);
  border-radius: var(--radius-pequeno);
  font-size: 1rem;
  color: var(--texto-sec);
  transition: border-color var(--trans);
}

.art-criterios li:hover {
  border-color: var(--laranjaPadrao);
}

.art-dica {
  padding: 0.875rem 1rem;
  border: 1px dashed var(--laranjaPadrao);
  border-radius: var(--radius-medio);
  font-size: 1rem;
  background: var(--surface-2);
  color: var(--texto);
  line-height: 1.6;
}

.art-dica strong {
  color: var(--laranjaPadrao);
  margin-right: 4px;
}

</style>