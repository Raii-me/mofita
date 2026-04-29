<script>
import Header from "../components/Header.vue"
import Footer from "../components/Footer.vue"
import Chatbot from "../components/Chatbot.vue"
import "../assets/css/variaveis.css";

export default {
  components: { 
    Header,
    Footer,
    Chatbot
  },

  data() {
    return {
      temaSelecionado: null,
      meusTemas: [
        {
          id: 1,
          titulo: "Perspectivas acerca do envelhecimento na sociedade brasileira",
          categoria: "ENEM",
          subcategoria: "Sociedade",
          imagem: "Temas_Envelhecimento_Sociedade.png",
          apoio: `Em 2022, pessoas com 65 anos ou mais representavam 10,9% da população brasileira, evidenciando o envelhecimento populacional. Esse cenário exige reflexões sobre inclusão social, saúde e valorização dos idosos, além de combater estigmas associados à velhice.`
        },
        {
          id: 2,
          titulo: "Desafios para a valorização da herança africana no Brasil",
          categoria: "ENEM",
          subcategoria: "Cultura",
          imagem: "Temas_Herancas_Africanas.jpg",
          apoio: `A formação cultural brasileira é profundamente marcada pela influência africana, presente em manifestações religiosas, musicais e gastronômicas. Apesar disso, ainda se observam práticas de discriminação e invisibilização dessa herança. A Lei 10.639/03 estabelece a obrigatoriedade do ensino da história e cultura afro-brasileira nas escolas, mas sua implementação enfrenta desafios.`
        },
        {
          id: 3,
          titulo: "desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil",
          categoria: "ENEM",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Invisibilidade_Mulheres.jpg",
          apoio: `O trabalho de cuidado, que inclui tarefas domésticas e atenção a crianças, idosos e pessoas dependentes, é majoritariamente desempenhado por mulheres no Brasil. Apesar de sua importância para o funcionamento da sociedade, esse tipo de trabalho geralmente não é remunerado nem reconhecido economicamente.`
        },
        {
          id: 4,
          titulo: "Desafios para a valorização de comunidades e povos tradicionais no Brasil",
          categoria: "ENEM",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Cominudades_Tradicionais.jpg",
          apoio: `Comunidades indígenas, quilombolas e outros povos tradicionais possuem papel fundamental na preservação ambiental e cultural do país. No entanto, enfrentam desafios como conflitos territoriais, avanço de atividades econômicas e dificuldades no acesso a políticas públicas.`
        },
        {
          id: 5,
          titulo: "Invisibilidade e registro civil: garantia de acesso a cidadania no Brasil",
          categoria: "ENEM",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Reginstro_Civil.jpg",
          apoio: `O registro civil é um direito básico que garante o reconhecimento legal do indivíduo e o acesso a serviços essenciais. No Brasil, ainda existem pessoas sem documentação, o que dificulta o acesso à educação, à saúde e a programas sociais.`
        },
        {
          id: 6,
          titulo: "O estigma associado as doenças mentais na sociedade brasileira",
          categoria: "ENEM",
          subcategoria: "Saúde",
          imagem: "Temas_Doenca_Mental.jpg",
          apoio: `Os transtornos mentais representam um desafio significativo para a saúde pública no Brasil. No entanto, o preconceito e a falta de informação dificultam o diagnóstico e o tratamento, reforçando a necessidade de debates e políticas públicas na área.`
        },
        {
          id: 7,
          titulo: "O desafio de reduzir as desigualdade entre as regiões do Brasil",
          categoria: "ENEM",
          subcategoria: "Desigualdade Social",
          imagem: "Temas_Desigualdade_Social.jpg",
          apoio: `O Brasil apresenta desigualdades regionais históricas, refletidas em indicadores como renda, educação e acesso a serviços básicos. A redução dessas disparidades é um desafio constante para políticas públicas e planejamento nacional.`
        },
        {
          id: 8,
          titulo: "Democratização do acesso ao cinema no Brasil",
          categoria: "ENEM",
          subcategoria: "Cultura",
          imagem: "Temas_Democratizacao_Cinema.jpg",
          apoio: `O acesso ao cinema no Brasil ainda é limitado por fatores econômicos e geográficos. Grande parte das salas de exibição está concentrada em centros urbanos. Iniciativas como cinemas itinerantes e políticas de incentivo cultural buscam ampliar o acesso à produção audiovisual.`
        },
        {
          id: 9,
          titulo: "Manipulação do comportamento do usuário pelo controle de dados na internet",
          categoria: "ENEM",
          subcategoria: "Tecnologia",
          imagem: "Temas_Controle_Dados.jpg",
          apoio: `O avanço das tecnologias digitais possibilitou a coleta e análise de grandes volumes de dados dos usuários. Esses dados são utilizados por algoritmos para personalizar conteúdos e anúncios, influenciando comportamentos e decisões. A Lei Geral de Proteção de Dados (LGPD) busca estabelecer diretrizes para o uso dessas informações.`
        },
        {
          id: 10,
          titulo: "Desafios para a formação educacional dos surdos no Brasil",
          categoria: "ENEM",
          subcategoria: "Educação",
          imagem: "Tema_Educacao_Surdos.jpg",
          apoio: `A Língua Brasileira de Sinais (Libras) é reconhecida oficialmente, mas ainda há escassez de profissionais qualificados. A falta de intérpretes e de professores preparados compromete o processo de aprendizagem. Modelos de educação bilíngue são apontados como alternativas para promover maior inclusão educacional.`
        },
        {
          id: 11,
          titulo: "Como os adolescentes podem usar as redes sociais sem prejudicar a saúde mental?",
          categoria: "Provão Paulista",
          subcategoria: "Saúde",
          imagem: "Temas_Redes_Sociais_Adolecentes.jpg",
          apoio: `O uso das redes sociais tem se intensificado entre adolescentes, influenciando suas relações sociais e comportamentos. Estudos apontam possíveis impactos na saúde mental, como aumento da ansiedade e da insatisfação com a própria imagem.`
        },
        {
          id: 12,
          titulo: "Gentrificação urbana - o processo de transformação de áreas urbanas",
          categoria: "Provão Paulista",
          subcategoria: "Desigualdade Social",
          imagem: "Temas_Gentrificacao.jpg",
          apoio: `A gentrificação é um processo de transformação urbana que ocorre quando áreas valorizadas passam a atrair moradores de maior renda, elevando o custo de vida local. Como consequência, populações tradicionais podem ser deslocadas para regiões periféricas.`
        },
        {
          id: 13,
          titulo: "O combate a fome no Brasil: entr a responsabilidade do estado e a atuação da sociedade civil",
          categoria: "Provão Paulista",
          subcategoria: "Desigualdade Social",
          imagem: "Temas_Fome_Brasil.jpg",
          apoio: `A fome e a insegurança alimentar ainda afetam milhões de brasileiros. O problema está relacionado a fatores como desigualdade social, desemprego e acesso a alimentos. Programas sociais e políticas públicas buscam enfrentar essa questão.`
        },
        {
          id: 14,
          titulo: "Impacto da inteligência artificial nos alunos de escola pública",
          categoria: "Plataforma",
          subcategoria: "Tecnologia",
          imagem: "Temas_IA_Escolas.jpg",
          apoio: `A inteligência artificial tem potencial para transformar o processo educacional, oferecendo ferramentas de personalização do ensino. No entanto, sua aplicação em escolas públicas enfrenta limitações como falta de infraestrutura e acesso à tecnologia.`
        },
        {
          id: 15,
          titulo: "Inclusão social de pessoas com deficiências físicas",
          categoria: "Plataforma",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Resocializacao_Deficientes.jpg",
          apoio: `A inclusão de pessoas com deficiência envolve a eliminação de barreiras físicas e sociais. A legislação brasileira estabelece direitos relacionados à acessibilidade, mas ainda existem desafios na adaptação de espaços urbanos e na inserção no mercado de trabalho.`
        },
        {
          id: 16,
          titulo: "Desafios para manter um consumo consciente",
          categoria: "Plataforma",
          subcategoria: "Natureza",
          imagem: "Temas_Consumo_Consciente.jpg",
          apoio: `O aumento do consumo tem impactos diretos no meio ambiente, como a geração de resíduos e a exploração de recursos naturais. O conceito de consumo consciente envolve práticas como redução, reutilização e reciclagem.`
        },
        {
          id: 17,
          titulo: "Desafios para o ensino de qualidade sobre educação financeira",
          categoria: "Plataforma",
          subcategoria: "Economia",
          imagem: "Temas_Educacao_Financeira.jpg",
          apoio: `A educação financeira tem ganhado destaque diante do aumento do endividamento das famílias brasileiras. A inclusão desse tema na educação básica é apontada como estratégia para promover maior autonomia financeira.`
        },
        {
          id: 18,
          titulo: "O impacto da inteligência artificial na precarização do trabalho e nas relações de consumo",
          categoria: "Plataforma",
          subcategoria: "Tecnologia",
          imagem: "Temas_Substituicao_IA.jpg",
          apoio: `A inteligência artificial está transformando o mercado de trabalho ao automatizar tarefas e criar novas demandas profissionais. Esse processo pode resultar na substituição de algumas funções e na necessidade de requalificação da mão de obra.`
        },
        {
          id: 19,
          titulo: "Impacto da violência doméstica contra a criança e o adolescente no desenvolvimento social",
          categoria: "Plataforma",
          subcategoria: "Violencia",
          imagem: "Temas_Violencia_Criancas.jpg",
          apoio: `A violência doméstica é uma violação de direitos que afeta o desenvolvimento físico e emocional de crianças e adolescentes. O Estatuto da Criança e do Adolescente prevê mecanismos de proteção, mas a identificação e prevenção ainda representam desafios.`
        },
        {
          id: 20,
          titulo: "A persistência da insegurança alimentar e seus reflexos na saúde nacional",
          categoria: "Plataforma",
          subcategoria: "Saúde",
          imagem: "Temas_Inseguranca_Alimentar.jpg",
          apoio: `A insegurança alimentar está relacionada tanto à falta de alimentos quanto à baixa qualidade nutricional. Esse cenário pode resultar em problemas como desnutrição e doenças crônicas.`
        }
      ]
    }
  },

  methods: {
    getImagemUrl(nome) {
      return new URL(`../assets/TEMAS/${nome}`, import.meta.url).href;
    },
    
    abrirModal(tema) {
      this.temaSelecionado = tema;
      document.body.style.overflow = 'hidden';
    },
    fecharModal() {
      this.temaSelecionado = null;
      document.body.style.overflow = '';
    }
  }
}
</script>

