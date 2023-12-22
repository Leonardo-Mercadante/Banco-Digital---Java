public class ContaSalario extends Conta {

    public ContaSalario(int numero, int agencia, String banco, double saldo, double depositar, double sacar) {
        super(numero, agencia, banco, saldo);
    }

    private int limite;

    public int getLimite() {
        return limite;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void sacar(double valor){
        if (this.limite == 2) {
            System.out.println("Atingiu o valor máximo de saques");
        }
        else{
            System.out.println("Saques Disponiveis: ");
            this.limite --;
            this.saldo -= valor;
        }
       
    } 
    public void depositar(double valor){
        this.saldo +=valor;
    }




}