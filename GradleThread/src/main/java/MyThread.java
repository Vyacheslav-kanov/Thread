public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(3000);
                System.out.println(getName() + " Всем привет !");
            }
        } catch (InterruptedException e) {

        }finally {
            System.out.println(getName() + " Завершён");
        }
    }
}
