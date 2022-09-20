public class Dummy{
	
	int a,b;
	
	public Dummy(int a,int b){
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args){
		Dummy dummyObj = new Dummy(1,2);
		
		System.out.println(dummyObj.a+dummyObj.b);
	}
}