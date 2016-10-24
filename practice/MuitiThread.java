package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MuitiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data data = new Data();
		ExecutorService es = Executors.newFixedThreadPool(4);
		for(int i = 0;i<2;i++){
			es.execute(new Add(data));
		}
		for(int i = 0;i<2;i++){
			es.execute(new Minus(data));
		}
		es.shutdown();

	}

}
class Data{
	private int j = 0;
	
	public void add(){
		while(true){
			synchronized(this)  {
				System.out.println("当前线程："+Thread.currentThread().getName()+" "+"正在对j进行+操作"+" j:"+(++j));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
	public void minus(){
		while(true){
			synchronized (this) {
				System.out.println("当前线程："+Thread.currentThread().getName()+" "+"正在对j进行-操作"+" j:"+(--j));
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Add implements Runnable {  
	private Data data;
	public Add(Data data){
		this.data = data;
	}
	public void run() {
		data.add();
	}
}
class Minus implements Runnable {  
	private Data data;
	public Minus(Data data){
		this.data = data;
	}
	public void run() {
		data.minus();
	}
}
