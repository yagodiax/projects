package escola;

public class Escola {

    public static void main(String[] args) {
        aluno felipe = new aluno();
        
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        
        System.out.println("O aluno " + felipe.getNome() + " Tem " + felipe.getIdade() + " anos ");
    }
    
}
