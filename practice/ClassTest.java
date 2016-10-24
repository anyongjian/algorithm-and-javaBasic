package practice;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Candy{
	static{System.out.println("loading canndy");}
	private int a;
	private String b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
}
class Gum{
	static{System.out.println("loading gum");}
}
class Cookie{
	static{System.out.println("loading cookie");}
}

/*
 * 获取Class对象的三种方法
 *（1）：调用Object类的getClass()方法获取Class对象。例如：int a; Class c = a.getClass();
 *（2）：调用Class类中的静态方法forName("a");a必须是接口或者类的名字
 *（3）：如果T是一个Java类型，T.class就代表了匹配的类对象。 Class c = Double[].class;
 * */
public class ClassTest {
	public static void main(String args[]){
		try{
			Class<?> class1 = Class.forName("practice.Candy");
			System.out.println(class1.getName());
			Method[] methods = class1.getDeclaredMethods();
			Field[] fields = class1.getDeclaredFields();
			for(int i=0;i<methods.length;i++){
				System.out.println(methods[i].getName());
			}
			/*int a = 1;
			Class<?> class2 = int.class;
			System.out.println(class2.getName());*/
		}catch(ClassNotFoundException e){
			System.out.println("could not find gum");
		}
		/*new Candy();
		try{
			Class.forName("practice.Gum");
		}catch(ClassNotFoundException e){
			System.out.println("could not find gum");
		}
		new Cookie();*/
		
	}

}
