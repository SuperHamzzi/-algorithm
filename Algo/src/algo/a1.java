package algo;

import java.util.Scanner;

public class a1 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
			String a = sc.next().toUpperCase();
			
			String b = sc.next().toUpperCase();
			String[] asp = a.split("");
			int num = 0;
			for(int i=0; i<asp.length ; i++) {
				if(asp[i].equals(b)) {
					num++;
				}
			}
			System.out.println(num);
	}

}
