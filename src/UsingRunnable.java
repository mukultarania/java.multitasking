
class Stop implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hii");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Go implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class UsingRunnable {
    public static void main(String[] a) {
        Runnable go = new Go();
        Runnable stop = new Stop();

        Thread t1 = new Thread(go);
        Thread t2 = new Thread(stop);
        t1.start();
        t2.start();
    }

}
