package u2;

public class MainAppU2 {
    public static void main(String[] args){
        System.out.println("Iniciando programa...");

        NumberThread numberRunnable = new NumberThread();
        MessageThread messageRunnable = new MessageThread();

        Thread numberThread = new Thread(numberRunnable);
        Thread messageThread = new Thread(messageRunnable);

        numberThread.start();
        messageThread.start();
    }
}

