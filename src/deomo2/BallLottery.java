package deomo2;


import java.util.Scanner;

/**
 * @Author jinglong
 * @Date 2021/2/8 20:09
 * @Version 1.0
 */
public class BallLottery {
        public static void main(String[] args) {
        int[] ball = new int[7];

        while (true) {
            System.out.println("------------欢迎进入双色七球彩票系统---------------");
            System.out.println("1.购买彩票");
            System.out.println("2.查看开奖");
            System.out.println("3.退出");
            System.out.println("请选择你要完成的功能");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            switch (i){
                case 1:
                    System.out.println("双色球系统 购买彩票");
                    System.out.println("请设置你你要购买几注");
                    int cont = sc.nextInt();
                    for (int j = 1; j <= 7 ; j++) {
                        if(j!= 7){
                            System.out.println("请输入第"+j+"个红球");
                            int red = sc.nextInt();
                            ball[j-1] = red;
                        }else{
                            System.out.println("请输入一个蓝球");
                            int lan = sc.nextInt();
                            ball[6] = lan;
                        }
                    }
                    System.out.println("你购买了"+cont+"注彩票，一共消费了"+cont * 3+"元钱，你购买的彩票号码为：");
                   for(int mun:ball){
                       System.out.print(mun+"\t");
                   }
                    System.out.println();
                    break;
                case 2:
                    int[] lottery = getLottery();
                    int loeve = getLoeve(ball, lottery);
                    switch(loeve){
                        case 1:
                            System.out.println("中了一");
                            break;
                        case 2:
                            System.out.println("中了2");
                            break;
                        case 3:
                            System.out.println("中了3");
                            break;
                        case 4:
                            System.out.println("中了4");
                            break;
                        case 5:
                            System.out.println("中了5");
                            break;
                        case 6:
                            System.out.println("中了6");
                            break;
                    }

                    System.out.println("双色球系统 查看开奖");
                    break;
                case 3:
                    System.out.println("双色球系统 退出");
                   return;
            }
        }
    }
    public static int[] getLottery(){
        int[] luckBall = new int[7];
        for (int i = 1; i <= 7; i++) {
            if(i!=7){
                luckBall[i-1] = (int)(Math.random()*33)+1;
            }else{
                luckBall[6] = (int)(Math.random()*16)+1;
            }
        }
        return luckBall;
    }
    public static int getLoeve(int[] balls, int[] luclk){
        int level = 1;
        int red = 0;
        int blue = 0;
        for (int i = 0; i <= 6; i++) {
            if(i!= 6){
                for (int j = 0; j <= 5 ; j++) {
                    if (balls[i] == luclk[j]) {
                        red++;
                    }
                }
                }else{
                if(balls[6]== luclk[6]){
                    blue ++;
                }
            }
        }
        System.out.println("红球"+red);
        System.out.println("蓝"+blue);
        if(red == 6 && blue== 1){
            level = 1;

        }else{

        }

        return level;
    }
}
