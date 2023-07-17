import java.util.Scanner;

class Javarepeat{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int n,w;

        System.out.println("*를 n개 출력하되 W마다 줄을 바꿔 출력");

        do {
            System.out.println("n값: ");
            n = stdin.nextInt();
        }while(n<=0);

        do {
            System.out.println("w값: ");
            w = stdin.nextInt();
        } while (w <= 0 || w>n);

        for (int i = 0; i< n/w;i++)
            System.out.println("*".repeat(w));
        int rest = n % w;
        if (rest != 0)
            System.out.println("*".repeat(rest));

        stdin.close();
    }
}