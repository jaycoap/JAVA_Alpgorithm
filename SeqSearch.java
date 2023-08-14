import java.util.Scanner;

class SeqSearch{
    static int seqSearch(int[] a, int n, int key){
        int i=0;

        while(true){
            if(i==n)
                return -1;
            if(a[i]==key)
                return i;
            i++;
        }
    }
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("요솟수: ");
        int a = stdin.nextInt();
        int[] x = new int[a];

        for (int i = 0; i<a;i++){
            System.out.print("x["+i+"]:");
            x[i] = stdin.nextInt();
        }

        System.out.print("검색할 값: ");
        int keys = stdin.nextInt();
        int idx = seqSearch(x,a,keys);

        if (idx == -1)
            System.out.println("Failed");
        else
            System.out.println("x["+idx+"]에서 발견");

        stdin.close();
    }
}