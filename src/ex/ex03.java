package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，輸出 n 的所有正因數，並判斷該整數是否為質數
 * Date: 2016/11/28
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		boolean c=true;
		int i=2;
		while(i<a){
			if(a%i==0){System.out.println(i+" ");c=false;}
			i++;
		}
		if(c==true){System.out.println("質數");}
	}

}
