package algo;

import java.util.Scanner;

public class a5 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		String b = sc.next();
		char[] s = b.toCharArray();

		int lt= 0;
		int rt= b.length()-1;
		while(lt<rt){
			if(!Character.isAlphabetic(s[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(s[rt])){
				rt--;
			}else {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
		}
		String temp = String.valueOf(s);
		System.out.println(temp);
	
	}
}
