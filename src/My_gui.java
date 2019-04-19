import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class My_gui  extends JFrame implements ActionListener  {
	public Sys sys = new Sys();
	JButton newStudent = new JButton("Add New Student");
	JButton newLecturer = new JButton("Add New Lecturer");
	JButton newCourse = new JButton("Add New Course");
	JButton AddStuTOCourse = new JButton("Add Student To Course");
	JButton AddlecTOCourse = new JButton("Add Lecturer To Course");
	JButton RemoveStuFromCourse = new JButton("Remove Student From Course");
	JButton RemoveLecFromTOCourse = new JButton("Remove Lecturer From Course");
	JButton SetGradeForStud = new JButton("Set Grade To Student In Course");
	JButton getGradeToStud = new JButton("Get Grade Of Student In Course");
	JButton printStudAverage = new JButton("Print Student Average");
	JButton printAllStudsAverage = new JButton("Print All Studrnts Average");
	JButton GetCourseList = new JButton("Print All Courses");
	JButton GetStudsList = new JButton("Print All Students");
	JButton GetLecList = new JButton("Print All Lecturers");
	JButton GetCourseNum = new JButton("Get Num Of Courses");
	JButton GetStudsNum = new JButton("Get Num Of Students");
	JButton GetLecNum = new JButton("Get Num Of Lecturers");
	JButton PersonCourses = new JButton("Print Courses To Studnet Or Lecturer");
	JButton close = new JButton("Quit");

	public My_gui() throws HeadlessException {
		super("School Mangement System");
		JPanel p= new JPanel(new GridLayout(0,2)); 
		p.add(newStudent); 
		p.add(newLecturer);
		p.add(newCourse);
		p.add(AddStuTOCourse);
		p.add(AddlecTOCourse);
		p.add(RemoveStuFromCourse);
		p.add(RemoveLecFromTOCourse);
		p.add(SetGradeForStud);
		p.add(getGradeToStud);
		p.add(printStudAverage);
		p.add(printAllStudsAverage);
		p.add( GetCourseList);
		p.add(GetStudsList);
		p.add(GetLecList);
		p.add(GetCourseNum);
		p.add(PersonCourses);
		p.add(GetStudsNum);
		p.add(GetLecNum);
		setLayout(new BorderLayout()); 
        add(p,BorderLayout.NORTH);

		pack();  
		AddStuTOCourse.addActionListener(this);
		AddlecTOCourse.addActionListener(this);
		RemoveStuFromCourse.addActionListener(this);
		RemoveLecFromTOCourse .addActionListener(this);
		SetGradeForStud .addActionListener(this);
		GetCourseList.addActionListener(this);
		GetStudsList.addActionListener(this);
		GetLecList.addActionListener(this);
		newStudent.addActionListener(this);
		newLecturer.addActionListener(this);
		newCourse.addActionListener(this);
		close.addActionListener(this);
		GetCourseNum.addActionListener(this);
		GetStudsNum.addActionListener(this);
		GetLecNum.addActionListener(this);
		PersonCourses.addActionListener(this);
		getGradeToStud.addActionListener(this);
		printStudAverage.addActionListener(this);
		printAllStudsAverage.addActionListener(this);
}

	public void actionPerformed(ActionEvent ev)
	{
		if("Add Student To Course".equals(ev.getActionCommand()))
		{
			AddStudToCourse  f = new AddStudToCourse ();
			f.show();
		}
		else
			if("Add Lecturer To Course".equals(ev.getActionCommand()))
			{
				AddLecToCourse  f = new AddLecToCourse ();
				f.show();
			}
			else
				if("Remove Student From Course".equals(ev.getActionCommand()))
				{
					RemoveStudFromCourse f = new RemoveStudFromCourse ();
					f.show();
				}
				else
					if("Remove Lecturer From Course".equals(ev.getActionCommand()))
					{
						RemoveLecFromCourse f = new RemoveLecFromCourse ();
						f.show();
					}
					else
						if("Set Grade To Student In Course".equals(ev.getActionCommand()))
						{
							SetGradeToStudentInCourse  f = new SetGradeToStudentInCourse();
							f.show();
						}
						else
							if("Print All Courses".equals(ev.getActionCommand()))
							{
								CourseList  f = new CourseList ();
								f.show();
							}
							else
								if("Print All Students".equals(ev.getActionCommand()))
								{
									StudList  f = new StudList ();
									f.show();
								}
								else
									if("Add New Student".equals(ev.getActionCommand()))
									{
										AddNewStudentt  f = new AddNewStudentt ();
										f.show();
									}
									else
										if("Add New Lecturer".equals(ev.getActionCommand()))
										{
											AddLec  f = new AddLec();
											f.show();
										}
		
									else
										if("Print All Lecturers".equals(ev.getActionCommand()))
										{
											LecList  f = new LecList ();
											f.show();
										}
										else
											if("Add New Course".equals(ev.getActionCommand()))
											{
												AddCourse  f = new AddCourse ();
												f.show();
											}
											else
												if("Get Num Of Courses".equals(ev.getActionCommand()))
												{
													JOptionPane.showMessageDialog( close,sys.getNumOfCourses());
												}
												else
													if("Get Num Of Students".equals(ev.getActionCommand()))
													{
														JOptionPane.showMessageDialog( close,sys.getNumOfStuds());
													}
													else
														if("Get Num Of Lecturers".equals(ev.getActionCommand()))
														{
															JOptionPane.showMessageDialog( close,sys.getNumOfLecurers());
														}
														else
															if("Print Courses To Studnet Or Lecturer".equals(ev.getActionCommand()))
															{
																AnyPersonCourseList f = new AnyPersonCourseList();
																f.show();
															}
															else
																if("Get Grade Of Student In Course".equals(ev.getActionCommand()))
																{
																	getGradeToStud f = new getGradeToStud();
																	f.show();
																}
																else
																	if("Print Student Average".equals(ev.getActionCommand()))
																	{
																		printStudAverage f = new printStudAverage();
																		f.show();
																	}
																	else
																		if("Print All Studrnts Average".equals(ev.getActionCommand()))
																		{
																			printAllStudsAverage f = new printAllStudsAverage();
																			f.show();
																		}
		}
	
	public class AddNewStudentt  extends JFrame implements ActionListener{
		JButton newStudent = new JButton("Add New Student");
		JButton close = new JButton("Quit");
		Label label1=new Label("Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Name");
		TextField text2= new TextField(20);
		Label label3=new Label("Address");
		TextField text3= new TextField(20);
		TextField text4= new TextField(20);
		Label label4=new Label("Department");
		
		public AddNewStudentt() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(text3);
			p.add(label3);
			p.add(text4);
			p.add(label4);
			p.add(newStudent);
			setLayout(new BorderLayout());
	        add(p,BorderLayout.NORTH);
			pack(); 
			newStudent.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Add New Student".equals(ev.getActionCommand()))
				{
					if(text1.getText().isEmpty()||text2.getText().isEmpty()||text3.getText().isEmpty()||text4.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					if(sys.isStringNum(text1.getText())== false || sys.isStringAlpha(text2.getText())== false || sys.isStringAlpha(text3.getText()) == false|| sys.isStringAlpha(text4.getText())== false)
							JOptionPane.showMessageDialog( close,"INVALID INPUT");
					else
					{
						sys.AddStudent(text1.getText(),text2.getText(),text3.getText(),text4.getText(),1);
						text1.setText("");
						text2.setText("");
						text3.setText("");
						text4.setText("");
						JOptionPane.showMessageDialog( close,"Done Successfully");
						this.hide();
					}
				}
			}
}
	public class AddLec  extends JFrame implements ActionListener{
		JButton newStudent = new JButton("Add New Lecturer");
		JButton close = new JButton("Quit");
		Label label1=new Label("Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Name");
		TextField text2= new TextField(20);
		Label label3=new Label("Address");
		TextField text3= new TextField(20);
		Label label4=new Label("Department");
		TextField text4= new TextField(20);
		Label l5=new Label("Status");
		TextField t5= new TextField(20);
		public AddLec() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(text3);
			p.add(label3);
			p.add(text4);
			p.add(label4);
			p.add(t5);
			p.add(l5);
			p.add(newStudent);
			setLayout(new BorderLayout());
	        add(p,BorderLayout.NORTH);
			pack();  
			newStudent.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Add New Lecturer".equals(ev.getActionCommand()))
				{
					if(text1.getText().isEmpty() || text2.getText().isEmpty() || text3.getText().isEmpty() || text4.getText().isEmpty() || t5.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					if(sys.isStringNum(text1.getText()) == false || sys.isStringAlpha(text2.getText()) == false || sys.isStringAlpha(text3.getText()) == false|| sys.isStringAlpha(text4.getText())== false || sys.isStringAlpha(t5.getText()) == false)
						JOptionPane.showMessageDialog( close,"INVALID INPUT");
					else
					{
						sys.AddLecturer(text1.getText(),text2.getText(),text3.getText(),text4.getText(),t5.getText());
						text1.setText("");
						text2.setText("");
						text3.setText("");
						text4.setText("");
						t5.setText("");
						JOptionPane.showMessageDialog(close,"Done Successfully");
						this.hide();
					}
				}
			}
}
	public class AddStudToCourse  extends JFrame implements ActionListener{
		JButton add = new JButton("Add Student To Course");
		JButton close = new JButton("Quit");
		Label label1=new Label("Student Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Course Id");
		TextField text2= new TextField(20);
		Label label3=new Label("Grade");
		TextField text3= new TextField(20);
		public AddStudToCourse() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(text3);
			p.add(label3);;
			p.add(add);
			setLayout(new BorderLayout()); 
	        add(p,BorderLayout.NORTH);
			pack();     
			add.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Add Student To Course".equals(ev.getActionCommand()))
				{
					if(text1.getText().isEmpty()||text2.getText().isEmpty()||text3.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					if(sys.isStringNum(text1.getText()) == false || sys.CheckNum(text2.getText()) == false || sys.CheckGrade(text3.getText()) == false)
						JOptionPane.showMessageDialog( close,"INVALID INPUT");
					else
					{
						if(sys.FindStudent(text1.getText()) != null && sys.FindCourse(text2.getText()) != null)
						{
							sys.addStudToCourse(text1.getText(),(text2.getText()),Double.parseDouble(text3.getText()));
							text1.setText("");
							text2.setText("");
							text3.setText("");
							JOptionPane.showMessageDialog( close,"Done Successfully");
							this.hide();
						}
						else JOptionPane.showMessageDialog( close,"The Student Or The Course Is Not Exist");
					}
				}

			}
}
	public class AddLecToCourse  extends JFrame implements ActionListener{
		JButton add = new JButton("Add Lecturer To Course");
		JButton close = new JButton("Quit");
		Label label1=new Label("Lecturer Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Course Id");
		TextField text2= new TextField(20);
		public AddLecToCourse() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(add);
			setLayout(new BorderLayout());
	        add(p,BorderLayout.NORTH);
			pack();
			add.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Add Lecturer To Course".equals(ev.getActionCommand()))
				{
					if(text1.getText().isEmpty()||text2.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					if(sys.isStringNum(text1.getText()) == false || sys.CheckNum(text2.getText()) == false)
						JOptionPane.showMessageDialog(close, "INVALID INPUT");
					else
					{
						if(sys.FindLecturer(text1.getText()) != null && sys.FindCourse(text2.getText()) != null )
						{
							sys.addLecToCourse(text1.getText(),text2.getText());
							text1.setText("");
							text2.setText("");
							JOptionPane.showMessageDialog( close,"Done Successfully");
							this.hide();
						}
						else JOptionPane.showMessageDialog(close, "The Lecturer Or The Course Dose Not Exist");
					}
				}	

			}
}
	public class RemoveStudFromCourse  extends JFrame implements ActionListener{
		JButton remove = new JButton("Delete");
		JButton close = new JButton("Quit");
		Label label1=new Label("Student Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Course Id");
		TextField text2= new TextField(20);
		public RemoveStudFromCourse() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(remove);
			setLayout(new BorderLayout()); 
	           add(p,BorderLayout.NORTH);
	       
			pack(); 
			remove.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Delete".equals(ev.getActionCommand()))
				{
					if(text1.getText().isEmpty()||text2.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					else
					{
						if(sys.FindStudent(text1.getText()) != null && sys.FindCourse(text2.getText()) != null)
						{
							if(sys.isStringNum(text1.getText()) == true && sys.CheckNum(text2.getText()) == true)
							{
								 sys.RemoveStudFromCourse(text1.getText(),text2.getText());
								 text1.setText("");
								 text2.setText("");
								 JOptionPane.showMessageDialog( close,"Done Successfully");
								 this.hide();
							}
							else JOptionPane.showMessageDialog(close, "INVALID INPUT");
						}
						else JOptionPane.showMessageDialog(close, "The Student Or The Course Not Exists");
					}
				}
			}
}
	public class RemoveLecFromCourse  extends JFrame implements ActionListener{
		JButton remove = new JButton("Delete");
		JButton close = new JButton("Quit");
		Label label2=new Label("Course Id");
		TextField text2= new TextField(20);
		public RemoveLecFromCourse() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text2);
			p.add(label2);
			p.add(remove);
			setLayout(new BorderLayout()); 
	           add(p,BorderLayout.NORTH);
			pack();
			remove.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Delete".equals(ev.getActionCommand()))
				{
					if(text2.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					else
					{
						if(sys.FindCourse(text2.getText()) != null && sys.CheckNum(text2.getText()) == true)
						{
							sys.RemoveLecFromCourse((text2.getText()));
						 	text2.setText("");
						 	//this.hide();
						}
						else JOptionPane.showMessageDialog(close ,"The Cousre Not Exist Or INVALID INPUT" );
					}
				}
			}
	}
	public class SetGradeToStudentInCourse extends JFrame implements ActionListener{
		JButton newStudent = new JButton("Set");
		JButton close = new JButton("Quit");
		Label label1=new Label("Student Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Course Id");
		TextField text2= new TextField(20);
		Label label3=new Label("Grade");
		TextField text3= new TextField(20);
		public SetGradeToStudentInCourse() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(text3);
			p.add(label3);
			p.add(newStudent);
			setLayout(new BorderLayout()); 
	        add(p,BorderLayout.NORTH);
			pack();
			newStudent.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
			if("Set".equals(ev.getActionCommand()))
			{
				if(text1.getText().isEmpty() || text2.getText().isEmpty() || text3.getText().isEmpty())
					JOptionPane.showMessageDialog(close, "Please FiLL All Fields ^_^");
				else 
				{
					if(sys.isStringNum(text1.getText()) == false || sys.CheckNum(text2.getText()) == false)
						JOptionPane.showMessageDialog(close, "You Have Typed INVALID DATA -_-");
					if(sys.FindStudent(text1.getText()) != null)
					{
						if(sys.FindCourse(text2.getText()) != null)
						{
							if(sys.CheckGrade(text3.getText()) == true)
							{
								sys.SetGradeToStud(text1.getText(), text2.getText(),Double.parseDouble(text3.getText()));
								JOptionPane.showMessageDialog( close,"Done Successfully");
								this.hide();
							}
							else JOptionPane.showMessageDialog(close, "The Grade Is *INVALID* ","input validity error", JOptionPane.ERROR_MESSAGE);
						}
						else JOptionPane.showMessageDialog(close, "the course dosenot exist");
					}
					else JOptionPane.showMessageDialog(close, "the Student  dosenot exist","input validity error", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
}
	
	public class getGradeToStud extends JFrame implements ActionListener{
		
		List list = new List();
		JButton ShowGrade = new JButton("Show");
		JButton close = new JButton("Exit");
		Label labelabel1 = new Label("Student Id");
		TextField text1 = new TextField(20);
		Label labelabel2 = new Label("Course Id");
		TextField field2 = new TextField(20);
		
		public getGradeToStud() throws HeadlessException{
			super("SHOW ME THE GRADE");
			JPanel panel = new JPanel(new GridLayout(0, 2));
			panel.add(text1);
			panel.add(labelabel1);
			panel.add(field2);
			panel.add(labelabel2);
			panel.add(ShowGrade);
			setLayout(new BorderLayout());
			add(panel,BorderLayout.NORTH);
			pack();
			ShowGrade.addActionListener(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String titles = "Student Id"+ "Name" + "Subject" + "Grade";
			list.add(titles);
			double grade = 0;
			if("Show".equals(e.getActionCommand()))
			{
				if(text1.getText().isEmpty() || field2.getText().isEmpty())
					JOptionPane.showMessageDialog( close,"Please FiLL All Fields ^_^");
				if(sys.isStringNum(text1.getText()) == false || sys.CheckNum(field2.getText()) == false)
					JOptionPane.showMessageDialog(close, "You Have Typed INVALID DATA -_-");
				if(sys.FindStudent(text1.getText()) != null)
				{
					if(sys.FindCourse(field2.getText()) != null)
					{
						grade = sys.getGradeToStud(text1.getText(), field2.getText());
						JOptionPane.showMessageDialog(close, grade);
					}
					else JOptionPane.showMessageDialog(close, "the course dosenot exist");
				}
				else JOptionPane.showMessageDialog(close, "the Student  dosenot exist","input validity error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	public class printStudAverage extends JFrame implements ActionListener{

		List list = new List();
		JButton ShowAvg = new JButton("Show");
		JButton close = new JButton("Exit");
		Label labelabel1 = new Label("Student Id");
		TextField text1 = new TextField(20);
		
		public printStudAverage()throws HeadlessException {
			super("SHOW ME THE AVG");
			JPanel panel = new JPanel(new GridLayout(0, 2));
			panel.add(text1);
			panel.add(labelabel1);
			panel.add(ShowAvg);
			setLayout(new BorderLayout());
			add(panel,BorderLayout.NORTH);
			pack();
			ShowAvg.addActionListener(this);
		}
		
		@Override
		public void actionPerformed(ActionEvent ev) {

			String titles = "Name" + "Average";
			list.add(titles);
			
			if("Show".equals(ev.getActionCommand()))
			{
				if(text1.getText().isEmpty())
					JOptionPane.showMessageDialog( close,"Please Fill All Fields");
				else
				{
					if(sys.FindStudent(text1.getText()) != null)
					{
						
						try {
							JOptionPane.showMessageDialog( close,sys.FindStudent(text1.getText()).getStudAverage());
						} catch (HeadlessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else JOptionPane.showMessageDialog(close, "the Student  dosenot exist","input validity error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		}
	}
	
	public class printAllStudsAverage extends JFrame implements ActionListener{

		List list = new List();
		JButton ShowAvg = new JButton("Show");
		JButton close = new JButton("Exit");
		Label labelabel1 = new Label("Student Id");
		TextField text1 = new TextField(20);
		
		public printAllStudsAverage()throws HeadlessException {
			super("SHOW ME THE AVG");
			JPanel panel = new JPanel(new GridLayout(0, 2));
			JTextArea area = new JTextArea(10,35);
			panel.add(area);
			setLayout(new BorderLayout());
			add(panel,BorderLayout.NORTH);
			String str1="Id                        grade \n ";
			list.add(str1);
			for(int i=0;i<sys.getPerson().size();i++)
			{
				if((sys.getPerson().get(i)) instanceof Student)
				{
				try {
					str1=str1+((Student)sys.getPerson().get(i)).getId()+"                        "+((Student)sys.getPerson().get(i)).getStudAverage()+"\n";
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			}
			area.setText(str1);
			pack();
			ShowAvg.addActionListener(this);
		}
		
		@Override
		public void actionPerformed(ActionEvent ev) {

			String titles = "Name" + "Average";
			list.add(titles);
			
			if("Show".equals(ev.getActionCommand()))
			{
				if(text1.getText().isEmpty())
					JOptionPane.showMessageDialog( close,"Please Fill All Fields");
				else
				{
					if(sys.FindStudent(text1.getText()) != null)
					{
						sys.printStudAverage(text1.getText());
					}
					else JOptionPane.showMessageDialog(close, "the Student  dosenot exist","input validity error", JOptionPane.ERROR_MESSAGE); 
				}
			}
		}
	}
	
	
	
	public class AddCourse extends JFrame implements ActionListener{
		JButton newStudent = new JButton("Add Course");
		JButton close = new JButton("Quit");
		Label label1=new Label("Course Id");
		TextField text1= new TextField(20);
		Label label2=new Label("Points");
		TextField text2= new TextField(20);
		Label label3=new Label("Name");
		TextField text3= new TextField(20);
		public AddCourse() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,2));
			p.add(text1);
			p.add(label1);
			p.add(text2);
			p.add(label2);
			p.add(text3);
			p.add(label3);
			p.add(newStudent);
			setLayout(new BorderLayout()); 
	        add(p,BorderLayout.NORTH);
			pack();
			newStudent.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Add Course".equals(ev.getActionCommand()))
				{
					if(text1.getText().isEmpty()||text2.getText().isEmpty()||text3.getText().isEmpty())
						JOptionPane.showMessageDialog( close,"Please Fill All Fields");
					else
					{
						if(sys.FindCourse(text1.getText()) == null)
						{
							if(sys.CheckNum(text1.getText()) == true && sys.CheckNum(text2.getText()) == true && sys.isStringAlpha(text3.getText()) == true)
							{
								sys.AddCourse((text1.getText()), Double.parseDouble(text2.getText()), text3.getText());
								text1.setText("");
								text2.setText("");
								text3.setText("");
								JOptionPane.showMessageDialog( close,"Done Successfully");
								this.hide();
							}
							else JOptionPane.showMessageDialog(close, "INVALID INPUT");
						}
						else JOptionPane.showMessageDialog( close,"The Cousre is Exist");
					}
				}
			}
}
	public class CourseList extends JFrame implements ActionListener{ 
		protected JTextArea text1 = new JTextArea(10,35);
		JButton close = new JButton("Quit");
		public  CourseList() throws HeadlessException {
			super("School Mangement System");
			String str1="Course Id" + "                                         "+"Points"+"                                         "+"Subject"+"\n";
			for(int i=0;i<sys.getNumOfCourses();i++)
			{
				str1=str1+"  "+sys.getCourse().get(i).getCid()+"                                                       "+sys.getCourse().get(i).getPoints()+"                                               "+sys.getCourse().get(i).getSubject()+"\n";
			}
			text1.setText(str1);
			setLayout(new BorderLayout()); 
	        add(text1,BorderLayout.NORTH);
			pack();
	}
		public void actionPerformed(ActionEvent ev)
		{
			String arg = ev.getActionCommand();

			}
}
	public class StudList extends JFrame implements ActionListener{
		List list = new List();  
		protected JTextArea text1 = new JTextArea(10,40);
		JButton close = new JButton("Quit");
		public  StudList() throws HeadlessException {
			super("School Mangement System");
			String str1="       "+"Name"+"                       "+"Address"+"                       "+"Id"+"                      "+"Department"+"\n";
			list.add(str1);
			for(int i=0;i<sys.getPerson().size();i++)
			{
				if((sys.getPerson().get(i)) instanceof Student)
				{
					str1=str1+"         "+((Student)sys.getPerson().get(i)).getDepartment()+"                                    "+((Student)sys.getPerson().get(i)).getYear()+"                            "+((Student)sys.getPerson().get(i)).getId()+"                           "+((Student)sys.getPerson().get(i)).getAddress()+"                           "+((Student)sys.getPerson().get(i)).getName()+"\n";
				}
			}
			text1.setText(str1);
			setLayout(new BorderLayout()); 
	           add(text1,BorderLayout.NORTH);
			pack();
	}
		public void actionPerformed(ActionEvent ev)
		{
			String arg = ev.getActionCommand();
			}}
	
	public class LecList extends JFrame implements ActionListener{
		List list = new List();  
		protected JTextArea text1 = new JTextArea(10,40);
		JButton close = new JButton("Quit");
		public  LecList() throws HeadlessException {
			super("School Mangement System");
			String str1="     "+"Id"+"                       "+"Name"+"                       "+"Address"+"                       "+"Department"+"                      "+"Status"+"\n";
			list.add(str1);
			for(int i=0;i<sys.getPerson().size();i++)
			{
				if((sys.getPerson().get(i)) instanceof Lecturer)
				{
					str1=str1+((Lecturer)sys.getPerson().get(i)).getId()+"                  "+((Lecturer)sys.getPerson().get(i)).getStatus()+"                                            "+((Lecturer)sys.getPerson().get(i)).getDepartment()+"                           "+((Lecturer)sys.getPerson().get(i)).getAddress()+"                               "+((Lecturer)sys.getPerson().get(i)).getName()+"\n";
				}
			}
			text1.setText(str1);
			setLayout(new BorderLayout()); 
	        add(text1,BorderLayout.NORTH);
			pack();
	}
		public void actionPerformed(ActionEvent ev)
		{
			String arg = ev.getActionCommand();
			}}
	
	public class AnyPersonCourseList extends JFrame implements ActionListener{
		protected JTextArea text1 = new JTextArea(10,35);
		JButton close = new JButton("Quit");
		Label label2=new Label("Id");
		TextField text2= new TextField(20);
		JButton show = new JButton("Show");
		
		public  AnyPersonCourseList() throws HeadlessException {
			super("School Mangement System");
			JPanel p= new JPanel(new GridLayout(0,3));
			p.add(text2);
			p.add(label2);
			p.add(show);
			setLayout(new BorderLayout()); 
	        add(p,BorderLayout.NORTH);
	        add(text1,BorderLayout.CENTER);
			pack();
			show.addActionListener(this);
	}
		public void actionPerformed(ActionEvent ev)
		{
				if("Show".equals(ev.getActionCommand()))
				{
					text1.setText(sys.PrintCourses((text2.getText())));
				}
		}
	}
	
}