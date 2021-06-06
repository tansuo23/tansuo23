package demo1;

/**
 * @Author jinglong
 * @Date 2021/1/1 0:10
 * @Version 1.0
 */
public class Disgusted {
    public static void main(String[] args) {
        int fun = fun(31);
        System.out.println(fun);

    }
    public static int fun(int num){
        int reult = 1;
        if(num > 1)
        reult = num * fun(num - 1);
        return reult;

    }
}
