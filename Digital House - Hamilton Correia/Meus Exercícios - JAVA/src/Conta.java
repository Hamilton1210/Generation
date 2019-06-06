public class Conta {
    private double numeroDaConta;
    private double saldo;
    private Cliente titular;

    public void deposito(double dinheiro) {
        this.saldo += dinheiro;
        System.out.printf("Foi realizado um deposito " + dinheiro);
    }

    public void saque(double dinheiro) {
        if (dinheiro > saldo) {
            System.out.println("saldo insuficiente");
        } else {
            this.saldo -= dinheiro;
            System.out.println("Foi realizado um saque " + dinheiro);
        }
    }

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(double numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}