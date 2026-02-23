package antipadrao;

public class Cliente {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void emprestar(double emprestimo){
        saldo += emprestimo;
    }
}



