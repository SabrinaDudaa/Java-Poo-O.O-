public class TestaContaBancaria {
    public static void main (String[]args){
        ContaBancaria conta1 = new ContaBancaria(123456, "Sabrina", 350);
        System.out.println(conta1.getNumConta() + conta1.getNome() + conta1.getSaldo());
        conta1.depositar(50);
        System.out.println("Novo saldo: " + conta1.getSaldo());

        conta1.sacar(150);
        System.out.println("Novo saldo: " + conta1.getSaldo());

        conta1.abrirConta("CC");
        System.out.println(conta1.getStatus());
    }
}
