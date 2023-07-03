package threads;

public class PingPong extends Thread{
    private Object lock;
    private String name;
    private int repitiation;

    public PingPong(Object lock, String name, int repitiation){
        this.lock = lock;
        this.name = name;
        this.repitiation = repitiation;
    }

    public void run(){
        synchronized(lock){
            while(repitiation>0) {
                System.out.println(name);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repitiation--;
            }
        }
    }
}

class Main{
    public static void main(String args[]){
        Object lock = new Object();
        PingPong th1 = new PingPong(lock,"ping",3);
        PingPong th2 = new PingPong(lock,"pong",3);

        th1.start();
        th2.start();
    }
}

