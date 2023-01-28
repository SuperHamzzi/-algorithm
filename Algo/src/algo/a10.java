package algo;

import java.util.Scanner;

public class a10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] c =a.toCharArray();
		int[] answer = new int[a.length()];
		int p =1000;
		char b = sc.next().charAt(0);
		for(int i=0; i<a.length();i++) {
			if(c[i]=='e') {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		for(int i=a.length()-1; i>=0;i--) {
			if(c[i]=='e') {
				p=0;
			}else {
				p++;
				
				answer[i]=Math.min(answer[i], p);
			}
		}
		for(int x:answer) {
			System.out.print(x+" ");
		}
		
	}
}
