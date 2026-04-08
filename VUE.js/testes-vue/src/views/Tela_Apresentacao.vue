<template>

  <nav class="nav-barra" id="barra-nav">
    <div class="nav-logotipo">
      <a href="#inicio">
        <img src="../assets/IMAGES/logo-redamais-grande.png" alt="Logo REDA+">
      </a>
    </div>
    <ul class="nav-menu" id="menu-links">
      <li><a href="#sobre">Sobre</a></li>
      <li><a href="#planos">Planos</a></li>
      <li><a href="#contato">Contato</a></li>
      <li><a href="">Login</a></li>
    </ul>
    <button class="menu-hamburguer" id="btn-hamburguer" aria-label="Abrir menu">
      <span></span>
      <span></span>
      <span></span>
    </button>
  </nav>

  <main>

    <header class="hero" id="inicio">
      <div class="hero-conteudo">
        <h1 class="titulo">
          Torne-se um <span class="laranja">MESTRE</span>,<br>
          seja <span class="laranja">REDA+</span>
        </h1>
        <p class="subtitulo">
          com a inovadora plataforma de<br>
          redação especializada para <strong>VOCÊ</strong>,<br>
          estudante!
        </p>
        <a href=""><button class="btn-quero">Eu Quero!</button></a>
      </div>
    </header>

    <section id="sobre" class="secao">
      <h2>A Maior plataforma de redação do <span class="laranja">BRASIL</span>!</h2>
      <div class="conteudo">

        <div class="caixa-esquerda">
          <a href="#" aria-label="Assistir vídeo sobre a REDA+">
            <div class="video-miniatura">
              <img src="../assets/IMAGES/exemplo-video.png" alt="Vídeo REDA+">
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
            <p class="mensagem">Nossa plataforma oferece planos vitalícios para te fazer ser o Nº 1!</p>
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
        <p class="subtitulo-secao">O plano de compra única permite pagar apenas uma vez e ter acesso vitalício ao
          conteúdo.<br>Não há mensalidades, renovações ou cobranças recorrentes.</p>
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
              <p class="plano-valor plano-valor-pro">R$ 29,99 <span class="plano-recorrencia">vitalício</span></p>
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
              <p class="plano-valor plano-valor-premium">R$ 49,99 <span class="plano-recorrencia">vitalício</span></p>
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
      <h2 style="margin-bottom:40px;">Veja o que a REDA+ oferece</h2>
      <div class="conteudo-funcionalidades">

        <div class="grid-imagens">
          <article class="card-imagem">
            <img src="../assets/IMAGES/exemplo-redacao.jpg" alt="Correção de redações com IA"
              class="imagem-funcionalidade">
            <p class="legenda">Correção de redações com IA focada em vestibulares</p>
          </article>
          <article class="card-imagem">
            <img src="../assets/IMAGES/inicial-exemplo-desempenho.jpg" alt="Gráficos de desempenho do aluno"
              class="imagem-funcionalidade">
            <p class="legenda">Gráficos de desempenho das redações do aluno</p>
          </article>
          <article class="card-imagem">
            <img src="../assets/IMAGES/livros-variedade.jpg" alt="Acervo com alta variedade de livros"
              class="imagem-funcionalidade">
            <p class="legenda">Acervo com alta variedade de livros</p>
          </article>
          <article class="card-imagem">
            <img src="../assets/IMAGES/inicial-exemplo-chatbot.jpg" alt="Chatbot com IA para tirar dúvidas"
              class="imagem-funcionalidade">
            <p class="legenda">Chatbot com IA para tirar dúvidas</p>
          </article>
        </div>

        <div class="caixa-app">
          <img src="../assets/IMAGES/logo-redamais-grande.png" alt="Logo REDA+" class="logo-aplicativo">
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
            <p class="passo-texto">Em questão de segundos, a REDA+ te entrega uma redação corrigida e detalhada para
              você, estudante.</p>
          </div>
          <div class="card-passo">
            <div class="passo-numero">4</div>
            <p class="passo-titulo">Aplique sugestões e envie para recorreção</p>
            <p class="passo-texto">Correções e recorreções ilimitadas com a REDA+</p>
          </div>
        </div>

        <div class="caixa-info caixa-info-esquerda">
          <p class="info-titulo">Por que usar o REDA+?</p>
          <p class="info-texto">No REDA+, você transforma suas redações em resultados reais! Nossa plataforma foi criada
            especialmente para quem quer entender, na prática, o que precisa melhorar para gabaritar a redação do ENEM.
            Com correções detalhadas, feedbacks personalizados e análise de critérios oficiais, você ganha clareza sobre
            seus pontos fortes e o que desenvolver para alcançar uma nota alta. Estude com foco e confiança — porque
            cada palavra escrita com estratégia faz diferença!</p>
        </div>

        <div class="caixa-info caixa-info-direita">
          <p class="info-titulo">Vantagens de usar o REDA+</p>
          <p class="info-texto">Com o REDA+, sua evolução está no centro de tudo. Você recebe correções que vão além do
            simples "certo ou errado": explicações claras, sugestões de melhorias, estrutura e coesão avaliadas com
            precisão, e ainda acompanhamento de desempenho ao longo do tempo. Tudo pensado especialmente para o ENEM!
            Aqui você não treina sozinho — você aprende com feedbacks que realmente impulsionam sua escrita rumo à
            aprovação.</p>
        </div>
      </div>
    </section>

  </main>

  <footer class="rodape" id="contato">
    <div class="rodape-conteudo">

      <div class="rodape-esquerda">
        <a href="#inicio">
          <img src="../assets/IMAGES/logo-redamais-grande.png" alt="REDA+" class="rodape-logo">
        </a>
        <p class="app-texto">Baixe nosso Aplicativo</p>
        <a href="#">
          <img src="../assets/IMAGES/footer-googleplay.png" alt="Disponível no Google Play" class="btn-playstore">
        </a>
      </div>

      <div class="rodape-direita">
        <div class="rodape-menus">
          <div class="menu-coluna">
            <h4>Sobre</h4>
            <ul>
              <li><a href="#">Quem Somos</a></li>
              <li><a href="#">Nossa Missão</a></li>
            </ul>
          </div>
          <div class="menu-coluna">
            <h4>Ajuda</h4>
            <ul>
              <li><a href="#">Perguntas Frequentes</a></li>
              <li><a href="#">Suporte</a></li>
            </ul>
          </div>
          <div class="menu-coluna">
            <h4>Produtos</h4>
            <ul>
              <li><a href="#planos">Planos</a></li>
              <li><a href="#">Assine</a></li>
            </ul>
          </div>
        </div>

        <div class="caixa-legal">
          <a href="#">Política de Privacidade</a>
          <a href="#">Termos de Uso</a>
        </div>
      </div>

    </div>

    <div class="rodape-base">
      <p>&copy; 2026 REDA+. Todos os direitos reservados.</p>
    </div>
  </footer>

