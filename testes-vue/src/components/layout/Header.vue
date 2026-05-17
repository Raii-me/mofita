<script>

import "../../assets/css/variaveis.css"

export default {
  data() {
    return {
      aberto: false
    }
  },
  methods: {
    toggleMenu() {
      this.aberto = !this.aberto
    }
  }
}


</script>


<template>
  <nav>
    <RouterLink to="/"><img src="../../assets/IMAGES/logo-redamais.png" class="logo" /></RouterLink>
    <ul>
      <li>
        <h3><RouterLink to="/home" class="router-link">Inicial</RouterLink></h3>
      </li>
      <li>
        <h3><RouterLink to="/modelos" class="router-link">Modelos</RouterLink></h3>
      </li>
      <li>
        <h3><RouterLink to="/livros" class="router-link">Livros</RouterLink></h3>
      </li>
      <li>
        <h3><RouterLink to="/desempenho" class="router-link">Desempenho</RouterLink></h3>
      </li>
    </ul>

    <div class="cont-user">
      <div class="msg">
        <p>Olá!, <font size="4px" color="#fc871a">{Usuario}</font></p>
        <p>
          <font size="2px">{Funcao}</font>
        </p>
      </div>
      <img src="../../assets/IMAGES/foto-perfil-temporaria.png" class="user-pic" @click="toggleMenu"/>
    </div>

    <div class="sub-menu-wrap" :class="{ 'open-menu': aberto }">
      <div class="sub-menu">
        <div class="user-info">
          <img src="../../assets/IMAGES/foto-perfil-temporaria.png" />
          <ul>
            <li>
              <h3>{Usuario}</h3>
            </li>
            <li>
              <p>{Funcao}</p>
            </li>
          </ul>
        </div>
        <hr />
        <a href="#" class="sub-menu-link">
          <img src="../../assets/ICONS/icons-azul/icon-perfil-azul.svg" />
          <p><RouterLink to="/perfil" class="router-link">Acessar Perfil</RouterLink></p>
          <span>></span>
        </a>
        <a href="#" class="sub-menu-link">
          <img src="../../assets/ICONS/icons-azul/icon-pagina-azul.svg" />
          <p><RouterLink to="/tema" class="router-link">Nova Redação</RouterLink></p>
          <span>></span>
        </a>
        <a href="#" class="sub-menu-link">
          <img src="../../assets/ICONS/icons-azul/icon-livro-azul.svg" />
          <p><RouterLink to="/redacao" class="router-link">Continuar Redação</RouterLink></p>
          <span>></span>
        </a>
        <a href="#" class="sub-menu-link">
          <img src="../../assets/ICONS/icons-azul/icon-perfil-chatbot-simples-azul.svg" />
          <p>ChatBot</p>
          <span>></span>
        </a>
        <a href="#" class="sub-menu-link" >
          <img src="../../assets/ICONS/icons-azul/icon-configuracoes-azul.svg" />
          <p><RouterLink to="/perfil" class="router-link">Configurações</RouterLink></p>
          <span>></span>
        </a>
        <a href="#" class="sub-menu-link">
          <img src="../../assets/ICONS/icons-azul/icon-sairperfil-azul.svg" />
          <p>Sair</p>
          <span>></span>
        </a>
      </div>
    </div>
  </nav>
</template>

<style scoped>

nav {
    height: 80px;
    background:  linear-gradient(90deg, 
      var(--azul-escuro) 0%, 
      var(--azul) 100%
    );
    width: 100%;
    padding: 10px 10%;
    display: flex;
    align-items: center;
    justify-content: space-between;
    position: relative;
    box-shadow: 0 4px 20px rgba(0, 0, 0, .08);
}

.logo {
    width: 120px;
}

.cont-user {
    display: flex;
}

.msg {
    display: flex;
    flex-direction: column;
    align-items: flex-end;
    font-weight: 600;
    color: var(--branco);
    text-decoration: none;
    font-size: small;
}

.user-pic {
    display: flex;
    width: 50px;
    border-radius: 50%;
    cursor: pointer;
    margin-left: 10px;
}

nav ul {
    margin-left: 1px;
}

nav ul li {
    display: inline-block;
    list-style: none;
    margin: 10px 20px;
}

nav ul li a {
    font-weight: 600;
    color: var(--branco);
    ;
    display: inline-block;
    text-decoration: none;
    transition: 0.5s;
    border-bottom: 3px solid transparent;
}

nav ul li a:hover {
    transform: scale(0.9);
    color: var(--laranjaPadrao);
    border-bottom: 3px solid var(--laranjaPadrao);
}

.sub-menu-wrap.open-menu {
    max-height: 430px;
}

.sub-menu {

    background: var(--branco);
    padding: 10px;
    margin: 5px;
    border-radius: 20px;
    overflow: hidden;
    z-index: 999999;

}

.sub-menu-wrap {
    position: absolute;
    top: 100%;
    right: 10%;
    width: 320px;
    max-height: 0;
    overflow: hidden;
    z-index: 10;
    transition: max-height 0.5s;
    box-shadow: var(--shadowPadrao);
    border-radius: 20px;


}

.user-info {
    display: flex;
    align-items: center;
}

.user-info h3,
.user-info p {
    font-weight: 500;
}

.user-info img {
    width: 60px;
    border-radius: 50%;
    margin-right: 15px;
}

.sub-menu hr {
    border: 0;
    height: 1px;
    width: 100%;
    background-color: var(--azulPadrao);
    margin: 1px 0 10px;
}

.sub-menu-link {
    display: flex;
    align-items: center;
    text-decoration: none;
    font-weight: 500;
    font-size: 15px;
    color: var(--azulPadrao);
    margin: 13px 0;
    transition: 2s;
}

.sub-menu-link p {
    width: 100%;
}

.sub-menu-link img {
    width: 35px;
    background: var(--brancoLeve);
    border-radius: 10px;
    padding: 8px;
    margin-right: 15px;
}

.sub-menu-link span {
    font-size: 22px;
    transition: transform 0.5s;
}

.sub-menu-link:hover span {
    transform: translateX(5px);
}

.sub-menu-link:hover p {
    transition: 0.5s;
    font-size: 17px;
    font-weight: 600;
    color: var(--laranjaPadrao);
}

@media (max-width: 1024px){
    nav{ padding: 10px 5%; }
    nav ul li{ margin: 10px 15px; }
    .sub-menu-wrap{ right: 5%; }
}

@media (max-width: 768px){
    nav{
        flex-wrap: wrap;
        height: auto;
        padding: 15px 5%;
    }

    .logo{ margin-bottom: 10px; }

    nav ul{
        width: 100%;
        text-align: center;
        margin-top: 10px;
    }

    .cont-user{
        position: absolute;
        top: 20px;
        right: 5%;
    }

    .sub-menu-wrap{ right: 5%; }

    .footer-container{
        flex-direction: column;
        text-align: center;
    }

    .footer-menus{
        flex-direction: column;
        gap: 30px;
    }

    .legal-box{
        flex-direction: column;
        gap: 15px;
    }
}

@media (max-width: 480px){
    .logo{ width: 100px; }

    .msg{ display: none; }

    nav ul li{
        display: block;
        margin: 15px 0;
    }

    nav ul li a:hover{
        transform: scale(1.05);
    }

    .sub-menu-wrap{
        width: 90%;
        right: 5%;
    }
}



</style>

