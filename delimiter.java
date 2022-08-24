import java.util.Scanner;
public class delimter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner("hi-mohan-here");
		Scanner scn=scan.useDelimiter("-");
		while(scn.hasNext()) {
			System.out.println(scn.next());
		}
	}
}
