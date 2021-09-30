package demo1;

public class Admn {
    public static void main(String[] args) {
        new Thread(new Runnable () {
            @Override
            public void run() {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }
            }
        }).start();
    }
}
