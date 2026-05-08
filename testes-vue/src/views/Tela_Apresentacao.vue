<script>
import Footer from "../components/layout/Footer.vue";

export default {
  components: {
    Footer,
  },

  data() {
    return {
      navRolado: false,
    };
  },

  mounted() {
    window.addEventListener("scroll", this.handleScroll);
  },

  unmounted() {
    window.removeEventListener("scroll", this.handleScroll);
  },

  methods: {
    handleScroll() {
      this.navRolado = window.scrollY > 10;
    },
  },
};
</script>

<template>
  <nav class="nav-barra" :class="{ rolado: navRolado }" id="barra-nav">
    <div class="nav-logotipo">
      <a href="#inicio">
        <img src="../assets/IMAGES/logo-redamais-grande.png" alt="Logo REDA+" />
      </a>
    </div>
    <ul class="nav-menu">
      <li><a href="#sobre">Sobre</a></li>
      <li><a href="#planos">Planos</a></li>
      <li><a href="#contato">Contato</a></li>
      <li class="nav-btn-entrar">
        <RouterLink to="/cadastro">Entrar</RouterLink>
      </li>
    </ul>
  </nav>

  <main>

    <header class="hero" id="inicio">
      <div class="hero-conteudo">
        <h1 class="titulo">
          Torne-se um <span class="laranja-titulo">MESTRE</span><br />
          Seja <span class="laranja-titulo">REDA+</span>
        </h1>
        <p class="subtitulo">
          Desenvolva sua <strong>escrita</strong> e seu <strong>desempenho</strong> com o <span class="laranja">REDA+</span>, A plataforma que transforma seu <strong>aprendizado</strong> em resultado.
        </p>
        <div class="hero-acoes">
          <a href="#planos"><button class="btn-quero">Eu Quero!</button></a>
        </div>
      </div>

      <div class="hero-imagem">
        <div class="hero-imagem-wrapper">

        </div>
      </div>
    </header>
    <section id="sobre" class="secao">
      <h2>A Maior plataforma de redação do <span class="laranja">BRASIL</span>!</h2>
      <div class="conteudo">

        <div class="caixa-esquerda">
          <a href="#" aria-label="Assistir vídeo sobre a REDA+">
            <div class="video-miniatura">
              <img src="../assets/IMAGES/exemplo-video.png" alt="Vídeo REDA+" />
              <div class="play-sobreposicao">
                <div class="play-botao" aria-hidden="true">&#9654;</div>
              </div>
            </div>
          </a>
          <p>Conheça mais sobre nós!</p>
        </div>

        <div class="caixa-direita">
          <p class="caixa-titulo">Conheça nossos planos!</p>
          <div class="caixa-direita-interna">
            <p class="mensagem">
              Nossa plataforma oferece planos vitalícios para te fazer ser o Nº 1!
            </p>
            <ul class="lista-planos">
              <li>
                <a id="plano-basico" href="#planos">
                  <span class="plano-etiqueta">Grátis</span>
                  <span class="plano-preco">R$ 0,00</span>
                </a>
              </li>
              <li>
                <a id="plano-pro-link" href="#planos">
                  <span class="plano-etiqueta">Pro</span>
                  <span class="plano-preco">R$ 29,99</span>
                </a>
              </li>
              <li>
                <a id="plano-prem-link" href="#planos">
                  <span class="plano-etiqueta">REDA+</span>
                  <span class="plano-preco">R$ 49,99</span>
                </a>
              </li>
            </ul>
            <a href="#planos"><button class="btn-solicitar">Eu Quero!</button></a>
          </div>
        </div>

      </div>
    </section>

    <section id="planos" class="secao secao-planos">
      <header class="cabecalho-planos">
        <h3 class="titulo-secao">
          Planos, Funcionalidades e Valores
          <span class="laranja"> Permanentes</span>
        </h3>
        <p class="subtitulo-secao">
          O plano de compra única permite pagar apenas uma vez e ter acesso
          vitalício ao conteúdo. Não há mensalidades, renovações ou cobranças recorrentes.
        </p>
      </header>

      <div class="caixa-planos">
        <ul class="lista-cards-plano">

          <li class="card-plano">
            <div class="cabecalho-card">
              <p class="plano-label plano-label-inicial">Plano Inicial</p>
              <p class="plano-valor plano-valor-inicial">R$ 0,00</p>
              <p class="plano-desc">Nenhum pagamento necessário</p>
            </div>
            <button id="btn-plano-inicial" class="btn-plano">Começar Grátis</button>
            <ul class="plano-recursos">
              <li>✓ 3 correções por mês</li>
              <li>✓ Feedback básico</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
            </ul>
          </li>

          <li class="card-plano card-plano-pro">
            <div class="cabecalho-card">
              <p class="plano-label plano-label-pro">Plano Pro</p>
              <p class="plano-valor plano-valor-pro">
                R$ 29,99 <span class="plano-recorrencia">vitalício</span>
              </p>
              <p class="plano-desc-pro">Plano vitalício com diversas ferramentas</p>
            </div>
            <button id="btn-plano-pro" class="btn-plano">Começar Agora</button>
            <ul class="plano-recursos">
              <li>✓ Correções ilimitadas</li>
              <li>✓ Feedback detalhado</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
            </ul>
          </li>

          <li class="card-plano card-plano-premium">
            <div class="cabecalho-card">
              <p class="plano-label plano-label-premium">Plano REDA+</p>
              <p class="plano-valor plano-valor-premium">
                R$ 49,99 <span class="plano-recorrencia">vitalício</span>
              </p>
              <p class="plano-desc-premium">Tudo que a REDA+ pode oferecer</p>
            </div>
            <button id="btn-plano-premium" class="btn-plano">Começar Agora</button>
            <ul class="plano-recursos">
              <li>✓ Correções ilimitadas</li>
              <li>✓ Feedback premium</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
            </ul>
          </li>

        </ul>
      </div>
    </section>

    <section id="funcionalidades" class="secao secao-funcionalidades">
      <h2 style="margin-bottom: 40px">Veja o que a REDA+ oferece</h2>
      <div class="conteudo-funcionalidades">

        <div class="grid-imagens">
          <article class="card-imagem">
            <img src="../assets/IMAGES/exemplo-redacao.jpg" alt="Correção de redações com IA"
              class="imagem-funcionalidade" />
            <p class="legenda">Correção de redações com IA focada em vestibulares</p>
          </article>
          <article class="card-imagem">
            <img src="../assets/IMAGES/inicial-exemplo-desempenho.jpg" alt="Gráficos de desempenho do aluno"
              class="imagem-funcionalidade" />
            <p class="legenda">Gráficos de desempenho das redações do aluno</p>
          </article>
          <article class="card-imagem">
            <img src="../assets/IMAGES/livros-variedade.jpg" alt="Acervo com alta variedade de livros"
              class="imagem-funcionalidade" />
            <p class="legenda">Acervo com alta variedade de livros</p>
          </article>
          <article class="card-imagem">
            <img src="../assets/IMAGES/inicial-exemplo-chatbot.jpg" alt="Chatbot com IA para tirar dúvidas"
              class="imagem-funcionalidade" />
            <p class="legenda">Chatbot com IA para tirar dúvidas</p>
          </article>
        </div>

        <div class="caixa-app">
          <img src="../assets/IMAGES/logo-redamais.png" alt="Logo REDA+" class="logo-aplicativo" />
          <p class="legenda">Baixe nosso aplicativo!</p>
          <button id="btn-baixar">Baixar App</button>
        </div>

      </div>
    </section>

    <section id="como-usar" class="secao secao-como-usar">
      <div class="cabecalho-como-usar">
        <h2 class="titulo-como-usar">
          Veja como utilizar a plataforma para
          <span class="laranja"> Correção!</span>
        </h2>
        <p class="subtitulo-como-usar">e veja como é extremamente simples utilizar a REDA+</p>
      </div>

      <div class="conteudo-passos">
        <div class="caixa-passos">

          <div class="card-passo">
            <div class="passo-numero">1</div>
            <p class="passo-titulo">Escolha o tema da sua redação</p>
            <p class="passo-texto">Na REDA+ existem milhares de temas à sua disposição!</p>
          </div>

          <div class="card-passo">
            <div class="passo-numero">2</div>
            <p class="passo-titulo">Escreva e envie sua redação</p>
            <p class="passo-texto">Digite ou cole a sua redação no editor da REDA+ e receba estatísticas</p>
          </div>

          <div class="card-passo">
            <div class="passo-numero">3</div>
            <p class="passo-titulo">Receba sua correção em segundos!</p>
            <p class="passo-texto">Em questão de segundos, a REDA+ te entrega uma redação corrigida e detalhada.</p>
          </div>

          <div class="card-passo">
            <div class="passo-numero">4</div>
            <p class="passo-titulo">Aplique sugestões e envie para recorreção</p>
            <p class="passo-texto">Correções e recorreções ilimitadas com a REDA+</p>
          </div>

        </div>

        <div class="caixa-info caixa-info-esquerda">
          <p class="info-titulo">Por que usar o REDA+?</p>
          <p class="info-texto">
            No REDA+, você transforma suas redações em resultados reais! Nossa plataforma foi criada
            especialmente para quem quer entender, na prática, o que precisa melhorar para gabaritar
            a redação do ENEM. Com correções detalhadas, feedbacks personalizados e análise de
            critérios oficiais, você ganha clareza sobre seus pontos fortes e o que desenvolver
            para alcançar uma nota alta.
          </p>
        </div>

        <div class="caixa-info caixa-info-direita">
          <p class="info-titulo">Vantagens de usar o REDA+</p>
          <p class="info-texto">
            Com o REDA+, sua evolução está no centro de tudo. Você recebe correções que vão além
            do simples "certo ou errado": explicações claras, sugestões de melhorias, estrutura e
            coesão avaliadas com precisão, e ainda acompanhamento de desempenho ao longo do tempo.
            Tudo pensado especialmente para o ENEM!
          </p>
        </div>
      </div>
    </section>

  </main>

  <Footer />
