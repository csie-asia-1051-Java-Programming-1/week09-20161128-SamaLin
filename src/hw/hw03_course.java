package hw;

public class hw03_course {
	private String CTitle,CId,CTeacher;
	private int CPoint,Credit;
	public hw03_course(String CTitle1,String CId1,int CPoint1,String CTeacher1,int 
			Credit1){
		CTitle=CTitle1;
		CId=CId1;
		CPoint=CPoint1;
		CTeacher=CTeacher1;
		Credit=Credit1;
	}
//	public void setCourse(String CTitle1,String CId1,int CPoint1,String CTeacher1,int 
//			Credit1){
//		CTitle=CTitle1;
//		CId=CId1;
//		CPoint=CPoint1;
//		CTeacher=CTeacher1;
//		Credit=Credit1;
//	}
	public void show(){
		System.out.print("Title: "+CTitle+"\t");
		System.out.print("Id: "+CId+"\t");
		System.out.print("Point: "+CPoint+"\t");
		System.out.print("Teacher: "+CTeacher+"\t");
		System.out.println("Credit: "+Credit);
	}

}
