<script setup>
import { onMounted, ref } from "vue";
import Chart from "chart.js/auto";

const canvasRef = ref(null);

onMounted(() => {
  if (!canvasRef.value) return;

  const ctx = canvasRef.value.getContext("2d");

  const gradient = ctx.createLinearGradient(0, 0, 0, 350);
  gradient.addColorStop(0, 'rgba(59, 91, 255, 0.20)');
  gradient.addColorStop(1, 'rgba(59, 91, 255, 0)');

  new Chart(ctx, {
    type: 'line',
    data: {
      labels: ['Text', 'Text', 'Text', 'Text', 'Text'],
      datasets: [{
        data: [750, 910, 800, 600, 1000],
        borderColor: '#3b5bff',
        backgroundColor: gradient,
        borderWidth: 3,
        tension: 0.4,
        fill: true,

        // 🔵 Pontos
        pointBackgroundColor: '#3b5bff',
        pointBorderColor: '#fff',
        pointBorderWidth: 2,
        pointRadius: 5,
        pointHoverRadius: 6
      }]
    },
    options: {
      responsive: true,
      maintainAspectRatio: false,

      plugins: {
        legend: {
          display: false
        },
        tooltip: {
          backgroundColor: '#1e1e2f',
          padding: 10,
          cornerRadius: 8,
          displayColors: false
        }
      },

      scales: {
        x: {
          grid: {
            display: true,
            color: 'rgba(0,0,0,0.05)',
            drawBorder: false
          },
          ticks: {
            color: '#9aa0ac',
            font: {
              size: 12
            }
          }
        },
        y: {
          min: 500,
          max: 1000,
          ticks: {
            stepSize: 100,
            color: '#9aa0ac'
          },
          grid: {
            color: 'rgba(0,0,0,0.05)',
            drawBorder: false
          }
        }
      }
    }
  });
});
</script>

<template>
  <div style="height: 300px;">

    <canvas ref="canvasRef"></canvas>
  </div>
</template>