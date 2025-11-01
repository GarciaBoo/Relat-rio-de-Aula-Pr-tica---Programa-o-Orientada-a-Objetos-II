package u3;

public class MainAppU3 {
    public static void main(String[] args) {
        System.out.println("Teste do Padrão Singleton");

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1.equals(singleton2)) {
            System.out.println("As referências são iguais. Apenas uma instância foi criada.");
        } else {
            System.out.println("Instâncias diferentes! Algo está errado.");
        }

        singleton1.mostrarMensagem("Olá do Singleton!");
        singleton2.mostrarMensagem("Mais uma mensagem...");
    }
}

