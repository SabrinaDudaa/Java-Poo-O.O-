public class TestaPessoa {
    public static void main (String[]args) {
     Pessoa p1 = new Pessoa("Bruno", 1.75); // Instanciação
     Pessoa [] pessoas = new Pessoa[3];
     pessoas [0] = new Pessoa("Claudia", 1.90);
     pessoas [1] = new Pessoa("Bruna", 1.60);
     pessoas [2] = new Pessoa("Celeste", 1.69);
     int i = 0;
     while (i <= pessoas.length && pessoas [i] != null) {
        System.out.println(pessoas[i].getNome() + pessoas[i].getAltura());
        i++;
     }
     System.out.println(p1.getNome());
     System.out.println(p1.getAltura());
     System.out.println( "numero de pessoas atualizado: " + Pessoa.numeroPessoas);



     Pessoa p2 = new Pessoa("Sabrina", 1.52);

     System.out.println("Nome: " + p2.getNome());
     System.out.println("Altura: " + p2.getAltura());
     System.out.println("numero de pessoas atualizado: " + Pessoa.numeroPessoas);

     p2 = null;

     Pessoa.numeroPessoas--;
     System.out.println("numero de pessoas atualizado: " + Pessoa.numeroPessoas);
    }
}
