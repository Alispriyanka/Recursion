package Recursion;

public class rec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
aa(1);
	}
	private static void aa(int i) {
		System.out.println(i);
		i++;
		if(i<=5) {
			aa(i);
		}
	}

}
