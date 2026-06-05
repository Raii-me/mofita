<script>
export default {
    name: "ModalApoio",

    props: {
        tema: { type: Object, default: null },
    },

    emits: ["fechar", "escolher"],

    watch: {
        tema(novo) {
            document.body.style.overflow = novo ? "hidden" : "";
        },
    },

    beforeUnmount() {
        document.body.style.overflow = "";
    },

    methods: {
        getImagemUrl(nome) {
            return new URL(`../../assets/TEMAS/${nome}`, import.meta.url).href;
        },

        getChargeUrl(nome) {
            return new URL(`../../assets/Charges/${nome}`, import.meta.url).href;
        },

        formatarParagrafos(texto) {
            if (!texto) return [];
            return texto
                .split(/\n+|\s{2,}/)
                .map((p) => p.trim())
                .filter((p) => p.length > 0);
        },
        escolherTema(tema) {
            this.$router.push({ name: "writing", params: { temaId: tema.id } })
        },
    },

};
</script>

<template>
    <div class="camada-fundo" :class="{ aberta: tema }" @click.self="$emit('fechar')">
        <aside class="janela-modal" :class="{ aberta: tema }">
            <div v-if="tema" class="corpo-modal">
                <button class="botao-fechar" @click="$emit('fechar')">✕</button>

                <div class="topo-imagem">
                    <img :src="getImagemUrl(tema.imagem)" :alt="tema.titulo" />
                </div>

                <header class="topo-modal">
                    <div class="etiqueta-tema">
                        <span class="tag-subcategoria">{{ tema.subcategoria }}</span>
                        <span class="divisor">•</span>
                        <span class="tag-subcategoria destaque">{{ tema.categoria }}</span>
                    </div>
                    <h1 class="titulo-redacao">{{ tema.titulo }}</h1>
                </header>

                <div class="texto-conteudo instrucoes">
                    <div class="subtitulo-secao">Comando da Redação</div>
                    <p>
                        A partir da leitura dos textos motivadores e com base nos
                        conhecimentos construídos ao longo de sua formação, redija um texto
                        dissertativo-argumentativo em modalidade escrita formal da língua
                        portuguesa sobre o tema apresentado, organize e relacione, de forma
                        coerente e coesa, argumentos e fatos para defesa de seu ponto de
                        vista.
                    </p>
                </div>

                <div class="texto-conteudo apoio">
                    <div class="subtitulo-secao">Textos Motivadores</div>

                    <div class="bloco-charge" v-if="tema.charge">
                        <img :src="getChargeUrl(tema.charge)" />
                        <p>
                            Disponível em:
                            <a :href="tema.link" target="_blank">{{ tema.link }}</a>
                        </p>
                    </div>

                    <div class="leitura-focada">
                        <p v-for="(p, i) in formatarParagrafos(tema.apoio)" :key="i">
                            {{ p }}
                        </p>
                    </div>
                </div>
            </div>

            <div class="rodape-modal" v-if="tema">
                <button class="btn-escolher" @click="escolherTema(tema)">
                    Começar a Escrever
                </button>
            </div>
        </aside>
    </div>
</template>

<style scoped>
.camada-fundo {
    position: fixed;
    inset: 0;
    background: rgba(0, 0, 0, 0);
    z-index: 999;
    opacity: 0;
    pointer-events: none;
    transition: opacity 0.4s ease, background 0.4s ease;
}

.camada-fundo.aberta {
    opacity: 1;
    pointer-events: all;
    background: rgba(0, 0, 0, 0.6);
}

.janela-modal {
    position: fixed;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%) scale(0.95);
    width: 50%;
    height: 95vh;
    background: var(--surface);
    box-shadow: var(--shadowPadrao);
    border-radius: 18px;
    transition: opacity 0.35s ease, transform 0.35s ease;
    display: flex;
    flex-direction: column;
    z-index: 1000;
    opacity: 0;
    pointer-events: none;
    border: 1px solid var(--borda);
}

.janela-modal.aberta {
    opacity: 1;
    pointer-events: all;
    transform: translate(-50%, -50%) scale(1);
}

.botao-fechar {
    position: absolute;
    top: 24px;
    right: 24px;
    width: 40px;
    height: 40px;
    border-radius: 50%;
    background: var(--surface-2);
    border: 1px solid var(--borda);
    font-size: 18px;
    cursor: pointer;
    display: flex;
    align-items: center;
    justify-content: center;
    transition: all 0.3s ease;
    z-index: 10;
    color: var(--texto-forte);
}

