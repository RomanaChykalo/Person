package remarkedHomeWork2;

public class Teacher extends Person{
	String teacherListOfSubject;
	public Teacher(int age,String name){
		super(age,name);
	}
	public void getSubject() {
		Subject[] teacherListOfSubject = Subject.values();
		for (int i = 0; i < Subject.values().length; i++) 
		{System.out.println("Вчитель викладає предмет: "+ teacherListOfSubject[i] +";");
		}

}
		
	}
	