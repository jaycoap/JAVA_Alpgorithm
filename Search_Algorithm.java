import java.util.Scanner;

public class Search_Algorithm {
    static int search_algorithm(int[]a, int n, int key){
        int i = 0;

        while(true){
            if (i==n){
                return -1;
            }
            if (a[i]==key){
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdin.nextInt();
        int[] x= new int[num];

        for (int i=0; i<num;i++){
            System.out.print("x["+i+"]");
            x[i] = stdin.nextInt();
        }
        System.out.print("검색할 값:");
        int ky = stdin.nextInt();

        int idx = search_algorithm(x, num, ky);

        if (idx == -1){
            System.out.println("noting");
        }
        else{
            System.out.println("find: x["+idx+"]");
        }
        stdin.close();
    }
}
