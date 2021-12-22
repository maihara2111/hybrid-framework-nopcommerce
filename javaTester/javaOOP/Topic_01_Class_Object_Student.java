package javaOOP;

public class Topic_01_Class_Object_Student {
	public int studentID;
	private String studentName;
	private Float knowledgePoint;
	private Float practicePoint;

	private int getStudentID() {
		return studentID;
	}

	private void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	private String getStudentName() {
		return studentName;
	}

	private void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	private Float getKnowledgePoint() {
		return knowledgePoint;
	}

	private void setKnowledgePoint(Float knowledgePoint) {
		this.knowledgePoint = knowledgePoint;
	}

	private Float getPracticePoint() {
		return practicePoint;
	}

	private void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}

	private Float getAveragePoint() {
		return (this.knowledgePoint + this.practicePoint * 2) / 3;
	}

	private void showStudentInfor() {
		System.out.println("********************************");
		System.out.println("Student ID = " + getStudentID());
		System.out.println("Student Name = " + getStudentName());
		System.out.println("Student knowledge Point = " + getKnowledgePoint());
		System.out.println("Student practicePoint = " + getPracticePoint());
		System.out.println("Student average Point = " + getAveragePoint());
		System.out.println("*********************************");
	}
	
	public static void main(String[] args) {
		Topic_01_Class_Object_Student firstStudent = new Topic_01_Class_Object_Student();
		firstStudent.setStudentID(13101992);
		firstStudent.setStudentName("Boyy");
		firstStudent.setKnowledgePoint(8.8f);
		firstStudent.setPracticePoint(9.9f);
		firstStudent.showStudentInfor();
	}

}
