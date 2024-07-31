package inheritance;

public class C extends A{

	void c() {
		System.out.println("This is class C");
	}
	public static void main(String[] args) {
		
		C i=new C();
		i.a();
		i.b();
		i.c();
	}

}
