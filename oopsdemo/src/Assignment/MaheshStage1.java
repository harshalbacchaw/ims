package Assignment;

import java.util.Scanner;

public class MaheshStage1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1;
		input1 = sc.nextInt();
		sc.close();
		int product = 1;
		if(input1>0 && input1<32767){
		    while(input1 != 0){
		      product = product * (input1 % 10);
		      input1 = input1 / 10;
		    }
		    System.out.println(product);
		}
		else{
		    System.out.println(-1);
		}
	}

}
