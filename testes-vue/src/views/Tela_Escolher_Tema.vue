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
      temaSelecionado: null,
      meusTemas: [
        {
          id: 1,
          titulo:
            "Perspectivas acerca do envelhecimento na sociedade brasileira",
          categoria: "ENEM",
          subcategoria: "Sociedade",
          imagem: "Temas_Envelhecimento_Sociedade.png",
          apoio: `O envelhecimento da população brasileira é o resultado de uma transição demográfica positiva, fruto de avanços na medicina preventiva e na tecnologia sanitária. Contudo, essa mudança revela um "etarismo" estrutural: a tendência de marginalizar o idoso com base na premissa utilitarista de que o valor humano está atrelado apenas à sua produtividade laboral. É imperativo compreender que a velhice não é sinônimo de incapacidade, mas uma fase que exige a ressignificação do papel social da pessoa idosa para além dos estereótipos de fragilidade.
    Dados do IBGE indicam que, em poucas décadas, o Brasil terá mais idosos do que jovens, o que impõe desafios urgentes às políticas públicas de saúde e previdência. A pressão pelo padrão do "velho ativo" muitas vezes ignora desigualdades históricas, excluindo aqueles que não possuem recursos financeiros ou saúde física para se manterem no mercado. Valorizar o envelhecimento é, portanto, um investimento na justiça social e na garantia de que o bônus demográfico não se transforme em um ônus social para as gerações futuras.`,
        },
        {
          id: 2,
          titulo: "Desafios para a valorização da herança africana no Brasil",
          categoria: "ENEM",
          subcategoria: "Cultura",
          imagem: "Temas_Herancas_Africanas.jpg",
          apoio: `A formação cultural brasileira é indissociável da matriz africana, presente de forma intrínseca na língua, na culinária e nas estruturas sociais. No entanto, séculos de apagamento histórico tentaram reduzir esse legado a um "folclore" exótico, ocultando o protagonismo intelectual e civilizatório dos povos escravizados. O racismo estrutural manifesta-se hoje na estigmatização de religiões de matriz africana e na criminalização de expressões culturais que resistem como símbolos de identidade e luta.
    Embora a Lei 10.639/03 estabeleça a obrigatoriedade do ensino da história afro-brasileira, sua implementação efetiva ainda enfrenta barreiras institucionais e o negacionismo histórico. A educação antirracista é o pilar fundamental para desconstruir preconceitos e formar cidadãos aptos a reconhecer a pluralidade brasileira. Valorizar essa herança é um ato de reparação necessária para a construção de uma democracia que não oculte suas próprias raízes sob o mito da democracia racial.`,
        },
        {
          id: 3,
          titulo:
            "Desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil",
          categoria: "ENEM",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Invisibilidade_Mulheres.jpg",
          apoio: `A "Economia do Cuidado" no Brasil sustenta-se em uma divisão sexual do trabalho arcaica, na qual as mulheres dedicam quase o dobro do tempo dos homens a tarefas domésticas e cuidados com dependentes. Esse esforço, embora vital para a reprodução da força de trabalho e o funcionamento do sistema econômico, permanece invisibilizado e raramente é contabilizado no Produto Interno Bruto (PIB). Trata-se de uma "servidão naturalizada" que priva as mulheres de oportunidades equânimes de desenvolvimento pessoal.
    De acordo com o IBGE, essa disparidade gera a "dupla ou tripla jornada", comprometendo severamente a saúde mental feminina e limitando sua autonomia financeira e ascensão profissional. Superar esse desafio exige que o cuidado deixe de ser visto como um "dom biológico feminino" e passe a ser compreendido como uma responsabilidade compartilhada e um dever do Estado, através da expansão de creches, asilos e políticas de assistência que desonerem a mulher de um fardo historicamente imposto.`,
        },
        {
          id: 4,
          titulo:
            "Desafios para a valorização de comunidades e povos tradicionais no Brasil",
          categoria: "ENEM",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Cominudades_Tradicionais.jpg",
          apoio: `O Brasil abriga uma constelação de 26 comunidades tradicionais — como ribeirinhos, quilombolas, ciganos e extrativistas — que desempenham um papel crucial na manutenção da sociobiodiversidade. Para esses grupos, a terra não possui um valor puramente mercantil; ela é um território sagrado de ancestralidade e subsistência baseado na reciprocidade. No entanto, essas populações enfrentam uma "necropolítica ambiental", sendo alvos diretos da expansão predatória do agronegócio e da mineração ilegal.
    Apesar da Política Nacional (PNPCT) de 2007, a garantia de direitos territoriais esbarra em conflitos violentos e na omissão estatal. Em um cenário global de crise climática, o modo de vida desses povos funciona como um escudo protetor contra o desmatamento. Proteger seus territórios não é apenas uma questão de justiça social ou direitos humanos, mas uma medida estratégica de sobrevivência ambiental para o planeta, garantindo que o conhecimento ancestral ofereça alternativas viáveis ao modelo de exploração exaurível.`,
        },
        {
          id: 5,
          titulo:
            "Invisibilidade e registro civil: garantia de acesso a cidadania no Brasil",
          categoria: "ENEM",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Reginstro_Civil.jpg",
          apoio: `A existência física nem sempre coincide com a existência legal no Brasil. A certidão de nascimento é o "primeiro documento da vida" e a chave de acesso ao pacto social; sem ela, o indivíduo permanece em um limbo jurídico, tornando-se uma "sombra estatística" para as políticas públicas. Milhares de brasileiros ainda vivem sem documentação básica, o que representa uma barreira intransponível para o acesso à vacinação, à matrícula escolar e à obtenção de benefícios assistenciais básicos.
    Embora a gratuidade do registro seja garantida por lei, a pobreza extrema e o isolamento geográfico perpetuam o que sociólogos chamam de "cidadania mutilada". A negação do nome e do sobrenome oficial fere o núcleo da dignidade humana, impedindo que a pessoa se reconheça e seja reconhecida como sujeito de direitos. A luta pela universalização do registro civil é, portanto, a luta pelo fim da invisibilidade sistêmica que marginaliza os brasileiros mais vulneráveis.`,
        },
        {
          id: 6,
          titulo:
            "O estigma associado as doenças mentais na sociedade brasileira",
          categoria: "ENEM",
          subcategoria: "Saúde",
          imagem: "Temas_Doenca_Mental.jpg",
          apoio: `O estigma em relação à saúde mental no Brasil é uma herança de práticas manicomiais que rotulavam o sofrimento psíquico como um desvio de caráter ou sinal de incapacidade produtiva. Esse preconceito se manifesta contemporaneamente na banalização de transtornos, frequentemente reduzidos a termos pejorativos como "frescura". Tal barreira impede que milhões de brasileiros busquem diagnóstico precoce, aprisionando-os em um silêncio social que agrava o quadro clínico e emocional.
    O Brasil apresenta índices alarmantes de depressão e ansiedade, sendo o país mais ansioso do mundo segundo a OMS. Paralelamente, as redes sociais promovem uma "felicidade tóxica", onde a vulnerabilidade é lida como fracasso pessoal. Enquanto o transtorno mental for tratado sob a ótica do estigma e não como uma prioridade de saúde pública, continuaremos a ignorar um impacto econômico e humano devastador, que exige o fortalecimento dos CAPS e de campanhas de conscientização massivas.`,
        },
        {
          id: 7,
          titulo:
            "O desafio de reduzir as desigualdade entre as regiões do Brasil",
          categoria: "ENEM",
          subcategoria: "Desigualdade Social",
          imagem: "Temas_Desigualdade_Social.jpg",
          apoio: `O Brasil convive com o paradoxo de ser uma das maiores potências econômicas globais enquanto mantém abismos territoriais profundos que remetem ao período colonial. O desenvolvimento concentrado no Centro-Sul reflete investimentos históricos que privilegiaram certas áreas em detrimento do Norte e Nordeste, criando regiões que funcionam como polos de riqueza e outras que lutam para consolidar direitos fundamentais. Essa disparidade geográfica dita desde a expectativa de vida até o acesso a saneamento e tecnologia.
    Reduzir essas desigualdades exige o que geógrafos chamam de "justiça territorial", rompendo com a lógica de que o CEP do cidadão define seu potencial de sucesso. Não se trata apenas de transferência de renda, mas de uma reestruturação do planejamento nacional que descentralize a infraestrutura e valorize as potencialidades regionais. Superar esse desafio é essencial para que o progresso não seja um privilégio geográfico, mas um patrimônio de todos os brasileiros de forma equânime.`,
        },
        {
          id: 8,
          titulo: "Democratização do acesso ao cinema no Brasil",
          categoria: "ENEM",
          subcategoria: "Cultura",
          imagem: "Temas_Democratizacao_Cinema.jpg",
          apoio: `O cinema é uma poderosa ferramenta de emancipação social, capaz de democratizar o imaginário coletivo e promover a empatia através da sétima arte. No entanto, no Brasil, a experiência da sala escura tornou-se um marcador de exclusão social e espacial. A extinção dos cinemas de rua e a migração das telas para os shoppings centers das áreas nobres transformaram o audiovisual em um evento de alto custo, geograficamente restrito e culturalmente centralizado.
    A existência de "desertos culturais" em periferias e no interior impede que a maioria da população tenha acesso à produção audiovisual, ferindo o direito constitucional à cultura. Democratizar o cinema exige políticas de fomento a cinemas itinerantes, redução de custos tributários e ocupação de espaços públicos. Afinal, uma sociedade que não acessa suas próprias narrativas visuais e simbólicas corre o risco de perder sua identidade e de se tornar invisível para si mesma.`,
        },
        {
          id: 9,
          titulo:
            "Manipulação do comportamento do usuário pelo controle de dados na internet",
          categoria: "ENEM",
          subcategoria: "Tecnologia",
          imagem: "Temas_Controle_Dados.jpg",
          apoio: `Na era do "Capitalismo de Vigilância", o rastro digital dos usuários tornou-se a mercadoria mais valiosa do mercado global. Algoritmos complexos monitoram comportamentos para construir perfis psicográficos que antecipam desejos e moldam opiniões de forma quase imperceptível. O problema reside na ilusão de liberdade: o cidadão acredita estar explorando a rede com autonomia, quando, na verdade, está circulando em "bolhas de conforto" desenhadas para reforçar crenças e limitar o contraditório.
    A Lei Geral de Proteção de Dados (LGPD) é um avanço, mas o desafio da soberania mental permanece diante da rapidez tecnológica. A manipulação de dados impacta desde hábitos de consumo até decisões democráticas, facilitando a propagação de desinformação direcionada. Enfrentar esse cenário exige uma alfabetização digital crítica, permitindo que o usuário compreenda a arquitetura algorítmica e aprenda a furar bolhas para recuperar o pensamento deliberativo e a autonomia na rede.`,
        },
        {
          id: 10,
          titulo: "Desafios para a formação educacional dos surdos no Brasil",
          categoria: "ENEM",
          subcategoria: "Educação",
          imagem: "Tema_Educacao_Surdos.jpg",
          apoio: `A formação educacional dos surdos no Brasil enfrenta o desafio de transitar de uma visão puramente clínica da surdez para uma perspectiva bilíngue e bicultural. Embora a Libras seja reconhecida oficialmente, o sistema de ensino ainda falha ao não oferecer uma estrutura que respeite a língua de sinais como primeira língua (L1) e o português escrito como segunda (L2). A falta de intérpretes qualificados e de materiais didáticos adaptados resulta em um "silenciamento educacional" que compromete o desenvolvimento cognitivo.
    A inclusão burocrática, que apenas insere o aluno surdo na classe comum sem suporte especializado, acaba gerando exclusão e atraso pedagógico. Superar esse entrave exige a implementação de escolas ou classes bilíngues e a formação continuada de docentes. Democratizar o ensino significa garantir que a diferença linguística não seja um entrave ao conhecimento, mas uma via legítima para que o aluno surdo desenvolva seu potencial e conquiste sua plena autonomia profissional e social.`,
        },
        {
          id: 11,
          titulo:
            "Como os adolescentes podem usar as redes sociais sem prejudicar a saúde mental?",
          categoria: "Provão",
          subcategoria: "Saúde",
          imagem: "Temas_Redes_Sociais_Adolecentes.jpg",
          apoio: `A adolescência é um período de intensa construção da autoimagem, e o uso desregulado das redes sociais tem acelerado crises de identidade e transtornos de humor. A exposição constante a algoritmos que privilegiam padrões estéticos inalcançáveis cria uma "cultura da comparação", onde o adolescente mede seu valor através de métricas de engajamento digital. Esse cenário tem gerado um aumento exponencial em casos de ansiedade e dismorfia corporal, muitas vezes silenciados no ambiente familiar.
    O desafio pedagógico e familiar é promover o equilíbrio entre o mundo on-line e o off-line, incentivando a literacia midiática. Usar as redes de forma saudável exige que o jovem aprenda a distinguir a "vida editada" da realidade crua, estabelecendo períodos de desconexão e priorizando interações presenciais. O papel da escola e dos responsáveis é guiar o adolescente para que a tecnologia seja uma ferramenta de ampliação de horizontes, e não uma prisão emocional baseada na validação de terceiros.`,
        },
        {
          id: 12,
          titulo:
            "Gentrificação urbana - o processo de transformação de áreas urbanas",
          categoria: "Provão",
          subcategoria: "Desigualdade Social",
          imagem: "Temas_Gentrificacao.jpg",
          apoio: `A gentrificação é um fenômeno sociogeográfico em que bairros periféricos ou degradados sofrem uma valorização imobiliária forçada, atraindo classes de maior renda e expulsando moradores tradicionais devido ao aumento do custo de vida. Esse processo é frequentemente mascarado sob o discurso de "revitalização", mas, na prática, promove uma "limpeza social" que descaracteriza o patrimônio imaterial e empurra a pobreza para regiões ainda mais distantes e desassistidas.
    Esse "apartheid urbano" invisível aprofunda a segregação espacial e sobrecarrega o sistema de transportes e serviços públicos nas margens da cidade. Para mitigar os impactos da gentrificação, é necessário um planejamento urbano que priorize a função social da propriedade e a manutenção de zonas de habitação de interesse social em áreas centrais. Garantir o direito à cidade significa permitir que diferentes classes sociais convivam no mesmo espaço, evitando que o desenvolvimento urbano seja sinônimo de exclusão habitacional.`,
        },
        {
          id: 13,
          titulo:
            "O combate a fome no Brasil: entre a responsabilidade do estado e a atuação da sociedade civil",
          categoria: "Provão",
          subcategoria: "Desigualdade Social",
          imagem: "Temas_Fome_Brasil.jpg",
          apoio: `O retorno do Brasil ao Mapa da Fome é um paradoxo trágico para um dos maiores exportadores de grãos do planeta. A insegurança alimentar não decorre da escassez de produção, mas da desigualdade de distribuição e da priorização de "commodities" em detrimento da agricultura familiar e do abastecimento interno. Esse cenário exige uma atuação robusta do Estado por meio de estoques reguladores e programas de transferência de renda que garantam o acesso físico e financeiro ao alimento.
    Paralelamente, a sociedade civil e o terceiro setor desempenham um papel de mitigação imediata através de bancos de alimentos e cozinhas comunitárias. Entretanto, a caridade não substitui a política pública estruturante. O combate à fome exige uma estratégia que una o direito à alimentação à geração de emprego e renda, assegurando que o alimento chegue à mesa com qualidade nutricional, combatendo tanto a desnutrição quanto os reflexos de saúde pública decorrentes da fome oculta.`,
        },
        {
          id: 14,
          titulo:
            "Impacto da inteligência artificial nos alunos de escola pública",
          categoria: "Plataforma",
          subcategoria: "Tecnologia",
          imagem: "Temas_IA_Escolas.jpg",
          apoio: `A Inteligência Artificial (IA) promete revolucionar a educação ao permitir a personalização do ensino em escala, adaptando ritmos e conteúdos às necessidades de cada estudante. Entretanto, em um país com abismos sociais como o Brasil, a aplicação da IA em escolas públicas esbarra na precariedade de infraestrutura básica: muitas instituições ainda lutam por conexão estável de internet e equipamentos funcionais. Sem uma política de inclusão digital robusta, a IA pode aprofundar o fosso pedagógico entre alunos do setor público e privado.
    Além da infraestrutura, há o desafio ético e pedagógico de formar professores para mediar o uso dessas tecnologias. A IA deve ser uma ferramenta de auxílio, e não uma substituta do pensamento crítico ou da interação humana. Investir em inteligência artificial nas escolas públicas significa, antes de tudo, investir na redução da desigualdade de oportunidades, garantindo que o aluno da rede pública não seja apenas um consumidor de tecnologia, mas um produtor de conhecimento capaz de navegar com fluidez na economia digital do futuro.`,
        },
        {
          id: 15,
          titulo: "Inclusão social de pessoas com deficiências físicas",
          categoria: "Plataforma",
          subcategoria: "Inclusão Social",
          imagem: "Temas_Resocializacao_Deficientes.jpg",
          apoio: `A inclusão de pessoas com deficiência física vai muito além da instalação de rampas e sinalizações táteis; ela exige o enfrentamento do capacitismo, o preconceito sistêmico que subestima a competência e a autonomia desses indivíduos. Embora a legislação brasileira, através da Lei Brasileira de Inclusão, seja uma das mais avançadas do mundo, a prática cotidiana ainda é marcada por barreiras arquitetônicas intransponíveis e pela resistência do mercado de trabalho em oferecer oportunidades reais de carreira.
    A verdadeira acessibilidade deve ser universal e transversal, permeando o transporte, a educação, o lazer e a tecnologia. Garantir a inclusão significa permitir que a pessoa com deficiência ocupe o espaço público não como uma exceção assistida, mas como um cidadão pleno. O desafio é transformar o planejamento urbano e a mentalidade empresarial para que as limitações físicas deixem de ser um fator de exclusão social e passem a ser compreendidas como uma parte da diversidade humana que exige respeito e adaptação sistêmica.`,
        },
        {
          id: 16,
          titulo: "Desafios para manter um consumo consciente",
          categoria: "Plataforma",
          subcategoria: "Natureza",
          imagem: "Temas_Consumo_Consciente.jpg",
          apoio: `O sistema de consumo atual opera sob a lógica da "obsolescência programada" e do descarte desenfreado, o que sobrecarrega os aterros sanitários e exaure os recursos naturais finitos. O consumo consciente propõe uma inversão dessa lógica, exigindo que o cidadão considere o ciclo de vida do produto — desde a extração da matéria-prima até as condições de trabalho na fábrica. No entanto, manter essa postura em uma sociedade pautada pelo imediatismo e pela publicidade agressiva é um desafio hercúleo que exige resistência ética.
    Além das escolhas individuais, o consumo consciente depende de políticas de "logística reversa" e incentivos tributários para empresas que adotam a economia circular. O desafio é transformar o "ato de comprar" em um ato político e ambientalmente responsável. Superar a cultura do desperdício exige educação ambiental profunda e a compreensão de que cada escolha de consumo impacta a viabilidade climática e a sobrevivência das futuras gerações, reduzindo a pegada ecológica de forma coletiva.`,
        },
        {
          id: 17,
          titulo:
            "Desafios para o ensino de qualidade sobre educação financeira",
          categoria: "Plataforma",
          subcategoria: "Economia",
          imagem: "Temas_Educacao_Financeira.jpg",
          apoio: `O endividamento das famílias brasileiras atingiu níveis históricos, refletindo a ausência de um letramento financeiro estruturado na educação básica. Sem ferramentas para compreender juros compostos, inflação e mecanismos de investimento, o cidadão torna-se vulnerável a armadilhas de crédito e à ansiedade financeira. A educação financeira deve ser tratada como um componente curricular transversal, permitindo que o jovem desenvolva uma relação saudável e crítica com o dinheiro e o consumo.
    Contudo, o ensino de qualidade sobre esse tema não deve focar apenas em cálculos matemáticos, mas em comportamento e psicologia do consumo. O desafio é formar cidadãos que saibam planejar seu futuro e se proteger de ciclos de pobreza intergeracional. Em um país com desigualdades extremas, a educação financeira atua como uma ferramenta de emancipação social, permitindo que o indivíduo tenha maior controle sobre sua vida econômica e contribua para a estabilidade do mercado nacional.`,
        },
        {
          id: 18,
          titulo:
            "O impacto da inteligência artificial na precarização do trabalho e nas relações de consumo",
          categoria: "Plataforma",
          subcategoria: "Tecnologia",
          imagem: "Temas_Substituicao_IA.jpg",
          apoio: `A Inteligência Artificial está catalisando uma metamorfose no mercado de trabalho, automatizando desde tarefas braçais até processos analíticos complexos. Se por um lado a eficiência é elevada, por outro observa-se a "uberização" de diversas profissões, onde o trabalhador é mediado por algoritmos que reduzem seu poder de negociação e eliminam garantias previdenciárias. Esse cenário cria uma nova massa de "precariado" tecnológico, que trabalha sem vínculo estável e sob a pressão de métricas automatizadas de desempenho.
    Nas relações de consumo, a IA molda desejos através de publicidade hipersegmentada, muitas vezes induzindo a um consumo por impulso que desrespeita a privacidade de dados. O desafio ético e regulatório é garantir que o avanço da IA não resulte em um retrocesso nos direitos humanos e trabalhistas. É fundamental que o Estado e as instituições internacionais estabeleçam diretrizes que priorizem o bem-estar humano sobre o lucro algorítmico, garantindo que a tecnologia sirva para libertar o homem de tarefas penosas, e não para escravizá-lo em novas formas de exploração digital.`,
        },
        {
          id: 19,
          titulo:
            "Impacto da violência doméstica contra a criança e o adolescente no desenvolvimento social",
          categoria: "Plataforma",
          subcategoria: "Violencia",
          imagem: "Temas_Violencia_Criancas.jpg",
          apoio: `A violência doméstica contra crianças e adolescentes é uma violação silenciosa que fere o núcleo básico de segurança do indivíduo em sua fase de maior vulnerabilidade. Esse abuso, seja físico, psicológico ou sexual, compromete o desenvolvimento neurológico e a capacidade de socialização, criando traumas que frequentemente são reproduzidos em ciclos intergeracionais de violência. O impacto social é vasto, refletindo-se em baixos índices de desempenho escolar, dificuldades de inserção no mercado de trabalho e sobrecarga no sistema de saúde e segurança.
    Embora o Estatuto da Criança e do Adolescente (ECA) ofereça diretrizes de proteção, a "invisibilidade do lar" dificulta a denúncia precoce. O desafio é fortalecer o papel da escola e da comunidade como redes de vigilância sensível, quebrando a cultura do "em briga de família não se mete a colher". Proteger a infância da violência doméstica é investir na saúde mental coletiva e garantir que as próximas gerações cresçam em um ambiente de afeto e respeito, essencial para a construção de uma cultura de paz na sociedade.`,
        },
        {
          id: 20,
          titulo:
            "A persistência da insegurança alimentar e seus reflexos na saúde nacional",
          categoria: "Plataforma",
          subcategoria: "Saúde",
          imagem: "Temas_Inseguranca_Alimentar.jpg",
          apoio: `A insegurança alimentar no Brasil contemporâneo é um reflexo das falhas estruturais na distribuição de renda e da carência de políticas de soberania alimentar. Ela se manifesta tanto na fome severa quanto na "fome oculta", onde a falta de nutrientes essenciais é mascarada pelo consumo de alimentos ultraprocessados de baixo custo. Esse cenário tem reflexos diretos na saúde pública, aumentando a incidência de desnutrição, anemia e doenças crônicas não transmissíveis, como diabetes e hipertensão, sobrecarregando o Sistema Único de Saúde (SUS).
    A persistência desse quadro em uma nação com enorme potencial agrícola revela a necessidade de uma reforma que priorize o abastecimento interno e o apoio à agroecologia familiar. O combate à insegurança alimentar exige um olhar que integre assistência social, educação nutricional e desenvolvimento econômico sustentável. Garantir que a população tenha acesso físico e econômico a alimentos saudáveis é um pré-requisito básico para a cidadania e para a manutenção da vitalidade física e intelectual da nação brasileira.`,
        },
      ],
    };
  },

  computed: {
    temasFiltrados() {
      return this.meusTemas.filter((tema) => {
        const bateTexto = tema.titulo
          .toLowerCase()
          .includes(this.filtroTexto.toLowerCase());

        const bateCategoria =
          this.filtroCategoria === "Todos" ||
          tema.subcategoria === this.filtroCategoria;

        return bateTexto && bateCategoria;
      });
    },
  },

  beforeUnmount() {
    document.body.style.overflow = "";
  },

  methods: {
    getImagemUrl(nome) {
      return new URL(`../assets/TEMAS/${nome}`, import.meta.url).href;
    },

    formatarParagrafos(texto) {
      return texto
        .split(/\n+|\s{2,}/)
        .map((p) => p.trim())
        .filter((p) => p.length > 0);
    },

    sortearTema() {
      if (this.temasFiltrados.length > 0) {
        const indice = Math.floor(Math.random() * this.temasFiltrados.length);
        this.abrirModal(this.temasFiltrados[indice]);
      } else {
        alert("Nenhum tema encontrado para sortear!");
      }
    },

    abrirModal(tema) {
      this.temaSelecionado = tema;
      document.body.style.overflow = "hidden";
    },
    fecharModal() {
      this.temaSelecionado = null;
      document.body.style.overflow = "";
    },
    escolherTema(tema) {
      this.$router.push({ name: "writing", params: { temaId: tema.id } });
    },
  },
};
</script>

