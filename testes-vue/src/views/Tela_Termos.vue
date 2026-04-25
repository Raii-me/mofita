<script>
import Header from "../components/Header.vue";
import Footer from "../components/Footer.vue";

export default {
  components: {
    Header,
    Footer,
  },

  methods: {
    voltar() {
      this.$router.push("/");
    },
  },
};
</script>

<template>

  <main class="termos-pagina">
    <div class="documento">

      <header class="cabecalho-documento">
        <h1>Termos de <span>Uso</span></h1>
        <p class="versao">Reda+ • Plataforma de Correção • Versão 1.0 (2026)</p>
      </header>

      <div class="conteudo-documento">

        <div class="secao">
          <h2 class="secao-titulo">1. Aceitação dos Termos</h2>
          <p class="texto">
            Ao acessar e utilizar a plataforma <strong>Reda+</strong>, você concorda em cumprir e
            estar vinculado aos seguintes Termos de Uso. Este documento rege a relação entre a
            plataforma e o estudante. Se você não concordar com qualquer parte destes termos,
            não deverá utilizar nossos serviços.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">2. Descrição do Serviço</h2>
          <p class="texto">
            O Reda+ é uma plataforma online que oferece ferramentas para criação, envio e correção
            pedagógica de redações seguindo as 5 competências oficiais do ENEM. O objetivo é fornecer
            feedback técnico para a evolução da escrita do usuário.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">3. Cadastro e Elegibilidade</h2>
          <ul class="lista-topicos">
            <li><strong>Público:</strong> Destinado a estudantes. Menores de 18 anos devem utilizar a plataforma sob
              supervisão de um responsável.</li>
            <li><strong>Dados:</strong> O usuário compromete-se a fornecer informações verídicas no cadastro. A
              segurança da senha é de inteira responsabilidade do usuário.</li>
            <li><strong>Uso Pessoal:</strong> O acesso é individual e intransferível. O compartilhamento de conta pode
              resultar em suspensão imediata.</li>
          </ul>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">4. Planos e Pagamentos</h2>
          <p class="texto">
            A plataforma adota o modelo de <strong>Pagamento Único</strong> para planos pagos,
            garantindo acesso vitalício conforme as condições de cada oferta:
          </p>

          <div class="card-plano">
            <span class="plano-nome">Plano Gratuito</span>
            <span class="plano-preco">R$ 0,00</span>
          </div>
          <div class="card-plano">
            <span class="plano-nome">Plano Premium</span>
            <span class="plano-preco">R$ 29,00 (Único)</span>
          </div>
          <div class="card-plano">
            <span class="plano-nome">Plano Reda+</span>
            <span class="plano-preco">R$ 49,00 (Único)</span>
          </div>

          <p class="texto-obs">
            * O termo "vitalício" refere-se à duração da existência da plataforma online,
            sem cobrança de mensalidades futuras para as funcionalidades adquiridas.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">5. Responsabilidades e Garantias</h2>
          <p class="texto"><strong>O Reda+ garante:</strong></p>
          <ul class="lista-topicos">
            <li>Estabilidade técnica da plataforma e correção de falhas no sistema.</li>
            <li>Suporte ao usuário para dúvidas sobre o funcionamento das ferramentas.</li>
            <li>Correções baseadas nos critérios oficiais do ENEM vigentes.</li>
          </ul>
          <p class="texto"><strong>O Reda+ NÃO garante:</strong></p>
          <ul class="lista-topicos">
            <li><strong>Nota Final:</strong> A correção é uma ferramenta de treino. Não garantimos que a nota obtida na
              plataforma será a mesma nota atribuída pelo INEP no exame oficial.</li>
            <li><strong>Disponibilidade 100%:</strong> Instabilidades momentâneas por provedores de internet ou
              manutenção de servidores podem ocorrer.</li>
          </ul>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">6. Regras de Conduta</h2>
          <p class="texto">É estritamente proibido:</p>
          <ul class="lista-topicos">
            <li>O envio de textos que contenham discurso de ódio, conteúdo ilícito ou ofensas.</li>
            <li>A prática de plágio (copiar textos prontos da internet sem autoria própria).</li>
            <li>O uso de ferramentas de automação (bots) para burlar os limites dos planos.</li>
          </ul>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">7. Propriedade Intelectual</h2>
          <p class="texto">
            Todo o código, identidade visual, logotipos e textos da interface pertencem ao Reda+.
            O usuário mantém a autoria das redações enviadas, porém concede à plataforma o direito
            de processar esses dados para fins de correção e estatísticas de desempenho.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">8. Suporte e Contato</h2>
          <p class="texto">
            Para suporte técnico ou dúvidas financeiras, o usuário deve entrar em contato pelo
            e-mail oficial: <strong>suporte@redamais.com.br</strong>. O tempo médio de resposta
            é de até 24 horas úteis.
          </p>
        </div>

      </div>

      <footer class="rodape-documento">
        <button class="btn-voltar-termos" @click="voltar">← Voltar para a Home</button>
      </footer>

    </div>
  </main>

