package threads.deadlock;

public class TestDeadLock {
    public static void main(String[] args) {
        DeadLockRisk dl = new DeadLockRisk();
        Thread t1 = new Thread(() -> {
            dl.read();
        });
        Thread t2 = new Thread(() -> {
            dl.write(1,2);
        });

        t1.start();
        t2.start();
    }
}
