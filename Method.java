class method3Method{
    static int max3(int a, int b, int c){
        int max = a;
        if (b>max){
            max = b;}
        if (c>max) {
            max = c;}

        return max;
    }
    public static void main(String[]args){
        System.out.println("max(3,2,1): " + max3(3,2,1));
        System.out.println("max(1,2,3): " + max3(3,2,1));
        System.out.println("max(3,1,2): " + max3(3,2,1));
        System.out.println("max(2,3,1): " + max3(3,2,1));


    }

}