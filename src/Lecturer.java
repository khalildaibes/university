import java.util.ArrayList;

public class Lecturer extends Person {
	
	private String status;
	private ArrayList<Course > course = new ArrayList<Course>();

	public Lecturer(String id, String name, String address, String department, String status) {
		super(id, name, address, department);
		this.status = status;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	@Override
	public String getDepartment() {
		// TODO Auto-generated method stub
		return super.getDepartment();
	}

	@Override
	public void setDepartment(String department) {
		// TODO Auto-generated method stub
		super.setDepartment(department);
	}

	@Override
	public String printCourses() {
		// TODO Auto-generated method stub
		super.printCourses();
		String str1="Subject"+"                                         "+"Points"+"                                         "+"Id"+"\n";
		for(int i=0;i<course.size();i++)
		{
			str1=str1+"  "+course.get(i).getCid()+"                                               "+ course.get(i).getPoints()+"                                               "+course.get(i).getSubject()+"\n";

		}
		return str1;
	}
	
	
}
