package deomo2;


import java.util.concurrent.*;

public class Start {
    ExecutorService service = Executors.newFixedThreadPool(5);
    ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newSingleThreadExecutor();
    AbstractExecutorService executorService = (AbstractExecutorService) Executors.defaultThreadFactory();
    public class Loadfile implements Callable<String>{
        private final  String fileName;
        public Loadfile(String fileName){
            this.fileName = fileName;
        }
        @Override
        public String call() throws Exception {
            return " ";
        }
    }
    public static void main(String[] args){

    }
}
