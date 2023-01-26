package algo;

import java.util.Scanner;

public class a2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String a=sc.next();
			String answer ="";
			for(char x : a.toCharArray()) {
				if(Character.isLowerCase(x)) answer +=Character.toUpperCase(x);
				else answer +=Character.toLowerCase(x);
			}
			System.out.println(answer);
			
	}

}
