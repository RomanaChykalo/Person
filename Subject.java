package remarkedHomeWork2;
	public enum Subject{
		ALGEBRA("algebra"), HISTORY("history"), BIOLOGI("biologi"), ENGLISH("english");
	String subject;
	private Subject(String subject){
		this.subject = subject;
	}
	public static Subject getSubject(String subject){
		  switch(subject){
		    case "algebra":return ALGEBRA;
		    case "history":return HISTORY;
		    case "biologi":return BIOLOGI;
		  }
		return null;
	}
	public static void main(String[] args){
		System.out.println(getSubject("history"));
		System.out.println(getSubject("history"));
		System.out.println(getSubject("algebra"));
		System.out.println(getSubject("algebra"));
	}
}
