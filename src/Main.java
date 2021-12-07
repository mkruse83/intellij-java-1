public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world changed! And another change.");
        while (true) {
            try {
                Thread.sleep(10000);
                System.out.println("Tick Java 1");
            } catch (InterruptedException e) {
                // silent catch
            }
        }
    }
}
