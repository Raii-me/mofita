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
        <RouterLink to="/login">Entrar</RouterLink>
      </li>
    </ul>
  </nav>

  <main>

    <header class="hero" id="inicio">
      <div class="hero-conteudo">

        <div class="mini-titulo">
          <img src="../assets/ICONS/icon-estrela-landing-page.png">
          <p>Correção com Inteligencia Artificial!</p>
        </div>

        <h1 class="titulo">
          Torne-se um <span class="laranja-titulo">MESTRE</span><br />
          Seja <span class="laranja-titulo">REDA+</span>
        </h1>
        <p class="subtitulo">
          Desenvolva sua <strong>escrita</strong> e seu <strong>desempenho</strong> com o <span
            class="laranja">REDA+</span>, A plataforma que transforma seu <strong>aprendizado</strong> em resultado.
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

              </div>
            </div>
          </a>
          <p>Conheça nosso site!</p>
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

              <div class="icone-plano icone-plano-1">
                <img src="../assets/ICONS/icon-livro-landing-page.png">
              </div>

              <p class="plano-label plano-label-inicial">Plano Inicial</p>



              <p class="plano-valor plano-valor-inicial">R$ 0,00</p>
              <p class="plano-desc">Nenhum pagamento necessário</p>
            </div>
            <button id="btn-plano-inicial" class="btn-plano">Começar Grátis</button>
            <ul class="plano-recursos">
              <li>✓ 3 correções por mês</li>
              <li>✓ Feedback básico</li>
              <li>✓ bonus</li>
              <li>✓ é pobre imundo</li>
            </ul>
          </li>

          <li class="card-plano card-plano-pro">
            <div class="cabecalho-card">

              <div class="icone-plano icone-plano-2">
                <img src="../assets/ICONS/icon-trofeu-landing-page-azul.svg">
              </div>

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

              <div class="icone-plano icone-plano-3">
                <img src="../assets/ICONS/icon-estrela-landing-page.png">
              </div>

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
              <li>✓ nao é pobre imundo</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
              <li>✓ bonus</li>
            </ul>
          </li>

        </ul>
      </div>
      <img src="../assets/SVG/svg-onda-landing-page-3.svg" class="SVG">
    </section>


    <section id="funcionalidades" class="secao secao-funcionalidades">

      <h2 style="margin-bottom: 40px">Veja o que a REDA+ oferece</h2>

      <div class="caixa-funcionalidades">

        <div class="itens-funcionalidades">
          <div class="inicio-funcionalidades">
            <img src="../assets/ICONS/icons-azul/icon-lapis-azul.png">
            <p>AI</p>
          </div>

          <h5>Correção de redações com IA</h5>
          <p class="caixa-descricao">Anáise focada em vestibulares, com nota e feedback detalado em cada competência.
          </p>

          <div class="caixa-inferior">
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Nota por competência</p>
            </div>
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Feedback instantâneo</p>
            </div>
          </div>
        </div>

        <div class="itens-funcionalidades">
          <div class="inicio-funcionalidades">
            <img src="../assets/ICONS/icons-azul/icon-grafico-desempenho-azul.svg">
            <p>Analytics</p>
          </div>

          <h5>Gráficos de desempenho</h5>
          <p class="caixa-descricao">Acompanhe sua evolução em cada redação e descubra exatamente onde melhorar.</p>

          <div class="caixa-inferior">
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Evolução em tempo real</p>
            </div>
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Pontos fracos mapeados</p>
            </div>
          </div>
        </div>

        <div class="itens-funcionalidades">
          <div class="inicio-funcionalidades">
            <img src="../assets/ICONS/icons-azul/icon-livro-azul.svg">
            <p>Repertório</p>
          </div>

          <h5>Acervo de livros</h5>
          <p class="caixa-descricao">Biblioteca completa para enriquecer seu repertório sociocultural.</p>

          <div class="caixa-inferior">
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Resumos curados</p>
            </div>
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Citações prontas</p>
            </div>
          </div>
        </div>

        <div class="itens-funcionalidades">
          <div class="inicio-funcionalidades">
            <img src="../assets/ICONS/icons-azul/icon-perfil-chatbot-simples-azul.svg">
            <p>24/7</p>
          </div>

          <h5>Chatbot ajudante</h5>
          <p class="caixa-descricao">Tire dúvidas a qualquer hora com nosso assistente inteligente.</p>

          <div class="caixa-inferior">
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Respostas na hora</p>
            </div>
            <div class="submenu-funcionalidades">
              <img src="../assets/ICONS/icons-laranja/icon-alvo-laranja.svg">
              <p>Sempre disponível</p>
            </div>
          </div>
        </div>

      </div>

      <div class="sessao-baixar">
        <div class="baixar-esquerda">
          <h1>Baixe nosso App!</h1>
          <p>Tenha acesso a todas as funcionalidades na palma da sua mão.</p>
        </div>

        <div class="baixar-direita">
          <img src="../assets/ICONS/icon-download-branco.png">
          <p>Download</p>
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


      <div class="conteudo-tutorial">

        <div class="retangulo-tutorial" id="retagulo-1">
          <div class="caixa-tutorial">
            <img src="../assets/ICONS/icons-laranja/icon-livro-laranja.png" alt="icon">
            <h3>Escolha o tema</h3>
            <p>Varios temas a disposição para você praticar no seu ritmo.</p>
          </div>
          <div class="etapa-tutorial">
            1
          </div>
        </div>

        <div class="retangulo-tutorial" id="retagulo-2">
          <div class="caixa-tutorial jogar-direita">
            <img src="../assets/ICONS/icons-laranja/icon-lapis-laranja.png" alt="icon">
            <h3>Escreva e envie</h3>
            <p>Digite ou cole sua redação no editor inteligente da REDA+ e receba estatisticas em tempo real.</p>
          </div>
          <div class="etapa-tutorial">
            2
          </div>
        </div>

        <div class="retangulo-tutorial" id="retagulo-3">
          <div class="caixa-tutorial">
            <img src="../assets/ICONS/icons-laranja/icon-raio-laranja.png" alt="icon">
            <h3>Correção Rapida</h3>
            <p>A IA entrega correção detalhada, nota por competência e feedback prersonalidazo na hora.</p>
          </div>
          <div class="etapa-tutorial">
            3
          </div>
        </div>

        <div class="retangulo-tutorial" id="retagulo-4">
          <div class="caixa-tutorial jogar-direita">
            <img src="../assets/ICONS/icons-laranja/icon-refazer-laranja.png" alt="icon">
            <h3>Escolha o tema</h3>
            <p>Varios temas a disposição para você praticar no seu ritmo.</p>
          </div>
          <div class="etapa-tutorial">
            4
          </div>
        </div>
      </div>


      <div class="retangulo-final-tutorial">

        <div class="retangulo-final-esquerdo">
          <div class="inicio-retangulo">
            <p></p>
            <h3>Por que usar o REDA+?</h3>
          </div>

          <p>o REDA+, você transforma suas redações em resultados reais! Nossa plataforma foi criada especialmente para
            quem quer entender, na prática, o que precisa melhorar para gabaritar a redação do ENEM. Com correções
            detalhadas, feedbacks personalizados e análise de critérios oficiais, você ganha clareza sobre seus pontos
            fortes e o que desenvolver para alcançar uma nota alta.</p>

        </div>

        <div class="retangulo-final-direito">
          <div class="inicio-retangulo">
            <p></p>
            <h3>Vantagens de usar o REDA+</h3>
          </div>

          <p>Com o REDA+, sua evolução está no centro de tudo. Você recebe correções que vão além do simples "certo ou
            errado": explicações claras, sugestões de melhorias, estrutura e coesão avaliadas com precisão, e ainda
            acompanhamento de desempenho ao longo do tempo. Tudo pensado especialmente para o ENEM!</p>
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
  top: 10px;
  left: 10px;
  right: 10px;
  z-index: 1000;
  border-radius: 15px;
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
  border-bottom: 2px solid var(--laranjaPadrao);
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
    url('../assets/SVG/svg-onda-landing-page.svg'),
    linear-gradient(11deg, rgba(236, 109, 30, 0.473) 1%, rgba(0, 0, 0, 0.72) 43%, rgba(255, 255, 255, 0) 100%),
    url('../assets/IMAGES/image-landing-page.jpg');
  background-size: cover;
  background-position: bottom;
  height: calc(100vh + 150px);
  max-height: 1500px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 60px 80px;
  gap: 40px;
  overflow: hidden;
  position: relative;

}

