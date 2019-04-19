import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class Sys {
	 private ArrayList<Person> person=new ArrayList<Person>();
	 private ArrayList<Course> course=new ArrayList<Course>();

	public Sys() {
		super();
	}
	public ArrayList<Person> getPerson() {
		return person;
	}
	public void setPerson(ArrayList<Person> person) {
		this.person = person;
	}
	public ArrayList<Course> getCourse() {
		return course;
	}
	public void setCourse(ArrayList<Course> course) {
		this.course = course;
	}
	 public void addStudToCourse(String sId,String cId,double grade)
	 {
		 StudentInCourse add_Student_To_course_list;
		 if(FindStudent(sId) != null && FindCourse(cId) != null)
		 {
			 add_Student_To_course_list = new StudentInCourse(FindStudent(sId) ,FindCourse(cId),grade);
		     ( FindStudent(sId)).getStudent_in_course().add(add_Student_To_course_list);
		 }
	 }
	 public void RemoveStudFromCourse(String sId,String cId)
	 {
		 if(checkIfStudentInCourse(sId) == 1 && FindStudent(sId)!= null&& FindCourse(cId)!=null)
		 {
			 for(int i=0 ;i < FindStudent(sId).getStudent_in_course().size() ; i++) 
				{
					if(FindStudent(sId).getStudent_in_course().get(i).getStudent().getId().equals(sId) && FindCourse(cId).getCid().equals(cId))
						FindStudent(sId).getStudent_in_course().remove(FindStudent(sId).getStudent_in_course().get(i));
				}
		 }
	 }
	 public void addLecToCourse(String lId,String cId)
	 {
		 if(FindLecturer(lId) != null && FindCourse(cId) != null)
			 FindCourse(cId).setLecturer((Lecturer)FindLecturer(lId));
		     ((Lecturer)FindLecturer(lId)).getCourse().add(FindCourse(cId));
	 }
	 public void RemoveLecFromCourse(String cId)
	 {
		 FindCourse(cId).getLecturer().getCourse().remove(FindCourse(cId));
		 FindCourse(cId).setLecturer(null);
	 }
	 
	 public void SetGradeToStud(String sId , String cId , double grade)
	 {
		 if(FindStudent(sId) != null && FindCourse(cId) != null && checkIfStudentInCourse(sId) == 1)
		 {
			 for(int i = 0 ; i < FindStudent(sId).getStudent_in_course().size() ; i++)
			 {
				 FindStudent(sId).getStudent_in_course().get(i).setGrade(grade);
			 }
		 }
		 
	 }
	 
	 public double getGradeToStud(String sId , String cId)
	 {
		 double retval = 0;
		try{
				 if(FindStudent(sId) != null && FindCourse(cId) != null && checkIfStudentInCourse(sId) == 1)
				 {
					 for(int i = 0 ; i < FindStudent(sId).getStudent_in_course().size() ; i++)
					 {
						retval = FindStudent(sId).getStudent_in_course().get(i).getGrade();
						
					 }
				 }
			}catch (Exception e) {
				// TODO: handle exception
				 e.printStackTrace();
			}
		return retval;
	 }
	 
	 public void printAllStudsAverage()
	 {
		 for(int i=0;i<person.size();i++)
		 {
			 if(person.get(i) instanceof Student)
			 {
				try {
					System.out.println(((Student)person.get(i)).getStudAverage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
	 }
	 }
	 public void printStudAverage(String sId)
	 {
		 try {
		System.out.println( ((Student)FindStudent(sId)).getStudAverage());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	 }
	public String PrintCourses(String Pid)
	{
		String str1="";
			if(CheckIfPerson(Pid) != null)
			{
				if(CheckIfPerson(Pid) instanceof Student)
					str1=((Student)CheckIfPerson(Pid)).printCourses();
				else
					if(CheckIfPerson(Pid) instanceof Lecturer)
						str1 = ((Lecturer)CheckIfPerson(Pid)).printCourses();
			
				return str1;
			}
			else
				return "No Courses";
	}
	public void AddStudent(String sId , String Name , String Address , String dept, int year)
	{
		Person p1=new Student(sId, Name, Address, dept, year);
		person.add(p1);
		
	}
	public void AddLecturer(String lId,String Name,String Address,String dept,String status)
	{
		Person p1=new Lecturer(lId, Name, Address, dept, status);
		person.add(p1);
		
	}
	public void AddCourse(String cId, double point , String subj)
	{
		Course cor = new Course(cId, point, subj);
		course.add(cor);
		
	}
	public void PrintAllCourses()
	{
		for(int i=0;i<course.size();i++)
		{
			System.out.println( course.get(i).getCid());
			System.out.println( course.get(i).getPoints());
			System.out.println( course.get(i).getSubject());
			
		}
	}
	public void PrintAllStuds()
	{
		for(int i=0;i<person.size();i++)
		{
			if(person.get(i) instanceof Student)
			{
			System.out.println( ((Student)person.get(i)).getId());
			System.out.println( ((Student)person.get(i)).getName());
			System.out.println( ((Student)person.get(i)).getAddress());
			System.out.println( ((Student)person.get(i)).getDepartment());
			System.out.println( ((Student)person.get(i)).getYear());
			}
	}
		}
	public void PrintAllLecturers()
	{
		for(int i=0;i<person.size();i++)
		{
			if(person.get(i) instanceof Lecturer)
			{
			System.out.println( (( Lecturer)person.get(i)).getId());
			System.out.println( (( Lecturer)person.get(i)).getName());
			System.out.println( (( Lecturer)person.get(i)).getAddress());
			System.out.println( (( Lecturer)person.get(i)).getDepartment());
			System.out.println( (( Lecturer)person.get(i)).getStatus());
			}
	}
		}
	public int getNumOfCourses()
	{
		return course.size();
	}
	public int getNumOfStuds()
	{
		int count=0;
		for(int i=0;i<person.size();i++)
		{
			if(person.get(i) instanceof Student)
			{
			count++;
			}
	}
		return count;
	}
	public int getNumOfLecurers()
	{
		int count=0;
		for(int i=0;i<person.size();i++)
		{
			if(person.get(i) instanceof Lecturer)
			{
			count++;
			}
	}
		return count;
	}
/************************************************* my functions****************************************************************/	
	 public Student FindStudent(String sId)
	 {
		Student retval = null;
		for(int i=0 ;i<person.size();i++) 
		{
			if(person.get(i).getId().equals(sId) && person.get(i) instanceof Student )
				retval = (Student)person.get(i);
		}
		 return retval;
	 }
	 
	 public Lecturer FindLecturer(String lId)
	 {
		 Lecturer retval = null;
		for(int i=0;i<person.size();i++) 
		{
			if(person.get(i).getId().equals(lId) && person.get(i) instanceof Lecturer )
				retval = (Lecturer)person.get(i);
		}
		if(retval != null) return retval;
		else return null;
	 }
	 public Course FindCourse(String cId)
	 {
		 Course retval = null;
		for(int i=0;i<course.size();i++) 
		{
			if(course.get(i).getCid().equals(cId))
				retval=course.get(i);
		}
		if(retval != null) return retval;
		else return null;
	 }
	 public int checkIfStudentInCourse(String sId)
	 {
		 
		int retval = 0;
		if(FindStudent(sId) != null)
		{
			for(int i=0;i<FindStudent(sId).getStudent_in_course().size();i++) 
			{
				if(FindStudent(sId).getStudent_in_course().get(i).getStudent().getId().equals(sId))
					retval = 1;
			}
				
		}
		return retval;
	 }
	 
	 public Person CheckIfPerson (String Pid)
	 {
		Person retval = null;
		for(int i=0 ;i<person.size();i++) 
		{
			if(person.get(i).getId().equals(Pid) ) retval = person.get(i);
		}
		if(retval != null) return retval;
		else return null;
	 }
	 
	 public boolean isStringAlpha(String aString) {
	        int charCount = 0;
	        String isNot = "\"!@#$%^&*()_+|\\/.;:1234567890?<>=[]{}\";";
	        if (aString.length() == 0) return false;//zero length string ain't alpha
	        for (int i = 0; i < aString.length(); i++) {
	            for (int j = 0; j < isNot.length(); j++) {
	                if (aString.substring(i, i + 1).equals(isNot.substring(j, j + 1)))
	                    charCount++;
	            }
	            if (charCount > 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	    public boolean isStringNum(String aString) {
	        int charCount = 0;
	        String isNot = "0123456789";
	        if (aString.length() != 9) return false;//zero length string ain't alpha
	        for (int i = 0; i < aString.length(); i++) {
	            for (int j = 0; j < isNot.length(); j++) {
	                if(aString.substring(i, i + 1).equals(isNot.substring(j, j + 1)))
	                    charCount++;
	            }
	            if(charCount != (i+1)){
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public boolean CheckNum(String aString) {
	        int charCount = 0;
	        String isNot = "0123456789.";
	        if (aString.length() > 9) return false;
	        for (int i = 0; i < aString.length(); i++) {
	            for (int j = 0; j < isNot.length(); j++) {
	                if(aString.substring(i, i + 1).equals(isNot.substring(j, j + 1)))
	                    charCount++;
	            }
	            if(charCount != (i+1)){
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public boolean CheckGrade(String aString) {
	        int charCount = 0;
	        String isNot = "0123456789.";
	        if (aString.length() > 3) return false;
	        for (int i = 0; i < aString.length(); i++) {
	            for (int j = 0; j < isNot.length(); j++) {
	                if(aString.substring(i, i + 1).equals(isNot.substring(j, j + 1)))
	                    charCount++;
	            }
	            if(charCount != (i+1)){
	                return false;
	            }
	        }
	        return true;
	    }
	    
	 
}

