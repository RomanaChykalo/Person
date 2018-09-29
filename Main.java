package remarkedHomeWork2;

import java.util.Arrays;

public class Main {

	Subject[] secondListOfSubject;

	public static void main(String[] args) {
		Subject[] teachersListOfSubject = { Subject.getSubject("algebra"), Subject.getSubject("biologi"),
				Subject.getSubject("history"), Subject.getSubject("ukrainian_language") };
		Subject[] secondListOfSubject = { Subject.getSubject("biologi"), Subject.getSubject("chemestry") };

		Teacher teacherIvanna = new Teacher(35, "Іванна", teachersListOfSubject);
		Teacher teacherPetro = new Teacher(28, "Петро", secondListOfSubject);

		System.out.println("Вчитель " + teacherIvanna.getName() + ", віком " + teacherIvanna.getAge() + " років, "
				+ "викладає такі предмети: " + Arrays.toString(teachersListOfSubject));
		System.out.println("Вчитель " + teacherPetro.getName() + ", віком " + teacherPetro.getAge() + " років, "
				+ "викладає такі предмети: " + Arrays.toString(secondListOfSubject));

		Subject[] listOfSubject = { Subject.getSubject("algebra"), Subject.getSubject("english") };

		Pupil pupilRuslan = new Pupil(8, "Руслан", 3, listOfSubject);
		System.out.println("Учень " + pupilRuslan.getName() + ", віком " + pupilRuslan.getAge() + " років, "
				+ "вивчає такі предмети: " + Arrays.toString(listOfSubject));

	}

}
