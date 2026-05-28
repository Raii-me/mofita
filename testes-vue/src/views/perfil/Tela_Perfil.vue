<script>
import Header from "../../components/layout/Header.vue"
import Footer from "../../components/layout/Footer.vue"
import Chatbot from "../../components/features/Chatbot.vue"
import Switch from '../../components/features/Switch.vue'
import "../../assets/css/variaveis.css";

export default {
    components: { Header, Footer, Chatbot, Switch },

    data() {
        return {
            nome: 'teste',
            esc: '',
            tirarAnimacao: false,
            altoContraste: false,
            notificacao: false,
            espacamentoLinha: false,
            modoFoco: false,
            modoEscuro: false,
            receberEmail: true,
            chatbotFlutuante: true,
            abaAtiva: 'conta'
        }
    },

    mounted() {
        const temaSalvo = localStorage.getItem("theme");
        this.modoEscuro = temaSalvo === "dark";
        this.aplicarTema();
    },

    watch: {
        modoEscuro() {
            this.aplicarTema();
        }
    },

    methods: {
        mudarAba(aba) {
            this.abaAtiva = aba;
        },

        voltar() {
            this.$router.back("/");
        },

        salvar() {
            this.nome = this.esc;
            alert(this.nome);
        },

        aplicarTema() {
            if (this.modoEscuro) {
                document.documentElement.setAttribute("data-theme", "dark");
                localStorage.setItem("theme", "dark");
            } else {
                document.documentElement.removeAttribute("data-theme");
                localStorage.setItem("theme", "light");
            }
        }
    }
}
</script>

<template>

    <div class="conteudo-config">
        <div class="config-container">
            <section class="info-conta">

                <aside class="sidebar">
                    <div class="profile-edt">
                        <div class="avatar-wrapper">
                            <img src="../../assets/IMAGES/foto-perfil-temporaria.png" />
                        </div>
                        <p class="profile-nome">{{ usuario }}</p>
                        <p class="profile-funcao">{{ Funcao }}</p>
                        <p class="id-usuario">{{ id }}</p>
                        <hr />
                    </div>

                    <nav class="opcoes">
                        <button
                            class="opcoes-sidebar"
                            @click="mudarAba('conta')"
                            :class="{ ativo: abaAtiva === 'conta' }"
                        >
                            <img src="../../assets/ICONS/icons-azul/icon-perfil-azul.svg" />
                            <span>Conta</span>
                        </button>

                        <button
                            class="opcoes-sidebar"
                            @click="mudarAba('configuracao')"
                            :class="{ ativo: abaAtiva === 'configuracao' }"
                        >
                            <img src="../../assets/ICONS/icons-azul/icon-configuracoes-azul.svg" />
                            <span>Configurações</span>
                        </button>

            
                    </nav>

                    <div class="final">
                        <button class="final-sidebar">
                            <img src="../../assets/ICONS/icons-outros/icon-logout.png" />
                            <span>Sair</span>
                        </button>
                        <button class="final-sidebar" id="voltar" @click="voltar">
                            <img src="../../assets/ICONS/icons-outros/icon-logout.png" />
                            <span>Voltar</span>
                        </button>
                    </div>
                </aside>

                <main class="config-box">

                    <div v-if="abaAtiva === 'conta'" class="aba-conteudo">
                        <div class="secao-titulo">
                            <h4>Seus dados</h4>
                            <p>Gerencie suas informações pessoais</p>
                        </div>

                        <div class="setting-box">
                            <label class="field-label">Nome</label>
                            <div class="change-box">
                                <input type="text" v-model="esc" placeholder="Digite um novo nome" />
                                <button @click="salvar">Salvar</button>
                            </div>
                        </div>

                        <div class="setting-box">
                            <label class="field-label">Email</label>
                            <div class="change-box">
                                <input type="email" placeholder="Digite um novo email" />
                                <button>Salvar</button>
                            </div>
                        </div>

                        <div class="secao-titulo secao-titulo--mt">
                            <h4>Segurança</h4>
                            <p>Altere sua senha de acesso</p>
                        </div>

                        <div class="setting-box">
                            <label class="field-label">Senha atual</label>
                            <div class="password-config">
                                <input type="password" placeholder="Digite sua senha atual" />
                            </div>
                        </div>

                        <div class="setting-box">
                            <label class="field-label">Nova senha</label>
                            <div class="password-config">
                                <input type="password" placeholder="Digite sua nova senha" />
                            </div>
                        </div>

                        <div class="setting-box">
                            <label class="field-label">Confirmar senha</label>
                            <div class="password-config">
                                <input type="password" placeholder="Confirme sua nova senha" />
                                <button>Salvar</button>
                            </div>
                        </div>
                    </div>

                    <div v-else-if="abaAtiva === 'configuracao'" class="aba-conteudo">
                        <div class="secao-titulo">
                            <h4>Configurações</h4>
                            <p>Preferências gerais do sistema</p>
                        </div>

                        <div class="opcao-row">
                            <div class="opcao-info">
                                <span class="opcao-nome">Modo Escuro</span>
                                <span class="opcao-desc">Altera o tema da interface para escuro</span>
                            </div>
                            <Switch v-model="modoEscuro" />
                        </div>

                        <div class="opcao-row">
                            <div class="opcao-info">
                                <span class="opcao-nome">Tamanho da Fonte</span>
                                <span class="opcao-desc">Ajuste o tamanho do texto na plataforma</span>
                            </div>
                            <select class="category">
                                <option value="10">10px</option>
                                <option value="12">12px</option>
                                <option value="14" selected>14px</option>
                                <option value="16">16px</option>
                                <option value="18">18px</option>
                                <option value="20">20px</option>
                                <option value="22">22px</option>
                            </select>
                        </div>

                        <div class="opcao-row">
                            <div class="opcao-info">
                                <span class="opcao-nome">Receber Emails</span>
                                <span class="opcao-desc">Notificações e novidades por email</span>
                            </div>
                            <Switch v-model="receberEmail" />
                        </div>

                        <div class="opcao-row">
                            <div class="opcao-info">
                                <span class="opcao-nome">Chatbot Flutuante</span>
                                <span class="opcao-desc">Exibe o assistente flutuante na tela</span>
                            </div>
                            <Switch v-model="chatbotFlutuante" />
                        </div>

                        <div class="secao-footer">
                            <button class="btn-restaurar">Restaurar Padrão</button>
                        </div>
                    </div>

                </main>
            </section>
        </div>
    </div>
