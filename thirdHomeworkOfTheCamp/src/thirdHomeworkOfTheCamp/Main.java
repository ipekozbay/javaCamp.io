package thirdHomeworkOfTheCamp;

public class Main {

	public static void main(String[] args) {

		StudentManager studentManager = new StudentManager();
		Student student = new Student();

		student.setName("ipek özbay");
		student.setId(1);
		student.seteMail("blabla.com");
		student.setHomework("work3");
		student.setCoursesOfTheStudent("JAVA AND REACT");

		System.out.println(" adding student =>");

		studentManager.add(student);

		System.out.println("\n");

		InstructorManager instructorManager = new InstructorManager();

		Instructor instructor = new Instructor();

		instructor.name = "engin demiroð";
		instructor.setCoursesOfTheInstructor("java / c# / pyhton");
		instructor.id = 4;
		instructor.eMail = "blaba2.com";

		System.out.println(" adding instructor =>");

		instructorManager.add(instructor);
	}
}
