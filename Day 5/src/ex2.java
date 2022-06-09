
public class ex2 {
	String name;

	public static void main(String[] args) {
		ex2 a = new ex2();
		ex2 b = a;
		b.name= "abc";
		a = null;
		System.out.println(b.name);

	}

}
