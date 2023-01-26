package algo;

import java.util.ArrayList;
import java.util.Scanner;

public class a4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> answer = new ArrayList<>();
		int a = sc.nextInt();
		String[] str = new String[a];
		for(int i=0;i<a; i++) {
			str[i]=sc.next();
			String tmp = new StringBuilder(str[i]).reverse().toString();
			answer.add(tmp);
		}
		for(String x: answer) {
			System.out.println(x);
		}
		
	}
}
