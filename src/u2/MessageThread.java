package u2;

public class MessageThread implements Runnable {
    @Override
    public void run() {
        String[] messages = {"Hello World!", "Linux!", "Thread Working!", "Java is Fun!"};
        for (String message : messages) {
            System.out.println("Messagem: " + message);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
