import java.util.Arrays;
import java.util.Scanner;

class reverseArray{
    static void swap(int[] a, int idx1, int idx2){
        int t= a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a){
        for (int i = 0; i<a.length/2; i++)
            swap(a,i,(a.length-1)-i);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int answer = stdIn.nextInt();

        int[] x = new int[answer];

        for (int i = 0; i<answer;i++){
            System.out.print("x["+i+"]:");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("x = "+ Arrays.toString(x));
        stdIn.close();
    }
}