</template>

<script>

import "../assets/css/variaveis.css";

</script>

<style>
:root {
  --azul: #204b86;
  --azul-escuro: #152f55;
  --laranja: #fc871a;
  --laranja-escuro: #d86b05;
  --branco2: #ebf1f5;
  --cinza-claro: #b8cae2;
  --sombra-sm: 0 4px 12px rgba(0, 0, 0, 0.12);
  --sombra-md: 0 8px 24px rgba(0, 0, 0, 0.18);
  --raio: 16px;
  --raio-lg: 28px;
  --trans: 0.25s ease;
}

*,
*::before,
*::after {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}

html {
  scroll-behavior: smooth;
  overflow-x: hidden;
}

body {
  background: var(--branco2);
  min-height: 100vh;
  overflow-x: hidden;
}

.nav-barra {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  z-index: 1000;
  height: 72px;
  background: var(--azul);
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 0 60px;
  transition:
    background var(--trans),
    box-shadow var(--trans);
}

.nav-barra.rolado {
  background: var(--azul-escuro);
  box-shadow: 0 4px 20px rgba(0, 0, 0, 0.35);
}

.nav-logotipo img {
  height: 140px;
  width: auto;
}

.nav-menu {
  display: flex;
  list-style: none;
  align-items: center;
  gap: 40px;
  font-size: 17px;
}

