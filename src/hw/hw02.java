package hw;
/*
 * Topic: 輸入一個正整數 N，列舉如下數列，直到數字超過 N 為止。
數列一:1 2 4 7 11 16 22 29…
數列二:1 2 2 3 3 3 4 4 4 4 5 5 5 5 5...
 * Date: 2016/11/28
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n =scn.nextInt();
		int sum=1;
		System.out.println("數列一");
		try{
			int i=0;
			while(sum<=n){
				sum=sum+i;
				System.out.print(sum+"\t");
				i++;
			}
		}catch(Exception e){
			System.out.println(e.toString()); 
		}
		
		System.out.println();
		
		System.out.println("數列二");
		for(int i=0;i<=n+1;i++){
			for(int j=0;j<i;j++){
				System.out.print(i+"\t");
			}
		}
	}

}
