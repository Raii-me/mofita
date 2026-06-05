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
      temaSelecionado: null,
      modelos: [
        {
          id: 1,
          imagem: "Temas_Envelhecimento_Sociedade.png",
          categoria: "ENEM",
          titulo: "Perspectivas acerca do envelhecimento na sociedade brasileira",
          nota: 1000,
          modelo: `Na obra "Feliz aniversário", a escritora Clarice Lispector aborda, dentre outros aspectos, a realidade de exclusão vivenciada por grande parte dos idosos brasileiros, os quais, de acordo com a autora, só são lembrados por seus familiares em datas comemorativas. Ao transpor o viés literário, percebe-se a acentuação dessa problemática, a qual aborda a falta de perspectiva social perante ao envelhecimento existente no Brasil contemporâneo. À vista desse conceito, é ideal analisar o passado nacional e o descaso governamental como desafios para a plena longevidade da sociedade. 
Diante desse cenário, nota-se que a dificultosa promoção de um futuro digno à terceira idade advém de um processo de desenvolvimento nacional pautado na exclusão socioespacial. Isso pode ser constatado, de forma evidente, pois o país, desde o período do Brasil Colônia, foi construído por práticas violentas — como a promulgação da Lei dos Sexagenários —, as quais visavam à marginalização de escravizados com mais de 60 anos em detrimento da inserção respeitosa dessa parcela da população no cotidiano brasileiro. Nesse sentido, essa atitude segregacionista mascara, há gerações, a necessidade de reverter esse revés e naturaliza, nos dias atuais, o silenciamento desenfreado dos idosos, produzindo culturalmente a ideia de inferioridade desse grupo. Assim, torna-se inegável o contínuo retrocesso da nação acerca do reconhecimento da velhice como importante e inevitável, à medida que a manutenção de raízes históricas degradantes persiste. 
Ademais, é fundamental ressaltar que a negligência estatal perpetua a aversão social ao inerente envelhecimento populacional. Essa questão se intensifica, na atualidade, ao passo que o Brasil não possui uma campanha nacional concreta e eficaz de estímulo à qualidade de vida da terceira idade. Tal panorama foi estudado pelo pesquisador Ruy Braga, o qual, a partir de uma perspectiva crítica voltada à realidade latino-americana, verbaliza que a ausência de um modelo assistencial inclusivo e socialmente comprometido permite o não reconhecimento dos idosos como integrantes ativos da sociedade. Sob essa ótica, o posicionamento do estudioso é válido, visto que políticas públicas ineficientes possibilitam a precarização do bem-estar da terceira idade, de modo a qualificar essa faixa etária como pouco importante para a edificação da nação — suprimindo o seu futuro salutar. Por isso, essa situação hostil precisa ser revertida. 
É premente, portanto, uma medida que perpetue perspectivas positivas ao envelhecimento populacional. Logo, cabe ao Poder Executivo Federal — mais especificamente ao Ministério dos Direitos Humanos e da Cidadania — fomentar o respeito à terceira idade. Tal ação ocorrerá por meio da criação do “Projeto Nacional Vida Feliz”, o qual engajará debates públicos — ministrados por idosos — nos 5570 municípios brasileiros, a fim de desmistificar ideais advindos da colonização do Brasil e de protagonizar a atuação de pessoas idosas no combate direto e frontal à marginalização sofrida por elas, culminando na promoção da dignidade a essa parte da sociedade. Afinal, não é aceitável que, em um país democrático, a população envelhecida seja, como denunciado por Clarice, invisibilizada.`,
        },
        {
          id: 2,
          imagem: "Temas_Herancas_Africanas.jpg",
          categoria: "ENEM",
          titulo: "Desafios para a valorização da herança africana no Brasil",
          nota: 1000,
          modelo: `O "ciclo do ouro" — ocorrido no Brasil no século XVIII — acarretou o aumento do número de escravos provenientes do continente africano no país, trazidos com graves diferenças culturais entre si, sem que fossem levados em consideração os aspectos regionais e sociais de suas origens, ocasionando uma homogeneização forçada de indivíduos. Atualmente, de forma análoga à História Colonial Brasileira, ainda há uma forte tendência à padronização cultural da África, desprezando sua pluralidade e seu legado. Assim, dois grandes desafios para a valorização da herança africana no Brasil devem ser debelados: as políticas públicas ineficazes e as falhas educacionais.
Diante do cenário exposto, as políticas públicas ineficazes possibilitam a desvalorização do legado africano no país, uma vez que elas impedem o estabelecimento concreto de uma revisão histórica pautada em mais oportunidades, proteção e visibilidade para pessoas pretas. Consoante o sociólogo Émile Durkheim, uma sociedade sem regras claras, sem valores e sem limites encontra-se em estado de anomia social. Nesse sentido sociológico, esse estado anômico pode ser observado na hodierna realidade brasileira, na medida em que as políticas públicas ineficientes permitem o desprezo e o desrespeito com as religiões de matriz africana, a desassistência em áreas quilombolas e a ausência de representatividade em propagandas, por exemplo. Com base nisso, uma mudança urgente e pragmática deve ser realizada, visando à transformação dessa conjuntura, de modo a não só valorizar a herança africana no país, como também a protegê-la. 
Ademais, as falhas educacionais também constituem-se como importantes fatores que aprofundam o descaso com o legado africano no Brasil. Segundo o filósofo Immanuel Kant, "o homem é aquilo que a educação faz dele". Sob esse prisma filosófico, essas falhas educacionais solidificam mentalidades alienadas na população, potencializando preconceitos e ratificando equívocos concernentes à cultura africana no país. Nesse viés, a própria formação do cidadão brasileiro — no que tange à África e sua herança — é maculada por noções desprovidas de veracidade e etnocêntricas, corroborando a desvalorização da pluralidade e das "raízes africanas", presentes em campos variados, como a gastronomia, a dança e a religião, representados respectivamente pelo acarajé, pelo tambor de crioula e pelo candomblé. Então, torna-se imperiosa a correção imediata dessas falhas, no sentido de debelar erros e ampliar visões africanas positivas. 
Infere-se, portanto, que as políticas públicas ineficazes e as falhas educacionais configuram-se como os dois desafios para a valorização da herança africana no Brasil. Nessa ótica, o Governo Federal — órgão máximo responsável pela ordem social — deve ampliar as políticas públicas existentes, tornando-as mais eficazes, por intermédio de uma aliança com o Governo Estadual e o Governo Municipal, com a finalidade de aumentar a proteção, as oportunidades e a representatividade das pessoas pretas. O Governo Federal também deve corrigir as falhas educacionais, por meio da Mídia — grande divulgadora de informações — e da Escola, a fim de mitigar equívocos, ocasionando a valorização do legado africano. Logo, o país possuirá uma estrutura melhor para "dialogar" com a herança da África, longe da padronização impositiva ocorrida durante o "ciclo do ouro" no século XVIII.`,
        },
        {
          id: 3,
          imagem: "Temas_Invisibilidade_Mulheres.jpg",
          categoria: "ENEM",
          titulo:
            "Desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil",
          nota: 1000,
          modelo: `De acordo com a pensadora brasileira Djamila Ribeiro, o primeiro passo a ser tomado para solucionar uma questão é tirá-la da invisibilidade. Porém, no contexto atual do Brasil, as mulheres enfrentam diversos desafios para que seu trabalho de cuidado seja reconhecido, gerando graves impactos em suas vidas, como a falta de destaque. Nesse sentido, essa problemática ocorre em virtude da omissão governamental e da influência midiática.
Dessa forma, em primeiro plano, é preciso atentar para o descaso estatal em relação aos obstáculos enfrentados diariamente por mulheres que trabalham como cuidadoras. Segundo John Locke, “as leis fizeram-se para os homens e não para as leis”. No entanto, a inércia governamental direcionada a tais pessoas não cumpre com o previsto na Carta Magna, visto que a falta de investimento em políticas públicas causa dificuldades no âmbito profissional deste setor — como a desvalorização salarial. Isso contribui para que suas necessidades sejam cada vez mais negligenciadas.
Além disso, a influência dos meios digitais é um fator agravante no que tange ao problema. Para Chimamanda Adichie, mudar o “status quo” — o estado atual das coisas — é sempre penoso. Essa conjuntura pode ser observada no papel que a mídia possui na luta diária de mulheres que exercem o trabalho do cuidado ou doméstico, uma vez que ela auxilia no fortalecimento de uma mentalidade social machista no país. Isso ocasiona o silenciamento da população feminina, enraizando a lógica do patriarcado na sociedade. Diante do exposto, as mulheres perdem a voz na busca por direitos profissionais na área de cuidado, ao ser propagada a ideia de que essa função é sua, e somente sua, obrigação.
Portanto, é necessário que esta situação seja dissolvida. Para isso, o Governo — órgão responsável por garantir a condição e existência de todos — deve prover apoio psicológico e financeiro às cuidadoras, por meio de investimentos e pelo exercício das leis, a fim de sanar a vulnerabilidade socioeconômica existente no cotidiano desses grupos. Paralelamente, os meios de comunicação precisam combater a lógica de inferioridade e a concepção machista agregadas a este trabalho. Assim, será possível solucionar esta questão, pois será retirada do cenário de invisibilidade, como propõe Djamila.
`,
        },
        {
          id: 4,
          imagem: "Temas_Cominudades_Tradicionais.jpg",
          categoria: "ENEM",
          titulo:
            "Desafios para a valorização de comunidades e povos tradicionais no Brasil",
          nota: 1000,
          modelo: `O poeta modernista Oswald de Andrade relata, em "Erro de Português", que, sob um dia de chuva, o índio foi vestido pelo português — uma denúncia à aculturação sofrida pelos povos indígenas com a chegada dos europeus ao território brasileiro. Paralelamente, no Brasil atual, há a manutenção de práticas prejudiciais não só aos silvícolas, mas também aos demais povos e comunidades tradicionais, como os pescadores. Com efeito, atuam como desafios para a valorização desses grupos a educação deficiente acerca do tema e a ausência do desenvolvimento sustentável.
Diante desse cenário, existe a falta da promoção de um ensino eficiente sobre as populações tradicionais. Sob esse viés, as escolas, ao abordarem tais povos por meio de um ponto de vista histórico eurocêntrico, enraízam no imaginário estudantil a imagem de aborígenes cujas vivências são marcadas pela defasagem tecnológica. A exemplo disso, há o senso comum de que os indígenas são selvagens, alheios aos benefícios do mundo moderno, o que, consequentemente, gera um preconceito, manifestado em indagações como “o índio tem smartphone e está lutando pela demarcação de terras?”. Entretanto, de acordo com a Teoria do Indigenato, defendida pelo ministro Edson Fachin, do Supremo Tribunal Federal, o direito dos povos tradicionais à terra é inato, sendo anterior, até, à criação do Estado brasileiro. Dessa forma, por não ensinarem tal visão, os colégios fomentam a desvalorização das comunidades tradicionais, mediante o desenvolvimento de um pensamento discriminatório nos alunos.
Além disso, outro desafio para o reconhecimento desses indivíduos é a carência do progresso sustentável. Nesse contexto, as entidades mercadológicas que atuam nas áreas ocupadas pelas populações tradicionais não necessariamente se preocupam com a sua preservação, comportamento no qual se valoriza o lucro em detrimento da harmonia entre a natureza e as comunidades em questão. À luz disso, há o exemplo do que ocorre aos pescadores, cujos rios são contaminados devido ao garimpo ilegal, extremamente comum na Região Amazônica. Por conseguinte, o povo que sobrevive a partir dessa atividade é prejudicado pelo que a Biologia chama de magnificação trófica, quando metais pesados acumulam-se nos animais de uma cadeia alimentar — provocando a morte de peixes e a infecção de humanos por mercúrio. Assim, as indústrias que usam os recursos naturais de forma irresponsável não promovem o desenvolvimento sustentável e agem de maneira nociva às sociedades tradicionais.
Portanto, é essencial que o Governo mitigue os desafios supracitados. Para isso, o Ministério da Educação — órgão responsável pelo estabelecimento da grade curricular das escolas — deve educar os alunos a respeito dos empecilhos à preservação dos indígenas, por meio da inserção da matéria “Estudos Indigenistas” no ensino básico, a fim de explicar o contexto dos silvícolas e desconstruir o preconceito. Ademais, o Ministério do Desenvolvimento — pasta instituidora da Política Nacional de Desenvolvimento Sustentável dos Povos e Comunidades Tradicionais — precisa fiscalizar as atividades econômicas danosas às sociedades vulneráveis, visando à valorização de tais pessoas, mediante canais de denúncias.`,
        },
        {
          id: 5,
          imagem: "Temas_Reginstro_Civil.jpg",
          categoria: "ENEM",
          titulo:
            "Invisibilidade e registro civil: garantia de acesso a cidadania no Brasil",
          nota: 1000,
          modelo: `Em “Vidas Secas”, obra literária do modernista Graciliano Ramos, Fabiano e sua família vivem uma situação degradante marcada pela miséria. Na trama, os filhos do protagonista não recebem nomes, sendo chamados apenas como o “mais velho” e o “mais novo”, recurso usado pelo autor para evidenciar a desumanização do indivíduo. Ao sair da ficção, sem desconsiderar o contexto histórico da obra, nota-se que a problemática apresentada ainda percorre a atualidade: a não garantia de cidadania pela invisibilidade da falta de registro civil. A partir desse contexto, não se pode hesitar — é imprescindível compreender os impactos gerados pela falta de identificação oficial da população.
Com efeito, é nítido que o deficitário registro civil repercute, sem dúvida, na persistente falta de pertencimento como cidadão brasileiro. Isso acontece porque, como já estudado pelo historiador José Murilo de Carvalho, para que haja uma cidadania completa no Brasil é necessária a coexistência dos direitos sociais, políticos e civis. Sob essa ótica, percebe-se que, quando o pilar civil não é garantido — em outras palavras, a não efetivação do direito devido à falta do registro em cartório —, não é possível fazer com que a cidadania seja alcançada na sociedade. Dessa forma, da mesma maneira que o “mais novo” e o “mais velho” de Graciliano Ramos, quase 3 milhões de brasileiros continuam invisibilizados: sem nome oficial, sem reconhecimento pelo Estado e, por fim, sem a dignidade de um cidadão.
Além disso, a falta do sentimento de cidadania na população não registrada reflete, também, na manutenção de uma sociedade historicamente excludente. Tal questão ocorre, pois, de acordo com a análise da antropóloga brasileira Lilia Schwarcz, desde a Independência do Brasil, não há a formação de um ideal de coletividade — ou seja, de uma “Nação” ao invés de, meramente, um “Estado”. Com isso, o caráter de desigualdade social e exclusão do diferente se mantém, sobretudo no que diz respeito às pessoas que não tiveram acesso ao registro oficial, as quais frequentemente são obrigadas a lidar com situações humilhantes por parte do restante da sociedade: das mais diversas discriminações até o fato de não poderem ter qualquer outro documento se, antes, não tiverem sua identificação oficial.
Portanto, ao entender que a falta de cidadania gerada pela invisibilidade do não registro está diretamente ligada à exclusão social, é tempo de combater esse grave problema. Assim, cabe ao Poder Executivo Federal, mais especificamente ao Ministério da Mulher, da Família e dos Direitos Humanos, ampliar o acesso aos cartórios de registro civil. Tal ação deverá ocorrer por meio da implantação de um Projeto Nacional de Incentivo à Identidade Civil, o qual irá articular, junto aos gestores dos municípios brasileiros, campanhas divulgadas pela mídia socialmente engajada, que expliquem sobre a importância do registro oficial para garantia da cidadania, além de instruções para realizar o processo, a fim de mitigar as desigualdades geradas pela falta dessa documentação. Afinal, assim como os meninos em “Vidas Secas”, toda a população merece ter a garantia e o reconhecimento do seu nome e identidade.
`,
        },
        {
          id: 6,
          imagem: "Temas_Doenca_Mental.jpg",
          categoria: "ENEM",
          titulo:
            "O estigma associado as doenças mentais na sociedade brasileira",
          nota: 1000,
          modelo: `Nise da Silveira foi uma renomada psiquiatra brasileira que, indo contra a comunidade médica tradicional da sua época, lutou a favor de um tratamento humanizado para pessoas com transtornos psicológicos. No contexto nacional atual, indivíduos com patologias mentais ainda sofrem com diversos estigmas criados. Isso ocorre, pois faltam informações corretas sobre o assunto e, também, existe uma carência de representatividade desse grupo nas mídias.
Primariamente, vale ressaltar que a ignorância é uma das principais causas da criação de preconceitos contra portadores de doenças psiquiátricas. Sob essa ótica, o pintor holandês Vincent Van Gogh foi alvo de agressões físicas e psicológicas por sofrer de transtornos neurológicos e não possuir o tratamento adequado. O ocorrido com o artista pode ser presenciado no corpo social brasileiro, visto que, apesar de uma parcela significativa da população lidar com alguma patologia mental, ainda são propagadas informações incorretas sobre o tema. Esse processo fortalece a ideia de que integrantes não são capazes de conviver em sociedade, reforçando estigmas antigos e criando novos. Dessa forma, a ignorância contribui para a estigmatização desses indivíduos e prejudica o coletivo.
Ademais, a carência de representatividade nos veículos midiáticos fomenta o preconceito contra pessoas com distúrbios psicológicos. Nesse sentido, a série de televisão da emissora HBO, "Euphoria", mostra as dificuldades de conviver com Transtorno Afetivo Bipolar (TAB), ilustrado pela protagonista Rue, que possui a doença. A série é um exemplo de representação desse grupo nas artes, falando sobre a doença de maneira responsável. Contudo, ainda é pouca a representatividade desses indivíduos em livros, filmes e séries, que, quando possuem um papel, muitas vezes, são personagens secundários e não há um aprofundamento de sua história. Desse modo, esse processo agrava os estereótipos contra essas pessoas e afeta sua autoestima, pois eles não se sentem representados.
Portanto, faz-se imprescindível que a mídia — instrumento de ampla abrangência — informe a sociedade a respeito dessas doenças e sobre como conviver com pessoas portadoras, por meio de comerciais periódicos nas redes sociais e debates televisivos, a fim de formar cidadãos informados. Paralelamente, o Estado — principal promotor da harmonia social — deve promover a representatividade de pessoas com transtornos mentais nas artes, por intermédio de incentivos monetários para produzir obras sobre o tema, com o fito de amenizar o problema. Assim, o corpo civil será mais educado e os estigmas contra indivíduos com patologias mentais não serão uma realidade do Brasil.`,
        },
        {
          id: 7,
          imagem: "Temas_Desigualdade_Social.jpg",
          categoria: "ENEM",
          titulo:
            "O desafio de reduzir as desigualdade entre as regiões do Brasil",
          nota: 1000,
          modelo: `Na obra de arte “Os reiterantes” de Candido Portinari é retratada uma família na pobreza andando em um deserto, ou seja, representando um exemplo de migração de nordestinos para lugares que possam melhorar a condição financeira. Fora do desenho, a situação de desigualdade entre regiões brasileiras é presente, de modo geral, ocasionada por um fardo histórico e a negligência estatal, então, caso resolvidos, talvez essa não fosse a realidade do Brasil. 
          Em primeira análise, é necessário ressaltar que os fluxos migratórios internos ocorridos no passado podem ser motivadores do cenário atual de priorização de certas localidades do país. Evidenciando o supracitado, em meados de 1950, com o advento do modelo capitalista, as opções de industrialização sempre recaiam nas regiões Sul e Sudeste, de forma a centralizar os espaços propícios a chegada de canarinhos que precisavam modificar suas situações econômicas. Diante disso, trazendo para o século XXI, torna-se inadmissível que tal circunstância ainda ocorra, quando até donos de grandes perfis nas redes sociais, os chamados influenciadores digitais, que moram no Nordeste muitas vezes precisam se mudar para os polos industriais, tendo que deixar um vínculo familiar para trás. Logo, faz-se crucial o interesse das empresas, nesse caso nacionais, no restante do país, de forma a expandir a situação criada anos atrás.
          Ademais, convém debater que o descaso estatal também faz parte da precarização de certas áreas, indo contra um dever previsto na lei. Sob esse aspecto, de acordo com o artigo 5 da Constituição todos são iguais e tem que ter acesso a segurança e propriedade, condicionando um lar. Em outras palavras, mesmo que em teoria existam lugares “mais fáceis” de se conseguirem empregos, citados anteriormente por terem sido o foco de muitas empresas, torna-se desconfortável para aquele já estagnado na miséria conseguir forças para migrar para outras regiões, como último recurso e muitas vezes sem o conhecimento para adquirir o serviço, pois é compromisso do Estado evitar esse cenário ao proporcionar tanto a capacitação, como oportunidades. Isto significa que além das empresas, é evidente a ação dos três poderes a fim de agirem para promover a propriedade e segurança em totalidade entre brasileiros.
          Por conseguinte, é indiscutível ações interventivas, para tanto, cabe ao governo federal junto do Ministério do Trabalho fazerem um projeto de expansão da modernização e dos empregos, pincipalmente para o Norte e o Nordeste. De modo geral, esse projeto será feito a partir de política públicas voltadas a capacitação para os serviços do futuro, logo, para a tecnologia, em que cursos técnicos gratuitos serão ofertados em massa, como, Administração, Informática, Marketing Digital. Além disso, propostas serão feitas com as empresas nacionais, por exemplo, Magazine Luiza, de forma a incentivar a maior instalação de suas sedes e lojas físicas nas regiões citadas antes, objetivando gerar novos empregos e proporcionar espaços mais modernos e parecidos com os encontrados no Sul. Desse modo, os diferentes territórios do Brasil vão ser nivelados.`
        },
        {
          id: 8,
          imagem: "Temas_Democratizacao_Cinema.jpg",
          categoria: "ENEM",
          titulo: "Democratização do acesso ao cinema no Brasil",
          nota: 1000,
          modelo: `Ao longo do processo de formação da sociedade, o pensamento cinematográfico consolidou-se em diversas comunidades. No início do século XX, com os regimes totalitários, por exemplo, o cinema era utilizado como meio de dominação à adesão das massas ao governo. Embora o cinema tenha se popularizado, posteriormente, como entretenimento, nota-se, na contemporaneidade, a sua limitação social, em virtude do discurso elitizado que o compõe e da falta de acesso por parte da população. Essa visão negativa pode ser significativamente minimizada, desde que acompanhada da desconstrução coletiva, junto à redução do custo do ingresso para a maior acessibilidade.
          Em primeira análise, é evidente que a herança ideológica da produção cinematográfica, como um recurso destinado às elites, conservou-se na coletividade e perpetuou a exclusão de classes inferiores. Nessa perspectiva, segundo Michel Foucault, filósofo francês, o poder articula-se em uma linguagem que cria mecanismos de controle e coerção, os quais aumentam a subordinação. Sob essa ótica, constata-se que o discurso hegemônico introduzido, na modernidade, moldou o comportamento do cidadão a acreditar que o cinema deve se restringir a determinada parcela da sociedade, o que enfraquece o princípio de que todos indivíduos têm o direito ao lazer e ao entretenimento. Desse modo, com a concepção instituída da produção cinematográfica como diversão das camadas altas, o cinema adquire o caráter elitista, o qual contribui com a exclusão do restante da população.
          Além disso, uma comunidade que restringe o acesso ao cinema, por meio do custo de ingressos, representa um retrocesso para a coletividade que preza por igualdade. Nesse sentido, na teoria da percepção do estado da sociedade, de Émile Durkheim, sociólogo francês, abrangem-se duas divisões: "normal e patológico". Seguindo essa linha de pensamento, observa-se que um ambiente patológico, em crise, rompe com o seu desenvolvimento, visto que um sistema desigual não favorece o progresso coletivo. Dessa forma, com a disponibilidade de ir ao cinema mediada pelo preço — que não leva em consideração a renda regional —, a democratização torna-se inviável.
          Depreende-se, portanto, a relevância da igualdade do acesso ao cinema no Brasil. Para que isso ocorra, é necessário que o Estado proporcione a redução coerente do custo de ingressos por região, junto à difusão da importância da produção cinematográfica no cotidiano, nos meios de comunicação, por meio de anúncios, a fim de colaborar com o acesso igualitário. Ademais, a instituição educacional deve proporcionar aos indivíduos uma educação voltada à democratização coletiva do cinema, como entretenimento destinado às elites, por intermédio de debates e palestras, na área das Ciências Humanas, como forma de esclarecimento populacional. Assim, haverá um ambiente estável que colabore com a acessibilidade geral ao cinema no país`
        },
        {
          id: 9,
          imagem: "Temas_Controle_Dados.jpg",
          categoria: "ENEM",
          titulo:
            "Manipulação do comportamento do usuário pelo controle de dados na internet",
          nota: 1000,
          modelo: `No livro “1984” de George Orwell, é retratado um futuro distópico em que um Estado totalitário controla e manipula toda forma de registro histórico e contemporâneo, a fim de moldar a opinião pública a favor dos governantes. Nesse sentido, a narrativa foca na trajetória de Winston, um funcionário do contraditório Ministério da Verdade que diariamente analisa e altera notícias e conteúdos midiáticos para favorecer a imagem do Partido e formar a população através de tal ótica. Fora da ficção, é fato que a realidade apresentada por Orwell pode ser relacionada ao mundo cibernético do século XXI: gradativamente, os algoritmos e sistemas de inteligência artificial corroboram para a restrição de informações disponíveis e para a influência comportamental do público, preso em uma grande bolha sociocultural.
          Em primeiro lugar, é importante destacar que, em função das novas tecnologias, internautas são cada vez mais expostos a uma gama limitada de dados e conteúdos na internet, consequência do desenvolvimento de mecanismos filtradores de informação a partir do uso diário individual. De acordo com o filósofo Zygmund Baüman, vive-se atualmente um período de liberdade ilusória, já que o mundo digitalizado não só possibilitou novas formas de interação com o conhecimento, mas também abriu portas para a manipulação e alienação vistas em “1984”. Assim, os usuários são inconscientemente analisados e lhes é apresentado apenas o mais atrativo para o consumo pessoal.
          Por conseguinte, presencia-se um forte poder de influência desses algoritmos no comportamento da coletividade cibernética: ao observar somente o que lhe interessa e o que foi escolhido para ele, o indivíduo tende a continuar consumindo as mesmas coisas e fechar os olhos para a diversidade de opções disponíveis. Em um episódio da série televisiva Black Mirror, por exemplo, um aplicativo pareava pessoas para relacionamentos com base em estatísticas e restringia as possibilidades para apenas as que a máquina indicava – tornando o usuário passivo na escolha. Paralelamente, esse é o objetivo da indústria cultural para os pensadores da Escola de Frankfurt: produzir conteúdos a partir do padrão de gosto do público, para direcioná-lo, torná-lo homogêneo e, logo, facilmente atingível.
          Portanto, é mister que o Estado tome providências para amenizar o quadro atual. Para a conscientização da população brasileira a respeito do problema, urge que o Ministério de Educação e Cultura (MEC) crie, por meio de verbas governamentais, campanhas publicitárias nas redes sociais que detalhem o funcionamento dos algoritmos inteligentes nessas ferramentas e advirtam os internautas do perigo da alienação, sugerindo ao interlocutor criar o hábito de buscar informações de fontes variadas e manter em mente o filtro a que ele é submetido. Somente assim, será possível combater a passividade de muitos dos que utilizam a internet no país e, ademais, estourar a bolha que, da mesma forma que o Ministério da Verdade construiu em Winston de “1984”, as novas tecnologias estão construindo nos cidadãos do século XXI.`
        },
        {
          id: 10,
          imagem: "Tema_Educacao_Surdos.jpg",
          categoria: "ENEM",
          titulo: "Desafios para a formação educacional dos surdos no Brasil",
          nota: 1000,
          modelo: `Na mitologia grega, Sísifo foi condenado por Zeus a rolar uma enorme pedra morro acima eternamente. Todos os dias, Sísifo atingia o topo do rochedo, contudo era vencido pela exaustão, assim a pedra retornava à base. Hodiernamente, esse mito assemelha-se à luta cotidiana dos deficientes auditivos brasileiros, os quais buscam ultrapassar as barreiras as quais os separam do direito à educação. Nesse contexto, não há dúvidas de que a formação educacional de surdos é um desafio no Brasil o qual ocorre, infelizmente, devido não só à negligência governamental, mas também ao preconceito da sociedade.
          A Constituição cidadã de 1988 garante educação inclusiva de qualidade aos deficientes, todavia o Poder Executivo não efetiva esse direito. Consoante Aristóteles no livro "Ética a Nicômaco", a política serve para garantir a felicidade dos cidadãos, logo se verifica que esse conceito encontra-se deturpado no Brasil à medida que a oferta não apenas da educação inclusiva, como também da preparação do número suficiente de professores especializados no cuidado com surdos não está presente em todo o território nacional, fazendo os direitos permanecerem no papel.
          Outrossim, o preconceito da sociedade ainda é umgrande impasse à permanência dos deficientes auditivos nas escolas. Tristemente, a existência da discriminação contra surdos é reflexo da valorização dos padrões criados pela consciência coletiva. No entanto, segundo o pensador e ativista francês Michel Foucault, é preciso mostrar às pessoas que elas são mais livres do que pensam para quebrar pensamentos errôneos construídos em outros momentos históricos. Assim, uma mudança nos valores da sociedade é fundamental para transpor as barreiras à formação educacional de surdos.
          Portanto, indubitavelmente, medidas são necessárias para resolver esse problema. Cabe ao Ministério da Educação criar um projeto para ser desenvolvido nas escolas o qual promova palestras, apresentações artísticas e atividades lúdicas a respeito do cotidiano e dos direitos dos surdos. - uma vez que ações culturais coletivas têm imenso poder transformador - a fim de que a comunidade escolar e a sociedade no geral - por conseguinte - conscientizem-se. Desse modo, a realidade distanciar-se-á do mito grego e os Sísifos brasileiros vencerão o desafio de Zeus.
          `
        },
        {
          id: 11,
          imagem: "Temas_Redes_Sociais_Adolecentes.jpg",
          categoria: "Provão Paulista",
          titulo: "Como os adolescentes podem usar as redes sociais sem prejudicar a saúde mental?",
          nota: 1000,
          modelo: `A crescente presença das redes sociais no cotidiano dos adolescentes configura um dos fenômenos mais marcantes da contemporaneidade. Embora essas plataformas possibilitem interação, acesso à informação e expressão individual, seu uso descontrolado pode acarretar prejuízos significativos à saúde mental. Nesse contexto, torna-se essencial compreender como os jovens podem utilizar esses meios de forma equilibrada, preservando seu bem-estar psicológico e emocional.
Em primeiro lugar, é importante destacar que o uso excessivo das redes sociais pode intensificar sentimentos de ansiedade, baixa autoestima e comparação social. Isso ocorre, em grande parte, devido à exposição constante a padrões idealizados de vida, corpo e sucesso, frequentemente irreais. Sob essa lógica, a teoria da “sociedade do espetáculo”, proposta por Guy Debord, evidencia como a valorização da aparência em detrimento da essência contribui para a alienação dos indivíduos. Assim, adolescentes, ainda em fase de formação identitária, tornam-se mais vulneráveis a esses impactos, o que reforça a necessidade de um uso consciente e crítico dessas plataformas.
Além disso, a falta de limites no tempo de uso agrava problemas relacionados ao sono, à concentração e ao convívio social. Estudos na área da psicologia apontam que a exposição prolongada a telas, especialmente antes de dormir, interfere na qualidade do descanso, o que impacta diretamente o equilíbrio emocional. Dessa forma, torna-se evidente que a moderação no uso das redes sociais não é apenas recomendável, mas fundamental para a manutenção da saúde mental dos jovens.
Por outro lado, é possível utilizar as redes sociais de maneira positiva e benéfica. Quando usadas com propósito, essas ferramentas podem servir como espaços de aprendizado, apoio emocional e mobilização social. Comunidades virtuais voltadas ao bem-estar, por exemplo, oferecem acolhimento e informação, contribuindo para a construção de uma relação mais saudável com o ambiente digital. Portanto, o problema não reside nas redes em si, mas na forma como são utilizadas.
Diante disso, faz-se necessária a implementação de medidas que promovam o uso consciente das redes sociais entre adolescentes. Cabe às instituições escolares, em parceria com as famílias, desenvolver programas de educação digital que orientem sobre os riscos e benefícios dessas plataformas. Essa ação pode ser realizada por meio de palestras, oficinas e inclusão do tema no currículo escolar, com o objetivo de conscientizar os jovens sobre hábitos saudáveis no ambiente virtual. Como efeito esperado, haverá a formação de indivíduos mais críticos, capazes de estabelecer limites e preservar sua saúde mental.
Em suma, o uso equilibrado das redes sociais é essencial para evitar prejuízos psicológicos entre adolescentes. Por meio da conscientização, da educação digital e da adoção de hábitos saudáveis, é possível transformar essas ferramentas em aliadas, e não em fontes de sofrimento.`
        },
        {
          id: 12,
          imagem: "Temas_Gentrificacao.jpg",
          categoria: "Provão Paulista",
          titulo:
            "Gentrificação urbana - o processo de transformação de áreas urbanas",
          nota: 1000,
          modelo: `A intensificação da urbanização nas grandes cidades tem evidenciado transformações significativas no espaço urbano, entre elas a gentrificação. Esse processo, caracterizado pela valorização de áreas antes ocupadas por populações de baixa renda e sua consequente substituição por grupos com maior poder aquisitivo, revela contradições profundas no desenvolvimento urbano contemporâneo. Nesse contexto, torna-se imprescindível analisar os impactos da gentrificação e discutir formas de mitigar seus efeitos sociais negativos.
Em primeira análise, a gentrificação está diretamente relacionada à lógica capitalista de valorização do espaço urbano. A partir de investimentos públicos e privados em infraestrutura, cultura e serviços, regiões antes marginalizadas passam a atrair novos moradores e empreendimentos. Contudo, esse processo frequentemente resulta no aumento do custo de vida local, inviabilizando a permanência dos antigos residentes. Tal dinâmica pode ser compreendida à luz do pensamento do geógrafo David Harvey, que aponta como o capital molda o espaço urbano de acordo com interesses econômicos, muitas vezes em detrimento do direito à cidade das populações mais vulneráveis.
Além disso, a substituição da população original acarreta a perda de identidades culturais e laços comunitários historicamente construídos. Bairros que antes possuíam características próprias passam a ser padronizados para atender às demandas de novos moradores e turistas, o que enfraquece a diversidade sociocultural. Esse fenômeno pode ser associado ao conceito de “modernidade líquida”, de Zygmunt Bauman, no qual relações e tradições tornam-se cada vez mais frágeis e descartáveis diante das transformações rápidas da sociedade contemporânea.
Por outro lado, é necessário reconhecer que a requalificação urbana pode trazer benefícios, como melhoria na infraestrutura, aumento da segurança e maior oferta de serviços. Entretanto, tais avanços não devem ocorrer à custa da exclusão social. A ausência de políticas públicas eficazes agrava esse cenário, permitindo que o desenvolvimento urbano seja conduzido de forma desigual e excludente.
Diante disso, é fundamental a implementação de medidas que promovam um desenvolvimento urbano mais justo e inclusivo. O poder público, em parceria com organizações sociais, deve estabelecer políticas de habitação acessível, como o controle de aluguéis e a criação de zonas de interesse social, garantindo a permanência das populações originárias nas áreas valorizadas. Essa ação pode ser executada por meio de legislação específica e fiscalização contínua, com o objetivo de equilibrar os interesses econômicos e sociais. Como efeito esperado, haverá a redução da segregação urbana e a preservação das identidades culturais locais.
Em suma, a gentrificação urbana evidencia os desafios de conciliar desenvolvimento e justiça social nas cidades contemporâneas. A adoção de políticas inclusivas e a valorização das comunidades locais são caminhos essenciais para garantir que o progresso urbano beneficie a todos, e não apenas uma parcela privilegiada da população.
`,
        },
        {
          id: 13,
          imagem: "Temas_Fome_Brasil.jpg",
          categoria: "Provão Paulista",
          titulo:
            "O combate a fome no Brasil: entre a responsabilidade do estado e a atuação da sociedade civil",
          nota: 1000,
          modelo: `A persistência da fome no Brasil evidencia uma contradição estrutural em um país marcado por vasta produção agrícola e profundas desigualdades sociais. Embora avanços tenham sido registrados em determinados períodos, o problema voltou a ganhar destaque nos últimos anos, revelando fragilidades nas políticas públicas e nas redes de proteção social. Nesse contexto, o combate à fome exige uma análise que considere tanto a responsabilidade do Estado quanto o papel complementar da sociedade civil.
Em primeira análise, é inegável que o Estado possui a responsabilidade central na garantia do direito à alimentação, previsto na Constituição Federal. Programas de transferência de renda, como o Bolsa Família, historicamente contribuíram para a redução da insegurança alimentar, ao assegurar recursos mínimos para famílias em situação de vulnerabilidade. Além disso, políticas públicas voltadas à agricultura familiar e ao abastecimento interno são fundamentais para promover o acesso a alimentos de qualidade. Nesse sentido, a teoria do economista Amartya Sen destaca que a fome não decorre apenas da escassez de alimentos, mas principalmente da falta de acesso a eles, o que reforça a importância de ações estatais eficazes.
Ademais, a ausência ou descontinuidade dessas políticas agrava o problema, ampliando as desigualdades sociais. Em cenários de crise econômica, o aumento do desemprego e da informalidade compromete a capacidade das famílias de garantir sua subsistência. Dessa forma, a atuação estatal deve ser contínua, estruturada e baseada em dados concretos, a fim de assegurar segurança alimentar de forma duradoura.
Por outro lado, a sociedade civil desempenha um papel relevante no enfrentamento imediato da fome. Organizações não governamentais, projetos comunitários e iniciativas voluntárias atuam na distribuição de alimentos e na assistência a populações vulneráveis, especialmente em contextos emergenciais. Tais ações, embora essenciais, não substituem o dever do Estado, mas funcionam como mecanismos de apoio e mobilização social. Além disso, a participação da sociedade contribui para a fiscalização das políticas públicas e para a construção de soluções mais democráticas e inclusivas.
Diante disso, faz-se necessária a articulação entre Estado e sociedade civil para o combate efetivo à fome no Brasil. Cabe ao Governo Federal, em parceria com estados e municípios, ampliar e fortalecer programas de transferência de renda e segurança alimentar. Essa ação pode ser executada por meio do aumento de investimentos públicos, da criação de políticas permanentes de abastecimento e da valorização da agricultura familiar, com fiscalização rigorosa e transparência na gestão. Paralelamente, organizações da sociedade civil devem ser incentivadas por meio de parcerias e apoio institucional, ampliando sua capacidade de atuação. Como efeito esperado, haverá a redução significativa da insegurança alimentar e a promoção de maior justiça social.
Em suma, o combate à fome no Brasil depende de uma atuação integrada, em que o Estado assume seu papel central e a sociedade civil contribui de forma complementar. Somente por meio de políticas públicas consistentes e do engajamento coletivo será possível garantir o direito fundamental à alimentação para toda a população.++`
        },
        {
          id: 14,
          imagem: "Temas_IA_Escolas.jpg",
          categoria: "Autoral",
          titulo: "Impacto da inteligência artificial nos alunos de escola pública",
          nota: 1000,
          modelo: `Na obra "Admirável Mundo Novo", de Aldous Huxley, a tecnologia é utilizada como instrumento de controle social e condicionamento comportamental dos indivíduos. Embora a realidade contemporânea seja distinta da ficção apresentada pelo autor, o avanço da inteligência artificial tem provocado transformações profundas na educação, especialmente entre estudantes da rede pública. Nesse contexto, o impacto dessa tecnologia sobre os alunos brasileiros está relacionado tanto à ampliação das desigualdades educacionais quanto à insuficiente preparação pedagógica para seu uso consciente.
    Nesse prisma, a assimetria no acesso aos recursos tecnológicos potencializa os efeitos negativos da inteligência artificial nas escolas públicas. Segundo o sociólogo Pierre Bourdieu, a distribuição desigual dos capitais econômico e cultural influencia diretamente as oportunidades disponíveis aos indivíduos. Sob essa ótica, muitos estudantes da rede pública não possuem acesso adequado à internet de qualidade, dispositivos modernos ou plataformas educacionais avançadas, dificultando o aproveitamento pleno das ferramentas de IA. Como consequência, enquanto determinados grupos utilizam esses recursos para potencializar a aprendizagem, outros permanecem limitados por barreiras estruturais, ampliando disparidades já existentes no sistema educacional brasileiro.
    Além disso, a ausência de formação adequada para alunos e professores constitui outro obstacle relevante. De acordo com Paulo Freire, a educação deve promover a autonomia crítica do estudante. Entretanto, o uso indiscriminado da inteligência artificial, sem orientação pedagógica adequada, pode estimular a dependência tecnológica e comprometer o desenvolvimento de habilidades fundamentais, como interpretação, argumentação e pensamento crítico. Assim, em vez de atuar como ferramenta complementar ao aprendizado, a tecnologia corre o risco de substituir processos cognitivos essenciais para a formação cidadã.
    Portanto, medidas devem ser adotadas para garantir que a inteligência artificial contribua positivamente para a educação pública. Cabe ao Ministério da Educação ampliar investimentos em infraestrutura tecnológica nas escolas, por meio da aquisição de equipamentos modernos e da expansão do acesso à internet, visando reduzir desigualdades digitais. Paralelamente, as secretarias de educação devem promover cursos de capacitação para docentes e estudantes sobre o uso ético e responsável da IA, a fim de fortalecer a aprendizagem crítica. Dessa maneira, a tecnologia deixará de representar um fator de exclusão e passará a atuar como instrumento de democratização do conhecimento.`,
        },
        {
          id: 15,
          imagem: "Temas_Resocializacao_Deficientes.jpg",
          categoria: "Autoral",
          titulo: "Inclusão social de pessoas com deficiências físicas",
          nota: 1000,
          modelo: `A Constituição Federal de 1988 estabelece que todos os cidadãos são iguais perante a lei, independentemente de suas condições físicas ou sociais. Entretanto, apesar dos avanços legislativos alcançados nas últimas décadas, a inclusão social de pessoas com deficiências físicas ainda enfrenta inúmeros obstáculos no Brasil. Nesse cenário, a insuficiência da acessibilidade urbana e a persistência de preconceitos sociais configuram importantes entraves à plena participação desses indivíduos na sociedade.
    Sob esse viés, a precariedade da infraestrutura urbana compromete diretamente a autonomia das pessoas com deficiência física. Segundo o conceito de cidadania defendido por T. H. Marshall, o acesso aos direitos sociais é condição indispensável para a integração dos indivíduos à coletividade. Contudo, a realidade brasileira é marcada pela presença de calçadas inadequadas, transportes públicos insuficientemente adaptados e prédios sem acessibilidade plena. Tal conjuntura restringe o direito de locomoção e dificulta o acesso à educação, ao trabalho e ao lazer, contribuindo para processos de exclusão social.
    Além disso, o preconceito ainda representa uma barreira significativa à inclusão. Sob a perspectiva do sociólogo Erving Goffman, os estigmas sociais produzem formas de discriminação que marginalizam determinados grupos. Nesse sentido, muitas pessoas com deficiência enfrentam dificuldades para ingressar no mercado de trabalho ou são constantemente subestimadas quanto às suas capacidades. Essa mentalidade reforça práticas discriminatórias e impede o reconhecimento de seu potencial produtivo e intelectual.
    Portanto, torna-se necessário ampliar as políticas de inclusão social. Para isso, o Ministério das Cidades deve intensificar a fiscalização das normas de acessibilidade e investir na adaptação dos espaços urbanos, por meio de recursos federais destinados aos municípios. Ademais, o Ministério dos Direitos Humanos deve promover campanhas educativas nos meios de comunicação, visando combater preconceitos e incentivar a valorização da diversidade. Assim, será possível construir uma sociedade mais justa, inclusiva e comprometida com a dignidade humana.`
        },
        {
          id: 16,
          imagem: "Temas_Consumo_Consciente.jpg",
          categoria: "Autoral",
          titulo: "Desafios para manter um consumo consciente",
          nota: 1000,
          modelo: `O sociólogo Zygmunt Bauman define a contemporaneidade como uma "sociedade de consumidores", marcada pela constante busca por bens materiais e pela substituição acelerada de produtos. Nesse contexto, embora a preocupação com a sustentabilidade tenha se tornado mais presente nos debates públicos, manter hábitos de consumo consciente ainda representa um grande desafio para a população brasileira. Diante dessa realidade, a influência da cultura consumista e a insuficiência da educação ambiental configuram obstáculos para a consolidação de práticas responsáveis de consumo.
    Precipuamente, a engrenagem da cultura do consumo excessivo atua como fator primordial para a manutenção desse problema. Segundo os pensadores da Escola de Frankfurt, a indústria cultural possui forte capacidade de moldar comportamentos e desejos sociais. Sob essa perspectiva, a publicidade e as redes sociais estimulam constantemente a aquisição de novos produtos, associando felicidade, sucesso e status ao ato de consumir. Como consequência, muitos indivíduos desenvolvem hábitos impulsivos de compra, ignorando os impactos ambientais e sociais gerados pela exploração excessiva dos recursos naturais e pela produção desenfreada de resíduos.
    Ademais, a deficiência da educação ambiental dificulta a formação de consumidores mais conscientes. De acordo com Paulo Freire, a educação é capaz de transformar a realidade por meio da reflexão crítica. Entretanto, a abordagem limitada de temas relacionados à sustentabilidade nas instituições de ensino impede que parte da população compreenda plenamente as consequências de suas escolhas de consumo. Dessa forma, perpetuam-se práticas prejudiciais ao meio ambiente, como o desperdício de recursos, o descarte inadequado de materiais e a valorização de padrões consumistas incompatíveis com o desenvolvimento sustentável.
    Portanto, é imprescindível fortalecer a promoção do consumo consciente no Brasil. Para isso, o Ministério da Educação deve ampliar a inserção de conteúdos voltados à sustentabilidade nos currículos escolares, por meio de projetos interdisciplinares e atividades práticas que incentivem hábitos responsáveis. Paralelamente, os meios de comunicação devem desenvolver campanhas educativas capazes de conscientizar a população acerca dos impactos do consumo excessivo, estimulando escolhas mais sustentáveis. Assim, será possível construir uma sociedade comprometida com a preservação ambiental e com a utilização responsável dos recursos disponíveis.`,
        },
        {
          id: 17,
          imagem: "Temas_Educacao_Financeira.jpg",
          categoria: "Autoral",
          titulo: "Desafios para o ensino de qualidade sobre educação financeira",
          nota: 1000,
          modelo: `Na obra "Pai Rico, Pai Pobre", o escritor Robert Kiyosaki destaca a importância do conhecimento financeiro para a construção de uma vida economicamente estável. Entretanto, no Brasil contemporâneo, a educação financeira ainda ocupa espaço reduzido na formação dos cidadãos, contribuindo para problemas como endividamento e consumo descontrolado. Nesse cenário, a insuficiência das políticas educacionais e a influência da cultura consumista configuram desafios para a promoção de um ensino de qualidade sobre finanças.
    Dessa forma, a lacuna existente na abordagem da educação financeira pelas escolas dificulta a formação de indivíduos preparados para lidar com as oscilações do mercado. Segundo o educador Paulo Freire, a educação deve fornecer instrumentos capazes de transformar a realidade dos estudantes. Contudo, muitos jovens concluem a educação básica sem conhecimentos fundamentais sobre orçamento, investimentos, crédito ou planejamento financeiro. Como resultado, tornam-se mais vulneráveis a decisões impulsivas e ao acúmulo de dívidas ao longo da vida adulta.
    Além disso, a cultura consumista amplamente difundida pelos meios de comunicação agrava esse cenário. Sob a ótica da Escola de Frankfurt, a indústria cultural influencia comportamentos e padrões sociais. Nesse sentido, a constante associação entre felicidade e consumo estimula gastos excessivos e dificulta a adoption de hábitos financeiros saudáveis. Dessa forma, mesmo quando há acesso à informação, muitos indivíduos enfrentam dificuldades para aplicar conceitos de planejamento e controle financeiro.
    Portanto, torna-se necessário ampliar a qualidade do ensino sobre educação financeira no Brasil. Para isso, o Ministério da Educação deve fortalecer a abordagem do tema na educação básica, mediante a criação de materiais didáticos específicos e a capacitação de professores. Além disso, instituições financeiras e meios de comunicação devem promover campanhas educativas acessíveis à população, visando disseminar conhecimentos sobre organização financeira e consumo responsável. Assim, será possível formar cidadãos mais conscientes e preparados para lidar com os desafios econômicos da sociedade contemporânea.`,
        },
        {
          id: 18,
          imagem: "Temas_Substituicao_IA.jpg",
          categoria: "Autoral",
          titulo: "O impacto da inteligência artificial na precarização do trabalho e nas relações de consumo",
          nota: 1000,
          modelo: `No filme "Tempos Modernos", Charlie Chaplin retrata trabalhadores submetidos à lógica da mecanização excessiva e à perda gradual de autonomia no ambiente produtivo. Embora a obra pertença ao século XX, suas reflexões permanecem atuais diante do avanço da inteligência artificial. Nesse contexto, a crescente adoção dessa tecnologia tem provocado mudanças profundas tanto no mercado de trabalho quanto nas relações de consumo, evidenciando desafios relacionados à precarização laboral e à manipulação dos hábitos dos consumidores.
    Em primeira instância, o processo de substituição de funções humanas por sistemas automatizados intensifica a insegurança profissional. Segundo Karl Marx, as transformações nos meios de produção impactam diretamente as relações de trabalho. Sob essa perspectiva, a utilização da inteligência artificial em setores administrativos, industriais e de atendimento tem reduzido a necessidade de mão de obra em determinadas atividades, aumentando a competitividade e a vulnerabilidade de trabalhadores menos qualificados. Como consequência, cresce a informalidade e a instabilidade econômica entre grupos socialmente fragilizados.
    Além disso, a inteligência artificial influencia significativamente o comportamento dos consumidores. De acordo com Zygmunt Bauman, a sociedade contemporânea é marcada pelo consumo constante e pela construção de identidades através das mercadorias. Nesse sentido, algoritmos inteligentes coletam dados pessoais para direcionar anúncios e recomendações cada vez mais precisas, estimulando compras impulsivas e reduzindo a autonomia de decisão dos indivíduos. Dessa forma, as relações de consumo tornam-se mais assimétricas, favorecendo interesses corporativos.
    Portanto, medidas devem ser implementadas para minimizar os impactos negativos da inteligência artificial. Cabe ao Ministério do Trabalho desenvolver programas de qualificação profissional voltados às novas demandas tecnológicas, por meio de cursos gratuitos e parcerias com instituições de ensino. Paralelamente, a Autoridade Nacional de Proteção de Dados deve intensificar a fiscalização do uso de informações pessoais pelas empresas digitais, garantindo maior transparência e proteção aos consumidores. Assim, será possível conciliar inovação tecnológica, justiça social e respeito aos direitos dos cidadãos.`,
        },
        {
          id: 19,
          imagem: "Temas_Violencia_Criancas.jpg",
          categoria: "Autoral",
          titulo: "Impacto da violência doméstica contra a criança e o adolescent no desenvolvimento social",
          nota: 1000,
          modelo: `A violência doméstica contra crianças e adolescentes constitui uma grave violação dos direitos humanos e compromete diretamente a formação de indivíduos saudáveis e integrados à sociedade. Apesar dos avanços legais promovidos pelo Estatuto da Criança e do Adolescente, milhares de jovens brasileiros ainda convivem diariamente com agressões físicas, psicológicas e negligência familiar. Nesse cenário, a persistência desse problema está associada à naturalização da violência e à insuficiência das redes de proteção social.
    De início, a herança cultural de normalização das práticas violentas no ambiente familiar favorece a continuidade desse fenômeno. Segundo o sociólogo Pierre Bourdieu, determinadas formas de violência podem ser reproduzidas simbolicamente e naturalizadas ao longo das gerações. Sob essa ótica, muitos responsáveis consideram agressões físicas ou humilhações como métodos legítimos de educação, ignorando os danos emocionais causados às vítimas. Como resultado, crianças e adolescentes desenvolvem dificuldades de socialização, insegurança e baixa autoestima, fatores que comprometem seu desenvolvimento social.
    Além disso, a fragilidade dos mecanismos de proteção contribui para a manutenção da violência doméstica. Embora existam órgãos especializados, como os Conselhos Tutelares, a falta de recursos e de integração entre instituições dificulta a identificação precoce de situações de risco. Consequentemente, inúmeras vítimas permanecem expostas a ambientes abusivos por longos períodos, acumulando traumas que podem repercutir durante toda a vida adulta.
    Portanto, torna-se indispensável fortalecer o enfrentamento à violência doméstica contra crianças e adolescentes. Para isso, o Ministério dos Direitos Humanos deve ampliar investimentos em programas de proteção e acolhimento, por meio da capacitação de profissionais e do fortalecimento da rede de assistência social. Paralelamente, as escolas devem promover campanhas educativas voltadas à conscientização das famílias sobre formas não violentas de educação. Assim, será possível garantir um desenvolvimento social mais saudável às futuras gerações.`,
        },
        {
          id: 20,
          imagem: "Temas_Inseguranca_Alimentar.jpg",
          categoria: "Autoral",
          titulo: "A persistência da insegurança alimentar e seus reflexos na saúde nacional",
          nota: 1000,
          modelo: `A alimentação adequada constitui um direito fundamental assegurado pela Constituição Federal e indispensável à manutenção da saúde e da dignidade humana. Contudo, milhões de brasileiros ainda enfrentam dificuldades para garantir refeições suficientes e nutritivas diariamente. Nesse contexto, a persistência da insegurança alimentar no país revela problemas estruturais relacionados à desigualdade socioeconômica e à insuficiência de políticas públicas eficazes.
    Com efeito, a severa concentração de renda aliada à vulnerabilidade econômica impede o acesso regular aos alimentos básicos. Segundo o economista Amartya Sen, a fome está mais associada à falta de acesso do que à escassez de alimentos propriamente dita. Sob essa perspectiva, famílias em situação de pobreza enfrentam dificuldades para adquirir produtos básicos, sobretudo em períodos de inflação elevada e desemprego. Como consequência, tornam-se mais frequentes quadros de desnutrição, deficiências nutricionais e agravamento de doenças.
    Ademais, a insuficiência das políticas de segurança alimentar contribui para a manutenção desse cenário. Embora existam programas de assistência social e distribuição de renda, sua abrangência nem sempre é suficiente para atender todas as populações vulneráveis. Dessa forma, muitas comunidades permanecem expostas à insegurança alimentar, o que impacta negativamente indicadores de saúde pública e qualidade de vida.
    Portanto, é necessário intensificar as ações de combate à insegurança alimentar no Brasil. Para isso, o Governo Federal deve ampliar investimentos em programas de transferência de renda e fortalecimento da agricultura familiar, por meio da destinação de recursos específicos e da ampliação da assistência técnica aos produtores. Paralelamente, os municípios devem fortalecer programas de alimentação escolar e distribuição de alimentos para famílias vulneráveis. Assim, será possível reduzir os impactos da fome e promover melhores condições de saúde para a população brasileira.`,
        }
      ],
    };
  },

  computed: {
    modelosFiltrados() {
      return this.modelos.filter((modelo) => {
        const bateTexto = modelo.titulo
          .toLowerCase()
          .includes(this.filtroTexto.toLowerCase());

        const bateCategoria =
          this.filtroCategoria === "Todos" ||
          modelo.categoria === this.filtroCategoria;

        return bateTexto && bateCategoria;
      });
    },
  },

  methods: {
    getImagemUrl(nome) {
      return new URL(`../../assets/TEMAS/${nome}`, import.meta.url).href;
    },

    abrirModal(modelo) {
      this.temaSelecionado = modelo;
      document.body.style.overflow = "hidden";
    },

    fecharModal() {
      this.temaSelecionado = null;
      document.body.style.overflow = "";
    },

    escolherTema(modelo) {
      console.log("Tema escolhido:", modelo.titulo);
    },

    formatarParagrafos(texto) {
      if (!texto) return [];
      return texto.split('\n').filter(p => p.trim() !== '');
    }
  },
  beforeUnmount() {
    document.body.style.overflow = "";
  }
};
</script>

