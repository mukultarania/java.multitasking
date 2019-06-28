public class UsingRunnable {
    public static void main(String[] a) throws InterruptedException {

        //Lambda Expression () - >
        Thread t1 = new Thread(() -> {           //Using Inner Class
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();  // Join to check is thread joined
        t2.join();
        System.out.println("Is thread alive :" + (t1.isAlive() && t2.isAlive()));
    }

}
