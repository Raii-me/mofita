import { createRouter, createWebHistory } from 'vue-router'

import Tela_Apresentacao from '../views/Tela_Apresentacao.vue'
import Tela_Termos from '../views/Tela_Termos.vue'
import Tela_Politica from '../views/Tela_Politica.vue'

import Cadastro_Login from '../views/auth/Tela_Cadastro_Login.vue'
import Tela_Email from '../views/auth/Tela_Email.vue'
import Tela_Codigo from '../views/auth/Tela_Codigo.vue'
import Tela_Redefinir from '../views/auth/Tela_Redefinir.vue'

import Tela_Inicial from '../views/dashboard/Tela_Inicial.vue'
import Tela_Perfil from '../views/perfil/Tela_Perfil.vue'
import Tela_Modelos from '../views/material/Tela_Modelos.vue'
import Tela_Livros from '../views/material/Tela_Livros.vue'
import Tela_Escrever from '../views/redacao/Tela_EditorRedacao.vue'
import Tela_Continuar_Redacao from '../views/redacao/Tela_Continuar_Redacao.vue'
import Tela_Escolher_Tema from '../views/redacao/Tela_Escolher_Tema.vue'
import Tela_Feedback from '../views/feedback/Tela_Feedback.vue'
import Tela_Desempenho from '../views/desempenho/Tela_Desempenho.vue'

import teste from '../views/fodaseteste.vue'

const routes = [
  { path: '/',                   name: 'overview',     component: Tela_Apresentacao },
  { path: '/politica',           name: 'policy',       component: Tela_Politica },
  { path: '/termos',             name: 'terms',        component: Tela_Termos },
  { path: '/cadastro',           name: 'register',     component: Cadastro_Login, props: {modo: 'cadastro'} },
  { path: '/login',              name: 'login',        component: Cadastro_Login, props: {modo: 'login'   } },
  { path: '/recuperar',          name: 'recuperation', component: Tela_Email },
  { path: '/codigo',             name: 'code',         component: Tela_Codigo },
  { path: '/redefinir',          name: 'redefinition', component: Tela_Redefinir },
  { path: '/home',               name: 'home',         component: Tela_Inicial },
  { path: '/perfil',             name: 'profile',      component: Tela_Perfil },
  { path: '/modelos',            name: 'template',     component: Tela_Modelos },
  { path: '/livros',             name: 'book',         component: Tela_Livros },
  { path: '/escrever/:temaId?',  name: 'writing',      component: Tela_Escrever },
  { path: '/redacao',            name: 'reda',         component: Tela_Continuar_Redacao },
  { path: '/tema',               name: 'theme',        component: Tela_Escolher_Tema },
  { path: '/feedback',           name: 'feedback',     component: Tela_Feedback },
  { path: '/desempenho',         name: 'dashboard',    component: Tela_Desempenho },
  { path: '/teste',              name: 'teste',        component: teste },

]

const router = createRouter({
  history: createWebHistory(),
  routes,
})

export default router