
public class StudentInCourse  {

	private Student student;
	private Course course;
	private double grade;
	
	public StudentInCourse(Student sid, Course cid, double grade) {
		super();
		this.student = sid;
		this.course = cid;
		this.grade = grade;
		
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
