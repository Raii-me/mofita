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
            <h1>Nova Redação</h1>
            <p>Acesse os temas disponíveis na plataforma com textos de apoios e orientações especificas para desenvolver sua
            produção textual com estratégia e foco.</p>
        </header>

        <navbar class="fixar-search-bar">
            <div class="search-bar">
                <div class="caixa-search">
                    <button type="submit" id="search" class="search-btn"><img src="../assets/ICONS/icon-lupa.png"
                        id="icon-search"></img></button>
                    <input type="text" id="text" class="input-text" placeholder="Buscar um tema">
                </div>

            <div class="caixa-random">
                <button type="submit" id="btn-random"><img src="../assets/ICONS/icon-dado.png" id="icon-dado"></button>
                <p>Aleatorio!</p>
            </div>

            <div class="caixa-category">
                <img src="../assets/ICONS/icon-category-buscar.PNG" id="category-icon">
                    <select name="opcoes" class="category">
                    <option>Todos</option>
                    <option value="opcao1">ENEM</option>
                    <option value="opcao2">Provão Paulista</option>
                    <option value="opcao3">Plataforma</option>
                    <option value="opcao4">----------</option>
                    <option value="opcao5">Sociedade</option>
                    <option value="opcao6">Cultura</option>
                    <option value="opcao7">Inclusão Social</option>
                    <option value="opcao8">Saúde</option>
                    <option value="opcao9">Desigualdade Social</option>
                    <option value="opcao10">Tecnologia</option>
                    <option value="opcao11">Educação</option>
                    <option value="opcao12">Natureza</option>
                    <option value="opcao13">Economia</option>
                    <option value="opcao14">Violencia</option>
                    </select>
                </div>
            </div>
        </navbar>
    </section>

    <section>
        <main-content class="grid-modelos">


     

        <div class="card" id="1-tema-envelhecimento-sociedade">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Envelhecimento_Sociedade.png" id="img-box">
                <div class="tema">
                    <p>Sociedade </p>
                </div>
            </div>
            <div class="descricao">
                <p>Perspectivas acerca do envelhecimento na sociedade brasileira </p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="2-tema-herancas-africanas">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Herancas_Africanas.jpg" id="img-box">
                <div class="tema">
                    <p>Cultura</p>
                </div>
            </div>
            <div class="descricao">
                <p>Desafios para a valorização da herança africana no Brasil</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="3-tema-invisibilidade-mulher">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Invisibilidade_Mulheres.jpg" id="img-box">
                <div class="tema">
                    <p>Inclusão Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>desafios para o enfrentamento da invisibilidade do trabalho de cuidado realizado pela mulher no Brasil</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="4-tema-comunidade-tradicional">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Cominudades_Tradicionais.jpg" id="img-box">
                <div class="tema">
                    <p>Inclusão Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>Desafios para a valorização de comunidades e povos tradicionais no Brasil</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="5-tema-registro-civil">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Reginstro_Civil.jpg" id="img-box">
                <div class="tema">
                    <p>Inclusão Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>Invisibilidade e registro civil: garantia de acesso a cidadania no Brasil</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="6-tema-doenca-mental">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Doenca_Mental.jpg" id="img-box">
                <div class="tema">
                    <p>Saúde</p>
                </div>
            </div>
            <div class="descricao">
                <p>O estigma associado as doenças mentais na sociedade brasileira </p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="7-tema-desgualdade-social">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Desigualdade_Social.jpg" id="img-box">
                <div class="tema">
                    <p>Desigualdade Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>O desafio de reduzir as desigualdade entre as regiões do Brasil </p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="8-tema-democratizacao-cinema">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Democratizacao_Cinema.jpg" id="img-box">
                <div class="tema">
                    <p>Cultura</p>
                </div>
            </div>
            <div class="descricao">
                <p>Democratização do acesso ao cinema no Brasil</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="9-tema-controle-dados">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Controle_Dados.jpg" id="img-box">
                <div class="tema">
                    <p>Tecnologia</p>
                </div>
            </div>
            <div class="descricao">
                <p>Manipulação do comportamento do usuário pelo controle de dados na internet</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="10-tema-educacao-surdos">
            <div class="imagem">
                <img src="../assets/TEMAS/Tema_Educacao_Surdos.jpg" id="img-box">
                <div class="tema">
                    <p>Educação</p>
                </div>
            </div>
            <div class="descricao">
                <p>Desafios para a formação educacional dos surdos no Brasil</p>
                <div class="opcoes">
                    <p>ENEM</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="11-tema-rede-social-adolecente">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Redes_Sociais_Adolecentes.jpg" id="img-box">
                <div class="tema">
                    <p>Saúde</p>
                </div>
            </div>
            <div class="descricao">
                <p>Como os adolescentes podem usar as redes sociais sem prejudicar a saúde mental?
                </p>
                <div class="opcoes">
                    <p>Provão Paulista</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="12-tema-gentrificacao">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Gentrificacao.jpg" id="img-box">
                <div class="tema">
                    <p>Desigualdade Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>Gentrificação urbana - o processo de transformação de áreas urbanas</p>
                <div class="opcoes">
                    <p>Provão Paulista</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="13-tema-fome-brasil">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Fome_Brasil.jpg" id="img-box">
                <div class="tema">
                    <p>Desigualdade Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>O combate a fome no Brasil: entr a responsabilidade do estado e a atuação da sociedade civil</p>
                <div class="opcoes">
                    <p>Provão Paulista</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="14-tema-ia-escola">
            <div class="imagem">
            <img src="../assets/TEMAS/Temas_IA_Escolas.jpg" id="img-box">
            <div class="tema">
                    <p>Tecnologia</p>
                </div>
            </div>
            <div class="descricao">
                <p> Impacto da inteligência artificial nos alunos de escola pública</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="15-tema-resocializacao-deficientes">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Resocializacao_Deficientes.jpg" id="img-box">
                <div class="tema">
                    <p>Inclusão Social</p>
                </div>
            </div>
            <div class="descricao">
                <p>Inclusão social de pessoas com deficiências físicas</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="16-tema-consumo-consciente">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Consumo_Consciente.jpg" id="img-box">
                <div class="tema">
                    <p>Natureza</p>
                </div>
            </div>
            <div class="descricao">
                <p>Desafios para manter um consumo consciente</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="17-tema-educacao-financeira">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Educacao_Financeira.jpg" id="img-box">
                <div class="tema">
                    <p>Economia</p>
                </div>
            </div>
            <div class="descricao">
                <p>Desafios para  o ensino de qualidade sobre educação financeira</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>
        
        <div class="card" id="18-tema-substituicao-ia">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Substituicao_IA.jpg" id="img-box">
                <div class="tema">
                    <p>Tecnologia</p>
                </div>
            </div>
            <div class="descricao">
                <p>O impacto da inteligência artificial na precarização do trabalho e nas relações de consumo</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="19-tema-violencia-crianca">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Violencia_Criancas.jpg" id="img-box">
                <div class="tema">
                    <p>Violencia</p>
                </div>
            </div>
            <div class="descricao">
                <p> Impacto da violência doméstica contra a criança e o adolescente no desenvolvimento social</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
                </div>
            </div>
        </div>

        <div class="card" id="20-tema-inseguranca-alimentar">
            <div class="imagem">
                <img src="../assets/TEMAS/Temas_Inseguranca_Alimentar.jpg" id="img-box">
                <div class="tema">
                    <p>Saúde</p>
                </div>
            </div>
            <div class="descricao">
                <p>A persistência da insegurança alimentar e seus reflexos na saúde nacional</p>
                <div class="opcoes">
                    <p>Plataforma</p>
                    <a href="#">
                        <button>Escrever ↗</button></a>
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
#btn-random {
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

.caixa-random {
    display: flex;
    align-items: center;
    width: fit-content;
    height: 38px;
    margin-left: auto;
    background-color: var(--brancoPadrao);
    border: 1px solid var(--borda);
    border-radius: 10px;
}

#btn-random {
    margin-left: 10px;
}

.caixa-random p {
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