<template>
  <Header />

  <section>
    <header class="titulo">
      <h1>Modelos</h1>
      <p>
        Inspire-se com redações que alcançaram a nota máxima. Analise a estrutura, os argumentos e a aplicação das
        competências para replicar o sucesso na sua produção.
      </p>
    </header>

    <navbar class="fixar-search-bar">
      <div class="search-bar">
        <div class="caixa-search">
          <button class="search-btn">
            <img src="../../assets/ICONS/icons-outros/icon-lupa.png" id="icon-search" />
          </button>
          <input type="text" v-model="filtroTexto" class="input-text" placeholder="Buscar um tema" />
        </div>

        <div class="caixa-category">
          <img src="../../assets/ICONS/icons-outros/icon-category-buscar.PNG" id="category-icon" />
          <select class="category" v-model="filtroCategoria">
            <option value="Todos">Todos</option>
            <option value="ENEM">ENEM</option>
            <option value="Provão Paulista">Provão Paulista</option>
            <option value="Autoral">Autoral</option>
          </select>
        </div>
      </div>
    </navbar>
  </section>

  <section class="container-modelos">
    <main-content class="grid-modelos">
      <div v-for="modelo in modelosFiltrados" :key="modelo.id" class="card" @click="abrirModal(modelo)">

        <div class="imagem">
          <img :src="getImagemUrl(modelo.imagem)" :alt="modelo.titulo" id="img-box" />
          <div class="tema-da-modelo">
            <p>{{ modelo.categoria }}</p>
          </div>
        </div>

        <div class="caixa-descricao-modelo">
          <p>{{ modelo.titulo }}</p>
          <div class="visualizar-detalhe-modelo">
            <p>{{ modelo.nota }}</p>
            <a href="#">
              <span class="ler-mais-btn">Ver modelo →</span>
            </a>
          </div>
        </div>

      </div>
    </main-content>
  </section>

  <div class="camada-fundo" :class="{ aberta: temaSelecionado }">
    <aside class="janela-modal" :class="{ aberta: temaSelecionado }">
      <div v-if="temaSelecionado" class="corpo-modal">

        <button class="botao-fechar" @click="fecharModal">✕</button>

        <div class="topo-imagem">
          <img :src="getImagemUrl(temaSelecionado.imagem)" :alt="temaSelecionado.titulo" />
        </div>

        <header class="topo-modal">
          <div class="etiqueta-tema">
            <span class="tag-subcategoria">{{ temaSelecionado.categoria }}</span>
            <span class="divisor">•</span>
            <span class="tag-subcategoria destaque">{{ temaSelecionado.nota }}</span>
          </div>

          <h1 class="titulo-redacao">{{ temaSelecionado.titulo }}</h1>
        </header>


        <div class="texto-conteudo apoio">
          <div class="subtitulo-secao">Redação</div>

          <div class="leitura-focada">
            <p v-for="(p, i) in formatarParagrafos(temaSelecionado.modelo)" :key="i">
              {{ p }}
            </p>
          </div>

        </div>

      </div>

    </aside>
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
  background: var(--branco);
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

