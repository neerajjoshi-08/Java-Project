class MathOperation {
    public static void main(String[] args) {
        int sum = 0, average = 0;
        int A[] = new int[5];

        try {
            for(int i = 0; i < 5; ++i) {
                A[i] = Integer.parseInt(args[i]);
                sum += A[i];
            }
            average = sum/5;
            System.out.println("Sum of elements: " + sum);
            System.out.println("Average of all elements: " + average);
        }
        catch(ArithmeticException ae) {
            System.out.println("Arithmetic Exception encountered.");
        }
        catch(NumberFormatException nfe) {
            System.out.println("Number format Exception encountered.");
        }
    }
}