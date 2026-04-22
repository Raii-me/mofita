import { createRouter, createWebHistory } from 'vue-router'
import Tela_Teste from '../views/Tela_Teste.vue'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Tela_Teste
    }
  ]
})

export default router