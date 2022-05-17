public class Main {

    public static void main(String[] args) {
        Cliente Mirelly = new Cliente();
        Mirelly.setNome("Mirelly");

        Conta cc = new ContaCorrente(Mirelly);
        Conta poupanca = new ContaPoupanca(Mirelly);

        cc.depositar(1200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}
