class MyThread1 extends Thread {
    public void run() {
        for(int i = 2; i <= 20; i=i+2) {
            System.out.print(i + " ");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for(int i = 1; i <= 19; i=i+2) {
            System.out.print(i + " ");
        }
    }
}

class EvenOddNumber {
    public static void main(String[] args) {
        MyThread1 a = new MyThread1();
        MyThread2 b = new MyThread2();
        a.start();
        b.start();
    }
}