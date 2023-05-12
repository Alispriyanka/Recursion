package Recursion;

public class Recufact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1,fact=1;
int factorial=find(no,fact);
System.out.println(factorial);
	}
	private static int find(int no,int fact) {
		fact=fact*no;
		no++;
		if(no<=5)
			return find(no,fact);
		else
			return fact;
	}

}
