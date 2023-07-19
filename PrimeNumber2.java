public class PrimeNumber2 {

    static int solution(int a) {
        int answer = 0;
        int ptr = 0;
        int [] prime = new int[a];
        
        prime[ptr++] = 2;
        for (int n=3;n<=a;n+=2){
            int i;
            for(i=1; i<ptr;i++){
                if(n%prime[i]==0)
                    break;
            }
            if(ptr==i)
                prime[ptr++] = n;
        }
        for (int i=0; i<ptr;i++)
            System.out.println(prime[i]);
        return answer;

    }
    public static void main(String[] args){
        System.out.println(solution(10));
    }

}
