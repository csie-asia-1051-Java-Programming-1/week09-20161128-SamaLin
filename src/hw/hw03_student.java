package hw;

import java.util.ArrayList;

public class hw03_student {
	private String id,name;
	private int Chinese,English,Math;
	ArrayList<hw03_course> courseList=new ArrayList<hw03_course>();
	
	public  hw03_student(String id1,String name1,int Chinese1,int English1,int Math1) {
		id=id1;
		name=name1;
		Chinese=Chinese1;
		English=English1;
		Math=Math1;

	}
//	public void setStudent(String id1,String name1,int Chinese1,int English1,int Math1){
//		id=id1;
//		name=name1;
//		Chinese=Chinese1;
//		English=English1;
//		Math=Math1;
//	}
	public void showInfo(){
		System.out.print("Id: "+id+"\t");
		System.out.print("Name: "+name+"\t");
		System.out.print("Chinese: "+Chinese+"\t");
		System.out.print("Englie: "+English+"\t");
		System.out.print("Math: "+Math+"\t");
		System.out.println("Avg: "+getavg());
		for(int i=0;i<courseList.size();i++){
			courseList.get(i).show();
//			System.out.println();
		}
	}
	public float getavg(){
		return (Chinese+English+Math)/3;
	}
	public void setCourse(String CTitle,String CId,int CPoint,String CTeacher,int 
			Credit){
		courseList.add(new hw03_course(CTitle,CId,CPoint,CTeacher,Credit));
	}

}
