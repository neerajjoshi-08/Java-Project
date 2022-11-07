class MyThread1 extends Thread {
    public void run() {
        for(int i = 1; i <= 10; ++i) {
            System.out.print(i + " ");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        for(int i = 11; i <= 20; ++i) {
            System.out.print(i + " ");
        }
    }
}

class MyThread3 extends Thread {
    public void run() {
        for(int i = 21; i <= 30; ++i) {
            System.out.print(i + " ");
        }
    }
}

class PriorityThread {
    public static void main(String[] args) {
        MyThread1 a = new MyThread1();
        MyThread2 b = new MyThread2();
        MyThread3 c = new MyThread3();

        a.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);   
        c.setPriority(Thread.NORM_PRIORITY);   

        System.out.println("Priority of thread 1: " + a.getPriority());
        System.out.println("Priority of thread 2: " + b.getPriority());
        System.out.println("Priority of thread 3: " + c.getPriority());

        a.start();
        b.start();
        c.start();
    }
}