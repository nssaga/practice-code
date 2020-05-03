package nssaga.advance.designPattern.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	
	List<Student> students;
	
	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		
		Student student1 = new Student("Nawal", 0);
		Student student2 = new Student("Kumar", 1);
		Student student3 = new Student("Sah", 2);
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
	}

	@Override
	public List<Student> getAllStudents() {		
		return students;
	}

	@Override
	public Student getStudent(int rollNo) {		
		return students.get(rollNo);
	}

	@Override
	public void updateStudent(Student student) {
		students.get(student.getRollNo()).setName(student.getName());
		System.out.println(student.getRollNo()+" updated in DB.");
	}

	@Override
	public void deleteStudent(Student student) {
		students.remove(student.getRollNo());
		System.out.println(student.getRollNo()+" deleted from DB");
	}

}
