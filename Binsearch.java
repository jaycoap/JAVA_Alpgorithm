import java.util.Arrays;
import java.util.Scanner;


class Binsearch {
    static int binsearch(int[]a, int n, int key){
        int last = 0;
        int middlecenter = n-1;

        do{
            int center = (last+middlecenter)/2;
            if(a[center] == key){
                return center;
            }
            else if (a[center]<key){
                last = center +1;
            }
            else{
                middlecenter = center -1;
            }

        } while (last<=middlecenter);
        return -1;
    }        

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("요솟수");
        int num = stdin.nextInt();
        int[] x= new int[num]; 
        System.out.print("x[0]:");
        x[0] = stdin.nextInt();

        for (int i = 1; i<num; i++){
            
            System.out.print("x["+i+"]");
            x[i] = stdin.nextInt();
        }
        Arrays.sort(x);
        
        int ky = stdin.nextInt();

        int idx = binsearch(x, num, ky);

        if(idx == -1){
            System.out.println("없는 숫자");
        }
        else{
            System.out.println("x["+idx+"]에서 발견");
        }
        stdin.close();
    }
}
