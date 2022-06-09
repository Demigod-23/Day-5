
public class ex1 {

	public static void main(String[] args) {
		ex1 obj = new ex1();
		obj.start();

	}
	void start() {
		String a = "do ";
		String b = method(a);
		System.out.println(": " +a +b);
		
	}
	String method(String a) {
		a = a +"good";
		System.out.println(a);
		return "good";
	}

}
