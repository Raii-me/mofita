<script>
export default {
    data() {
        return { abrir: false }
    },
    mounted() {
        window.addEventListener('keydown', (e) => {
            if (e.key === 'Escape') this.abrir = false;
        });
    }
}

</script>

<template>

    <div class="overlay" :class="{ active: abrir }" @click="abrir = false">

    </div>

    <div class="caixaEsquerda">
        <h2>Vamos Começar!!!</h2>

        <ul class="btn-Funcoes">
            <li><button class="btn-Abrir" @click="abrir = true" id="botoesdeAcao">Nova Redação</button></li>
            <li><button class="btn-Abrir" @click="abrir = true" id="botoesdeAcao">Continuar Redação</button></li>
            <li><button class="btn-Abrir" @click="abrir = true" id="botoesdeAcao">Minhas Redações</button></li>
        </ul>
    </div>

    <div class="overlay" v-show="abrir" @click="abrir = false">

    </div>

    <div class="caixaAcao" :class="{ active: abrir }">
        <h2 class="caixaTitulo">Nova Redação</h2>
        <p>Escolha como deseja criar uma nova redação</p>

        <div class="caixaBotoes">
            <button class="botaoAcao">Digitar</button>
            <button class="botaoAcao">Arquivo</button>
        </div>
    </div>

</template>

<style>
.overlay {

    position: fixed;
    inset: 0;
    background: rgba(0, 0, 0, 0.5);
    backdrop-filter: blur(3px);
    opacity: 0;
    visibility: hidden;
    z-index: 100;
    transition: 0.3s;
}

.caixaAcao {

    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) scale(0.9);
    background: #f4f4f4;
    padding: 30px;
    width: auto;
    height: auto;
    text-align: center;
    border-radius: 10px;
    box-shadow: 0 10px 25px rgba(0, 0, 0, 0.2);
    opacity: 0;
    visibility: hidden;
    transition: 0.3s;
    z-index: 200;
}

.caixaTitulo {

    color: #000;
    text-align: center;
    font-size: 32px;
    font-weight: 700;
    margin-top: 20px;
    margin-bottom: 10px;

}

.caixaAcao p {

    font-size: 20px;
    font-weight: 700;
    margin-bottom: 20px;
}


.caixaBotoes {

    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 30px;
}

.botaoAcao {

    background: #3b4cc0;
    border: 0px solid #0B22B6;
    text-align: center;
    color: #fff;
    font-weight: 700;
    padding: 12px;
    width: 371px;
    border-radius: 6px;
    cursor: pointer;
    box-shadow: var(--shadowPadrao);
    transition: 0.2s;
}

.botaoAcao:hover {

    background: #2f3da3;
    font-weight: 900;
    transform: translateY(4px);
}


.overlay.active {

    opacity: 1;
    visibility: visible;
}

.caixaAcao.active {

    opacity: 1;
    visibility: visible;
    transform: translate(-50%, -50%) scale(1);
}



</style>