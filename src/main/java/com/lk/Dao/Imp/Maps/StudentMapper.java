package com.lk.Dao.Imp.Maps;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.lk.Model.Student;

public class StudentMapper implements RowMapper<Student> {


	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stu = new Student();
		stu.setId(rs.getInt("ID"));
		stu.setName(rs.getString("NAME"));
		return stu;
		
	}

}
