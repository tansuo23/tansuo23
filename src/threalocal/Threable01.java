package threalocal;


/**
 * @author: 探索科技：建龙
 */
public class Threable01 {
    public static void main(String[] args) {
//        Instant now = Instant.MIN;
//        Instant instant = Instant.ofEpochSecond(1559895474L);
//        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
////        System.out.println(instant);
////        System.out.println(now);
//        System.out.println(zonedDateTime.getOffset());
//
//        Queue<String> q = new LinkedList<>();
//        q.offer("ee");
//        q.offer("com");
//        q.add("tansuo");
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println("-----------------------");
//        Vector vector = new Vector();
//        vector.add("tansuo");
//        vector.add("ff");
//        vector.add("tafhhnsuo");
//        vector.add("fddryt");
//        vector.clone();
//        System.out.println(vector);
//        PriorityQueue priorityQueue = new PriorityQueue();
//        priorityQueue.add("龙哥");
//        priorityQueue.add("龙兴雨");
//        priorityQueue.add("国立");
//        priorityQueue.add("贞灵");
//        System.out.println(priorityQueue.element());
        final Object o = new Object();
        char[] chars = "12345".toCharArray();
        char[] chars1 = "abcdf".toCharArray();
        new Thread(() -> {
            synchronized (o) {
                for (char q : chars) {
                    System.out.print(q);
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        new Thread(() -> {

            synchronized (o) {
                for (char n : chars1) {
                    System.out.print(n);
                    try {
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
