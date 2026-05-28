<template>
  <footer class="rodape" id="contato">
    <div class="rodape-conteudo">
      
      <div class="rodape-esquerda">
        <a href="#inicio">
          <img src="../../assets/IMAGES/logo-redamais-grande.png" alt="REDA+" class="rodape-logo" />

        </a>

        <p class="app-texto">Baixe nosso Aplicativo</p>

        <a href="#">
          <img
            src="../../assets/IMAGES/footer-googleplay.png"
            alt="Google Play"
            class="btn-playstore"
          />
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
              <RouterLink to="/teste" class="router-link"><li><a href="#">Suporte</a></li></RouterLink>
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
          <RouterLink to="/politica" class="router-link">Política de Privacidade</RouterLink>
          <RouterLink to="/termos" class="router-link">Termos de Uso</RouterLink>


        </div>

      </div>
    </div>

    <div class="rodape-base">
      <p>&copy; 2026 REDA+. Todos os direitos reservados.</p>
    </div>
  </footer>
</template>

<style scoped>
@import "../../assets/css/variaveis.css";

.rodape {
  background: linear-gradient(90deg,
    var(--azul-escuro) 0%,
    var(--azul) 100%);
  border-top: 1px solid rgba(255, 255, 255, 0.07);
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
  height: 120px;
  width: auto;
}

.app-texto {
  color: var(--laranjaPadrao);
  font-style: italic;
  margin: 16px 0 8px;
  font-size: 14px;
}

.btn-playstore {
  height: 46px;
  border-radius: 8px;
  box-shadow: var(--sombra-sm);
  transition: var(--trans);
  cursor: pointer;
}

.btn-playstore:hover {
  transform: translateY(-2px);
  opacity: 0.9;
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
  color: var(--laranjaPadrao);
  font-size: 15px;
  font-weight: 700;
  margin-bottom: 14px;
}

.menu-coluna ul {
  list-style: none;
}

.menu-coluna li {
  margin-bottom: 10px;
}

.menu-coluna a {
  color: #fff;
  text-decoration: none;
  font-size: 14px;
  transition: var(--trans);
}

.menu-coluna a:hover {
  color: var(--laranjaPadrao);
}

.caixa-legal {
  background: rgba(255, 255, 255, 0.107);
  border-radius: 8px;
  border: 1px solid rgba(255, 255, 255, 0.2);
  padding: 14px 30px;
  display: flex;
  justify-content: center;
  gap: 60px;
  box-shadow: var(--shadowPadrao);
}

.caixa-legal a {
  color: #fff;
  font-weight: 600;
  font-size: 13px;
  text-decoration: none;
}

.caixa-legal a:hover {
  text-decoration: underline;
}

.rodape-base {
  border-top: 1px solid var(--laranjaPadrao);
  background: var(--azulPadrao);
  text-align: center;
  padding: 14px 20px;
}

.rodape-base p {
  font-size: 12px;
  color: var(--texto-claro);
}
</style>
