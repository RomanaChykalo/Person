package remarkedHomeWork2;

import java.util.Arrays;

public class Main {

	Subject[] secondListOfSubject;

	public static void main(String[] args) {
		Subject[] teachersListOfSubject = { Subject.getSubject("algebra"), Subject.getSubject("biologi"),
				Subject.getSubject("history"), Subject.getSubject("ukrainian_language") };
		Subject[] secondListOfSubject = { Subject.getSubject("biologi"), Subject.getSubject("chemestry") };

		Teacher teacherIvanna = new Teacher(35, "������", teachersListOfSubject);
		Teacher teacherPetro = new Teacher(28, "�����", secondListOfSubject);

		System.out.println("������� " + teacherIvanna.getName() + ", ���� " + teacherIvanna.getAge() + " ����, "
				+ "������� ��� ��������: " + Arrays.toString(teachersListOfSubject));
		System.out.println("������� " + teacherPetro.getName() + ", ���� " + teacherPetro.getAge() + " ����, "
				+ "������� ��� ��������: " + Arrays.toString(secondListOfSubject));

		Subject[] listOfSubject = { Subject.getSubject("algebra"), Subject.getSubject("english") };

		Pupil pupilRuslan = new Pupil(8, "������", 3, listOfSubject);
		System.out.println("����� " + pupilRuslan.getName() + ", ���� " + pupilRuslan.getAge() + " ����, "
				+ "����� ��� ��������: " + Arrays.toString(listOfSubject));

	}

}
