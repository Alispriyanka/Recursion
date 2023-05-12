package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int base=2,pow=3;
  int result=power(base,pow);
  System.out.println(result);
  
	}
	public static int power(int base,int pow) {
		if(pow!=0) {
			return(base*power(base,pow-1));
		}
		else {
			return 1;
		}
	}

}
