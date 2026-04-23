const apiKey = "AIzaSyBdLE8rLWhTd0L9bK0Lk9EUnE2c654p4ks"; 
const url = `https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key=${apiKey}`;

async function sendMessage() {
    var messageInput = document.getElementById('msg-input');
    var userText = messageInput.value;

    if (!userText) {
        messageInput.style.border = '1px solid red';
        return;
    }

    messageInput.style.border = 'none';
    var status = document.getElementById('status');
    var btnSubmit = document.getElementById('btn-submit');

    status.style.display = 'block';
    status.innerHTML = 'Aguarde a resposta...';
    btnSubmit.disabled = true;
    messageInput.disabled = true;

    try {
        const response = await fetch(url, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({
                contents: [{ parts: [{ text: userText }] }]
            })
        });

        const data = await response.json();

        if (response.ok) {
            const botResponse = data.candidates[0].content.parts[0].text;
            showHistoric(userText, botResponse);
            messageInput.value = ''; 
        } else {
            console.error("Erro na API:", data);
            alert("Erro na API: " + (data.error?.message || "Erro desconhecido"));
        }
    } catch (e) {
        console.error("Erro de rede:", e);
        alert("Erro de conexão.");
    } finally {
        status.style.display = 'none';
        btnSubmit.disabled = false;
        messageInput.disabled = false;
        messageInput.focus();
    }
}


function showHistoric(userMsg, botMsg) {
    var historic = document.getElementById('historic');
    var boxUser = document.createElement('div');
    boxUser.className = 'box-my-message';
    boxUser.innerHTML = `<p class="my-message">${userMsg}</p>`;
    historic.appendChild(boxUser);

    var boxBot = document.createElement('div');
    boxBot.className = 'box-response-message';
    boxBot.innerHTML = `<p class="chat-message">${botMsg}</p>`;
    historic.appendChild(boxBot);

    historic.scrollTop = historic.scrollHeight;
}

