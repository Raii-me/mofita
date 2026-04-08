import { createRouter, createWebHistory } from 'vue-router'
import Tela_desempenho from '../views/Tela_desempenho.vue'

const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Tela_desempenho
    }
  ]
})

export default router