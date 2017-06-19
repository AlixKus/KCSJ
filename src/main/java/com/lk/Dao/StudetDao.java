package com.lk.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lk.Model.Student;
import com.lk.Model.StudentTeacher;

@Service 
public class StudetDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(readOnly = true)
	public List<Student> findAll() {
		String sql = "select * from student";
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

	@Transactional
	public List<StudentTeacher> getStAndTc() {
		return (List<StudentTeacher>) jdbcTemplate.query(
				"SELECT teacher.name AS tname, student.name as sname FROM student INNER JOIN teacher ON student.teacherId = teacher.id",
				new RowMapper<StudentTeacher>() {
					@Override
					public StudentTeacher mapRow(ResultSet rs, int rowNum) throws SQLException {
						StudentTeacher stu = new StudentTeacher();
						stu.setName(rs.getString("tname"));
						stu.setTeacherName(rs.getString("sname"));
						return stu;
					}
				});

	}

	@Transactional
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
