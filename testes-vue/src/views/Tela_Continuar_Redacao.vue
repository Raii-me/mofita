<script>
import Header from "../components/Header.vue"
import Footer from "../components/Footer.vue"
import Chatbot from "../components/Chatbot.vue"
import "../assets/css/variaveis.css";

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

    <section>
        <header class="titulo">
            <h1>Continuar Redação</h1>
            <p>Continue sua redação de onde parou, mantendo o foco, a clareza e a evolução do seu texto</p>
        </header>

        <navbar class="fixar-search-bar">
            <div class="search-bar">
                <div class="caixa-search">
                    <button id="search" class="search-btn"><img src="../assets/ICONS/icon-lupa.png"
                        id="icon-search"></img></button>
                    <input type="text" class="input-text" placeholder="Buscar redação">
                </div>

                <div class="caixa-favorito"><a href="#">
                    <button id="btn-favorito"><img src="../assets/ICONS/icon-favorito.png" id="icon-dado"></button>
                    <p>Favoritos!</p></a>
                </div>

                <div class="caixa-category">
                    <img src="../assets/ICONS/icon-category-buscar.PNG" id="category-icon">
                        <select name="opcoes" class="category">
                            <option>Todos</option>
                            <option value="opcao1">Recentes</option>
                            <option value="opcao2">Ultima</option>
                            <option value="opcao3">Primeira</option>
                        </select>
                </div>
            </div>
        </navbar>
    </section>

    <section>
        <main-content class="grid-modelos">


     

        <div class="card" id="1-continuar-envelhecimento-sociedade">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Envelhecimento_Sociedade.png" id="img-box">
                <div class="tema">
                    <p>Sociedade </p>
                </div>
            </div>
            <div class="descricao">
                <p>Perspectivas acerca do envelhecimento na sociedade brasileira </p>
                <div class="opcoes">
                    <p>11/05/2026</p>
                    <a href="#">
                        <button>Continuar Redação ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="2-continuar-herancas-africanas">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Herancas_Africanas.jpg" id="img-box">
                <div class="tema">
                    <p>Cultura</p>
                </div>
            </div>
            <div class="descricao">
                <p>Desafios para a valorização da herança africana no Brasil</p>
                <div class="opcoes">
                    <p>04/01/2026</p>
                    <a href="#">
                        <button>Continuar Redação ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="3-continuar-invisibilidade-mulher">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Invisibilidade_Mulheres.jpg" id="img-box">
                <div class="tema">
                    <p>Inclusão Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil</p>
                <div class="opcoes">
                    <p>30/06/2026</p>
                    <a href="#">
                        <button>Continuar Redação ↗</button></a>
                </div>
            </div>
        </div>


        <div class="card" id="0-continuar-">
            <div class="imagem">
                <img src="../assets/TEMAS/" id="img-box">
                <div class="tema">
                    <p>{Tema}</p>
                </div>
            </div>
            <div class="descricao">
                <p>{descrição}</p>
                <div class="opcoes">
                    <p>{data}</p>
                    <a href="#">
                        <button>Continuar Redação ↗</button></a>
                </div>
            </div>
        </div>

        </main-content>
    </section>
<Chatbot />
<Footer />
</template> 


<style>
a{
    display:flex;
    cursor: pointer;
    text-decoration: none;
    color:black;
}

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
#btn-favorito {
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

#icon-search {
    margin-top: 2px;
}

#icon-dado {
    margin-top: 5px;
}

#category-icon {
    margin: 10px 0 0 10px;
}

.caixa-favorito {
    display: flex;
    align-items: center;
    width: fit-content;
    height: 38px;
    margin-left: auto;
    background-color: var(--brancoPadrao);
    border: 1px solid var(--borda);
    border-radius: 10px;
 
}

#btn-favorito {
    margin-left: 10px;
}

.caixa-favorito p {
    display: flex;
    align-items: center;
    margin: 0 10px 0 3px;
    font-size: 14px;

}

.caixa-category {
    display: flex;
    height: 38px;
    margin-left: 1%;
    background-color: var(--brancoPadrao);
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

.titulo p {
    margin: 5px;
}

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
}

.tema {
    position: absolute;
    top: 10px;
    left: 10px;
    padding: 5px;
    background-color: var(--brancoPadrao);
    border-radius: 10px;
}

.descricao {
    position: absolute;
    bottom: 0;
    width: 100%;
    height: 50%;
    background-color: var(--brancoPadrao);
    border-radius: 0 0 10px 10px;
}

.descricao p {
    margin: 2%;
    font-size: 16px;
    text-align: justify;
}

.opcoes {
    position: absolute;
    bottom: 0;
    display: flex;
    align-items: center;
    width: 100%;
    padding: 5px;
}

.opcoes p {
    margin: 0 auto 0 3%;
    padding: 5px 15px;
    border: 1px solid var(--borda);
    border-radius: 30px;
}

.opcoes button {
    width: 170px;
    margin-right: 10px;
    padding: 10px;
    background: var(--laranja-btn);
    border: none;
    border-radius: 6px;
    color: var(--brancoPadrao);
    font-weight: 700;
    cursor: pointer;
    transition: var(--trans);
}

.opcoes button:hover {
    background: var(--laranja-btn-hover);
    box-shadow: var(--shadowPadrao);
    text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
    transform: translateY(-4px);
}

#model-icon {
    width: 18px;
    height: 18px;
    margin: 2px 5% 0 0;
}
</style>