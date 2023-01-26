package algo;

import java.util.Scanner;

public class a9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String str2 = "";
		char[] c = str.toCharArray();
		for(int i =0; i<c.length;i++) {
			if(48<=c[i]&&c[i]<=57) {
				str2+=c[i];
			}
		}
		int a = Integer.parseInt(str2);
		System.out.println(a);
	}

}

