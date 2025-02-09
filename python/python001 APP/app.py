import tkinter as tk
from PIL import Image, ImageTk

def abrir_nova_janela():
    # Esconde a janela principal
    root.withdraw()
    # Cria a nova janela
    nova_janela = tk.Toplevel(root)
    nova_janela.title("Página Inicial")
    nova_janela.geometry(f"{window_width}x{window_height}+{position_x}+{position_y}")
    # Adiciona um rótulo à nova janela
    label = tk.Label(nova_janela, text="Bem-vindo à página inicial!")
    label.pack(pady=20)
    # Adiciona um botão para fechar a nova janela e reexibir a janela principal
    button = tk.Button(nova_janela, text="Fechar", command=lambda: (nova_janela.destroy(), root.deiconify()))
    button.pack(pady=10)

# Cria a tela de login
root = tk.Tk()
root.title("Tela de Login")
root.configure(bg='#ebe5f3')  # Define a cor de fundo

# Define o tamanho da janela
window_width = 800
window_height = 500
root.geometry(f"{window_width}x{window_height}")

# Obtém as dimensões da tela
screen_width = root.winfo_screenwidth()
screen_height = root.winfo_screenheight()

# Calcula a posição x e y para centralizar a janela
position_x = int((screen_width / 2) - (window_width / 2))
position_y = int((screen_height / 2) - (window_height / 2))

# Define a geometria da janela com a posição centralizada
root.geometry(f"{window_width}x{window_height}+{position_x}+{position_y}")

# Configura a estrutura da página
frame = tk.Frame(root, bg='#ebe5f3')
frame.pack(padx=20, pady=20)

# Adiciona a imagem à esquerda e centraliza verticalmente
imagem = Image.open('C:/Users/yagod/OneDrive/Área de Trabalho/PY/img/logo.png')
imagem = imagem.resize((200, 200), Image.LANCZOS)  # Ajusta o tamanho da imagem
imagem_tk = ImageTk.PhotoImage(imagem)
label_imagem = tk.Label(frame, image=imagem_tk, bg='#ebe5f3')
label_imagem.image = imagem_tk
label_imagem.grid(row=0, column=0, padx=10, pady=10, rowspan=2, sticky='ns')

# Adiciona o formulário de login à direita da imagem
label_email = tk.Label(frame, text="Email:", bg='#ebe5f3')
label_email.grid(row=0, column=1, padx=10, pady=5, sticky='e')
entry_email = tk.Entry(frame)
entry_email.grid(row=0, column=2, padx=10, pady=5)

label_senha = tk.Label(frame, text="Senha:", bg='#ebe5f3')
label_senha.grid(row=1, column=1, padx=10, pady=5, sticky='e')
entry_senha = tk.Entry(frame, show='*')
entry_senha.grid(row=1, column=2, padx=10, pady=5)

# Botão de login
button_login = tk.Button(frame, text="Login", command=abrir_nova_janela)
button_login.grid(row=2, column=1, columnspan=2, pady=10)

# Inicia o loop de eventos da GUI
root.mainloop()
