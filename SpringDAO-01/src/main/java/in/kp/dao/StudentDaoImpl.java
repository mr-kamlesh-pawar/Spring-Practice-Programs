package in.kp.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import in.kp.beans.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbctemplate;

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	
	

	@Override
	public boolean addStudentDetailsDao(Student std) {

		String query=  "insert into t1 values(?,?,?)";
		int count = jdbctemplate.update(query, std.getId(), std.getName(), std.getCollege());
		
		boolean status=false;
		if(count > 0) {
			status=true;
			
		} else {
			status=false;
		}
		return status;
	}

}
