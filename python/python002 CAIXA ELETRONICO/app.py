# Váriaveis
usuario = "yago"
senha = 1234
saldo = 0.00

# Função que verifica o Login
def login(lusuario, lsenha):
    if lusuario == usuario and lsenha == senha:
        return True
    else:
        return False

# Função que só é executada se a verificação resultar em True
def principal():
    lusuario = input("Insira o Nome de Usuário: ")
    lsenha = input("Insira sua Senha: ")

    if login(usuario, senha):
        print("Login Efetuado com Sucesso, Selecione uma das Opções Abaixo: ")
        while True: 
            print("\n1. Verificar saldo") 
            print("2. Depósito") 
            print("3. Saque") 
            print("4. Sair") 
            opcao = input("Digite o número da opção desejada: ") 
            
            if opcao == "1": 
                verificar_saldo()   
            elif opcao == "2": 
                valor = float(input("Digite o valor do depósito: ")) 
                deposito(valor) 
            elif opcao == "3": 
                valor = float(input("Digite o valor do saque: ")) 
                saque(valor) 
            elif opcao == "4": 
                print("Saindo... Obrigado!") 
                principal()
            else: 
                print("Opção inválida! Tente novamente.")

    else:
        print("Usuário ou Senha Incorretos.")

# Função para verificar o saldo
def verificar_saldo():
    global saldo
    print(f"Seu saldo Atual é de: R$ {saldo:.2f}")

# Função para fazer deposito
def deposito(valor):
    global saldo 
    saldo += valor 
    print(f"Depósito de R$ {valor:.2f} realizado com sucesso! Seu novo saldo é: R$ {saldo:.2f}")

# Função para fazer saque
def saque(valor):
    global saldo 
    if valor <= saldo: 
        saldo -= valor 
        print(f"Saque de R$ {valor:.2f} realizado com sucesso! Seu novo saldo é: R$ {saldo:.2f}") 
    else: 
        print("Saldo insuficiente para realizar o saque.")


# Executa a Função Principal
principal()