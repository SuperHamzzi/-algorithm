package algo;

import java.util.Scanner;

public class a8 {
	public String solution(String s) {
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]","");
		System.out.println(s);
		String tmp=new StringBuilder(s).reverse().toString();
		if(tmp.equals(s)) {
			answer="YES";
		}
		return answer;
	}
	public static void main(String[] args) {
		a8 T = new a8();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));
	}
}