</template>

<style scoped>
@import "../assets/css/variaveis.css";

.nav-barra {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  z-index: 1000;
  height: 70px;
  background: linear-gradient(90deg, var(--azul-escuro) 0%, var(--azulPadrao) 100%);
  border-bottom: 1px solid rgba(255, 255, 255, 0.08);
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0 60px;
  transition: background var(--trans), box-shadow var(--trans);
}

.nav-barra.rolado {
  background: var(--azul-escuro);
  box-shadow: 0 4px 24px rgba(0, 0, 0, 0.4);
}

.nav-logotipo img {
  margin-top: 6px;
  width: auto;
  height: 170px;
}

.nav-menu {
  display: flex;
  list-style: none;
  align-items: center;
  gap: 36px;
  font-size: 15px;
}

.nav-menu a {
  text-decoration: none;
  color: rgba(255, 255, 255, 0.88);
  font-weight: 600;
  letter-spacing: 0.2px;
  transition: color var(--trans);
}

.nav-menu a:hover {
  color: var(--laranjaPadrao);
}

.nav-btn-entrar {
  background: linear-gradient(135deg, var(--laranjaPadrao) 0%, var(--laranjaEscuro) 100%);
  color: #fff;
  padding: 8px 22px;
  border-radius: var(--radius-pequeno);
  font-weight: 700;
  box-shadow: 0 8px 24px rgba(249, 115, 22, 0.3);
  transition: opacity var(--trans), transform var(--trans);
}

