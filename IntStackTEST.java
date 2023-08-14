import java.util.Scanner;

class IntStackTEST{
    public static void main(String[] args){
        Scanner stdin = new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 갯수: %d / %d\n", stack.size(), stack.getCapacity());
            System.out.print("(1) PUSH  (2) POP  (3) PEEK  (4) DUMP  (0) EXIT:");

            int menu = stdin.nextInt();
            if(menu == 0) {
                stdin.close();
                break;
            }

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터: ");
                    x = stdin.nextInt();

                    try{
                        stack.push(x);
                    } catch (IntStack.OverflowIntStackException e){
                        System.out.println("Stack full");
                    }
                    break;
                case 2:
                    try{
                        x = stack.pop();
                        System.out.println("POP 한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("Stack null");
                    }
                    break;

                case 3:
                    try{
                        x = stack.peek();
                        System.out.println("피크한 데이터는 "+ x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("Stack null");
                    }
                    break;
                case 4:
                    stack.dump();
                    break;
            }
        }
    }
}