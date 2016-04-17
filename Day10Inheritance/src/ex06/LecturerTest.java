package ex06;

public class LecturerTest {

	public static void main(String[] args) {
		
		String name = "Jane";
		String tName = "Tom";
		String subject = "Maths";
		String lessonName = "Tues";
		
		
		Lecturer jane = new Lecturer(name);
		Teacher tom = new Teacher(tName);
		
		jane.getName(name);
		jane.teach(lessonName);
		jane.doResearch(subject);
		tom.getName();
		

	}

}
