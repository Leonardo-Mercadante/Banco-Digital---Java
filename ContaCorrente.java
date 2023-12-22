public class ContaCorrente extends Conta{

    private double chequeEspecial;
    private double limiteEspecial = 1500.00;


    public ContaCorrente(int numero, int agencia, String banco, double saldo, double depositar, double sacar, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;

    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                ", limiteEspecial=" + limiteEspecial +
                '}';
    }

    public double getSaldo(){
        return this.chequeEspecial + this.limiteEspecial + this.saldo;
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
