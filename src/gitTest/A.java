package gitTest;

public class A {
	
	private A(){}
	private static A a;
	
	public static A getInstance(){
		if(a == null){
			synchronized (A.class) {
				if(a == null){// 
					a = new A();
					a.getClass();
				}
			}
		}
		return a;
	}
}
