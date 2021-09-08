import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		if(a!=0) {
			boolean c = (a != 0);
			System.out.print("0 ");
		} else {
			System.out.print("1 ");
		}
		if (b == 0) {
			boolean d = (b == 0);
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		if((a!=0) && (b==0)) {
			System.out.print("false"+" ");
		}
		if((a!=0) || (b==0)){
			System.out.println("true");
		}
	}

}
