const buttons = document.querySelectorAll('.btn-open');
const overlay = document.getElementById('overlay');
const modal = document.getElementById('modal');

buttons.forEach(btn => {
    btn.addEventListener('click', () => {
        overlay.classList.add('active');
        modal.classList.add('active');
    });
});

// fecha o modal se clicar fora
overlay.addEventListener('click', () => {
    overlay.classList.remove('active');
    modal.classList.remove('active');
});