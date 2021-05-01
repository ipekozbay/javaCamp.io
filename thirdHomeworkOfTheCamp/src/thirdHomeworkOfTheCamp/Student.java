package thirdHomeworkOfTheCamp;

public class Student extends User {

	private String CoursesOfTheStudent;
	private String homework;

	public String getCoursesOfTheStudent() {
		return CoursesOfTheStudent;
	}

	public void setCoursesOfTheStudent(String coursesOfTheStudent) {
		CoursesOfTheStudent = coursesOfTheStudent;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

}