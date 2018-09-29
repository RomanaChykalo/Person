package remarkedHomeWork2;

public enum Subject {
	ALGEBRA("algebra"), HISTORY("history"), BIOLOGI("biologi"), ENGLISH("english"), CHEMESTRY(
			"chemestry"), UKRAINIAN_LANGUAGE("ukrainian_language");
	String name;

	Subject(String name) {
		this.name = name;
	}

	public static Subject getSubject(String name) {
		Subject[] values = values();
		for (Subject s : values) {
			if (s.name.equals(name)) {
				return s;
			}
		}
		return null;
	}
}
