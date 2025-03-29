public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone("iPhone 8", "Preto");

        meuIphone.tocar();

        meuIphone.fazerChamada("123456789");

        meuIphone.navegar("www.apple.com");

        meuIphone.mostrarInformacoes();
    }
}