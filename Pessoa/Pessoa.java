public class Pessoa {
   private String nome;
   private double altura;
   static int numeroPessoas = 0;

    public String getNome () {
            return this.nome;
    }

    public double getAltura (){
            return this.altura;
    }


        public void setNome (String nome) {
            this.nome = nome;   
        }

        public void setAltura (double altura){
            this.altura = altura;
        }


        public Pessoa (String nome, double altura) {
            numeroPessoas++;
            this.nome = nome;  
            this.altura = altura;
        }
}
