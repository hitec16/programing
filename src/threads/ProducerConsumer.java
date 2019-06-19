package threads;

import java.util.LinkedList;

public class ProducerConsumer {

    public static void main(String[] args) throws InterruptedException {
    final PC pc = new PC();
    Thread t1 = new Thread(() -> {
        try {
            pc.produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    Thread t2 = new Thread(() -> {
        try {
            pc.consume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    public static class PC {

        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        public void produce() throws InterruptedException {
            int value = 0;
            while (true){
                synchronized (this){
                    if (list.size() == capacity)
                        wait();

                    System.out.println("Produced value " + value);
                    list.add(value);
                    value++;
                    notify();
                    Thread.sleep(1000);// this is just to show logs slower
                }
            }
        }

        public void consume() throws InterruptedException {
            while(true){
                synchronized (this){
                    if(list.isEmpty())
                        wait();

                    int val = list.removeFirst();
                    System.out.println("Consumed value: " +val);

                    notify();
                    Thread.sleep(1000);
                }
            }
        }

    }
}