<template>
  <Header />

  <section>
    <header class="titulo">
      <h1>Nova Redação</h1>
      <p>
        Acesse os temas disponíveis na plataforma com textos de apoios e
        orientações especificas para desenvolver sua produção textual com
        estratégia e foco.
      </p>
    </header>

    <navbar class="fixar-search-bar">
      <div class="search-bar">
        <div class="caixa-search">
          <button type="submit" id="search" class="search-btn">
            <img src="../assets/ICONS/icon-lupa.png" id="icon-search" />
          </button>
          <input type="text" v-model="filtroTexto" id="text" class="input-text" placeholder="Buscar um tema" />
        </div>

        <div class="btns">
          <div class="caixa-random" @click="sortearTema">
            <button type="submit" id="btn-random">
              <img src="../assets/ICONS/icon-dado.png" id="icon-dado" />
            </button>
            <p>Aleatorio!</p>
          </div>

          <div class="caixa-category">
            <img src="../assets/ICONS/icon-category-buscar.PNG" id="category-icon" />
            <select name="opcoes" v-model="filtroCategoria" class="category">
              <option value="Todos">Todos</option>
              <option value="Sociedade">Sociedade</option>
              <option value="Cultura">Cultura</option>
              <option value="Inclusão Social">Inclusão</option>
              <option value="Saúde">Saúde</option>
              <option value="Desigualdade Social">Desigualdade</option>
              <option value="Tecnologia">Tecnologia</option>
              <option value="Educação">Educação</option>
              <option value="Natureza">Natureza</option>
              <option value="Economia">Economia</option>
              <option value="Violencia">Violencia</option>
            </select>
          </div>
        </div>
      </div>
    </navbar>
  </section>

  <section>
    <main-content class="grid-modelos">
      <div v-for="tema in temasFiltrados" :key="tema.id" class="card" :id="`${tema.id}-tema`">
        <div class="imagem">
          <img :src="getImagemUrl(tema.imagem)" :alt="tema.titulo" id="img-box" />
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
      <div style="position: relative">
        <button class="botao-fechar" @click="fecharModal">✕</button>
        <div class="topo-imagem">
          <img :src="getImagemUrl(temaSelecionado.imagem)" :alt="temaSelecionado.titulo" />
        </div>
      </div>

      <div class="corpo-modal">
        <div class="etiqueta-tema">
          {{ temaSelecionado.subcategoria }} · {{ temaSelecionado.categoria }}
        </div>
        <div class="titulo-redacao">{{ temaSelecionado.titulo }}</div>

        <div class="subtitulo-secao">Instruções:</div>
        <div class="texto-conteudo instrucoes">
          A partir da leitura dos textos motivadores e com base nos
          conhecimentos construídos ao longo de sua formação, redija um texto
          dissertativo-argumentativo em modalidade escrita formal da língua
          portuguesa sobre o tema apresentado, organize e relacione, de forma
          coerente e coesa, argumentos e fatos para defesa de seu ponto de
          vista.
        </div>

        <div class="subtitulo-secao">Texto de Apoio:</div>
        <div class="texto-conteudo apoio">
          <p v-for="(p, i) in formatarParagrafos(temaSelecionado.apoio)" :key="i">
            {{ p }}
          </p>
        </div>

        <button class="btn-escolher" @click="escolherTema(temaSelecionado)">
          Escolher Tema
        </button>
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
  margin: 2% 5%;
  font-size: 17px;
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

.texto-conteudo p {
  margin-bottom: 20px;
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
  transition:
    transform 0.2s ease,
    opacity 0.2s ease;
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