.nav-menu a {
  text-decoration: none;
  color: #fff;
  font-weight: 600;
  transition: color var(--trans);
}

.nav-menu a:hover {
  color: var(--laranja);
}

.nav-btn-entrar:hover {
  background: var(--laranja-escuro);
}

.menu-hamburguer {
  display: none;
  flex-direction: column;
  gap: 5px;
  background: none;
  border: none;
  cursor: pointer;
  padding: 4px;
}

.menu-hamburguer span {
  display: block;
  width: 26px;
  height: 3px;
  background: #fff;
  border-radius: 4px;
  transition: all 0.3s ease;
}

.hero {
  margin-top: 72px;
  min-height: 460px;
  background: linear-gradient(135deg, #152f55 0%, var(--azul) 80%);
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 60px 60px 48px;
}

.hero-conteudo {
  max-width: 660px;
}

.titulo {
  color: var(--branco2);
  font-size: 44px;
  font-weight: 800;
  line-height: 1.2;
  margin-bottom: 16px;
}

.subtitulo {
  color: rgba(235, 241, 245, 0.88);
  font-size: 18px;
  line-height: 1.7;
  margin-bottom: 30px;
}

.subtitulo strong {
  color: #fff;
  font-weight: 700;
}

.laranja {
  color: var(--laranja);
}

.btn-quero,
.btn-solicitar,
#btn-baixar {
  background: var(--laranja);
  color: #fff;
  font-weight: 700;
  border: none;
  border-radius: 10px;
  cursor: pointer;
  box-shadow: var(--sombra-md);
  transition:
    background var(--trans),
    transform var(--trans);
}

.btn-quero {
  font-size: 18px;
  padding: 14px 52px;
}

.btn-solicitar {
  font-size: 18px;
  padding: 13px 52px;
  margin-top: 12px;
}

#btn-baixar {
  font-size: 17px;
  padding: 13px 40px;
  box-shadow: var(--sombra-sm);
}

.btn-quero:hover,
.btn-solicitar:hover,
#btn-baixar:hover {
  background: var(--laranja-escuro);
  transform: translateY(-2px);
}

