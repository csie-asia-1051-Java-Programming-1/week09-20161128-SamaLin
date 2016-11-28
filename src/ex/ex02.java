package ex;

/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		ArrayList<ex02_student> studList=new ArrayList<ex02_student>();
		boolean flag=true;
//		int a=scn.nextInt();
//		studList.add(new ex02_student(scn.next(),scn.next(),scn.nextInt(),scn.nextInt(),scn.nextInt()));
//		studList.add(new ex02_student(scn.next(),scn.next(),scn.nextInt(),scn.nextInt(),scn.nextInt()));
//		studList.add(new ex02_student(scn.next(),scn.next(),scn.nextInt(),scn.nextInt(),scn.nextInt()));
//		studList.get(0).getavg();
//		studList.get(1).getavg();
//		studList.get(2).getavg();
		studList.add(new ex02_student("a","01",10,20,30));
		studList.add(new ex02_student("b","02",15,30,40));
		studList.add(new ex02_student("c","03",5,10,20));
//		float data[]=new float [studList.size()];
		ArrayList<Float> data = new ArrayList<Float>();
		for(int i=0;i<studList.size();i++){
			data.add(studList.get(i).getavg());
		}
		Collections.sort(data);
		Collections.reverse(data);
		for(int i=0;i<data.size();i++){
			for(int j=0;j<studList.size();j++){
				if(data.get(i)==studList.get(j).getavg()){
					studList.get(j).show();
				}
			}
		}
//		for(int i=1;i<studList.size();i++){
//			for(int j=0;j<;j++){
//				
//			}
//		}
		
//		studList.get(0).show();
	}

}
