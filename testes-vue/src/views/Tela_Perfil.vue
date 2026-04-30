<script>
import Header from "../components/Header.vue"
import Footer from "../components/Footer.vue"
import Chatbot from "../components/Chatbot.vue"
import Switch from '../components/Switch.vue'
import "../assets/css/variaveis.css";

export default {
    components: {
        Header,
        Footer,
        Chatbot,
        Switch
    },

    data() {
        return {
            nome: 'teste',
            esc: '',

            tirarAnimacao: false,
            altoContraste: false,
            notificacao: false,
            espacamentoLinha: false,
            modoFoco: false,
            restaurarPadraoConfiguracao: false,
            modoEscuro: false,
            receberEmail: false,
            chatbotFlutuante: false,
            restaurarPadraoAcessibilidade: false,

            abaAtiva: 'conta'
        }
    },

    methods: {
        mudarAba(aba) {
            this.abaAtiva = aba
        },
        salvar(){
            this.nome = this.esc
            alert(this.nome)
        }
    }
}
</script>


<template>
    <Header />

    <div class="conteudo-config">
        <div class="config-container">
            <section class="info-conta">

                <div class="sidebar">
                    <div class="profile-edt">
                        <img src="../assets/IMAGES/foto-perfil-temporaria.png" />
                        <p>{usuario}</p>
                        <p>{Funcao}</p>
                        <p class="id-usuario">{id}</p>
                        
                        <hr>
                    </div>

                    <div class="opcoes">

                        <div class="opcoes-sidebar" @click="mudarAba('conta')" :class="{ ativo: abaAtiva === 'conta' }">
                            <img src="../assets/ICONS/icon-perfil.png">
                            <p>Conta</p>
                        </div>

        


                        <div class="opcoes-sidebar" @click="mudarAba('acessibilidade')"
                            :class="{ ativo: abaAtiva === 'acessibilidade' }">
                            <img src="../assets/ICONS/icon-lupa.png">
                            <p>Acessibilidade</p>
                        </div>

                        <div class="opcoes-sidebar" @click="mudarAba('configuracao')"
                            :class="{ ativo: abaAtiva === 'configuracao' }">
                            <img src="../assets/ICONS/icon-configuracoes.png">
                            <p>Configurações</p>
                        </div>
                        <div class="opcoes-sidebar" @click="mudarAba('caixa4')"
                            :class="{ ativo: abaAtiva === 'caixa4' }">
                            <img src="../assets/ICONS/icon-botao-ajuda.png">
                            <p>palavracoisa</p>
                        </div>

                    </div>

                    <div class="final">
                        <div class="final-sidebar">
                            <img src="../assets/ICONS/icon-logout.png">
                            <p>Sair</p>
                        </div>
                    </div>
                </div>

                <main class="config-box">
                    <div v-if="abaAtiva === 'conta'">

                        <div class="titulo">
                            <h4>Seus dados</h4>
                        </div>

                        <div class="setting-box">
                            <p>Nome:</p>
                            <div class="change-box">
                                <input type="text" placeholder="Digite um Nome novo"/>
                                <button @click="salvar">Mudar Nome</button>
                            </div>
                        </div>

                        <div class="setting-box">
                            <p>Email:</p>
                            <div class="change-box">
                                <input type="text" placeholder="Digite um Email novo" />
                                <button>Mudar Email</button>
                            </div>
                        </div>

                        <div class="titulo">
                            <h4>Mudar Senha</h4>
                        </div>

                        <div class="password-box">
                            <p>Senha Atual</p>
                            <div class="password-config">
                                <input type="text" placeholder="Digite sua senha atual" />
                            </div>
                        </div>

                        <div class="password-box">
                            <p>Nova Senha</p>
                            <div class="password-config">
                                <input type="text" placeholder="Digite sua nova senha" />
                            </div>
                        </div>

                        <div class="password-box">
                            <p>Confirme</p>
                            <div class="password-config">
                                <input type="text" placeholder="Confirme sua senha" />
                                <button>Salvar</button>
                            </div>
                        </div>
                    </div>

                    <div v-else-if="abaAtiva === 'acessibilidade'">

                        <div class="titulo">
                            <h4>Acessibilidade</h4>
                        </div>


                        <div class="acessibilidade-box">
                            <p>Tirar Animações</p>
                            <Switch v-model="tirarAnimacao" />
                        </div>

                        <div class="acessibilidade-box">
                            <p>Alto contraste</p>
                            <Switch v-model="altoContraste" />
                        </div>



                        <div class="acessibilidade-box">
                            <p>Notificações</p>
                            <Switch v-model="notificacao" />
                        </div>
                        <div class="acessibilidade-box">
                            <p>Espaçamento entre linhas</p>
                            <Switch v-model="espacamentoLinha" />
                        </div>
                        <div class="acessibilidade-box">
                            <p>Modo foco</p>
                            <Switch v-model="modoFoco" />
                        </div>

                        <div class="acessibilidade-box">
                            <p>Restaurar Padrão</p>
                                <button>Mudar Nome</button>
                        </div>


                    </div>

                    <div v-else-if="abaAtiva === 'configuracao'">
                        <div class="titulo">
                            <h4>Configurações</h4>
                        </div>

                        <div class="acessibilidade-box">
                            <p>Modo Escuro</p>
                            <Switch v-model="modoEscuro" />
                        </div>

                        <div class="acessibilidade-box">
                            <p>Idiomas</p>
                            <select class="category">
                                <option value="opcao1">PT-BR</option>
                                <option value="opcao2">ES</option>
                                <option value="opcao3">EN</option>

                            </select>
                        </div>

                        <div class="acessibilidade-box">
                            <p>Tamanho da Fonte</p>
                            <select class="category">
                                <option value="opcao1">10px</option>
                                <option value="opcao2">12px</option>
                                <option value="opcao3">14px</option>
                                <option value="opcao4">16px</option>
                                <option value="opcao5">18px</option>
                                <option value="opcao6">20px</option>
                                <option value="opcao7">22px</option>
                            </select>
                        </div>

                        <div class="acessibilidade-box">
                            <p>Receber Email</p>
                            <Switch v-model="receberEmail" />
                        </div>

                        <div class="acessibilidade-box">
                            <p>Chatbot Flutuante</p>
                            <Switch v-model="chatbotFlutuante" />
                        </div>

                        <div class="acessibilidade-box">
                            <p>Restaurar Padrão</p>
                            <button>Mudar Nome</button>
                        </div>

                        





                    </div>
                </main>


            </section>


        </div>
    </div>

    <Chatbot />
    <Footer />
