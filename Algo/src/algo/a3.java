package algo;

import java.util.Scanner;

public class a3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String[] b = a.split(" ");
		String d = "";
		for(int i=0; i<b.length; i++) {
			if(b[i].length()>d.length()) {
				d=b[i];
			}
		}
		System.out.println(d);
		
		
	}
}
