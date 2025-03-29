public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String cor;

    public Iphone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    @Override
    public void tocar() {
        System.out.println("Música está tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        System.out.println("Música parada.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Acessando a página: " + url);
    }

    @Override
    public void pesquisar(String termo) {
        System.out.println("Pesquisando por: " + termo);
    }

    public void mostrarInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
    }
}
