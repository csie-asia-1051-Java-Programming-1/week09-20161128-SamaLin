package hw;
/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，Course的class包含 
 * 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		ArrayList<hw03_student> studList=new ArrayList<hw03_student>();
		String flag="Y";
		int now=0;
		//test
//		studList.add(new hw03_student("105021001","同學01",80,70,60));
//		studList.get(now).setCourse("國文","01",60,"老師一",2);
//		studList.get(now).setCourse("數學","02",61,"老師二",3);
//		now=1;
//		studList.add(new hw03_student("105021002","同學02",60,70,80));
//		studList.get(now).setCourse("國文","01",62,"老師二",2);
//		studList.get(now).setCourse("數學","02",63,"老師三",3);
//		studList.get(0).show();
//		studList.get(1).show();
		//test
		while(true){
			System.out.println("請輸入學生 學號 姓名 國文 英文 數學");
			studList.add(new hw03_student(scn.next(),scn.next(),scn.nextInt(),scn.nextInt(),scn.nextInt()));
			while(true){
				System.out.println("請輸入 課程名稱、課程代號、課程分數、授謀老師、學分數");
				studList.get(now).setCourse(scn.next(),scn.next(),scn.nextInt(),scn.next(),scn.nextInt());
				System.out.println("是否繼續輸入課程");
				flag =scn.next();
				if(flag.equals("N")||flag.equals("n")){
					break;
				};
			}
			System.out.println("是否繼續輸入學生");
			flag =scn.next();
			if(flag.equals("N")||flag.equals("n")){
				break;
			};
			now++;
		}
		ArrayList <Float> data=new ArrayList<Float>();
		for(int i=0;i<studList.size();i++){
			data.add(studList.get(i).getavg());
		}
		Collections.sort(data);
		Collections.reverse(data);
		for(int i=0;i<data.size();i++){
			for(int j=0;j<studList.size();j++){
				if(data.get(i)==studList.get(j).getavg()){
					studList.get(j).showInfo();
				}
			}
		}
		
	}

}
