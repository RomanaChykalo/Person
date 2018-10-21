package remarkedHomeWork2;
myBranch

import java.util.Arrays;

public class Main {


	public static void main(String[] args) {
		Subject[] teachersListOfSubject = { Subject.getSubject("algebra"), Subject.getSubject("biologi"),
				Subject.getSubject("history"), Subject.getSubject("ukrainian_language") };
		Subject[] secondListOfSubject = { Subject.getSubject("biologi"), Subject.getSubject("chemestry") };

		Teacher teacherIvanna = new Teacher(35, "Ivanna", teachersListOfSubject);
		Teacher teacherPetro = new Teacher(28, "Petro", secondListOfSubject);

		System.out.println("Teacher " + teacherIvanna.getName() + ", age " + teacherIvanna.getAge() + " years, "
				+ "teachs some subjects: " + Arrays.toString(teachersListOfSubject));
		System.out.println("Teacher " + teacherPetro.getName() + ", age " + teacherPetro.getAge() + " years, "
				+ "teachs subjects like this: " + Arrays.toString(secondListOfSubject));

		Subject[] listOfSubject = { Subject.getSubject("algebra"), Subject.getSubject("english") };

		Pupil pupilRuslan = new Pupil(8, "Ruslan", 3, listOfSubject);
		System.out.println("Student " + pupilRuslan.getName() + ", age " + pupilRuslan.getAge() + " years, "
				+ "studies this list of subjects: " + Arrays.toString(listOfSubject));



public class Main {


}
