package Interview.xiaobing;

public class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i <= 100 ; i ++){
            synchronized (Main.class){
                Main.class.notify();
                    System.out.println("A");

                try {
                    Main.class.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