<Chatbot v-if="chatbotFlutuante" />
</template>

<style scoped>
.conteudo-config {
    width: 100%;
    min-height: 100vh;
    display: flex;
    justify-content: center;
    align-items: flex-start;
    background: var(--surface);
}

.config-container {
    width: 90%;
    max-width: 1100px;
    height: fit-content;
    background-color: var(--brancoPadrao);
    box-shadow: var(--shadowPadrao);
    border-radius: var(--radius-medio);
    margin: 50px 0;
    overflow: hidden;
}

.info-conta {
    display: flex;
    min-height: 600px;
}

.sidebar {
    width: 220px;
    min-width: 220px;
    flex-shrink: 0;
    background-color: var(--surface-2);
    border-right: 1px solid var(--borda);
    display: flex;
    flex-direction: column;
    padding: 32px 0 20px;
    gap: 10px;
}

.profile-edt {
    display: flex;
    align-items: center;
    flex-direction: column;
    padding: 0 20px;
    margin-bottom: 8px;
}

.avatar-wrapper {
    position: relative;
    width: 72px;
    height: 72px;
    margin-bottom: 10px;
}

.avatar-wrapper img {
    width: 72px;
    height: 72px;
    border-radius: 50%;
    border: 2px solid var(--borda);
    object-fit: cover;
}

.profile-nome {
    font-size: 14px;
    font-weight: 700;
    color: var(--texto);
    margin: 0;
}

.profile-funcao {
    font-size: 12px;
    font-weight: 500;
    color: var(--texto-medio);
    margin: 2px 0 0;
}

.id-usuario {
    font-size: 10px;
    color: var(--texto-suave);
    margin: 2px 0 0;
}

.profile-edt hr {
    margin-top: 16px;
    width: 100%;
    border: none;
    height: 1px;
    background-color: var(--borda);
}

.opcoes {
    display: flex;
    flex-direction: column;
    align-items: stretch;
    padding: 8px 12px;
    gap: 2px;
    flex: 1;
}

.final {
    padding: 8px 12px;
    display: flex;
    flex-direction: column;
    gap: 10px;
}

.opcoes-sidebar,
.final-sidebar {
    display: flex;
    align-items: center;
    gap: 8px;
    width: 100%;
    padding: 9px 12px;
    background: transparent;
    border: none;
    border-radius: var(--radius-pequeno);
    font-size: 13px;
    font-weight: 600;
    cursor: pointer;
    transition: all var(--trans);
    text-align: left;
}

.opcoes-sidebar {
    color: var(--texto-sec);
}

.opcoes-sidebar:hover {
    background-color: var(--azulPadraoClaro);
    color: var(--azulPadrao);
}

.opcoes-sidebar.ativo {
    background-color: var(--azulPadraoClaro);
    color: var(--azulPadrao);
    font-weight: 700;
}

.final-sidebar {
    color: var(--vermelho);
    border: 1px solid var(--vermelho);
}
#voltar{
    color: var(--texto-sec);
    border: 1px solid var(--borda);
}

#voltar:hover{
    background: var(--brancoPadrao);
}

.final-sidebar:hover {
    background-color: var(--vermelhoClaro);
}

.opcoes-sidebar img,
.final-sidebar img {
    width: 15px;
    height: 15px;
    flex-shrink: 0;
}