.secao {
  padding: 40px 60px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

h2 {
  color: var(--laranja);
  font-size: 30px;
  font-weight: 700;
  margin-bottom: 32px;
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
  background: var(--azul);
  border-radius: var(--raio-lg);
  box-shadow: var(--sombra-md);
  transition: transform var(--trans);
}

.caixa-esquerda {
  min-width: 340px;
  padding: 20px;
}

.caixa-direita {
  min-width: 320px;
  padding: 24px;
}

.caixa-esquerda:hover {
  transform: translateY(-4px);
}

.caixa-esquerda>p {
  color: var(--branco2);
  font-size: 22px;
  font-weight: 600;
  text-align: center;
  margin-top: 14px;
}

.video-miniatura {
  position: relative;
  width: 100%;
  border-radius: 12px;
  overflow: hidden;
}

.video-miniatura img {
  width: 100%;
  display: block;
  border-radius: 12px;
  transition: transform 0.4s ease;
}

.video-miniatura:hover img {
  transform: scale(1.03);
}

.play-sobreposicao {
  position: absolute;
  inset: 0;
  display: flex;
  align-items: center;
  justify-content: center;
  background: rgba(0, 0, 0, 0.25);
  transition: background var(--trans);
}

.play-sobreposicao:hover {
  background: rgba(0, 0, 0, 0.4);
}

.play-botao {
  width: 60px;
  height: 60px;
  background: var(--laranja);
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 24px;
  color: #fff;
  box-shadow: 0 4px 16px rgba(0, 0, 0, 0.4);
  transition: transform var(--trans);
}

.play-sobreposicao:hover .play-botao {
  transform: scale(1.1);
}

.caixa-direita-interna {
  display: flex;
  flex-direction: column;
  align-items: center;
  background: #fff;
  border-radius: var(--raio);
  box-shadow: var(--sombra-sm);
  padding: 24px;
  width: 100%;
}

.caixa-titulo {
  color: var(--branco2);
  text-align: center;
  font-size: 24px;
  font-weight: 800;
  margin-bottom: 16px;
}

.mensagem {
  color: #333;
  font-size: 16px;
  font-weight: 500;
  text-align: center;
  margin-bottom: 8px;
}

.lista-planos {
  list-style: none;
  display: flex;
  gap: 12px;
  margin: 16px 0;
  flex-wrap: wrap;
  justify-content: center;
}

.lista-planos li a {
  display: flex;
  flex-direction: column;
  align-items: center;
  background: var(--branco2);
  padding: 16px 20px;
  border-radius: 10px;
  text-decoration: none;
  box-shadow: var(--sombra-sm);
  cursor: pointer;
  transition: transform var(--trans);
}

.lista-planos li a:hover {
  transform: translateY(-3px);
}

.plano-etiqueta {
  font-size: 12px;
  font-weight: 700;
  text-transform: uppercase;
  letter-spacing: 0.5px;
}

.plano-preco {
  font-size: 18px;
  font-weight: 800;
  margin-top: 4px;
}

#plano-basico .plano-etiqueta,
#plano-basico .plano-preco {
  color: #7a7a7a;
}

#plano-pro-link .plano-etiqueta,
#plano-pro-link .plano-preco {
  color: var(--azul);
}

#plano-prem-link .plano-etiqueta,
#plano-prem-link .plano-preco {
  color: var(--laranja);
}

.secao-planos {
  background: var(--branco2);
}

.cabecalho-planos {
  background: #fff;
  padding: 36px 60px;
  border-radius: var(--raio-lg);
  box-shadow: var(--sombra-sm);
  max-width: 760px;
  text-align: center;
  margin-bottom: 20px;
}

.titulo-secao {
  color: var(--azul);
  font-size: 26px;
  font-weight: 800;
  margin-bottom: 12px;
}

.subtitulo-secao {
  color: #555;
  font-size: 15px;
  line-height: 1.7;
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
  background: #fff;
  border: 2px solid #e4e1e1;
  width: 300px;
  border-radius: var(--raio-lg);
  text-align: center;
  box-shadow: var(--sombra-sm);
  padding: 28px 24px 32px;
  display: flex;
  flex-direction: column;
  align-items: center;
  position: relative;
  transition:
    transform var(--trans),
    box-shadow var(--trans);
}

.card-plano:hover {
  transform: translateY(-6px);
  box-shadow: var(--sombra-md);
}

.card-plano-pro {
  border-color: var(--azul);
  background: rgba(32, 75, 134, 0.04);
  transform: scale(1.04);
}

.card-plano-pro:hover {
  transform: scale(1.04) translateY(-6px);
}

.card-plano-premium {
  border-color: var(--laranja);
  background: rgba(252, 135, 26, 0.04);
}

.cabecalho-card {
  margin-bottom: 16px;
  width: 100%;
}

.plano-label {
  font-weight: 600;
  font-size: 14px;
  text-transform: uppercase;
  letter-spacing: 1px;
  margin-bottom: 8px;
}

.plano-label-inicial {
  color: #888;
}

.plano-label-pro {
  color: var(--azul);
}

.plano-label-premium {
  color: var(--laranja);
}

.plano-valor {
  font-weight: 800;
}

