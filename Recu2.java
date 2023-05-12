package Recursion;

public class Recu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int no=1,total=0;
 int result=add(no,total);
 System.out.println(result);
	}
private static int add(int no,int total) {
	total=total+no;
	no++;
	if(no<=10)
		return add(no,total);
	else
		return total;
}
}
