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
      this.$router.back("/");
    },
  },
};
</script>

<template>
  <main class="politica-pagina">
    <div class="documento">
      <header class="cabecalho-documento">
        <h1>Política de <span>Privacidade</span></h1>
        <p class="versao">Reda+ • Plataforma de Correção • Versão 1.0 (2026)</p>
      </header>

      <div class="conteudo-documento">
        <div class="secao">
          <h2 class="secao-titulo">1. Introdução</h2>
          <p class="texto">
            A sua privacidade é muito importante para nós. O
            <strong>Reda+</strong> é uma plataforma educacional que tem como
            objetivo ajudar estudantes a melhorar suas redações por meio de
            tecnologia e inteligência artificial.
          </p>
          <p class="texto">
            Esta Política de Privacidade explica de forma clara:
          </p>
          <ul class="lista-topicos">
            <li>Quais dados coletamos</li>
            <li>Como usamos esses dados</li>
            <li>Como protegemos suas informações</li>
          </ul>
          <p class="texto">
            Ao utilizar o Reda+, você concorda com as práticas descritas neste
            documento.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">2. Dados que Coletamos</h2>
          <p class="texto">
            Coletamos apenas os dados necessários para o funcionamento da
            plataforma:
          </p>

          <p class="subtitulo-grupo">Dados fornecidos pelo usuário:</p>
          <ul class="lista-topicos">
            <li>Nome completo</li>
            <li>E-mail</li>
            <li>Senha (criptografada)</li>
            <li>Redações enviadas</li>
          </ul>

          <p class="subtitulo-grupo">Dados gerados pelo uso:</p>
          <ul class="lista-topicos">
            <li>Histórico de redações</li>
            <li>Notas e correções</li>
            <li>Desempenho do usuário</li>
          </ul>

          <p class="texto">
            Esses dados são essenciais para que o sistema funcione corretamente
            e ofereça feedback personalizado.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">3. Como Usamos Seus Dados</h2>
          <p class="texto">Seus dados são utilizados para:</p>
          <ul class="lista-topicos">
            <li>Permitir login e acesso à plataforma</li>
            <li>Corrigir automaticamente suas redações com IA</li>
            <li>Gerar feedbacks personalizados</li>
            <li>Mostrar evolução no desempenho</li>
            <li>Melhorar a qualidade do sistema</li>
          </ul>
          <div class="destaque-alerta">
            <span></span>
            <p>
              <strong>Importante:</strong> Seus dados não são vendidos ou
              compartilhados para fins comerciais.
            </p>
          </div>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">4. Compartilhamento de Dados</h2>
          <p class="texto">
            O Reda+ não compartilha seus dados pessoais com terceiros, exceto
            quando necessário para:
          </p>
          <ul class="lista-topicos">
            <li>Cumprir obrigações legais</li>
            <li>Garantir funcionamento técnico da plataforma</li>
          </ul>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">5. Segurança das Informações</h2>
          <p class="texto">
            Adotamos medidas de segurança para proteger seus dados:
          </p>
          <ul class="lista-topicos">
            <li>Criptografia de senha</li>
            <li>Controle de acesso</li>
            <li>Proteção contra acessos não autorizados</li>
          </ul>
          <p class="texto">
            Mesmo assim, nenhum sistema é 100% seguro, então recomendamos que
            você também proteja suas informações.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">6. Direitos do Usuário</h2>
          <p class="texto">Você pode, a qualquer momento:</p>
          <ul class="lista-topicos">
            <li>Acessar seus dados</li>
            <li>Atualizar suas informações</li>
            <li>Solicitar exclusão da conta</li>
          </ul>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">7. Uso de Inteligência Artificial</h2>
          <p class="texto">O Reda+ utiliza Inteligência Artificial para:</p>
          <ul class="lista-topicos">
            <li>Corrigir redações</li>
            <li>Identificar erros</li>
            <li>Sugerir melhorias</li>
          </ul>
          <p class="texto">
            A IA funciona como ferramenta de apoio,
            <strong>não substituindo professores ou corretores humanos.</strong>
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">8. Atualizações desta Política</h2>
          <p class="texto">
            Esta política pode ser atualizada a qualquer momento. Sempre que
            isso acontecer, a data de atualização será informada nesta página.
          </p>
        </div>

        <div class="secao">
          <h2 class="secao-titulo">9. Contato</h2>
          <p class="texto">
            Em caso de dúvidas, entre em contato com o suporte da plataforma
            pelo e-mail:
            <strong>suporte@redamais.com.br</strong>. O tempo médio de resposta
            é de até 24 horas úteis.
          </p>
        </div>
      </div>

      <footer class="rodape-documento">
        <button class="btn-voltar" @click="voltar">← Voltar para a Home</button>
      </footer>
    </div>
  </main>
</template>

<style scoped>
@import "../assets/css/variaveis.css";

.politica-pagina {
  background-color: var(--branco);
  color: var(--texto);
  line-height: 1.6;
  padding: 40px 20px;
  min-height: 100vh;
}

.documento {
  max-width: 900px;
  margin: 0 auto;
  background: var(--branco);
  border-radius: var(--raio);
  box-shadow: var(--sombra-md);
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
  background: linear-gradient(135deg,
      var(--azul-escuro) 0%,
      var(--azulPadrao) 100%);
  padding: 40px;
  text-align: center;
  color: var(--branco);
}

.cabecalho-documento h1 {
  font-size: 32px;
  font-weight: 800;
}

.cabecalho-documento h1 span {
  color: var(--laranjaPadrao);
}

.versao {
  font-size: 13px;
  margin-top: 10px;
  opacity: 0.4;
  color: var(--branco);
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

.subtitulo-grupo {
  font-size: 14px;
  font-weight: 700;
  color: var(--texto);
  margin-bottom: 8px;
  margin-top: 4px;
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

.destaque-alerta {
  display: flex;
  align-items: flex-start;
  gap: 12px;
  background: var(--branco);
  border-left: 4px solid var(--laranjaPadrao);
  border-radius: var(--radius-pequeno);
  padding: 14px 18px;
  margin-top: 8px;
}

.destaque-alerta span {
  font-size: 18px;
  line-height: 1.4;
}

.destaque-alerta p {
  font-size: 14.5px;
  color: var(--texto-sec);
  margin: 0;
}

.destaque-alerta p strong {
  color: var(--texto);
}

.rodape-documento {
  background: var(--brancoLeve);
  padding: 20px;
  text-align: center;
  border-top: 1px solid var(--borda-clara);
}

.btn-voltar {
  background: none;
  border: none;
  color: var(--azulPadrao);
  font-weight: 600;
  font-size: 14px;
  cursor: pointer;
  font-family: "Poppins", sans-serif;
  transition: opacity var(--trans);
}

.btn-voltar:hover {
  opacity: 0.7;
}

.texto strong {
  color: var(--laranjaPadrao);
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
}
</style>