.mini-titulo {
  border: 2px solid var(--laranjaEscuro);
  margin-left: 25px;
  margin-top: 100px;
  display: flex;
  align-items: center;
  background-color: var(--laranjaFundo);
  width: fit-content;
  padding: 7px 20px 7px 20px;
  border-radius: var(--radius-medio);
}

.mini-titulo p {
  color: var(--laranjaPadrao);
  font-weight: 700;
  font-size: 13px;
}

.mini-titulo img {
  width: 16px;
  height: 16px;
  margin-right: 10px;
}

.hero-conteudo {
  margin-left: 50px;
  max-width: 560px;
  flex-shrink: 0;
  padding-bottom: 15px;
  margin-bottom: 7%;
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

.laranja-titulo {
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

.btn-quero,
.btn-solicitar,
#btn-baixar {
  color: var(--branco);
  background: var(--laranjaPadrao);
  font-weight: 800;
  border-radius: var(--radius-pequeno);
  cursor: pointer;
  border: none;
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
  position: relative;
}

.SVG {
  position: absolute;
  bottom: 0;
  left: 0;
  width: 100%;
  z-index: 1;
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
  justify-content: center;
}

.caixa-direita {
  min-width: 320px;
  padding: 24px;
}

.caixa-esquerda:hover,
.caixa-direita:hover {
  transform: translateY(-4px);
}

.caixa-esquerda p {
  color: var(--texto-claro);
  font-size: 20px;
  font-weight: 600;
  margin-top: 14px;
}

.video-miniatura {
  width: 100%;
  border-radius: var(--radius-medio);
  overflow: hidden;
  margin-top: 0 auto;
}

.video-miniatura img {
  width: 100%;

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
  background-image: url('../assets/IMAGES/image-fundo-landing-page.png');
  background-repeat: no-repeat;
  background-size: cover;
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
  z-index: 10;
  margin-bottom: 10vh;
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
  background-color: #fff;
}

.secao-funcionalidades h2 {
  margin-top: -70px;
  color: var(--azulPadrao);
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




.retangulo-final-tutorial {
  width: 100%;
  height: 300px;
  position: relative;
  display: flex;
  padding: 15px;
  max-width: 1500px;

}

.inicio-retangulo {
  display: flex;
  align-items: center;
  margin-bottom: 10px;
}

.inicio-retangulo p {
  width: 15px;
  height: 15px;
  border-radius: 50%;
  background-color: var(--laranjaPadrao);
}

.inicio-retangulo h3 {
  margin-left: 13px;
}

.conteudo-tutorial {
  width: 100%;
  max-width: 1500px;
  margin-top: 50px;

  position: relative;
}

.retangulo-final-esquerdo p,
.retangulo-final-direito p {
  text-indent: 10px;
  color: var(--cinzaForte);
  font-size: 14px;
  font-weight: 400;
  line-height: 1.8;
  letter-spacing: 0.2px;
  text-align: justify;
}

.conteudo-tutorial::before {
  content: "";
  border-radius: 50%;

  position: absolute;

  top: 0;
  left: 50%;

  transform: translateX(-50%);

  width: 4px;
  height: 100%;

  background: linear-gradient(180deg, rgba(255, 118, 0, 0.13) 25%, rgba(255, 118, 0, 0.34) 50%, rgba(255, 118, 0, 0.57) 75%, rgba(255, 118, 0, 1) 100%);
  z-index: 1;
}

.retangulo-tutorial {
  width: 100%;
  height: 200px;
  position: relative;
  display: flex;
  padding: 15px;

}

.retangulo-final-direito {
  margin-left: auto;
}

.caixa-tutorial,
.retangulo-final-esquerdo,
.retangulo-final-direito {
  width: 45%;
  height: 100%;
  background-color: var(--branco);
  border-radius: var(--radius-medio);
  padding: 15px;
  border: 3px solid var(--borda-clara);
  z-index: 999;
  box-shadow: var(--shadowPadrao);
}

.jogar-direita {
  margin-left: auto;
}

.caixa-tutorial img {
  width: 34px;
  height: 34px;
  background-color: var(--laranjaFundo);
  padding: 4px;
  border-radius: var(--radius-pequeno);
}

.caixa-tutorial h3,
.retangulo-final-esquerdo h3,
.retangulo-final-direito h3 {
  color: var(--azulPadrao);
}

.caixa-tutorial p {
  color: var(--cinzaForte);
  font-size: 11px;
}

.etapa-tutorial {
  width: 50px;
  height: 50px;
  background-color: var(--laranjaPadrao);

  font-size: 25px;
  font-weight: 700;
  color: var(--branco);

  display: flex;
  justify-content: center;
  align-items: center;

  border: 3px solid var(--branco);
  border-radius: 50%;
  outline: 3px solid var(--laranjaPadrao);

  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);

  z-index: 999;
}

.sessao-baixar {
  display: flex;
  justify-content: center;
  align-items: center;
  background-image: url('../assets/IMAGES/image-fundo-landing-page.png');
  width: 100%;
  height: 100px;
  border-radius: var(--radius-medio);
  padding: 30px;
  max-width: 1500px;
}

.baixar-esquerda h1 {
  color: var(--branco);
  font-size: 25px;
}

.baixar-esquerda p {
  color: var(--branco);
  font-size: 13px;
}

.baixar-direita {
  margin-left: auto;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 15px;
  background-color: var(--laranjaPadrao);
  color: var(--branco);
  font-weight: 800;
  border-radius: var(--radius-medio);
  cursor: pointer;
  transition: var(--delayCurto);
}

.baixar-direita:hover {
  transform: translateY(-5px);
  box-shadow: var(--laranjaShadow);
  text-shadow: var(--pretoShadow);
}

.baixar-direita p {
  margin-left: 15px;
}

.baixar-direita img {
  width: 16px;
  height: 16px;
}

.caixa-funcionalidades {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 75px;
  flex-wrap: wrap;
  margin-top: 10px;
  margin-bottom: 50px;

}

.caixa-inferior {
  position: absolute;
  bottom: 0;
  margin-bottom: 13px;
}

.caixa-descricao {
  font-size: 13px;
  padding: 10px 15px 0 15px;
  font-weight: 400;
  margin-bottom: 5%;
}


.itens-funcionalidades {
  width: 250px;
  height: 250px;
  border-radius: var(--radius-medio);
  box-shadow: var(--shadowPadrao);
  margin-bottom: 10px;
  position: relative;
  transition: var(--delayCurto);
}

.itens-funcionalidades:hover {
  transform: translateY(-5px);
  box-shadow: 0px 5px 10px 1px rgba(0, 0, 0, 0.37);
}


.itens-funcionalidades h5 {
  color: var(--azulForte);
  font-size: 15px;
  padding: 0 15px 0 15px;
}

.inicio-funcionalidades {
  display: flex;
  align-items: center;
  margin: 10px;
  padding: 3px;
  border-radius: 10px;
}

.inicio-funcionalidades p {
  margin-left: auto;
  font-size: 10px;
  margin-right: 5px;
  background-color: var(--laranjaFundo);
  padding: 4px 10px 4px 10px;
  color: var(--laranjaPadrao);
  border-radius: var(--radius-medio);
  font-weight: 700;

}

.inicio-funcionalidades img {
  width: 38px;
  height: 38px;
  padding: 6px;
  background-color: var(--azulFundo);
  border-radius: var(--radius-pequeno);
}

.submenu-funcionalidades {
  display: flex;
  align-items: center;
  width: 100%;
  margin-left: 15px;

}

.submenu-funcionalidades img {
  width: 13px;
  height: 13px;
}

.submenu-funcionalidades p {
  font-size: 13px;
  color: var(--azulForte);
  margin-left: 7px;
}


.icone-plano {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 30px;
  height: 30px;
  margin: 0 auto;
  margin-bottom: 15px;
  padding: 20px;
  border-radius: var(--radius-pequeno);
}

.icone-plano-1 {
  background-color: var(--cinzaFundo);

}

.icone-plano-2 {
  background-color: var(--azulFundo);
}

.icone-plano-3 {
  background-color: var(--laranjaFundo);
}

.icone-plano img {
  width: 24px;
  height: 24px;
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



  .titulo {
    font-size: 38px;
  }

  .secao {
    padding: 60px 28px;
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
