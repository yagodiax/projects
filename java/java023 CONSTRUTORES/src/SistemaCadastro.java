public class SistemaCadastro {

    public static void main(String[] args) {
        
        Pessoa marcos = new Pessoa("Marcos");
        
        marcos.setEndereco("Avenida São Paulo");
        marcos.setCpf("123.456.787-15");
        
        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
    
}
