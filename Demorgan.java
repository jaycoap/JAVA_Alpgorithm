import java.util.Scanner;

public class Demorgan {
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int no;

        System.out.println("양수입력");

        do{
            System.out.print("no의 값: ");
            no = stdin.nextInt();
        } while (no<10||no>99);

        System.out.println("no는"+no);
        stdin.close();
    }
}
