import java.util.Scanner;

class Search_Algorithm_2{

    static int search_algorithm_2(int[] a, int n, int key){

        int i=0;

        a[n] = key;

        while(true){
            if(a[i]==key){
                break;
            }
            i++;
        }
        return i==n? -1:i;

    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdin.nextInt();
        int[] x= new int[num+1];

        for (int i = 0; i<num;i++){
            System.out.print("x["+i+"]");
            x[i] = stdin.nextInt();
        }
        System.out.print("검색할 값:");
        int ky = stdin.nextInt();
        
        int idx = search_algorithm_2(x,num,ky);

        if(idx == -1){
            System.out.println("noting");
        }
        else{
            System.out.println("x["+idx+"]");
        }

        stdin.close();
    }
}