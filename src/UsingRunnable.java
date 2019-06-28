public class UsingRunnable {
    public static void main(String[] a) throws InterruptedException {

        //Lambda Expression () - >
        Thread t1 = new Thread(() -> {           //Using Inner Class , Passing (Runnable object, Thread Name)
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "T1");                   //Adding Name to thread
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "T2");

        System.out.println("Thread Name:\n" + t1.getName() + "\n" + t2.getName() + "\n");

        t1.start();
        t2.start();
        //ThreadMethods th = new ThreadMethods(t1);
        //th.setPrior(10);
        t1.join();  // Join to check is thread joined
        t2.join();
        System.out.println("Is thread alive :" + (t1.isAlive() && t2.isAlive()));
        //System.out.println(th.getPrior()+"\n"+th.getName());
    }

}
