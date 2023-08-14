

public class IntStack {
    private int[] stack;// 스택용 배열
    private int capacity; // 스택 용량
    private int stack_pointer; // 스택 포인터

    // 실행시 예외: 스택 = null

    public class EmptyIntStackException extends RuntimeException{ 
        public EmptyIntStackException(){}
    }

    // 실행시 예외: 스택 over
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public IntStack(int maxlen){
        stack_pointer = 0;
        capacity = maxlen;
        try{
            stack = new int[capacity]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e){
            capacity = 0; // 생성 불가
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if (stack_pointer >= capacity) // 스택이 가득 찰 경우
            throw new OverflowIntStackException();

        return stack[stack_pointer++] = x;
    }

    // 스택에서 꼭대기의 데이터를 확인
    public int pop() throws EmptyIntStackException{
        if (stack_pointer <= 0) // 스택이 비어있는 경우
            throw new EmptyIntStackException();
        return stack[--stack_pointer];
    }

    public int peek() throws EmptyIntStackException{
        if (stack_pointer <= 0) // 스택이 비어있다면
            throw new EmptyIntStackException();

        return stack[stack_pointer-1];
    }
    public void clear(){ // 스택 초기화
        stack_pointer = 0;
    }

    // 스택에서 x를 찾아 index를 반환, 없다면 -1 반환
    public int indexOf(int x){
        for (int i = stack_pointer - 1; i>=0; i--)
            if (stack[i]==x)
                return i; // 검색 성공
            return -1; // 검색 실패
    }

    public int getCapacity(){ // 스택 용량 반환
        return capacity;
    }

    public int size(){ // 스택에 쌓여있는 데이터의 수를 반환
        return stack_pointer;
    }

    public boolean isEmpty(){ // 스택이 비어있는지 확인
        return stack_pointer <= 0;
    }

    public boolean isFull(){ // 스택이 가득 차 있는지 확인
        return stack_pointer >= capacity;
    }

    public void dump(){ // 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
        if (stack_pointer<=0)
            System.out.println("Null stack");
        else{
            for (int i = 0; i<stack_pointer;i++){
                System.out.print(stack[i] + " ");
            System.out.println();    
            }
        }
    }
}