<template>
  <Header />

  <section>
    <header class="titulo">
      <h1>Nova Redação</h1>
      <p>Acesse os temas disponíveis na plataforma com textos de apoios e orientações especificas para desenvolver sua
        produção textual com estratégia e foco.</p>
    </header>

    <navbar class="fixar-search-bar">
      <div class="search-bar">
        <div class="caixa-search">
          <button type="submit" id="search" class="search-btn">
            <img src="../assets/ICONS/icon-lupa.png" id="icon-search" />
          </button>
          <input type="text" id="text" class="input-text" placeholder="Buscar um tema">
        </div>

        <div class="caixa-random">
          <button type="submit" id="btn-random">
            <img src="../assets/ICONS/icon-dado.png" id="icon-dado">
          </button>
          <p>Aleatorio!</p>
        </div>

        <div class="caixa-category">
          <img src="../assets/ICONS/icon-category-buscar.PNG" id="category-icon">
          <select name="visualizar-detalhe-tema" class="category">
            <option>Todos</option>
            <option value="opcao5">Sociedade</option>
            <option value="opcao6">Cultura</option>
            <option value="opcao7">Inclusão Social</option>
            <option value="opcao8">Saúde</option>
            <option value="opcao9">Desigualdade Social</option>
            <option value="opcao10">Tecnologia</option>
            <option value="opcao11">Educação</option>
            <option value="opcao12">Natureza</option>
            <option value="opcao13">Economia</option>
            <option value="opcao14">Violencia</option>
          </select>
        </div>
      </div>
    </navbar>
  </section>

  <section>
    <main-content class="grid-modelos">

      <div
        v-for="tema in meusTemas"
        :key="tema.id"
        class="card"
        :id="`${tema.id}-tema`"
      >
        <div class="imagem">
          <img :src="getImagemUrl(tema.imagem)" :alt="tema.titulo" id="img-box">
          <div class="escolher-tema">
            <p>{{ tema.subcategoria }}</p>
          </div>
        </div>
        <div class="caixa-descricao-tema">
          <p>{{ tema.titulo }}</p>
          <div class="visualizar-detalhe-tema">
            <p>{{ tema.categoria }}</p>
            <button @click="abrirModal(tema)">Escrever ↗</button>
          </div>
        </div>
      </div>

    </main-content>
  </section>

  <div class="camada-fundo" :class="{ aberta: temaSelecionado }" @click.self="fecharModal">
    <div class="janela-modal" v-if="temaSelecionado">

      <div style="position: relative;">
        <button class="botao-fechar" @click="fecharModal">✕</button>
        <div class="topo-imagem">
          <img
            :src="getImagemUrl(temaSelecionado.imagem)"
            :alt="temaSelecionado.titulo"
          />
        </div>
      </div>

      <div class="corpo-modal">
        <div class="etiqueta-tema">{{ temaSelecionado.subcategoria }} · {{ temaSelecionado.categoria }}</div>
        <div class="titulo-redacao">{{ temaSelecionado.titulo }}</div>

        <div class="subtitulo-secao">Instruções:</div>
        <div class="texto-conteudo instrucoes">
          A partir da leitura dos textos motivadores e com base nos conhecimentos construídos ao longo
          de sua formação, redija um texto dissertativo-argumentativo em modalidade escrita formal da
          língua portuguesa sobre o tema apresentado, organize e relacione, de forma coerente e coesa, argumentos e
          fatos para defesa de seu ponto de vista.
        </div>

        <div class="subtitulo-secao">Texto de Apoio:</div>
        <div class="texto-conteudo">{{ temaSelecionado.apoio }}</div>

        <button class="btn-escolher">Escolher Tema</button>
      </div>

    </div>
  </div>

  <Chatbot />
  <Footer />
