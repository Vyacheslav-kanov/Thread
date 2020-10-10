public class Main {

    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("ThreadGroup");

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();

        Thread thread1 = new Thread(threadGroup, myThread1);
        Thread thread2 = new Thread(threadGroup, myThread2);
        Thread thread3 = new Thread(threadGroup, myThread3);
        Thread thread4 = new Thread(threadGroup, myThread4);

        myThread1.setName("Поток1");
        myThread2.setName("Поток2");
        myThread3.setName("Поток3");
        myThread4.setName("Поток4");

        try {
            System.out.println("Создаю потоки...");

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();

            Thread.sleep(10000);

            System.out.println("\nЗавершаю потоки\n");

            threadGroup.interrupt();

        } catch (InterruptedException e) {

        }
    }
}
