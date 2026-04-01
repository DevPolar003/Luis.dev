
const modal = document.getElementById('modal-overlay');
const modalContent = document.querySelector('.modal-content');
const container = document.getElementById('post-container');


async function carregarPosts() {
    try {
        const resposta = await fetch('/api/posts');
        if (!resposta.ok) throw new Error("Erro na rede");

        const posts = await resposta.json();

        container.innerHTML = '';

        posts.forEach(post => {
            container.innerHTML += `
                <div class="custom-card card-custom-blog p-4 d-flex justify-content-between align-items-center" style="cursor: pointer;">
                    <h3 class="m-0">${post.titulo}</h3>
                    <span class="post-date text-muted">data: ${post.date}</span>
                </div>
            `;
        });
        console.log("Posts carregados com sucesso!");
    } catch (erro) {
        console.error("Erro ao buscar os posts:", erro);
    }
}

container.addEventListener('click', (e) => {
    const card = e.target.closest('.card-custom-blog');
    if (card) {
        modal.style.display = 'flex';
        modal.classList.add('justify-content-center', 'align-items-center');
    }
});


modal.addEventListener('click', () => {
    modal.style.display = 'none';
});
modalContent.addEventListener('click', (e) => e.stopPropagation());


document.addEventListener('DOMContentLoaded', carregarPosts);