class PrimeNumber {
    public static void main(String[] args) {
        int check = 0;
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                check++;
                if (n % i == 0) {
                    break;
                }
            }
            if (n == i)
                System.out.println(n);
        }
        System.out.println("나눗셈수:" + check);
    }
}