</template>

<style scoped>
.conteudo-config {
    width: 100%;
    min-height: 100vh;

    display: flex;
    justify-content: center;
}

.config-container {
    width: 90%;
    height: fit-content;
    background-color: var(--branco);
    box-shadow: var(--shadowPadrao);
    border-radius: var(--radius-pequeno);

    margin-top: 50px;
    margin-bottom: 50px;
}

.info-conta {
    display: flex;
}

.sidebar {
    height: auto;
    min-height: 600px;
    padding-top: 35px;
    width: 200px;
    min-width: 200px;
    max-width: 200px;
    flex-shrink: 0;
    box-shadow: 2px 0 1px rgba(0, 0, 0, 0.103); /*isso daq q faz a linha ali caso alguem venha ver*/ 
    background-color: var(--branco);
    border-radius: var(--radius-pequeno) 0px 0px var(--radius-pequeno);
    border-right: 2px solid var(--cinzaPadrao);
    display: flex;
    flex-direction: column;
    overflow: hidden;
}

.profile-edt {
    display: flex;
    align-items: center;
    flex-direction: column;
}

.profile-edt img {
    width: 70px;
    height: 70px;
    border-radius: 50%;
    border: 2px solid var(--branco);
    margin-bottom: 5px;
}

.profile-edt p {
    font-size: 15px;
    font-weight: 700;
    color: #000000;
}

.profile-edt hr {
    margin-top: 10px;
    width: 100%;
    border: none;
    height: 1px;
    background-color: #e2e2e2;
}