</template>

<style scoped>
.fixar-search-bar {
    display: flex;
    justify-content: center;
}

.search-bar {
    display: flex;
    width: 90%;
    margin-top: 40px;
}

.caixa-search {
    display: flex;
    width: 60%;
    height: 38px;
    background-color: var(--branco);
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
    cursor: pointer;
}

#icon-search { margin-top: 2px; }
#icon-dado { margin-top: 5px; }
#category-icon { margin: 10px 0 0 10px; }

.caixa-random {
    display: flex;
    align-items: center;
    width: fit-content;
    height: 38px;
    margin-left: auto;
    background-color: var(--branco);
    border: 1px solid var(--borda);
    border-radius: 10px;
}

#btn-random { margin-left: 10px; }

.caixa-random p {
    display: flex;
    align-items: center;
    margin: 0 10px 0 3px;
    font-size: 14px;
}

.caixa-category {
    display: flex;
    height: 38px;
    margin-left: 1%;
    background-color: var(--branco);
    border: 1px solid var(--borda);
    border-radius: 10px;
}

.category {
    width: 98px;
    height: 38px;
    cursor: pointer;
}

.titulo {
    margin: 40px 0 0 5%;
    max-width: 60%;
}

.titulo p { margin: 5px; }

.grid-modelos {
    display: grid;
    width: 90%;
    max-width: 1200px;
    margin: 5% auto 10%;
    gap: 40px;
    grid-template-columns: repeat(auto-fit, minmax(280px, 1fr));
}

