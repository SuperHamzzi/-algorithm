package algo;

import java.util.Scanner;

public class a6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String answer = "";
		for(int i=0;i<a.length();i++) {
			if(a.indexOf(a.charAt(i))==i) {
				answer +=a.charAt(i);
			}
		}
		System.out.println(answer);
		
	}
}
