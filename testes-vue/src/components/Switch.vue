<script setup>
const props = defineProps({
  modelValue: Boolean
})

const emit = defineEmits(['update:modelValue'])

function toggle() {
  emit('update:modelValue', !props.modelValue)
}
</script>

<template>
  <div 
    class="toggle" 
    :class="{ ativo: props.modelValue }"
    @click="toggle"
  >
    <div class="bolinha"></div>
  </div>
</template>

<style scoped>
.toggle {
  width: 50px;
  height: 26px;
  background: #ccc;
  border-radius: 20px;
  position: relative; /* IMPORTANTE */
  cursor: pointer;
  transition: background 0.3s ease;
}

.bolinha {
  position: absolute; /* IMPORTANTE */
  top: 3px;
  left: 3px;

  width: 20px;
  height: 20px;
  background: white;
  border-radius: 50%;

  transition: transform 0.3s ease;
}

/* estado ativo */
.toggle.ativo {
  background: var(--laranjaPadrao);
}

.toggle.ativo .bolinha {
  transform: translateX(24px);
}
</style>