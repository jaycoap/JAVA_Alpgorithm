import java.util.Scanner;

public class sidestep {
    
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n;
        int check = 0;
        System.out.println("+,-를 번갈아 N개 출력");

        do {
            System.out.print("n값: ");
            n = stdIn.nextInt();
        }while (n<=0);

        for (int i = 0; i < n; i++)
            System.out.print("+-");
          

        if(n%2 != 0)
            System.out.print("+");
            check += 1;
        System.out.print(check);
        stdIn.close();
        

    }
}