.opcoes-sidebar span,
.final-sidebar span {
    white-space: nowrap;
}

.config-box {
    flex: 1;
    display: flex;
    flex-direction: column;
    background: var(--brancoPadrao);
}

.aba-conteudo {
    padding: 32px 36px 40px;
    display: flex;
    flex-direction: column;
    gap: 0;
}

.secao-titulo {
    margin-bottom: 24px;
}

.secao-titulo--mt {
    margin-top: 36px;
}

.secao-titulo h4 {
    font-size: 16px;
    font-weight: 800;
    color: var(--texto);
    margin: 0 0 4px;
}

.secao-titulo p {
    font-size: 13px;
    color: var(--texto-medio);
    margin: 0;
}

.setting-box {
    display: flex;
    flex-direction: column;
    gap: 0;
    border: 1px solid var(--borda);
    border-radius: var(--radius-pequeno);
    padding: 16px;
    margin-bottom: 12px;
    background: var(--surface-2);
    transition: border-color var(--trans);
}

.setting-box:focus-within {
    border-color: var(--azulPadrao);
}

.field-label {
    font-size: 11px;
    font-weight: 700;
    text-transform: uppercase;
    letter-spacing: 0.6px;
    color: var(--texto-medio);
    margin-bottom: 8px;
}

.change-box,
.password-config {
    display: flex;
    gap: 10px;
    align-items: center;
}

.change-box input,
.password-config input {
    flex: 1;
    height: 40px;
    padding: 0 12px;
    background: var(--brancoPadrao);
    border: 1.5px solid var(--borda);
    border-radius: var(--radius-pequeno);
    outline: none;
    color: var(--texto);
    font-size: 14px;
    font-family: inherit;
    transition: border-color var(--delayCurto);
}

.change-box input::placeholder,
.password-config input::placeholder {
    color: var(--texto-medio);
}

input:focus {
    border-color: var(--azulPadrao) !important;
}

.change-box button,
.password-config button {
    height: 40px;
    padding: 0 18px;
    background: var(--laranjaPadrao);
    border: none;
    border-radius: var(--radius-pequeno);
    color: #fff;
    font-size: 13px;
    font-weight: 700;
    cursor: pointer;
    font-family: inherit;
    transition: all var(--trans);
    white-space: nowrap;
    flex-shrink: 0;
}

.change-box button:hover,
.password-config button:hover {
    background: var(--laranjaEscuro);
    transform: translateY(-2px);
    box-shadow: var(--laranjaShadow);
}

.opcao-row {
    display: flex;
    align-items: center;
    justify-content: space-between;
    padding: 16px;
    border: 1px solid var(--borda);
    border-radius: var(--radius-pequeno);
    background: var(--surface-2);
    margin-bottom: 8px;
    gap: 16px;
    transition: border-color var(--trans);
}

.opcao-row:hover {
    border-color: var(--laranjaPadrao);
}

.opcao-info {
    display: flex;
    flex-direction: column;
    gap: 3px;
}

.opcao-nome {
    font-size: 14px;
    font-weight: 600;
    color: var(--texto);
}

.opcao-desc {
    font-size: 12px;
    color: var(--texto-medio);
}

.category {
    background-color: var(--brancoPadrao);
    padding: 6px 10px;
    border-radius: var(--radius-pequeno);
    border: 1.5px solid var(--borda);
    color: var(--texto);
    font-size: 13px;
    font-family: inherit;
    cursor: pointer;
    outline: none;
    transition: border-color var(--trans);
    min-width: 80px;
}

.category:focus {
    border-color: var(--azulPadrao);
}

.secao-footer {
    margin-top: 24px;
    display: flex;
    justify-content: flex-end;
}

.btn-restaurar {
    padding: 9px 20px;
    background: transparent;
    border: 1.5px solid var(--borda);
    border-radius: var(--radius-pequeno);
    color: var(--texto-sec);
    font-size: 13px;
    font-weight: 600;
    cursor: pointer;
    font-family: inherit;
    transition: all var(--trans);
}

.btn-restaurar:hover {
    border-color: var(--vermelho);
    color: var(--vermelho);
    background: var(--vermelhoClaro);
}

@media (max-width: 768px) {
    .config-container {
        width: 100%;
        border-radius: 0;
        margin: 0;
    }

    .info-conta {
        flex-direction: column;
    }

    .sidebar {
        width: 100%;
        min-width: unset;
        border-right: none;
        border-bottom: 1px solid var(--borda);
        padding: 20px 16px 12px;
    }

    .opcoes {
        flex-direction: row;
        flex-wrap: wrap;
        padding: 8px 0;
        gap: 6px;
    }

    .opcoes-sidebar {
        width: auto;
        flex: 1;
        min-width: fit-content;
        justify-content: center;
    }

    .aba-conteudo {
        padding: 20px 16px 32px;
    }
}
</style>