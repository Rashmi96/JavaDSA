package threads;

public class MultipleThreads extends Thread{

    private Object lock;
    private String name;
    private int repitiation;

    public MultipleThreads(Object lock, String name, int repitiation){
        this.lock = lock;
        this.name = name;
        this.repitiation = repitiation;
    }

    public void run(){
        synchronized(lock){
            while(repitiation<=10) {
                System.out.println(name + " " + repitiation);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repitiation = repitiation+3;
            }
        }
    }
}

class MultipleThreadMain{
    public static void main(String args[]){
        Object lock = new Object();
        MultipleThreads th2 = new MultipleThreads(lock,"even",2);
        MultipleThreads th1 = new MultipleThreads(lock,"odd",1);
        MultipleThreads th3 = new MultipleThreads(lock,"third",3);


        th1.start();
        th2.start();
        th3.start();
    }
}