.nav-btn-entrar:hover {
  opacity: 0.9;
  transform: translateY(-1px);
}

.hero {

  background-image:
    url('../assets/IMAGES/image-landing-page.jpg');

  background-size: cover;
  background-position: center;

  height: 100vh;
  max-height: 1500px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 60px 80px;
  gap: 40px;
  overflow: hidden;
  position: relative;
}


.hero-conteudo {
  
  margin-left: 50px;


  max-width: 560px;
  z-index: 1;
  flex-shrink: 0;
  padding-bottom: 15px;
}

.titulo {


  color: #fff;
  font-size: 46px;
  font-weight: 900;
  line-height: 1.15;
  margin-bottom: 10px;
  text-shadow: var(--pretoShadow);

}

.subtitulo {

  font-size: 15px !important;
  width: 350px;
  color: var(--cinzaPadrao);
  font-size: 17px;
  line-height: 1.75;
  margin-bottom: 32px;
  margin-left: 25px;
}

.subtitulo strong {
  color: var(--branco);
  font-weight: 800;
}

.laranja-titulo{
  color: var(--laranjaPadrao);
  text-shadow: var(--laranjaShadow);
}

.laranja {
  color: var(--laranjaPadrao);
}

.hero-acoes {
  display: flex;
  align-items: center;
  gap: 20px;
  margin-top: 8px;
}

