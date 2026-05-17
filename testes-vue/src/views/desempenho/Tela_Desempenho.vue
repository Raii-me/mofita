<script>
import Header from "../../components/layout/Header.vue";
import Footer from "../../components/layout/Footer.vue";
import Chatbot from "../../components/features/Chatbot.vue";
import Grafico from "../../components/layout/Grafico.vue";

/* importar coisa aq , essa é a base */

export default {
    components: {
        Header,
        Footer,
        Chatbot,
        Grafico
    },
};
</script>


<template>
    <Header />

    <main>
        <section id="part-1" class="pagina-1">
            <div class="caixaGeral">
                <div>
                    <h1 class="titulo">DashBoard de Desempenho</h1>
                    <p class="subTitulo">Analise Seu desempenho na plataforma e descubra oque mehorar</p>
                </div>

                <div class="container">

                    <div class="caixaEsquerda">
                        <Grafico />

                    </div>

                    <div class="caixaDireita">
                        <h3 class="tituloDireita">Mais Estatisticas</h3>

                        <div class="item">
                            <img src="../../assets/ICONS/icons-azul/icon-Regras-azul.svg" class="icone">
                            <p class="mensageStatus">Redações Feitas</p>
                            <p class="Resultados">08</p>
                        </div>

                        <div class="item">
                            <img src="../../assets/ICONS/icons-azul/icon-grafico-desempenho-azul.svg" class="icone">
                            <p class="mensageStatus">Maior Nota</p>
                            <p class="Resultados">910</p>
                        </div>

                        <div class="item">
                            <img src="../../assets/ICONS/icons-azul/icon-seta-emqueda-azul.svg" class="icone">
                            <p class="mensageStatus">Menor Nota</p>
                            <p class="Resultados">710</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section id="part-2" class="pagina-2">
            <div class="caixaGeral">
                <div class="container-2">
                    <h2 class="tituloCaixa">Ultimas correções</h2>

                    <div class="verificarStatus">
                        <p class="Tema">Tema</p>
                        <p class="Nota">Nota</p>
                        <p class="Data">data</p>
                        <p class="botoes">...</p>
                    </div>


                    <div class="verificarStatus">
                        <p class="textosTema">desigualdade da educação publica Brasil</p>
                        <p class="notas">840</p>
                        <p class="datas">Maio 7, 2025</p>
                        <button class="visualizarBotoes"><RouterLink to="/feedback" class="router-link">Visualizar</RouterLink></button>
                    </div>
                    <div class="verificarStatus">
                        <p class="textosTema">Saude Publica no Brasil</p>
                        <p class="notas">780</p>
                        <p class="datas">Maio 7, 2025</p>
                        <button class="visualizarBotoes"><RouterLink to="/feedback" class="router-link">Visualizar</RouterLink></button>
                    </div>
                    <div class="verificarStatus">
                        <p class="textosTema">desigualdade da educação publica Brasil</p>
                        <p class="notas">910</p>
                        <p class="datas">Maio 7, 2025</p>
                        <button class="visualizarBotoes"><RouterLink to="/feedback" class="router-link">Visualizar</RouterLink></button>
                    </div>
                </div>
            </div>
        </section>
    </main>
    <Chatbot />
    <Footer />


</template>


<style scoped>
* {
    margin: 0px;
    padding: 0px;
    font-family: "Poppins", sans-serif;
    box-sizing: border-box;
}

main {
    display: flex;
    scroll-behavior: smooth;
    overflow: auto;
    overflow-x: hidden;
    flex-direction: column;
    background: var(--branco);
    min-height: 100vh;

}

.pagina-1 {

    display: flex;
    flex-direction: column;
    justify-content: flex-start;
}

.caixaGeral {
    width: 100%;
    max-width: 1200px;
    margin: 0 auto;
}

.titulo {

    margin-top: 40px;

}

.subTitulo {

    font-weight: 300;
    margin-bottom: 50px;

}

.container {

    flex: 1;
    display: flex;
    justify-content: center;
    align-items: stretch;
    flex-wrap: wrap;
    gap: 50px;
    width: 100%;
    max-width: 1200px;
    margin: 0 auto;

}

.caixaEsquerda {

    display: flex;
    flex-direction: column;
    text-align: center;
    align-self: flex-start;
    border-radius: 10px;
    background-color: #fff;
    box-shadow: var(--shadowPadrao);
    margin: 5px 5px 5px 5px;
    padding: 10px 10px 10px 10px;
    max-width: 850px;
    width: 100%;
    flex: 1 1 300px;


}

.Grafic {
    width: 100%;
    max-width: 100%;
    height: 300px;
}

.Grafic canvas {
    width: 100% !important;
    height: 100% !important;
}

.caixaDireita {

    display: flex;
    justify-content: center;
    flex-direction: column;
    align-self: flex-start;
    border-radius: 10px;
    background-color: #fff;
    box-shadow: var(--shadowPadrao);
    width: 400px;
    height: 300px;
    padding: 20px;
    margin: 5px 5px 5px 5px;
    flex: 1 1 300px;
    max-width: 350px;
}

.tituloDireita {
    text-align: left;
    margin-bottom: 25px;
}

.item {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 15px;
    border-top: 1px solid #ccc;
}

