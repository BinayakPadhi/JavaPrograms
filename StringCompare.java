package programs;

public class StringCompare {

	public static void main(String[] args) {
		String s1= new String("Binayak");
		String s2 = s1.concat("Padhi");
		System.out.println(s2);
		String s3 = s2.intern();
		System.out.println(s2==s3);
		String s4 = "BinayakPadhi";
		System.out.println(s3==s4);
	}

}