</template>

<style scoped>
@import "../assets/css/variaveis.css";

.termos-pagina {
  background-color: var(--branco2);
  color: var(--texto);
  line-height: 1.6;
  padding: 40px 20px;
  min-height: 100vh;
}

.documento {
  max-width: 900px;
  margin: 0 auto;
  background: var(--brancoPadrao);
  border-radius: var(--raio);
  box-shadow: var(--sombra-sm);
  border: 1px solid var(--borda-clara);
  overflow: hidden;
  animation: fadeIn 0.7s ease-out;
}

@keyframes fadeIn {
  from {
    opacity: 0;
    transform: translateY(12px);
  }

  to {
    opacity: 1;
    transform: translateY(0);
  }
}

.cabecalho-documento {
  background: linear-gradient(135deg, var(--azul-escuro) 0%, var(--azulPadrao) 100%);
  padding: 40px;
  text-align: center;
  color: var(--brancoPadrao);
}

.cabecalho-documento h1 {
  font-size: 32px;
  font-weight: 800;
}

.cabecalho-documento h1 span {
  color: var(--laranja-hover);
}

.versao {
  font-size: 13px;
  margin-top: 10px;
  opacity: 0.4;
}

.conteudo-documento {
  padding: 40px;
}

.secao {
  margin-bottom: 50px;
}

.secao-titulo {
  color: var(--azulPadrao);
  font-size: 18px;
  font-weight: 700;
  margin-bottom: 12px;
  display: flex;
  align-items: center;
  gap: 10px;
}

.secao-titulo::before {
  content: "";
  width: 4px;
  height: 18px;
  background: var(--laranjaPadrao);
  border-radius: 2px;
  flex-shrink: 0;
}

.texto {
  font-size: 15px;
  color: var(--texto-sec);
  margin-bottom: 15px;
  text-align: justify;
}

.texto strong {
  color: var(--texto);
}

.texto-obs {
  font-size: 13px;
  color: var(--texto-sec);
  margin-top: 10px;
}

.lista-topicos {
  padding-left: 20px;
  margin-bottom: 16px;
}

.lista-topicos li {
  font-size: 14.5px;
  color: var(--texto-sec);
  margin-bottom: 8px;
}

.card-plano {
  background: var(--branco2);
  border: 1px solid var(--borda-clara);
  border-radius: var(--radius-pequeno);
  padding: 15px 20px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin-bottom: 10px;
  transition: box-shadow var(--trans), transform var(--trans);
}

.card-plano:hover {
  box-shadow: var(--sombra-sm);
  transform: translateX(4px);
}

.plano-nome {
  font-weight: 700;
  font-size: 14px;
  color: var(--texto);
}

.plano-preco {
  color: var(--azulPadrao);
  font-weight: 800;
}

.rodape-documento {
  background: var(--brancoLeve);
  padding: 20px;
  text-align: center;
  border-top: 1px solid var(--borda-clara);
}

.btn-voltar-termos {
  background: none;
  border: none;
  color: var(--azulPadrao);
  font-weight: 600;
  font-size: 14px;
  cursor: pointer;
  font-family: "Poppins", sans-serif;
  transition: opacity var(--trans);
}

.btn-voltar-termos:hover {
  opacity: 0.7;
}

@media (max-width: 768px) {
  .conteudo-documento {
    padding: 20px;
  }

  .cabecalho-documento {
    padding: 30px 20px;
  }

  .cabecalho-documento h1 {
    font-size: 24px;
  }

  .card-plano {
    flex-direction: column;
    gap: 6px;
    text-align: center;
  }
}
</style>