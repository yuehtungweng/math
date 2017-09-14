import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,x,y;
        System.out.print("請輸入a:");
        a=input.nextInt();
        System.out.print("請輸入b:");
        b=input.nextInt();
        System.out.print("請輸入c:");
        c=input.nextInt();
        System.out.print("請輸入x:");
        x=input.nextInt();
        y=a*x*x+b*x+c;
        System.out.printf("%d",y);
        input.close();
    }
}
