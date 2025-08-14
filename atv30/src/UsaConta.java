public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        Pessoa p1 = new Pessoa("Joao", conta);
        Pessoa p2 = new Pessoa("Rafael", conta);

        try{
            p1.thread.join();
            p2.thread.join();
        }catch (InterruptedException exc){
            System.out.println("Thread interrompida");
        }
    }
}
