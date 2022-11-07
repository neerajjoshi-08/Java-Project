class Testing {
    public static void main(String[] args) {
        int num = -12345;
        System.out.print("Sum of the digits: " + DigitSum(num));
    }

    public static int DigitSum(int num) {
        int rem, sum = 0, flag = 1;

        
        if(num < 0) {
            flag = 0;
            num = -1 * num;
        }

        while(num > 0 || sum > 9) {
            if (num == 0) {
                num = sum;
                sum = 0;
            }
            rem = num % 10;
            sum += rem;
            num /= 10;
        }

        if(flag == 0)
            return -1 * sum;
        else 
            return sum;
    }
}