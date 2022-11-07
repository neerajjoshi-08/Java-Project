class Division {
    static void CalcDivision(int num1, int num2) {
        float div = num1/(float)num2;
        if(num2 == 0) {
            throw new ArithmeticException();
        }
        System.out.println("Divison of numbers is: " + div);
    }

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        try {
            CalcDivision(num1, num2);
        }

        catch(ArithmeticException ae) {
            System.out.println("Arithmetic Exception encountered! - " + ae);
        }
    }
}