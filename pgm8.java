class MyThread extends Thread {
    public MyThread(String threadName) {
        super(threadName);
        System.out.println("Constructor: Base class constructor invoked for " + getName());
        start();
    }
    
    @Override 
    public void run() {
        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("-->Child Thread[" + getName() + "]execution count: " + i);
                Thread.sleep(300); // Added sleep so InterruptedException can actually happen
            }
        } 
        catch (InterruptedException e) {
            System.out.println("Child thread was interrupted.");
        }
        System.out.println("--> Child Thread [" + getName() + "] finished execution");
    }
}

public class pgm8 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        
        // Fixed: Instantiating without an unused variable warning
        new MyThread("WorkerThread"); 

        try {
            for(int i = 1; i <= 5; i++) {
                System.out.println("Main thread execution count: " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        
        System.out.println("Main thread finished execution");
    }
}