.card {
    position: relative;
    width: 100%;
    height: 270px;
    overflow: hidden;
    background-color: var(--branco);
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
    object-fit: cover;
}

.escolher-tema {
    position: absolute;
    top: 10px;
    left: 10px;
    padding: 5px;
    background-color: var(--branco);
    border-radius: 10px;
}

.caixa-descricao-tema {
    position: absolute;
    bottom: 0;
    width: 100%;
    height: 50%;
    background-color: var(--branco);
    border-radius: 0 0 10px 10px;
}

.caixa-descricao-tema p {
    margin: 2%;
    font-size: 14px;
    text-align: justify;
}

.visualizar-detalhe-tema {
    position: absolute;
    bottom: 3px;
    display: flex;
    align-items: center;
    width: 100%;
    padding: 5px;
}

.visualizar-detalhe-tema p {
    margin: 0 auto 0 3%;
    padding: 5px 15px;
    border: 1px solid var(--borda);
    border-radius: 30px;
}

.visualizar-detalhe-tema button {
    width: 170px;
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

.visualizar-detalhe-tema button:hover {
    background: var(--laranjaEscuro);
    box-shadow: var(--shadowPadrao);
    text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
    transform: translateY(-4px);
}

.camada-fundo {
    position: fixed;
    inset: 0;
    background: rgba(0, 0, 0, 0);
    display: flex;
    align-items: center;
    justify-content: center;
    z-index: 100;
    padding: 1.5rem;
    pointer-events: none;
    transition: background 0.25s;
}

.camada-fundo.aberta {
    background: rgba(0, 0, 0, 0.5);
    pointer-events: all;
}

.janela-modal {
    background: white;
    border-radius: 16px;
    width: 100%;
    max-width: 600px;
    max-height: 90vh;
    overflow-y: auto;
    transform: translateY(28px) scale(0.97);
    opacity: 0;
    transition: transform 0.2s ease, opacity 0.2s ease;
    scrollbar-width: thin;
}

.camada-fundo.aberta .janela-modal {
    transform: translateY(0) scale(1);
    opacity: 1;
}

.topo-imagem {
    width: 100%;
    height: 230px;
    border-radius: 16px 16px 0 0;
    overflow: hidden;
    background: #f0f0f0;
}

.topo-imagem img {
    width: 100%;
    height: 100%;
    object-fit: cover;
}

.botao-fechar {
    position: absolute;
    top: 12px;
    right: 12px;
    width: 32px;
    height: 32px;
    border-radius: 50%;
    background: white;
    border: none;
    font-size: 1rem;
    cursor: pointer;
    display: flex;
    align-items: center;
    justify-content: center;
    color: #374151;
    z-index: 10;
    transition: var(--trans);
}

.botao-fechar:hover {
    background: #f3f4f6;
}

.corpo-modal {
    padding: 1.4rem 1.8rem 2rem;
}

.etiqueta-tema {
    font-size: 0.72rem;
    color: #9ca3af;
    font-weight: 500;
    text-transform: uppercase;
    letter-spacing: 0.6px;
    margin-bottom: 0.3rem;
}

.titulo-redacao {
    font-size: 1.05rem;
    font-weight: 700;
    color: #1a1a2e;
    line-height: 1.45;
    padding-bottom: 1rem;
    border-bottom: 1.5px solid #f0f0f0;
    margin-bottom: 1.5rem;
}

.subtitulo-secao {
    font-size: 0.88rem;
    font-weight: 700;
    color: #1a1a2e;
    margin-bottom: 0.6rem;
}

.texto-conteudo {
    font-size: 0.95rem;
    color: #4b5563;
    line-height: 1.85;
    text-align: justify;
    margin-bottom: 1.5rem;
}

.btn-escolher {
    position: sticky;
    bottom: 15px;
    display: block;
    margin: 10px auto 0;
    width: fit-content;
    padding: 12px 30px;
    background: var(--laranjaPadrao);
    color: white;
    border: none;
    border-radius: 20px;
    font-weight: 700;
    font-size: 0.9rem;
    cursor: pointer;
    transition: var(--trans);
    z-index: 20;
}

.btn-escolher:hover {
    background: var(--laranjaEscuro);
    box-shadow: var(--shadowPadrao);
    transform: translateY(-3px);
}
</style>
