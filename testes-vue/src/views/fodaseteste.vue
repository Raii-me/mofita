<script>
import Header from "../components/layout/Header.vue"
import Footer from "../components/layout/Footer.vue"
import Chatbot from "../components/features/Chatbot.vue"


export default {
  components: { 
    Header 
    , Footer
    , Chatbot

  }
}
</script>

<template>

<Header />

<body>
    <div class="fodase">
    <div class="caixa-teste1">1</div>
    <div class="caixa-teste2">2</div>
    </div>


</body> 

  <Chatbot />
 <Footer />
</template> 


<style>

body{
    height: 100vh;
}

.fodase{
    width: 100%;
    height: 100vh;
    display: flex;
    justify-content: center;
    align-items: center;
    gap: 20px;
}

.caixa-teste1{
    width: 200px;
    height: 200px;
    background-color: var(--teste);
}
.caixa-teste2{
    width: 200px;
    height: 200px;
    background-color: var(--azulPadrao);
}

</style>