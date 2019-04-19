import java.util.ArrayList;

public class Course {
	
	private String Cid;
	private double points;
	private String subject;
	private Lecturer lecturer;
	private ArrayList<StudentInCourse> student_in_course = new ArrayList<StudentInCourse>();
	
	public Course(String cid, double points, String subject) {
		super();
		Cid = cid;
		this.points = points;
		this.subject = subject;
	}

	public Course(String cid, double points, String subject, Lecturer lecturer) {
		super();
		Cid = cid;
		this.points = points;
		this.subject = subject;
		this.lecturer = lecturer;
	}
		
	public String getCid() {
		return Cid;
	}
	public void setCid(String cid) {
		Cid = cid;
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getCoursedAverage()throws Exception{
		double avg,sum = 0;
		for(int i = 0 ; i<student_in_course.size(); i++)
		{
			if(student_in_course.get(i).getCourse().getCid().equals(this.getCid()))
				sum += student_in_course.get(i).getGrade();
		}
		avg = sum / student_in_course.size();
		return avg;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}

	public ArrayList<StudentInCourse> getStudent_in_course() {
		return student_in_course;
	}

	public void setStudent_in_course(ArrayList<StudentInCourse> student_in_course) {
		this.student_in_course = student_in_course;
	}
	
	
	
}
