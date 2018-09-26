package remarkedHomeWork2;

public class Person {
	private int age;
	private String name;
	public Person(int age,String name){
		this.age=age;
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public Subject getSubject(String subject){
		  switch(subject){
		    case "algebra":return Subject.ALGEBRA;
		    case "history":return Subject.HISTORY;
		    case "biologi":return Subject.BIOLOGI;
		    case "english":return Subject.ENGLISH;
		  }
		return null;
	}
}


