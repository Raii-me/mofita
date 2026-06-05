<script>
export default {
    data() {
        return { novaReda: false }

    },
    mounted() {
        window.addEventListener('keydown', (e) => {
            if (e.key === 'Escape') this.abrir = false;
        });
    }
}
</script>

<template>

    <!-- tirei alguns modais daqui pois achei desnecessario alem de tornar o fluxo irritante -->
    <div class="overlay" :class="{ active: novaReda }" @click="novaReda = false"></div>


    <div class="caixaEsquerda">
        <h2>Vamos Começar!!!</h2>

        <ul class="btn-Funcoes">
            <li><button class="btn-Abrir" @click="novaReda = true">Nova Redação</button></li>
            <li><RouterLink to="/redacao" class="router-link"><button class="btn-Abrir" >Continuar Redação</button></RouterLink></li>
            <li><button class="btn-Abrir" @click="minhasReda = true">Minhas Redações</button></li>
        </ul>
    </div>

    <div class="caixaAcao" :class="{ active: novaReda }">
        <h2 class="caixaTitulo">Nova Redação</h2>
        <p>Escolha como deseja criar uma nova redação!</p>

        <div class="caixaBotoes">
            <RouterLink to="/tema" class="router-link"><button class="botaoAcao">Escrever Redação</button></RouterLink>
            <button class="botaoAcao">Enviar Arquivo</button>
        </div>
    </div>
</template>

<style scoped>
.caixaEsquerda {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    gap: 30px;
    margin-left: 10px;

}

.caixaEsquerda h2 {
    
    font-size: 20px;
    font-weight: 700;
    color: var(--laranjaPadrao);
}

.btn-Funcoes {
    list-style: none;
    display: flex;
    flex-direction: column;
    gap: 12px;
    padding: 0;
    margin: 0;
}

.btn-Abrir {
    margin-bottom: 20px;
    width: 220px;
    padding: 12px 20px;
    background: var(--laranjaPadrao);
    color: #fff;
    font-weight: 600;
    font-size: 15px;
    border: none;
    border-radius: var(--radius-pequeno);
    cursor: pointer;
    transition: 0.3s;
    box-shadow: var(--shadowPadrao);
}

.btn-Abrir:hover {
    background: var(--laranjaEscuro);
    transform: translateY(-2px);
}

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
    background: var(--branco);
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) scale(0.9);
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
    color: var(--textoForte);
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
    background: var(--laranjaPadrao);
    border: none;
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
    background: var(--laranjaEscuro);
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