.plano-valor-inicial {
  color: #555;
  font-size: 26px;
}

.plano-valor-pro {
  color: var(--azul);
  font-size: 22px;
}

.plano-valor-premium {
  color: var(--laranja);
  font-size: 22px;
}

.plano-recorrencia {
  font-size: 13px;
  font-weight: 500;
  opacity: 0.7;
}

.plano-desc {
  color: #777;
  font-size: 13px;
  margin-top: 6px;
}

.plano-desc-pro {
  color: var(--azul);
  font-size: 13px;
  margin-top: 6px;
  font-weight: 500;
}

.plano-desc-premium {
  color: var(--laranja);
  font-size: 13px;
  margin-top: 6px;
  font-weight: 600;
}

.btn-plano {
  font-size: 16px;
  font-weight: 700;
  padding: 10px 36px;
  border-radius: 10px;
  cursor: pointer;
  margin-bottom: 20px;
  transition:
    background var(--trans),
    color var(--trans),
    transform var(--trans);
}

#btn-plano-inicial {
  background: #fff;
  border: 2px solid var(--azul);
  color: var(--azul);
}

#btn-plano-inicial:hover {
  background: var(--azul);
  color: #fff;
}

#btn-plano-pro {
  background: var(--azul);
  border: 2px solid var(--azul-escuro);
  color: #fff;
}

#btn-plano-pro:hover {
  background: var(--azul-escuro);
  transform: translateY(-2px);
}

#btn-plano-premium {
  background: var(--laranja);
  border: 2px solid var(--laranja-escuro);
  color: #fff;
}

#btn-plano-premium:hover {
  background: var(--laranja-escuro);
  transform: translateY(-2px);
}

