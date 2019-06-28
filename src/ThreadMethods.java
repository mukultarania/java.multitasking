public class ThreadMethods {
    private Thread t;
    private String name = "";
    private int prior = 0;

    ThreadMethods(Thread t) {
        this.t = t;
    }

    public String getName() {
        return (this.t.getName());
    }

    public void setName(String name) {
        this.name = name;
        this.t.setName(name);
    }

    public int getPrior() {
        return (this.t.getPriority());
    }

    public void setPrior(int prior) {
        this.prior = prior;
        this.t.setPriority(prior);
    }
}
