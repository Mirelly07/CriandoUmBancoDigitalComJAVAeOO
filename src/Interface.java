public interface Interface {

        void sacar(double valor);

        void depositar(double valor);

        void transferir(double valor, Interface  contaDestino);

        void imprimirExtrato();
    }

