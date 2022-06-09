
public class ex3 {
String name;
	public static void main(String[] args) {
		ex3 a = new ex3();
		a.name = "TNS India";
		ex3 b = a;
		a = null;
		System.out.println(b.name);
		ex3 c = new ex3();
		c.name = "TNS India";
		System.out.println(c.name);
		

	}

}
