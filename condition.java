import java.util.Scanner;


public class condition {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수입력: ");
        int n = stdIn.nextInt();

        if (n>0)
            System.out.println("양수");
        else if (n<0)
            System.out.println("음수");
        else
            System.out.println("0이다.");
        stdIn.close(); 
    }    
}
