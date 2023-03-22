package coding.leetCode;

public class SingletonCls {
	public static void main(String args[]){
	//	MySingleton ms= new MySingleton(); //constructor for create object is not visible
		MySingleton ms= MySingleton.getInstance();
		ms.getInstance();
		ms.getSomething();
	}
}

class MySingleton{
	private static MySingleton mObj;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance(){
			if(mObj == null){
				System.out.println("Call getInstance");
				mObj =new MySingleton();
			}
		return mObj;
    }
	
	public void getSomething() {
		System.out.println("Hello Sunny");
	}

}
