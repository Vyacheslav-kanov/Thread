import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Всем привет!");
            count++;
        }
        return count;
    }
}
