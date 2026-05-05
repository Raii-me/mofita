import { createRouter, createWebHistory } from 'vue-router'
import Tela_Apresentacao from '../views/Tela_Apresentacao.vue'
import Tela_Perfil from '../views/Tela_Perfil.vue'
import Tela_Termos from '../views/Tela_Termos.vue'
import Tela_Politica from '../views/Tela_Politica.vue'
import Tela_Modelos from '../views/Tela_Modelos.vue'
import Tela_Livros from '../views/Tela_Livros.vue'
import Tela_Inicial from '../views/Tela_Inicial.vue'
import Tela_Feedback from '../views/Tela_Feedback.vue'
import Tela_Escolher_Tema from '../views/Tela_Escolher_Tema.vue'
import Tela_Desempenho from '../views/Tela_Desempenho.vue'
import Tela_Continuar_Redacao from '../views/Tela_Continuar_Redacao.vue'
import Tela_Escrever from '../views/Tela_EditorRedacao.vue'
import teste from '../views/fodaseteste.vue'



const routes = [
  { path: '/',                name: 'overview',  component: Tela_Apresentacao },
  { path: '/escrever/:temaId?',        name: 'writing',  component: Tela_Escrever },
  { path: '/home',            name: 'home',      component: Tela_Inicial },
  { path: '/modelos',         name: 'template',  component: Tela_Modelos },
  { path: '/livros',          name: 'book',      component: Tela_Livros },
  { path: '/termos',          name: 'terms',     component: Tela_Termos },
  { path: '/politica',        name: 'policy',    component: Tela_Politica },
  { path: '/perfil',          name: 'profile',   component: Tela_Perfil },
  { path: '/feedback',        name: 'feedback',  component: Tela_Feedback },
  { path: '/tema',            name: 'theme',     component: Tela_Escolher_Tema },
  { path: '/desempenho',      name: 'dashboard', component: Tela_Desempenho },
  { path: '/redacao',         name: 'reda',   component: Tela_Continuar_Redacao },
  { path: '/teste',         name: 'teste',   component: teste },

]

const router = createRouter({
  history: createWebHistory(),
  routes,
 })


 

export default router