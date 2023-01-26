package algo;

import java.util.Scanner;

public class a7_2 {
	
	public String solution(String str) {
		String answer="YES";
		str=str.toUpperCase();
				int len=str.length();
				for(int i=0; i<len/2;i++) {
					if(str.charAt(i)!=str.charAt(len-i-1)) {
						answer="NO";
						break;
					}
				}
				return answer;
	}
	public static void main(String[] args) {
		a7_2 T = new a7_2();
	
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
	}
}

