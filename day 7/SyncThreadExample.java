public class SyncThreadExample implements Runnable {
    String threadName;
    int count;

   public SyncThreadExample(String name, int count) {
       this.threadName = name;
       this.count = count;
   }

   public void run() {
       for (int i = 1; i <= count; i++) {
           System.out.println(threadName + ": Count " + i);
           try {
               Thread.sleep(5000);
           } catch (InterruptedException e) {
               System.out.println("Thread " + threadName + " interrupted.");
           }
       }
       System.out.println("Thread " + threadName + " exiting.");
   }

   public static void main(String[] args) {
       SyncThreadExample thread1 = new SyncThreadExample("Thread 1", 5);
       SyncThreadExample thread2 = new SyncThreadExample("Thread 2", 5);

       Thread t1 = new Thread(thread1);
       Thread t2 = new Thread(thread2);

       t1.start();
       t2.start();
   }
}