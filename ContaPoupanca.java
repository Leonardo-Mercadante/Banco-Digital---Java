public class ContaPoupanca extends Conta{

    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversario, double taxaDeJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getSaldo(){
        return this.saldo + this.taxaDeJuros*this.saldo;
    }

    public void sacar(Double valor) {
        if(saldo > this.getSaldo()) {
            System.out.println("Saldo indisponivel para o valor de saque");
        }
        else {
            this.saldo-=saldo;

        }       
        
    }

    public void depositar(Double valor) {
        this.saldo+=saldo;
        
    }


}
