<script>
import "../assets/css/variaveis.css";
</script>

<template>
  <footer class="site-footer">
    <div class="footer-container">
      <div class="footer-left">
        <a href="#">
          <img src="../assets/IMAGES/logo-redamais-grande.png" alt="Reda+" class="footer-logo" />
        </a>
        <p class="app-text">Baixe nosso Aplicativo</p>

        <a href="#"
          ><img
            src="../assets/IMAGES/footer-googleplay.png"
            alt="Google Play"
            class="playstore-btn"
          />
        </a>
      </div>

      <div class="footer-right">
        <div class="footer-menus">
          <div class="menu-col">
            <h4>Sobre</h4>
            <ul>
              <li><a href="#">Quem Somos</a></li>
            </ul>
          </div>
          <div class="menu-col">
            <h4>Ajuda</h4>
            <ul>
              <li><a href="#">Perguntas Frequentes</a></li>
            </ul>
          </div>
          <div class="menu-col">
            <h4>Produtos</h4>
            <ul>
              <li><a href="#">Assine</a></li>
            </ul>
          </div>
        </div>

        <div class="legal-box">
          <a href="#">Politicas de Privacidade</a>
          <a href="#">Termos de Uso</a>
        </div>
      </div>
    </div>

    <div class="footer-bottom">
      <p>&copy; 2026 REDA+. Todos os direitos reservados.</p>
    </div>
  </footer>
</template>

<style>


* {
  margin: 0px;
  padding: 0px;
  font-family: "Poppins", sans-serif;
  box-sizing: border-box;
}

html {
  scroll-behavior: smooth;
  overflow: auto;
  overflow-x: hidden;
  height: 100%;
}

body {
  display: flex;
  flex-direction: column;
  background: var(--branco2);
  min-height: 100vh;
  margin: 0;
  overflow-x: hidden;
}



/* FOOTER */
.site-footer {
  flex: 1;
  margin-top: auto;
  background-color: var(--azulPadrao);
}

.footer-container {
  display: flex;
  justify-content: center;
  align-items: center;
  max-width: 80%;
  margin: 0 auto;
  padding: 40px 20px;
  gap: 150px;
  
}

.footer-left {
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.footer-logo {
  height: 170px;
  width: auto;
}

.app-text {
  color: var(--laranjaPadrao);
  font-style: italic;
  margin: 20px 0 10px;
  font-size: 16px;
}

.playstore-btn {
  height: 50px;
  border: #000 2px solid;
  border-radius: 7px;
  box-shadow: var(--shadowPadrao);
}

.footer-right {
  display: flex;
  flex-direction: column;
  flex-grow: 1;
  max-width: 700px;
  gap: 30px;
}

.footer-menus {
  display: flex;
  justify-content: space-between;
}

.menu-col h4 {
  color: var(--laranjaPadrao);
  font-size: 18px;
  font-weight: 500;
  margin-bottom: 15px;
}

.menu-col ul {
  list-style: none;
}

.menu-col li {
  margin-bottom: 10px;
}

.menu-col a {
  color: var(--brancoPadrao);
  text-decoration: none;
  font-size: 15px;
}

.menu-col a:hover {
  text-decoration: underline;
}

.legal-box {
  background-color: var(--brancoPadrao);
  border-radius: 4px;
  padding: 15px 30px;
  display: flex;
  justify-content: center;
  gap: 100px;
  box-shadow: var(--shadowPadrao);
}

.legal-box a {
  color: var(--laranjaPadrao);
  font-weight: bold;
  text-decoration: none;
}

.legal-box a:hover {
  text-decoration: underline;
}

.footer-bottom {
  border-top: 1px solid var(--laranjaPadrao);
  background-color: var(--azulPadrao);
  text-align: center;
  padding: 12px 20px;
}

.footer-bottom p {
  font-size: 14px;
  color: #e0e0e0;
}
</style>
