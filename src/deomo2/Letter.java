package deomo2;

public class Letter {
    public static void main(String[] args) {
        int fu = fu(5);
        System.out.println(fu);
    }
    public static int fu(int mun){
        int reult = 1;
        if(mun >1)
       reult =  mun * fu(mun -1 );
       return reult;
    }
}