.opcoes {
    margin-top: 5px;
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 100%;
}

.final {
    margin-top: auto;
    margin-bottom: 10px;
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 100%;
}

.opcoes-sidebar {
    border: 2px solid var(--azulPadrao);
    color: var(--azulPadrao);
}

.final-sidebar {
    border: 2px solid var(--vermelho);
    color: var(--vermelho);
}

.opcoes-sidebar p,
.final-sidebar p {
    all: unset;
    margin-right: 5px;
}

.opcoes-sidebar,
.final-sidebar {
    transition: 0.5s;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 5px;
    width: 168px;
    padding: 5px;
    background-color: var(--branco);
    font-size: 14px;
    border-radius: var(--radius-pequeno);
    cursor: pointer;
}

.opcoes-sidebar img,
.final-sidebar img {
    margin-left: 5px;
    margin-right: 5px;
    width: 14px;
    height: 14px;
}

.opcoes-sidebar:hover {
    background-color: var(--azulPadraoClaro);
    box-shadow: var(--sombra-md);
}

.final-sidebar:hover {
    background-color: var(--vermelhoClaro);
    box-shadow: var(--sombra-md);
}

.opcoes-sidebar.ativo {
    background-color: var(--azulPadraoClaro);
    box-shadow: var(--sombra-md);
}


.category {
    background-color: var(--branco);
    padding: 2px;
    width: 60px;
    border-radius: var(--radius-pequeno);
    border: 1px solid var(--cinzaBorda);
}

.acessibilidade-box {
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 11px;
    margin-left: 2%;
    margin-right: 2%;
    background-color: var(--cinzaPadrao);
    border: 1px solid var(--cinzaBorda);
    border-radius: var(--radius-pequeno);
    box-shadow: var(--sombra-sm);
    margin-top: 15px;
}


.acessibilidade-box button {
    height: 40px;
    margin-left: auto;
    width: 100px;
    background: var(--laranjaPadrao);
    border: none;
    border-radius: var(--radius-pequeno);
    color: var(--branco);
    font-weight: 500;
    cursor: pointer;
    transition: var(--trans);
    margin-right: 10px;
}


.acessibilidade-box p {
    margin-right: auto;

}

.config-box {
    display: flex;
    flex-direction: column;
    width: 100%;
}

.titulo h4 {
    margin-left: 2%;
    margin-top: 3%;
}

.setting-box,
.password-box {
    position: relative;
    margin-left: 2%;
    margin-right: 2%;
 
    padding: 6px;
    border: 1px solid var(--cinzaBorda);
    border-radius: var(--radius-pequeno);
    margin-top: 15px;
    margin-bottom: 10px;
    box-shadow: var(--sombra-sm);
}

.setting-box p,
.password-box p {
    color: var(--cinzaForte);
    position: absolute;
    background-color: var(--branco);
    top: 10px;
    padding:0 5px 0 5px;
    left:10px;
    margin-left: 4px;
}

.change-box,
.password-config {
    color: var(--branco);
    display: flex;
    gap: 10px;
}
input:focus {
    
    border-color: var(--azulPadrao) !important;

}


.change-box input,
.password-config input {
    transition: var(--delayCurto);
    margin-top:20px;
    padding-left: 10px;
    width: 80%;
    height: 40px;
    background: var(--branco);
    border: 2px solid var(--cinzaBorda);
    border-radius: var(--radius-pequeno);
     outline: none;
}

.change-box button,
.password-config button {
    margin-top:20px;
    margin-left: auto;
    width: 100px;
    background: var(--laranjaPadrao);
    border: none;
    border-radius: var(--radius-pequeno);
    color: var(--branco);
    font-weight: 500;
    cursor: pointer;
    transition: var(--trans);
    margin-right: 10px;
    font-weight: 700;
}

.profile-edt button:hover,
.setting-box button:hover,
.password-config button:hover {
    background: var(--laranjaEscuro);
    box-shadow: var(--sombra-md);
    text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
    transform: translateY(-2px) ;
   
}

.id-usuario{
    font-size: 10px !important;
}


</style>