import java.util.Scanner;

class BubbleSort{
    static void swap(int[] a, int idx1, int idx2){ // 위치변경
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubblesort(int[] a, int n){ // 버블 정렬
        for(int i = 0; i < n-1;i++){
            for(int j = n-1; j>i; j--){
                if(a[j-1]>a[j])
                    swap(a, j-1, j);
            }
        }   
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.println("버블 정렬");
        System.out.print("요솟수: ");
        int nx = stdin.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++){
            System.out.print("x[" + i+"]:");
            x[i] = stdin.nextInt();
        }

        bubblesort(x, nx);

        System.out.println("오름차순 정렬 완료");
        for(int i=0; i< nx; i++)
            System.out.println("x["+i+"]=" + x[i]);

        stdin.close();
    }
}