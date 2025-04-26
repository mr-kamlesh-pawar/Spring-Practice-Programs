package in.kp.dao;

import in.kp.beans.Student;

public interface StudentDao {
	
	public void addStudentDetails(Student std);
	public void updateStudentDetails(Student std);
	public void deleteStudentDetails(Student std);
	public void showStudentDetails(int id);

}