.hero-imagem {
  flex: 1;
  display: flex;
  justify-content: center;
  align-items: flex-end;
  min-width: 400px;
  max-width: 100vh;
  z-index: 1;
  position: relative;
}

.hero-imagem-wrapper {
  position: relative;
  width: 100%;
}

.garota-estudando {
  width: 100%;
  display: block;
  margin: 0 auto;
  filter: drop-shadow(0 24px 48px rgba(0, 0, 0, 0.5));
  border-radius: var(--raio);
}

.btn-quero,
.btn-solicitar,
#btn-baixar {
  background: var(--laranjaPadrao);
  color: #fff;
  font-weight: 700;
  border: none;
  border-radius: var(--radius-pequeno);
  cursor: pointer;
  box-shadow: 0 8px 24px rgba(249, 115, 22, 0.3);
  transition: opacity var(--trans), transform var(--trans), box-shadow var(--trans);
  font-family: "Poppins", sans-serif;
}

.btn-quero {
  font-size: 17px;
  padding: 14px 52px;
  margin-left: 25px;
}

.btn-solicitar {
  font-size: 17px;
  padding: 13px 52px;
  margin-top: 12px;
}

#btn-baixar {
  font-size: 16px;
  padding: 13px 40px;
}

.btn-quero:hover,
.btn-solicitar:hover,
#btn-baixar:hover {
  opacity: 0.92;
  transform: translateY(-2px);
  box-shadow: 0 12px 32px rgba(249, 115, 22, 0.4);
}

.secao {
  padding: 72px 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

h2 {
  color: var(--laranjaPadrao);
  font-size: 30px;
  font-weight: 800;
  margin-bottom: 36px;
  text-align: center;
}

.conteudo {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  width: 100%;
  max-width: 1100px;
  gap: 28px;
}

.caixa-esquerda,
.caixa-direita {
  flex: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
  background: var(--azulPadrao);
  border-radius: var(--raio-lg);
  box-shadow: var(--shadowPadrao);
  border: 1px solid rgba(255, 255, 255, 0.1);
  transition: transform var(--trans), box-shadow var(--trans);
}

.caixa-esquerda {
  min-width: 340px;
  padding: 20px;
}

.caixa-direita {
  min-width: 320px;
  padding: 24px;
}

.caixa-esquerda:hover,
.caixa-direita:hover {
  transform: translateY(-4px);
}

.caixa-esquerda>p {
  color: var(--texto-claro);
  font-size: 20px;
  font-weight: 600;
  text-align: center;
  margin-top: 14px;
}

.video-miniatura {
  position: relative;
  width: 100%;
  border-radius: var(--radius-medio);
  overflow: hidden;
}

.video-miniatura img {
  width: 100%;
  display: block;
  border-radius: var(--radius-medio);
  transition: transform 0.4s ease;
}

.caixa-direita-interna {
  display: flex;
  flex-direction: column;
  align-items: center;
  background: var(--branco);
  border-radius: var(--raio);
  box-shadow: var(--sombra-sm);
  padding: 24px;
  width: 100%;
}

.caixa-titulo {
  color: #fff;
  text-align: center;
  font-size: 22px;
  font-weight: 800;
  margin-bottom: 16px;
  text-shadow: 0 1px 6px rgba(0, 0, 0, 0.2);
}

.mensagem {
  color: var(--texto);
  font-size: 15px;
  font-weight: 500;
  text-align: center;
  margin-bottom: 8px;
  line-height: 1.55;
}

.lista-planos {
  list-style: none;
  display: flex;
  gap: 10px;
  margin: 16px 0;
  flex-wrap: wrap;
  justify-content: center;
}

.lista-planos li a {
  display: flex;
  flex-direction: column;
  align-items: center;
  background: var(--branco);
  padding: 14px 18px;
  border-radius: var(--radius-pequeno);
  text-decoration: none;
  box-shadow: var(--sombra-sm);
  border: 1px solid var(--borda-clara);
  cursor: pointer;
  transition: transform var(--trans), box-shadow var(--trans);
}

.lista-planos li a:hover {
  transform: translateY(-3px);
  box-shadow: var(--sombra-md);
}

.plano-etiqueta {
  font-size: 11px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.8px;
}

.plano-preco {
  font-size: 17px;
  font-weight: 800;
  margin-top: 4px;
}

#plano-basico .plano-etiqueta,
#plano-basico .plano-preco {
  color: #7a8a9a;
}

