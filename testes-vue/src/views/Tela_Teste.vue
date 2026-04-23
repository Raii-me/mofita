<script setup>
import { ref } from 'vue'

import Header from "../components/Header.vue"
import Footer from "../components/Footer.vue"
import Chatbot from "../components/Chatbot.vue"
import Switch from '../components/Switch.vue'
import "../assets/css/variaveis.css"


const tirarAnimacao = ref(false)
const altoContraste = ref(false)
const notificacao = ref(false)
const espacamentoLinha = ref(false)
const modoFoco = ref(false)
const restaurarPadraoConfiguracao = ref(false)
const modoEscuro = ref(false)
const receberEmail = ref(false)
const chatbotFlutuante = ref(false)

const restaurarPadraoAcessibilidade = ref(false)


const abaAtiva = ref('conta')

function mudarAba(aba) {
    abaAtiva.value = aba
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
                        <p>Rai Vicencio</p>
                        <p>Administrador</p>
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
                            <p>Logout</p>
                        </div>
                    </div>
                </div>


                <main class="config-box">
                    <div v-if="abaAtiva === 'conta'">

                        <div class="titulo">
                            <h4>Seus dados</h4>
                        </div>

                        <div class="setting-box">
                            <p>Nome: {usuario}</p>
                            <div class="change-box">
                                <input type="text" placeholder="Alterar o nome de usuario" />
                                <button>Mudar Nome</button>
                            </div>
                        </div>

                        <div class="setting-box">
                            <p>Email: {email}</p>
                            <div class="change-box">
                                <input type="text" placeholder="Alterar o email do usuario" />
                                <button>Mudar Email</button>
                            </div>
                        </div>

                        <div class="titulo">
                            <h4>Mudar Senha</h4>
                        </div>

                        <div class="password-box">
                            <p>Digite sua senha atual</p>
                            <div class="password-config">
                                <input type="text" placeholder="Senha Atual" />
                            </div>
                        </div>

                        <div class="password-box">
                            <p>Digite sua nova senha</p>
                            <div class="password-config">
                                <input type="text" placeholder="Nova Senha" />
                            </div>
                        </div>

                        <div class="password-box">
                            <p>Confirme sua senha</p>
                            <div class="password-config">
                                <input type="text" placeholder="Confirmar Senha" />
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
                            <Switch v-model="restaurarPadraoAcessibilidade" />
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
                            <Switch v-model="restaurarPadraoConfiguracao" />
                        </div>

                        





                    </div>
                </main>


            </section>


        </div>
    </div>

    <Chatbot />
    <Footer />
</template>

<style>
.conteudo-config {
    width: 100%;
    height: 100vh;
    background-color: rgb(189, 219, 219);
    display: flex;
    justify-content: center;

}

.config-container {
    width: 70%;
    height: fit-content;
    background-color: #fff;
    border-radius: var(--radius-pequeno);
    margin-top: 30px;
}

.info-conta {
    display: flex;
}

.sidebar {
    height: auto;
    padding-top: 35px;
    width: 200px;
    background-color: var(--laranjaPadrao);
    border-radius: var(--radius-pequeno) 0px 0px var(--radius-pequeno);
    border-right: 2px solid var(--azulPadrao);
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
    border: 2px solid var(--branco2);
    margin-bottom: 5px;
  

}

.profile-edt p {
    font-size: 15px;
      font-weight: 700;
      color: #ffffff;

}

.profile-edt hr {
    margin-top: 10px;
    width: 100%;
}

.opcoes,
.final {
    margin-top: 5px;
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
}

.opcoes-sidebar,
.final-sidebar {
    transition: 0.3s;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 5px;
    width: 90%;
    padding: 5px;
    background-color: var(--branco2);
    font-size: 14px;
    border-radius: var(--radius-pequeno);
}

.opcoes-sidebar img,
.final img {

    margin-left: 10px;
    width: 14px;
    height: 14px;
    margin-right: auto;
}

.final {
    margin-top: 100%;
    margin-bottom: 10px;
}

.opcoes-sidebar:hover {
    border-right: 5px solid #16325a;
    background-color: var(--azulPadrao);
    color: var(--branco2);
    font-weight: 600;
}

.final-sidebar:hover {
    border-right: 5px solid #b61414;
    background-color: var(--vermelho);
    color: var(--branco2);
    font-weight: 600;
}

.opcoes-sidebar.ativo {
    border-right: 5px solid #16325a;
    background-color: var(--azulPadrao);
    color: var(--branco2);
    font-weight: 600;
}

.category {
    background-color: var(--branco2);
    padding: 2px;
    width: 60px;
    border-radius: var(--radius-pequeno);
    border: 1px solid var(--cinza-claro);

}

.acessibilidade-box {
    display: flex;
    justify-content: center;
    align-items: center;
    padding: 10px;
    margin-left: 2%;
    margin-right: 2%;
    background-color: var(--branco2);
    border: 1px solid var(--cinza-claro);
    border-radius: var(--radius-pequeno);
    margin-top: 15px;

}

.acessibilidade-box p {
    margin-right: auto;
}

.profile-edt button:hover,
.setting-box button:hover,
.password-config button:hover {
    background: var(--laranja-btn-hover);
    box-shadow: var(--shadowPadrao);
    text-shadow: 3px 3px 7px rgba(0, 0, 0, 0.103);
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
    margin-left: 2%;
    margin-right: 2%;
    background-color: var(--branco2);
    padding: 6px;
    border: 1px solid var(--cinza-claro);
    border-radius: var(--radius-pequeno);
    margin-top: 15px;
    margin-bottom: 10px;
}

.setting-box p,
.password-box p {
    margin-left: 4px;
}

.change-box,
.password-config {
    display: flex;
    gap: 10px;
}

.change-box input,
.password-config input {
    padding-left: 10px;
    width: 80%;

    background: var(--brancoPadrao);
    border: 1px solid var(--cinza-claro);
    border-radius: var(--radius-pequeno);
}

.change-box button,
.password-config button {
    margin-left: auto;
    width: 100px;

    background: var(--laranja-btn);
    border: none;
    border-radius: var(--radius-pequeno);
    color: var(--brancoPadrao);
    font-weight: 500;
    cursor: pointer;
    transition: var(--trans);
    margin-right: 10px;
}
</style>