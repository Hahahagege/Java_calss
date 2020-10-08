package JavaCode;


import java.util.Random;
import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args){
        System.out.println("Levels:1(Easy) 2(Common) 3(Hard)");
        System.out.println("Select levels:");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        int maxTry=0;
        switch (choice){
            case 1:
                maxTry = 12;
                break;
            case 2:
                maxTry = 9;
                break;
            case 3:
                 maxTry = 7;
        }
        int [] answer;
        answer = new int[4];
        boolean num[]=new boolean[10];
        int i;
        Random rand=new Random();
        for(i=0;i<4;i++){
            while(true){
                int a=rand.nextInt(10);
                if(num[a]==false){
                    answer[i]=a;
                    num[a]=true;
                    break;
                }
            }
        }
        for (int b:answer) {
            System.out.println(b);
        }
        System.out.println("数字准备完毕！");
        int b[]=new int[4];
        int k=0;
        while (true){
            int m=0,n=0;
            System.out.println("请输入四个数字（0-9）：");
            for (int j = 0; j < 4; j++) {
                b[j] = input.nextInt();
                for (i = 0; i < 4; i++) {
                    if (b[j] == answer[i]){
                       m++;
                    }
                }
            }
            for(i=0;i<4;i++){
                if(answer[i]==b[i]){
                    n++;
                }
            }
            System.out.println(k+". "+n+"A"+(m-n)+"B");
            k++;
            if(n==4&&(m-n)==0){
                System.out.println("You are great!");
                break;
            }
            else if(k==maxTry){
                System.out.println("You lose!");
                break;
            }
        }
    }
}