#plano-pro-link .plano-etiqueta,
#plano-pro-link .plano-preco {
  color: var(--azulPadrao);
}

#plano-prem-link .plano-etiqueta,
#plano-prem-link .plano-preco {
  color: var(--laranjaPadrao);
}

.secao-planos {
  background:
    radial-gradient(ellipse 70% 50% at 50% 0%, rgba(26, 75, 156, 0.07) 0%, transparent 70%),
    var(--branco);
}

.cabecalho-planos {
  background: var(--branco);
  padding: 36px 60px;
  border-radius: var(--raio-lg);
  box-shadow: var(--sombra-sm);
  border: 1px solid var(--borda-clara);
  max-width: 760px;
  text-align: center;
  margin-bottom: 20px;
}

.titulo-secao {
  color: var(--azulPadrao);
  font-size: 26px;
  font-weight: 800;
  margin-bottom: 12px;
}

.subtitulo-secao {
  color: var(--texto-sec);
  font-size: 14.5px;
  line-height: 1.75;
}

.caixa-planos {
  width: 100%;
  max-width: 1100px;
}

.lista-cards-plano {
  list-style: none;
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  align-items: stretch;
  gap: 24px;
  padding: 24px 0 40px;
}

.card-plano {
  background: var(--branco);
  border: 2px solid var(--borda-clara);
  width: 300px;
  border-radius: var(--raio-lg);
  text-align: center;
  box-shadow: var(--sombra-sm);
  padding: 28px 24px 32px;
  display: flex;
  flex-direction: column;
  align-items: center;
  position: relative;
  transition: transform var(--trans), box-shadow var(--trans);
}

.card-plano:hover {
  transform: translateY(-7px);
  box-shadow: var(--shadowPadrao);
}

