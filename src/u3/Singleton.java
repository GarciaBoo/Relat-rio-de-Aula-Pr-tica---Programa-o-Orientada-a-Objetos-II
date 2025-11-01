package u3;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Instância Singleton criada!");
    }


    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void mostrarMensagem(String mensagem){
        System.out.println("Mensagem: " + mensagem);
    }
}
