package programs;

public class StaticConcept {
	
	static int num = 10;
	static String name = "Binayak";
	
	static{
		num = 20;
		name = "Padhi";
	}
	

	public static void main(String[] args) {
	
		System.out.println(num);
		System.out.println(name);
	}

}