.botao-fechar:hover {
    background: var(--surface-3);
    border-color: var(--laranjaPadrao);
    color: var(--laranjaPadrao);
}

.corpo-modal {
    flex: 1;
    overflow-y: auto;
    padding: 0px 40px 100px;
    scrollbar-width: thin;
    scrollbar-color: var(--borda) var(--surface);
    position: relative;
}

.corpo-modal::-webkit-scrollbar {
    width: 8px;
}

.corpo-modal::-webkit-scrollbar-track {
    background: var(--surface);
}

.corpo-modal::-webkit-scrollbar-thumb {
    background: var(--borda);
    border-radius: 4px;
}

.corpo-modal::-webkit-scrollbar-thumb:hover {
    background: var(--texto-medio);
}

.topo-modal {
    margin-bottom: 30px;
    padding-right: 50px;
}

.etiqueta-tema {
    display: flex;
    align-items: center;
    gap: 10px;
    font-size: 12px;
    font-weight: 600;
    text-transform: uppercase;
    color: var(--texto-medio);
    margin-bottom: 16px;
    letter-spacing: 1px;
}

.tag-subcategoria {
    color: var(--texto-medio);
}

.tag-subcategoria.destaque {
    color: var(--laranjaPadrao);
}

.titulo-redacao {
    font-size: 24px;
    font-weight: 800;
    color: var(--texto-forte);
    line-height: 1.2;
}

.topo-imagem {
    width: calc(100% + 80px);
    margin-left: -40px;
    margin-right: -40px;
    height: 50%;
    margin-bottom: 40px;
    border-radius: 8px;
    overflow: hidden;
}

.topo-imagem img {
    width: 100%;
    height: 100%;
    object-fit: cover;
}

.subtitulo-secao {
    font-size: 14px;
    font-weight: 700;
    text-transform: uppercase;
    color: var(--texto-medio);
    border-bottom: 1px solid var(--borda);
    padding-bottom: 8px;
    margin-bottom: 20px;
    letter-spacing: 0.5px;
}

.texto-conteudo.instrucoes {
    margin-bottom: 40px;
}

.texto-conteudo.instrucoes p {
    font-size: 16px;
    line-height: 1.7;
    color: var(--texto);
    background: var(--surface-3);
    padding: 20px;
    border-left: 4px solid var(--laranjaPadrao);
    border-radius: 0 4px 4px 0;
    margin: 0;
}

.bloco-charge {
    width: 100%;
    min-height: 200px;
    margin-bottom: 32px;
    border: 2px solid var(--borda);
    border-radius: 8px;
    display: flex;
    flex-direction: column;
    gap: 20px;
    align-items: center;
    justify-content: center;
    background: var(--surface-3);
    overflow: hidden;
}

.bloco-charge img {
    width: 100%;
    height: 100%;
    object-fit: contain;
    border-radius: 6px;
}

.bloco-charge p {
    text-align: center;
    font-size: 18px;
    padding: 10px;
    color: var(--texto);
}

.bloco-charge a {
    color: var(--laranjaPadrao);
}

.leitura-focada {
    font-family: 'Georgia', 'Times New Roman', serif;
    font-size: 18px;
    line-height: 1.8;
    color: var(--texto);
}

.leitura-focada p {
    margin-bottom: 24px;
    text-align: justify;
    color: var(--texto);
}

.rodape-modal {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    padding: 10px 40px;
    background: var(--branco);
    border-top: 1px solid var(--borda);
}

.btn-escolher {
    width: 100%;
    padding: 18px;
    background: var(--laranjaPadrao);
    color: #fff;
    border: none;
    border-radius: 4px;
    font-size: 16px;
    font-weight: 700;
    cursor: pointer;
    transition: transform 0.3s ease, background 0.3s ease;
    box-shadow: var(--laranjaShadow);
    display: block;
}

.btn-escolher:hover {
    background: var(--laranjaEscuro);
    transform: translateY(-2px);
}

.btn-escolher:active {
    transform: translateY(0);
}

@media (max-width: 768px) {
    .janela-modal {
        width: 95%;
        height: 90vh;
    }

    .corpo-modal {
        padding: 30px 20px 100px;
    }

    .titulo-redacao {
        font-size: 20px;
    }

    .topo-imagem {
        width: calc(100% + 40px);
        margin-left: -20px;
        margin-right: -20px;
    }
}
</style>