.plano-recursos {
  list-style: none;
  width: 100%;
  text-align: left;
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.plano-recursos li {
  font-size: 14px;
  font-weight: 500;
  color: #444;
  padding: 6px 10px;
  border-radius: 6px;
  background: rgba(0, 0, 0, 0.025);
}

.secao-funcionalidades {
  background: var(--cinza-claro);
}

.secao-funcionalidades h2 {
  color: var(--azul);
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
  background: #fff;
  padding: 12px;
  border-radius: var(--raio);
  box-shadow: 0 6px 18px rgba(0, 0, 0, 0.15);
  transition:
    transform var(--trans),
    box-shadow var(--trans);
}

.card-imagem:hover {
  transform: translateY(-4px);
  box-shadow: 0 12px 28px rgba(0, 0, 0, 0.2);
}

.imagem-funcionalidade {
  width: 100%;
  height: 220px;
  object-fit: cover;
  border-radius: 10px;
  display: block;
}

.legenda {
  text-align: center;
  margin-top: 10px;
  font-size: 13px;
  font-weight: 500;
  color: #333;
  line-height: 1.4;
}

.caixa-app {
  background: #fff;
  padding: 30px;
  border-radius: var(--raio-lg);
  box-shadow: 0 6px 18px rgba(0, 0, 0, 0.15);
  text-align: center;
  flex: 1;
  min-width: 220px;
  max-width: 280px;
  display: flex;
  flex-direction: column;
  align-items: center;
  gap: 14px;
}

.logo-aplicativo {
  width: 100%;
  max-width: 200px;
  border-radius: 10px;
}

.secao-como-usar {
  background: var(--branco2);
}

.cabecalho-como-usar {
  background: #fff;
  padding: 32px 60px;
  border-radius: var(--raio-lg);
  box-shadow: var(--sombra-sm);
  max-width: 760px;
  text-align: center;
  margin-bottom: 16px;
}

.titulo-como-usar {
  color: var(--azul);
  font-size: 26px;
  font-weight: 800;
  margin-bottom: 10px;
}

.subtitulo-como-usar {
  color: #555;
  font-size: 16px;
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
  background: #637ea4;
  padding: 28px 24px;
  border-radius: var(--raio);
  box-shadow: var(--sombra-sm);
  width: 220px;
  flex-shrink: 0;
  transition:
    transform var(--trans),
    box-shadow var(--trans);
}

.card-passo:hover {
  transform: translateY(-4px);
  box-shadow: var(--sombra-md);
}

.passo-numero {
  width: 36px;
  height: 36px;
  background: var(--laranja);
  color: #fff;
  font-size: 18px;
  font-weight: 800;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 12px;
  box-shadow: 0 3px 8px rgba(0, 0, 0, 0.25);
}

.passo-titulo {
  color: #ffa151;
  font-size: 17px;
  font-weight: 700;
  margin-bottom: 8px;
  line-height: 1.4;
}

.passo-texto {
  color: rgba(255, 255, 255, 0.9);
  font-size: 13px;
  line-height: 1.6;
}

.caixa-info {
  background: #637ea4;
  color: #fff;
  padding: 30px 40px;
  border-radius: var(--raio);
  box-shadow: var(--sombra-sm);
  width: 65%;
  max-width: 680px;
  transition:
    transform var(--trans),
    box-shadow var(--trans);
}

.caixa-info:hover {
  transform: translateY(-3px);
  box-shadow: var(--sombra-md);
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
  color: #ffa151;
  margin-bottom: 12px;
}

.info-texto {
  font-size: 14px;
  line-height: 1.7;
  color: rgba(255, 255, 255, 0.92);
}

.rodape {
  background: var(--azul);
}

.rodape-conteudo {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  max-width: 80%;
  margin: 0 auto;
  padding: 50px 20px;
  gap: 60px;
}

.rodape-esquerda {
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.rodape-logo {
  height: 130px;
  width: auto;
}

.app-texto {
  color: var(--laranja);
  font-style: italic;
  margin: 16px 0 8px;
  font-size: 15px;
}

.btn-playstore {
  height: 48px;
  border: 2px solid rgba(0, 0, 0, 0.3);
  border-radius: 8px;
  box-shadow: var(--sombra-sm);
  transition: transform var(--trans);
  cursor: pointer;
}

.btn-playstore:hover {
  transform: translateY(-2px);
}

.rodape-direita {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  max-width: 700px;
  gap: 30px;
}

.rodape-menus {
  display: flex;
  justify-content: space-between;
}

.menu-coluna h4 {
  color: var(--laranja);
  font-size: 17px;
  font-weight: 600;
  margin-bottom: 14px;
}

.menu-coluna ul {
  list-style: none;
}

.menu-coluna li {
  margin-bottom: 10px;
}

.menu-coluna a {
  color: rgba(255, 255, 255, 0.85);
  text-decoration: none;
  font-size: 14px;
  transition: color var(--trans);
}

.menu-coluna a:hover {
  color: #fff;
  text-decoration: underline;
}

.caixa-legal {
  background: rgba(255, 255, 255, 0.1);
  border-radius: 8px;
  padding: 14px 30px;
  display: flex;
  justify-content: center;
  gap: 60px;
  border: 1px solid rgba(255, 255, 255, 0.15);
}

.caixa-legal a {
  color: var(--laranja);
  font-weight: 600;
  font-size: 14px;
  text-decoration: none;
  transition: opacity var(--trans);
}

.caixa-legal a:hover {
  opacity: 0.75;
  text-decoration: underline;
}

.rodape-base {
  border-top: 1px solid rgba(252, 135, 26, 0.4);
  background: var(--azul-escuro);
  text-align: center;
  padding: 14px 20px;
}

.rodape-base p {
  font-size: 13px;
  color: rgba(255, 255, 255, 0.6);
}


@media (max-width: 1024px) {
  .nav-barra {
    padding: 0 30px;
  }

  .nav-menu {
    gap: 24px;
    font-size: 16px;
  }

  .hero {
    padding: 50px 30px 36px;
  }

  .titulo {
    font-size: 36px;
  }

  .secao {
    padding: 60px 30px;
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
</style>
