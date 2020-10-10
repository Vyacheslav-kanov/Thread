import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        List<MyCallable> quests = new ArrayList<>();

        quests.add(new MyCallable());
        quests.add(new MyCallable());
        quests.add(new MyCallable());
        quests.add(new MyCallable());

        try {
            System.out.println("Создаю потоки...");

            int result = threadPool.invokeAny(quests);

            System.out.println("\nЗачи закончены!\n");
            System.out.println(result);

            threadPool.shutdown();
            System.out.println("Пул завершён!");

        } catch (InterruptedException e) {

        } catch (ExecutionException e) {

        }
    }
}
