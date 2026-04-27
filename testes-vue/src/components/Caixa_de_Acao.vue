<script>
export default {
    data() {
        return { novaReda: false }
        return { contReda: false }
        return { minhasReda: false }
    },
    mounted() {
        window.addEventListener('keydown', (e) => {
            if (e.key === 'Escape') this.abrir = false;
        });
    }
}
</script>

<template>
    <div class="overlay" :class="{ active: novaReda }" @click="novaReda = false"></div>
    <div class="overlay" :class="{ active: contReda }" @click="contReda = false"></div>
    <div class="overlay" :class="{ active: minhasReda }" @click="minhasReda = false"></div>

    <div class="caixaEsquerda">
        <h2>Vamos Começar!!!</h2>

        <ul class="btn-Funcoes">
            <li><button class="btn-Abrir" @click="novaReda = true">Nova Redação</button></li>
            <li><button class="btn-Abrir" @click="contReda = true">Continuar Redação</button></li>
            <li><button class="btn-Abrir" @click="minhasReda = true">Minhas Redações</button></li>
        </ul>
    </div>

    <div class="caixaAcao" :class="{ active: novaReda }">
        <h2 class="caixaTitulo">Nova Redação</h2>
        <p>Escolha como deseja criar uma nova redação!</p>

        <div class="caixaBotoes">
            <button class="botaoAcao"><RouterLink to="/tema" class="router-link">Escrever Redação</RouterLink></button>
            <button class="botaoAcao">Enviar Arquivo</button>
        </div>
    </div>

    <div class="caixaAcao" :class="{ active: contReda }">
        <h2 class="caixaTitulo">Continuar Redação</h2>
        <p>Veja todas suas redações incompletas!</p>

        <div class="caixaBotoes">
            <button class="botaoAcao"><RouterLink to="/redacao" class="router-link">Ver Rascunhos</RouterLink></button>

        </div>
    </div>

    <div class="caixaAcao" :class="{ active: minhasReda }">
        <h2 class="caixaTitulo">Minhas Redações</h2>
        <p>Ver todas suas redações corrigidas!</p>

        <div class="caixaBotoes">
            <button class="botaoAcao"><RouterLink to="/desempenho" class="router-link">Ver Redações</RouterLink></button>

        </div>
    </div>
</template>

<style scoped>
.caixaEsquerda {
    display: flex;
    flex-direction: column;
    align-items: flex-start;
    gap: 20px;
}

.caixaEsquerda h2 {
    font-size: 28px;
    font-weight: 700;
    color: var(--azulPadrao);
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
    width: 220px;
    padding: 12px 20px;
    background: var(--azulPadrao);
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
    background: var(--azul-escuro);
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
    background: var(--azul-escuro);
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