package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class a4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> arr=  new ArrayList<>();
		String[] str = new String[n];
		for(int i=0;i<n;i++) {
			str[i] =sc.next();
		}
		for(String x: str) {
			char[] s = x.toCharArray();
			int lt=0;
			int rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s);
			arr.add(tmp);
		}
		for(String x: arr) {
			System.out.println(x);
		}
	}

}
