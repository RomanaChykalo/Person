package remarkedHomeWork2;
import java.util.Scanner;

public class MainMathod {

	public static void main(String[] args) {
		System.out.println("¬вед≥ть назву предмету.");
		Scanner scan = new Scanner(System.in);
		String subject = scan.next();
		Person person = new Person(14, "Ivan");
		System.out.println(person.getSubject(subject));
		Pupil pupil = new Pupil(1, "Olia", 6);
		pupil.getSubject();
		Teacher teacher = new Teacher(40, "Ivanka");
		teacher.getSubject();
		
	}

}
