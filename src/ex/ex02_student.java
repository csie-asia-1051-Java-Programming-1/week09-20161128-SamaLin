package ex;

//*
//* Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
//並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
//ID    NAME     Chinese     English       Math        Avg
//* Date: 2016/11/28
//* Author: 105021058 蕭懋霖
//*/

public class ex02_student {
	
	private String id,name;
	private int Chinese,English,Math;

	public ex02_student(String id1,String name1,int Chinese1,int English1,int Math1) {
		// TODO Auto-generated method stub
		id=id1;
		name=name1;
		Chinese=Chinese1;
		English=English1;
		Math=Math1;
		
	}
	public void show(){
		System.out.println("id:"+id);
		System.out.println("name:"+name);
//		System.out.println("Number of people:"+studList.size());
		System.out.println("Chinese:"+Chinese);
		System.out.println("English:"+English);
		System.out.println("Math:"+Math);
		System.out.println("Avg:"+getavg());
	}
	public float getavg(){
		
		return (Chinese+English+Math)/3;
	}
//	public float geta(){
//		
//		g
//	}

}