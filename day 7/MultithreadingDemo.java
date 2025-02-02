public class MultithreadingDemo implements Runnable {
     String threadName;
    
    MultithreadingDemo(String name) {
        threadName = name;
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println(threadName + " finished executing.");
    }
    
    public static void main(String[] args) {
        MultithreadingDemo thread1 = new MultithreadingDemo("Thread 1");
        MultithreadingDemo thread2 = new MultithreadingDemo("Thread 2");
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        
        t1.start();
        t2.start();
    }
}