.card-plano-pro {
  border-color: var(--azul);
  background: linear-gradient(180deg, #f0f5ff 0%, var(--branco) 100%);
  transform: scale(1.04);
  box-shadow: var(--sombra-md), 0 0 0 3px rgba(26, 75, 156, 0.1);
}

.card-plano-pro:hover {
  transform: scale(1.04) translateY(-7px);
}

.card-plano-premium {
  border-color: var(--laranjaPadrao);
  background: linear-gradient(180deg, #fff7f0 0%, var(--branco) 100%);
}

.card-plano-premium:hover {
  box-shadow: var(--shadowPadrao), 0 0 0 3px rgba(249, 115, 22, 0.12);
}

.cabecalho-card {
  margin-bottom: 16px;
  width: 100%;
}

.plano-label {
  font-weight: 700;
  font-size: 12px;
  text-transform: uppercase;
  letter-spacing: 1.2px;
  margin-bottom: 8px;
}

.plano-label-inicial {
  color: #8898a8;
}

.plano-label-pro {
  color: var(--azulPadrao);
}

.plano-label-premium {
  color: var(--laranjaPadrao);
}

.plano-valor {
  font-weight: 900;
}

.plano-valor-inicial {
  color: var(--texto-sec);
  font-size: 26px;
}

.plano-valor-pro {
  color: var(--azulPadrao);
  font-size: 24px;
}

.plano-valor-premium {
  color: var(--laranjaPadrao);
  font-size: 24px;
}

.plano-recorrencia {
  font-size: 13px;
  font-weight: 500;
  opacity: 0.65;
}

.plano-desc {
  color: #8898a8;
  font-size: 13px;
  margin-top: 6px;
}

.plano-desc-pro {
  color: var(--azulPadrao);
  font-size: 13px;
  margin-top: 6px;
  font-weight: 500;
}

.plano-desc-premium {
  color: var(--laranjaPadrao);
  font-size: 13px;
  margin-top: 6px;
  font-weight: 600;
}

.btn-plano {
  font-size: 15px;
  font-weight: 700;
  padding: 11px 36px;
  border-radius: var(--radius-pequeno);
  cursor: pointer;
  margin-bottom: 20px;
  font-family: "Poppins", sans-serif;
  transition: background var(--trans), color var(--trans), transform var(--trans), box-shadow var(--trans);
}

#btn-plano-inicial {
  background: transparent;
  border: 2px solid var(--azulPadrao);
  color: var(--azulPadrao);
}

#btn-plano-inicial:hover {
  background: var(--azulPadrao);
  color: #fff;
  transform: translateY(-2px);
}

#btn-plano-pro {
  background: var(--azul-escuro);
  border: none;
  color: #fff;
  box-shadow: 0 6px 16px rgba(26, 75, 156, 0.35);
}

#btn-plano-pro:hover {
  opacity: 0.9;
  transform: translateY(-2px);
}

#btn-plano-premium {
  background: var(--laranjaPadrao);
  border: none;
  color: #fff;
  box-shadow: 0 8px 24px rgba(249, 115, 22, 0.3);
}

#btn-plano-premium:hover {
  opacity: 0.9;
  transform: translateY(-2px);
}

