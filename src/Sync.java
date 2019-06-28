class Count {
    int count;

    public synchronized void increment() {   //Synchronized -> One thread at a time
        count++;
    }

    public void printCount() {
        System.out.println(this.count);
    }
}

public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        c.printCount();


    }

}