.icone {
    width: 40px;
    height: 40px;
    background-color: #F0F7FF;
    border-radius: 8px;
    padding: 5px;
}

.mensageStatus {

    text-align: center;
    font-weight: 500;
}

.Resultados {

    font-weight: 700;
    background-color: #efefef;
    border: 1px solid #fff;
    border-radius: 5px;
    padding-left: 5px;
    padding-right: 5px;

}

.pagina-2 {
    display: flex;
    flex-wrap: wrap;
    flex-direction: column;
    align-items: center;
    justify-content: flex-start;
    margin-top: 50px;
    margin-bottom: 100px;

}

.container-2 {

    display: grid;
    flex-wrap: wrap;
    justify-content: center;
    border-radius: 30px;
    width: 80%;
    max-width: 1000px;
    background-color: #fff;
    box-shadow: var(--shadowPadrao);
    margin-top: 15px;
    transition: var(--delayCurto);
}

.container-2:hover {

    transform: translateY(-10px);
    transition: var(--delayCurto);
}

.tituloCaixa {

    margin: 20px 0px 10px 10px;

}

.verificarStatus {

    display: grid;
    grid-template-columns: 3fr 1fr 1.5fr 1fr;
    align-items: center;
    padding: 15px 40px;
    margin-left: 10px;
    margin-right: 10px;
    margin-bottom: 20px;
    border-bottom: 1px solid #ccc;
    gap: 20px;

}

.Tema,
.Nota,
.Data,
.botoes {

    color: #ccc;
    font-weight: 400;
}

.Tema {
    text-align: left;
}

.Nota,
.Data {
    text-align: center;
}

.botoes {
    text-align: right;
    margin-right: 40px;
}


.textosTema {

    text-align: left;
    font-size: 15px;
    font-weight: 400;

}

.notas {

    text-align: center;
    font-weight: 600;
}

.datas {

    text-align: center;
}

.visualizarBotoes {

    background-color: #fc871a;
    border: #fc871a 1px solid;
    padding: 5px 10px 5px 10px;
    border-radius: 5px;
    color: #EBF1F5;
    text-align: center;
    justify-self: end;
    text-shadow: 3px 3px 10px rgba(0, 0, 0, 0.4);
    box-shadow: rgba(0, 0, 0, 0.35) 0px 5px 15px;
    cursor: pointer;


}

.visualizarBotoes:hover {

    background-color: #204B86;
    border: 1px solid #2f3da3;
    font-weight:500;
    transition: var(--delayCurto);

}

/* ================= RESPONSIVIDADE MELHORADA ================= */
/* DESKTOP GRANDE (ajuste fino) */
@media (max-width: 1200px) {
    .container {
        justify-content: center;
    }

    .caixaEsquerda {
        width: 100%;
        max-width: 800px;
        margin-left: 0;
        margin: 0 auto;
    }

    .caixaDireita {
        width: 100%;
        max-width: 400px;
    }

    .container-2 {
        margin-left: 0;
        width: 95%;
        margin: 0 auto;
    }
}


/* TABLET */
@media (max-width: 1024px) {

 
    .container {
        flex-direction: column;
        align-items: center;
    }

    .caixaEsquerda,
    .caixaDireita {
        width: 95%;
    }

    .Grafic {
        height: 280px;
    }

    .verificarStatus {
        grid-template-columns: 2fr 1fr 1fr;
    }

    .botoes {
        display: none;
    }
}


/* MOBILE */
@media (max-width: 768px) {


    /* TITULOS */
    .titulo,
    .subTitulo {
        text-align: center; /* Centraliza o texto */
        margin-left: 0;     /* Remove a margem fixa da esquerda */
        margin-right: 0;
        padding: 0 15px;    /* Respiro lateral seguro */
    }

    /* CARDS */
    .container {
          display: flex;
        flex-direction: column;
        align-items: center; /* Centraliza os cards horizontalmente */
        gap: 20px;
        width: 100%;
    }

    .caixaEsquerda,
    .caixaDireita {
         width: 95% !important; /* Garante largura consistente */
        max-width: 500px;      /* Evita que fiquem gigantes em telas médias */
        margin: 0 auto;        /* Centralização forçada */
        align-self: center; 
    }

    .caixaGeral {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    .container-2 {
        width: 95%;
        margin: 15px auto; /* Centraliza o card da tabela */
    }
    
    .caixaEsquerda,
    .container-2 {
        margin: 0 auto;
        width: 95%;
    }

    .Grafic {
        height: 250px;
    }

    /* TABELA VIRA CARD */
    .verificarStatus {
        grid-template-columns: 2fr 1fr 1fr;
        align-items: center;
        gap: 5px;
        background: #fff;
        border-radius: 10px;
        padding: 15px;
    }

    .textosTema {
        font-weight: 600;
    }

    .visualizarBotoes {
        width: 100%;
        margin-top: 10px;
        grid-column: 1 / -1;
        width: 100%;
    }
    
}


/* MOBILE PEQUENO */
@media (max-width: 480px) {

    .titulo {
        font-size: 18px;
    }

    .subTitulo {
        font-size: 13px;
    }

    .Grafic {
        height: 200px;
    }

}

</style>