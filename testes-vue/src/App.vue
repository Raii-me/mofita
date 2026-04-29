<script>
import Header from "./components/Header.vue"
import Footer from "./components/Footer.vue"

export default {
  components: { 
    Header 
    , Footer
  }
}
</script>

<template>


  <RouterView />
</template>

<style>
* {
    margin: 0px;
    padding: 0px;
    font-family: 'Poppins', sans-serif;
    box-sizing: border-box;
}
</style>

