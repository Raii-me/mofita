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
            <h1>Livros</h1>
            <p>Tenha acesso a temas acompanhados de livros e orientações direcionadas 
               para desenvolver sua escrita com estratégia e eficiência.</p>
        </header>

        <navbar class="fixar-search-bar">
            <div class="search-bar">
                <div class="caixa-search">
                    <button type="submit" id="search" class="search-btn"><img src="../assets/ICONS/icon-lupa.png"
                        id="icon-search"></img></button>
                    <input type="text" id="text" class="input-text" placeholder="Buscar um livro">
                </div>

            <div class="caixa-category">
                <img src="../assets/ICONS/icon-category-buscar.PNG" id="category-icon">
                    <select name="visualizar-detalhe-livro" class="category">
                    <option>Categorias</option>
                    <option value="opcao1">Análise Psocológica</option>
                    <option value="opcao2">Crítica Social</option>
                    <option value="opcao3">Desigualdade Social</option>
                    
                    </select>
                </div>
            </div>
        </navbar>
    </section>

    <section>
        <main-content class="grid-modelos">

        <div class="card" id="1-Livro-dom-casmurro">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-dom-casmurro.PNG" id="img-box">
                <div class="tema-livro">
                    <p>Análise Psicológica</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Dom Casmmurro - Machado de Assis</p>
                <div class="visualizar-detalhe-livro">
                    <p>1899</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="2-Livro-memorias-postumas">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-memoria-postumas.png" id="img-box">
                <div class="tema-livro">
                    <p>Crítica Social</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Memórias Póstumas de Brás Cubas - Machado de Assis</p>
                <div class="visualizar-detalhe-livro">
                    <p>1881</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="3-Livro-o-cortico">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-o-cortico.PNG" id="img-box">
                <div class="tema-livro">
                    <p>Desigualdade social</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>O Cortiço - Aluísio Azevedo</p>
                <div class="visualizar-detalhe-livro">
                    <p>1890</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="4-Livro-iracema">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-iracema.png" id="img-box">
                <div class="tema-livro">
                    <p>Nacionalismo</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Iracema - José de Alencar</p>
                <div class="visualizar-detalhe-livro">
                    <p>1865</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="5-Livro-os-lusiadas">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-os-lusiadas.png" id="img-box">
                <div class="tema-livro">
                    <p>Heroísmo</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Os Lusíadas - Luís de Camões</p>
                <div class="visualizar-detalhe-livro">
                    <p>1572</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="6-Livro-auto-da-barca-do-inferno">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-o-auto-da-barga-do-inferno.png" id="img-box">
                <div class="tema-livro">
                    <p>Moralidade</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Auto da Barca do Inferno - Gil Vicente</p>
                <div class="visualizar-detalhe-livro">
                    <p>1517</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="7-Livro-a-moreninha">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-a-moreninha.png" id="img-box">
                <div class="tema-livro">
                    <p>Amor</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>A Moreninha - Joaquim Manuel de Macedo</p>
                <div class="visualizar-detalhe-livro">
                    <p>1844</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="8-Livro-senhora">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-senhora.png" id="img-box">
                <div class="tema-livro">
                    <p>Amor</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Senhora - José de Alencar</p>
                <div class="visualizar-detalhe-livro">
                    <p>1844</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="9-Livro-quincas-borba">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-quincas-borba.png" id="img-box">
                <div class="tema-livro">
                    <p>Alienação</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Quincas Borba - Machado de Assis</p>
                <div class="visualizar-detalhe-livro">
                    <p>1891</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="10-Livro-o-alienista">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-o-alienista.png" id="img-box">
                <div class="tema-livro">
                    <p>Loucura</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>O Alienista - Machado de Assis</p>
                <div class="visualizar-detalhe-livro">
                    <p>1882</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="11-Livro-casa-de-pensao">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-casa-de-pensao.png" id="img-box">
                <div class="tema-livro">
                    <p>Determinismo</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Casa de Pensão - Aluísio Azevedo</p>
                <div class="visualizar-detalhe-livro">
                    <p>1884</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="12-Livro-PADRAO">
            <div class="imagem">
                <img src="../assets/LIVROS/livro-triste-fim-de-policarpo-quaresma.png" id="img-box">
                <div class="tema-livro">
                    <p>Idealismo</p>
                </div>
            </div>
            <div class="caixa-descricao-livro">
                <p>Triste Fim de Policarpo Quaresma - Lima Barreto</p>
                <div class="visualizar-detalhe-livro">
                    <p>1915</p>
                    <a href="#">
                        <button>Abrir Arquivos ↗</button></a>
                </div>
            </div>
        </div>

        

        </main-content>
    </section>
<Chatbot />
<Footer />
</template> 


<style>
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
    background-color: var(--branco);
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
#icon-search {
    width: 18px;
    height: 18px;
    cursor: pointer;
}

#icon-search {
    margin-top: 2px;
}

#category-icon {
    margin: 10px 0 0 10px;
}

.caixa-category {
    display: flex;
    height: 38px;
    margin-left: auto;
    background-color: var(--branco);
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
    background-color: var(--branco);
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

.tema-livro {
    position: absolute;
    top: 10px;
    left: 10px;
    padding: 5px;
    background-color: var(--branco);
    border-radius: 10px;
}

.caixa-descricao-livro {
    position: absolute;
    bottom: 0;
    width: 100%;
    height: 50%;
    background-color: var(--branco);
    border-radius: 0 0 10px 10px;
}

.caixa-descricao-livro p {
    margin: 5%;
    font-size: 16px;
    text-align: justify;
}

.visualizar-detalhe-livro {
    position: absolute;
    bottom: 0;
    display: flex;
    align-items: center;
    width: 100%;
    padding: 5px;
}

.visualizar-detalhe-livro p {
    margin: 0 auto 0 3%;
    padding: 5px 15px;
    border: 1px solid var(--borda);
    border-radius: 30px;
}

.visualizar-detalhe-livro button {
    width: 170px;
    margin-right: 10px;
    padding: 10px;
    background: var(--laranjaPadrao);
    border: none;
    border-radius: 6px;
    color: var(--branco);
    font-weight: 700;
    cursor: pointer;
    transition: var(--trans);
}

.visualizar-detalhe-livro button:hover {
    background: var(--laranjaEscuro);
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