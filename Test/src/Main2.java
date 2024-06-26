class A{
	void meth(int a){
		System.out.println(a);
	}
}
public class Main2 extends A {
	
	@Override
	void meth(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m = new Main2();
		m.meth(10);
	}

}
