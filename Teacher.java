package remarkedHomeWork2;

public class Teacher extends Person {
	Subject[] teachersListOfSubject;
	Subject[] secondListOfSubject;

	public Teacher(int age, String name, Subject[] teachersListOfSubject) {
		super(age, name);
		this.teachersListOfSubject = teachersListOfSubject;
	}
}
