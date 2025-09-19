public class Pessoa implements Runnable{
    Thread thread;
    private ContaBancaria conta = new ContaBancaria();

    public Pessoa(String nome, ContaBancaria conta){
        thread = new Thread(this, nome);
        this.conta = conta;
        thread.run();
    }

    public void run() {
        System.out.println(thread.getName() + " Iniciando, saldo total: " + conta.getSaldo());

        for(int i = 0; i < 30; i++){
            conta.sacar(200);
            System.out.println(thread.getName() + " Sacando, saldo total: " + conta.getSaldo());
            conta.depositar(200);
            System.out.println(thread.getName() + " Depositando, saldo total: " + conta.getSaldo());
        }

        System.out.println(thread.getName() + " Saldo final: " + conta.getSaldo());
        System.out.println();
    }
}