.container-modelos {
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
  background: var(--branco);
  color: var(--texto-forte);
  padding: 6px 12px;
  font-size: 12px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 1px;
  border-radius: 4px;
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

.caixa-descricao-modelo>p {
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

.camada-fundo {
  position: fixed;
  inset: 0;
  background: rgba(0, 0, 0, 0);
  z-index: 999;
  opacity: 0;
  pointer-events: none;
  transition: opacity 0.4s ease, background 0.4s ease;
}

.camada-fundo.aberta {
  opacity: 1;
  pointer-events: all;
  background: rgba(0, 0, 0, 0.6);
}

.janela-modal {
  position: fixed;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%) scale(0.95);
  width: 50%;
  height: 95vh;
  background: var(--surface);
  box-shadow: var(--shadowPadrao);
  border-radius: 18px;
  transition:
    opacity 0.35s ease,
    transform 0.35s ease;
  display: flex;
  flex-direction: column;
  z-index: 1000;
  opacity: 0;
  pointer-events: none;
  border: 1px solid var(--borda);
}

.janela-modal.aberta {
  opacity: 1;
  pointer-events: all;
  transform: translate(-50%, -50%) scale(1);
}

.botao-fechar {
  position: absolute;
  top: 24px;
  right: 24px;
  width: 40px;
  height: 40px;
  border-radius: 50%;
  background: var(--surface-2);
  border: 1px solid var(--borda);
  font-size: 18px;
  cursor: pointer;
  display: flex;
  align-items: center;
  justify-content: center;
  transition: all 0.3s ease;
  z-index: 10;
  color: var(--texto-forte);
}

.botao-fechar:hover {
  background: var(--surface-3);
  border-color: var(--laranjaPadrao);
  color: var(--laranjaPadrao);
}

.corpo-modal {
  flex: 1;
  overflow-y: auto;
  padding: 0px 40px 100px;
  scrollbar-width: thin;
  scrollbar-color: var(--borda) var(--surface);
  position: relative;
}

.corpo-modal::-webkit-scrollbar {
  width: 8px;
}

.corpo-modal::-webkit-scrollbar-track {
  background: var(--surface);
}

.corpo-modal::-webkit-scrollbar-thumb {
  background: var(--borda);
  border-radius: 4px;
}

.corpo-modal::-webkit-scrollbar-thumb:hover {
  background: var(--texto-medio);
}

.topo-modal {
  margin-bottom: 30px;
  padding-right: 50px;
}

.etiqueta-tema {
  display: flex;
  align-items: center;
  gap: 10px;
  font-size: 12px;
  font-weight: 600;
  text-transform: uppercase;
  color: var(--texto-medio);
  margin-bottom: 16px;
  letter-spacing: 1px;
}

.tag-subcategoria {
  color: var(--texto-medio);
}

.tag-subcategoria.destaque {
  color: var(--laranjaPadrao);
}

.titulo-redacao {
  font-size: 24px;
  font-weight: 800;
  color: var(--texto-forte);
  line-height: 1.2;
}

.topo-imagem {
  width: calc(100% + 80px);
  margin-left: -40px;
  margin-right: -40px;
  height: 50%;
  margin-bottom: 40px;
  border-radius: 8px;
  overflow: hidden;
}

.topo-imagem img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.subtitulo-secao {
  font-size: 14px;
  font-weight: 700;
  text-transform: uppercase;
  color: var(--texto-medio);
  border-bottom: 1px solid var(--borda);
  padding-bottom: 8px;
  margin-bottom: 20px;
  letter-spacing: 0.5px;
}

.texto-conteudo.instrucoes {
  margin-bottom: 40px;
}

.texto-conteudo.instrucoes p {
  font-size: 16px;
  line-height: 1.7;
  color: var(--texto);
  background: var(--surface-3);
  padding: 20px;
  border-left: 4px solid var(--laranjaPadrao);
  border-radius: 0 4px 4px 0;
  margin: 0;
}

.bloco-charge {
  width: 100%;
  min-height: 200px;
  margin-bottom: 32px;
  border: 2px solid var(--borda);
  border-radius: 8px;
  display: flex;
  flex-direction: column;
  gap: 20px;
  align-items: center;
  justify-content: center;
  background: var(--surface-3);
  overflow: hidden;
}

.bloco-charge img {
  width: 100%;
  height: 100%;
  object-fit: contain;
  border-radius: 6px;
}

.leitura-focada {
  font-family: 'Georgia', 'Times New Roman', serif;
  font-size: 18px;
  line-height: 1.8;
  color: var(--texto);
}

.leitura-focada p {
  margin-bottom: 24px;
  text-align: justify;
  color: var(--texto);
}

.rodape-modal {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  padding: 10px 40px;
  background: var(--branco);
  border-top: 1px solid var(--borda);
}

.btn-escolher {
  width: 100%;
  padding: 18px;
  background: var(--laranjaPadrao);
  color: #fff;
  border: none;
  border-radius: 4px;
  font-size: 16px;
  font-weight: 700;
  cursor: pointer;
  transition: transform 0.3s ease, background 0.3s ease;
  box-shadow: var(--laranjaShadow);
  display: block;
}

.btn-escolher:hover {
  background: var(--laranjaEscuro);
  transform: translateY(-2px);
  box-shadow: 0 0 20px rgba(245, 158, 11, 0.4);
}

.btn-escolher:active {
  transform: translateY(0);
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