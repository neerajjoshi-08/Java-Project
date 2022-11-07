class MyThread extends Thread {
    public void run() {
        try {
            for(int i = 1; i <= 10; ++i) {
                if(i == 6) {
                    System.out.print("<delay> ");
                    Thread.sleep(5000);
                }
                System.out.print(i + " ");
            }
        }
        catch(InterruptedException e) {
            System.out.println("Exception encountered!");
        }
    }
}

class PrintNumber {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }
}