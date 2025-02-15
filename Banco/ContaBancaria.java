public class ContaBancaria {
    private int numConta;
    private String nome;
    private double saldo;
    static int numInstancias = 0;
    private boolean status;

    public boolean getStatus(){
        return this.status;
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setConta(int numConta){
        this.numConta = numConta;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo =  saldo;
    }

    ContaBancaria(int numConta, String nome, double saldo){
        numInstancias++;
        this.numConta = numConta;
        this.nome = nome;
        this.saldo =  saldo;
        this.status = false;
    }

    public void depositar (double n){
        saldo += n;
    }

    public void sacar (double v){
        if (saldo > 0 && v <= saldo){
            saldo -= v;
        }

        else{
            System.out.println("Não é possível sacar esse valor");
        }
    }

    public void abrirConta(String t){
        status = true;

        if (t == "CC"){
            System.out.println("Conta Corrente");
        }

        if (t == "CP"){
            System.out.println("Conta Poupança");
        }
    }

}
