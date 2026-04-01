let cards = document.querySelectorAll('.card-custom-blog');
let modal = document.getElementById('modal-overlay');
let modalContent = document.querySelector('.modal-content');

cards.forEach(card => {
    card.addEventListener('click', () => {
        modal.style.display = 'flex';
        modal.classList.add('justify-content-center', 'align-items-center');
    });
});

modal.addEventListener('click', () => {
    modal.style.display = 'none';
    modal.classList.remove('justify-content-center', 'align-items-center');

});

modalContent.addEventListener('click', (e) => {
    e.stopPropagation();
});