 
public class TestaConta { 
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(33,02,"Banco cc1", 500,26, 0.01, 0);
        System.out.println("O saldo da conta corrente é R$"+cc1.getSaldo());

        ContaPoupanca p1 = new ContaPoupanca(33,3,"Banco CCC", 10.00,20,0.05);
        System.out.println("O saldo da conta poupança é R$"+p1.getSaldo());

        ContaSalario cs1 = new ContaSalario(35, 5, "Banco DDD", 1000.00, 500.00, 2000.00);
        System.out.println("O saldo da conta Salário é R$:"+cs1.getSaldo());
       

    }
}

