package remarkedHomeWork2;

public class Pupil extends Person{
	private int classNumber;
	String listOfSubject;
	public Pupil(int age, String name,int classNumber) {
		super(age, name);
		this.classNumber=classNumber;
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public void getSubject() {
		Subject[] listOfSubject = Subject.values();
		for (int i = 0; i < Subject.values().length; i++) 
		{System.out.println("Учень вивчає предмет: "+ listOfSubject[i] +";");
		}
	}
}
