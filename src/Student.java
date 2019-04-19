import java.util.ArrayList;

public class Student extends Person {
	
	private int year;
	private ArrayList<StudentInCourse> student_in_course = new ArrayList<StudentInCourse>();

	public Student(String id, String name, String address, String department, int year) {
		super(id, name, address, department);
		this.year = year;
	}

	public ArrayList<StudentInCourse> getStudent_in_course() {
		return student_in_course;
	}

	public void setStudent_in_course(ArrayList<StudentInCourse> student_in_course) {
		this.student_in_course = student_in_course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public double getStudentAverage(){
		return 0;
	}

	@Override
	public String printCourses() {
		// TODO Auto-generated method stub
		super.printCourses();
		
		String str1="Id"+"                                         "+"Points"+"                                         "+"Subject"+"\n";
		for(int i=0;i<student_in_course.size();i++)
		{
			str1=str1+"  "+student_in_course.get(i).getCourse().getCid()+"                                               "+ student_in_course.get(i).getCourse().getPoints()+"                                               "+student_in_course.get(i).getCourse().getSubject()+"\n";
	
		}
		return str1;
		
	}
	
	public double getStudAverage()throws Exception{
		double avg,sum = 0;
		for(int i = 0 ; i<student_in_course.size(); i++)
		{
			if(student_in_course.get(i).getStudent().getId().equals(this.getId()))
				sum += student_in_course.get(i).getGrade();
		}
		avg = sum / student_in_course.size();
		return avg;
	}
	public void addCourse(StudentInCourse st)
	{
		student_in_course.add(st);
	}

}
