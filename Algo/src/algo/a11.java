package algo;

import java.util.Scanner;

public class a11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char b = sc.next().charAt(0);
		int[] answer = new int[a.length()];
		int p =1000;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==b) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=p;
			}
		}
		for(int i=a.length(); i>=0; i--) {
			if(a.charAt(i)==b) {
				p=0;
				answer[i]=p;
			}else {
				p++;
				answer[i]=Math.min(answer[i],p);
			}
		}
		for(int x : answer) {
			System.out.println(x);
		}
	}
}
