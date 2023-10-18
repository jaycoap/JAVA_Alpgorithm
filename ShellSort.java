import java.util.Scanner;

class ShellSort{

    static void shellsort(int[] a, int n){
        for (int h = n / 2;h>0;h/=2){
            for (int i = h; i<n; i++){
                int j;
                int temp = a[i];
                for(j = i-h;j>=0 && a[j] > temp; j-=h){
                    a[j+h] = a[j];
                }
                a[j+h] = temp;
            }
        }
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.println("셸정렬");
        System.out.print("요솟수: ");

        int nx = stdin.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i< nx; i++){
            System.out.print("[" + i + "]: ");
            x[i] = stdin.nextInt();
        }
        shellsort(x,nx);

        System.out.println("오름차순 정렬");
        for (int i = 0; i<nx;i++)
            System.out.println("x["+i+"]="+ x[i]);

        stdin.close();
    }
}