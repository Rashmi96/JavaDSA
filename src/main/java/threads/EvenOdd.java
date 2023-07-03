package threads;

public class EvenOdd extends Thread{
    private Object lock;
    private String name;
    private int repitiation;

    public EvenOdd(Object lock, String name, int repitiation){
        this.lock = lock;
        this.name = name;
        this.repitiation = repitiation;
    }

    public void run(){
        synchronized(lock){
            while(repitiation<=5) {
                System.out.println(name + " " + repitiation);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repitiation = repitiation+2;
            }
        }
    }
}

class EvenOddMain{
    public static void main(String args[]){
        Object lock = new Object();
        EvenOdd th1 = new EvenOdd(lock,"even",2);
        EvenOdd th2 = new EvenOdd(lock,"odd",1);

        th2.start();
        th1.start();
    }
}
