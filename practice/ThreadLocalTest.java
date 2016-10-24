package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*LiftOff liftOff = new LiftOff();
		liftOff.run();*/
		/*Thread thread = new Thread(new LiftOff());
		thread.start();*/
		/*for(int i = 0;i<4;i++){
			new Thread(new LiftOff()).start();
		}*/
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i = 0;i<5;i++){
			executorService.execute(new LiftOff());
		}
		executorService.shutdown();
	}
	}
//定义任务
    class LiftOff implements Runnable{
    private ThreadLocalContext threadLocalContext = new ThreadLocalContext(); 
    private ThreadLocal<Long> threadLocal = new ThreadLocal<Long>();
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;
    public LiftOff() {
		// TODO Auto-generated constructor stub
	}
    public LiftOff(int countDown){
    	this.countDown = countDown;
    }
    public String status(){
    	return "#"+id+"("+(countDown>0?countDown:"Liftoff!")+"),";
    }
    @Override
    public void run(){
    		//System.out.print(status());
    		threadLocal.set(System.currentTimeMillis());
    		try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		System.out.println("threadName:"+Thread.currentThread().getName()+"  "+"threadBeginTime:"+threadLocal.get());
    }
	
}
//定义threadLocal
       class ThreadLocalContext {
    	private static ThreadLocal<Integer> threadLocalNum  = new ThreadLocal<Integer>(){
    		@Override
    		protected Integer initialValue(){
    			return 0;
    		}
    	};
    	public int getNextNum(){
    		threadLocalNum.set(threadLocalNum.get()+1);
    		return threadLocalNum.get();
    	}
    	
    }
