import java.util.Scanner;

public class while_condition {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 N까지의 합");
        System.out.println("입력 값:");
        int a = stdIn.nextInt();

        int sum = 0;
        int i = 1;

        while(i<=a){
            sum += i;
            i ++;
        }
        System.out.println("1부터" + a + "까지의 합은" + sum);
        stdIn.close();
    }
}
