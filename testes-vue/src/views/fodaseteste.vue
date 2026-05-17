<script>
import Header from "../components/layout/Header.vue"
import Footer from "../components/layout/Footer.vue"
import Chatbot from "../components/features/Chatbot.vue"


export default {
  components: { 
    Header 
    , Footer
    , Chatbot

  }
}
</script>

<template>

<Header />

<body>
    <div class="fodase">
    <div class="caixa-teste1">1</div>
    <div class="caixa-teste2">2</div>
    </div>


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


</body> 

  <Chatbot />
 <Footer />
</template> 


<style>

body{
    height: 100vh;
}

.fodase{
    width: 100%;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 20px;
}

.caixa-teste1{
    width: 200px;
    height: 200px;
    background-color: var(--teste);
}
.caixa-teste2{
    width: 200px;
    height: 200px;
    background-color: var(--azulPadrao);
}



/* ========================================
   CLASSES NÃO UTILIZADAS
======================================== */

.garota-estudando {
  width: 100%;
  display: block;
  margin: 0 auto;
  filter: drop-shadow(0 24px 48px rgba(0, 0, 0, 0.5));
  border-radius: var(--raio);
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
  background: linear-gradient(
    135deg,
    var(--laranjaPadrao) 0%,
    var(--laranjaEscuro) 100%
  );
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


#btn-baixar {
  font-size: 16px;
  padding: 13px 40px;
}


  .garota-estudando {
    max-width: 320px;
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

  .conteudo-funcionalidades {
    flex-direction: column;
    align-items: center;
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





































</style>