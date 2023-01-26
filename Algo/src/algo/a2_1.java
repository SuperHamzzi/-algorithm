package algo;

import java.util.Scanner;

public class a2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String a=sc.next();
			String answer ="";
			for(char x : a.toCharArray()) {
				if(65<=x && x<=90) answer +=Character.toLowerCase(x);
				else answer +=Character.toUpperCase(x);
			}
			System.out.println(answer);
			
	}

}
