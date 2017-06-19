package com.lk.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.lk.Dao.StudetDao;
import com.lk.Model.Student;
import com.lk.Model.StudentTeacher;

@Service
public class StudentService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private StudetDao dao;
	
	public List<StudentTeacher> getStScList() {
		return dao.getStAndTc();
	}
	
	public List<Student> getListDao() {
		return dao.getList();
	}
	
	public List<Student> getList() {
		String sql = "SELECT ID,NAME FROM STUDENT";
		return (List<Student>) jdbcTemplate.query(sql, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu = new Student();
				stu.setId(rs.getInt("ID"));
				stu.setName(rs.getString("NAME"));
				return stu;
			}

		});
	}
}