.plano-recursos {
  list-style: none;
  width: 100%;
  text-align: left;
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.plano-recursos li {
  font-size: 13.5px;
  font-weight: 500;
  color: var(--texto-sec);
  padding: 7px 12px;
  border-radius: var(--radius-pequeno);
  background: var(--branco);
  border: 1px solid var(--borda-clara);
}

.secao-funcionalidades {
  background: linear-gradient(160deg, #dce8f5 0%, var(--cinza-claro) 100%);
}

.secao-funcionalidades h2 {
  color: var(--azulPadrao);
}

.conteudo-funcionalidades {
  display: flex;
  justify-content: center;
  align-items: flex-start;
  gap: 40px;
  flex-wrap: wrap;
  width: 100%;
  max-width: 1200px;
}

.grid-imagens {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 20px;
  flex: 2;
  min-width: 300px;
}

.card-imagem {
  background: var(--branco);
  padding: 12px;
  border-radius: var(--raio);
  box-shadow: var(--sombra-sm);
  border: 1px solid rgba(26, 75, 156, 0.08);
  transition: transform var(--trans), box-shadow var(--trans);
}

.card-imagem:hover {
  transform: translateY(-5px);
  box-shadow: var(--sombra-md);
}

.imagem-funcionalidade {
  width: 100%;
  height: 200px;
  object-fit: cover;
  border-radius: var(--radius-pequeno);
  display: block;
}

.legenda {
  text-align: center;
  margin-top: 10px;
  font-size: 13px;
  font-weight: 500;
  color: var(--texto-sec);
  line-height: 1.4;
}

.caixa-app {
  background: var(--branco);
  padding: 30px;
  border-radius: var(--raio-lg);
  box-shadow: var(--sombra-md);
  text-align: center;
  flex: 1;
  min-width: 220px;
  max-width: 280px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 14px;
  border: 1px solid rgba(26, 75, 156, 0.1);
}

.logo-aplicativo {
  width: 100%;
  max-width: 200px;
  border-radius: var(--radius-pequeno);
}

.secao-como-usar {
  background:
    radial-gradient(ellipse 80% 40% at 50% 100%, rgba(26, 75, 156, 0.06) 0%, transparent 70%),
    var(--branco);
}

.cabecalho-como-usar {
  background: var(--branco);
  padding: 32px 60px;
  border-radius: var(--raio-lg);
  box-shadow: var(--sombra-sm);
  border: 1px solid var(--borda-clara);
  max-width: 760px;
  text-align: center;
  margin-bottom: 16px;
}

.titulo-como-usar {
  color: var(--azulPadrao);
  font-size: 26px;
  font-weight: 800;
  margin-bottom: 10px;
}

.subtitulo-como-usar {
  color: var(--texto-sec);
  font-size: 15px;
}

.conteudo-passos {
  display: flex;
  flex-direction: column;
  align-items: center;
  width: 100%;
  max-width: 1100px;
}

.caixa-passos {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  gap: 24px;
  padding: 40px 0 20px;
  width: 100%;
}

.card-passo {
  background: var(--azulPadrao);
  padding: 28px 24px;
  border-radius: var(--raio);
  box-shadow: var(--sombra-md);
  width: 220px;
  flex-shrink: 0;
  border: 1px solid rgba(255, 255, 255, 0.1);
  transition: transform var(--trans), box-shadow var(--trans);
}

.card-passo:hover {
  transform: translateY(-5px);
  box-shadow: var(--shadowPadrao);
}

.passo-numero {
  width: 36px;
  height: 36px;
  background: linear-gradient(135deg, var(--laranjaPadrao) 0%, var(--laranjaEscuro) 100%);
  color: #fff;
  font-size: 17px;
  font-weight: 800;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 14px;
  box-shadow: 0 3px 10px rgba(249, 115, 22, 0.4);
}

.passo-titulo {
  color: var(--laranjaPadrao);
  font-size: 16px;
  font-weight: 700;
  margin-bottom: 8px;
  line-height: 1.4;
}

.passo-texto {
  color: var(--texto-claro);
  font-size: 13px;
  line-height: 1.65;
}

.caixa-info {
  background: var(--azulPadrao);
  color: #fff;
  padding: 30px 40px;
  border-radius: var(--raio);
  box-shadow: var(--sombra-md);
  width: 65%;
  max-width: 680px;
  border: 1px solid rgba(255, 255, 255, 0.1);
  transition: transform var(--trans), box-shadow var(--trans);
}

.caixa-info:hover {
  transform: translateY(-3px);
  box-shadow: var(--shadowPadrao);
}

.caixa-info-esquerda {
  align-self: flex-start;
  margin: 30px 0 10px 0;
}

.caixa-info-direita {
  align-self: flex-end;
  margin: 10px 0 40px 0;
}

.info-titulo {
  font-size: 20px;
  font-weight: 700;
  color: var(--laranjaPadrao);
  margin-bottom: 12px;
}

.info-texto {
  font-size: 14px;
  line-height: 1.75;
  color: var(--texto-claro);
}

@media (max-width: 1024px) {
  .nav-barra {
    padding: 0 28px;
  }

  .nav-menu {
    gap: 20px;
    font-size: 15px;
  }

  .hero {
    padding: 48px 30px 36px;
    flex-direction: column;
    align-items: flex-start;
    min-height: auto;
  }

  .hero-imagem {
    width: 100%;
    max-width: 100%;
    align-self: center;
    min-width: unset;
  }

  .garota-estudando {
    max-width: 320px;
  }

  .titulo {
    font-size: 38px;
  }

  .secao {
    padding: 60px 28px;
  }

  .conteudo-funcionalidades {
    flex-direction: column;
    align-items: center;
  }

  .caixa-app {
    max-width: 100%;
    width: 100%;
  }
}

@media (max-width: 600px) {
  .hero {
    padding: 36px 18px 28px;
  }

  .hero-imagem {
    display: none;
  }

  .caixa-info {
    width: 90%;
    margin-left: 0;
    margin-right: 0;
    align-self: center;
  }
}
</style>
