package in.kp.services;

import in.kp.beans.Student;
import in.kp.dao.StudentDao;

public class StudentServiceImpl  implements StudentService{

	private StudentDao stdDao;
	
	public void setStdDao(StudentDao stdDao) {
		this.stdDao = stdDao;
	}

	@Override
	public boolean addStdDetailsService(Student std) {
		boolean status = stdDao.addStudentDetailsDao(std);
		return status;
	}

}
