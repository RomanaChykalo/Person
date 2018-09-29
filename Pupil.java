package remarkedHomeWork2;

public class Pupil extends Person {
	private int classNumber;
	Subject[] listOfSubject;

	public Pupil(int age, String name, int classNumber, Subject[] listOfSubject) {
		super(age, name);
		this.classNumber = classNumber;
		this.listOfSubject = listOfSubject;
	}

	public int getClassNumber() {
		return classNumber;
	}
}
