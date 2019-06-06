public class Exercicio1 {
    public static void main(String[] args) {

      /*Conta hamilton = new Conta();
        hamilton.deposito(1500);
        hamilton.saque(1400);*/

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente(); //instanciar (criar um objeto de uma classe).
        cliente1.setNome("João");
        cliente1.setSobreNome("Carlos");
        cliente2.setNome("Guilherme");
        cliente2.setSobreNome("Paulo");

        Conta contaCliente1 = new Conta();
        Conta contaCliente2 = new Conta();
        contaCliente1.setNumeroDaConta(2600);
        contaCliente1.setSaldo(1500);
        contaCliente1.setTitular(cliente1);

//        System.out.println("O nome do cliente da conta 1 é: " + contaCliente1.getTitular().getNome());

        contaCliente2.setNumeroDaConta(3000);
        contaCliente2.setSaldo(1000);
        contaCliente2.setTitular(cliente2);

        contaCliente1.deposito(1000);
        System.out.println("o valor do saldo " + contaCliente1.getSaldo());

        contaCliente1.saque(400);
        System.out.println("o valor do saldo " + contaCliente1.getSaldo());

        contaCliente2.deposito(600);
        System.out.println("o valor do salo " + contaCliente2.getSaldo());

        contaCliente2.saque(800);
        System.out.println("o valor do saldo " + contaCliente2.getSaldo());
    }

}
