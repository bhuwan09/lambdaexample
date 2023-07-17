package lambdapractise;

public class ThreadDemo {
    public static void main(String[] args) {
        // First thread: Thread JOHN

         Runnable thread1 =()-> {
             //this is body of thread
             //stuff
             for(int i = 1; i<= 10; i++){
                 System.out.println("Value of i is " + i);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }
             }
         };

         Thread t = new Thread(thread1);
         t.setName("Thread1");
         t.start();


    }
}
