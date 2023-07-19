import java.util.Scanner;

class CardConv{
    static int cardConv(int x, int r, char[] d){
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do{
            d[digits++] = dchar.charAt(x%r);
            x/=r;
            System.out.println(x+" "+ x%r);


        }while(x!=0);

        for (int i = 0; i<digits/2;i++){
            char t = d[i];
            d[i] = d[digits -i -1];
            d[digits -i -1] = t;
        }
        return digits;
    }

    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;

        char[] cno = new char[32];

        do{
            do{
                System.out.print("변환하는 음이 아닌 정수: ");
                no = stdin.nextInt();
            }while(no<0);
            do{
                System.out.print("진수 선택(2~36)");
                cd = stdin.nextInt();
            }while(cd<2||cd>36);
            dno = cardConv(no,cd,cno);
            System.out.println(cd+"진수로 변환");
            for(int i = 0; i<dno;i++)
                System.out.print(cno[i]);
            
            System.out.println();
            retry = stdin.nextInt();
        }while(retry == 1);
        stdin.close();
    }
}