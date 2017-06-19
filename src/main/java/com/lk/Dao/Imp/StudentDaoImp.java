/**
 * 
 */
package com.lk.Dao.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lk.Dao.Imp.Maps.StudentMapper;
import com.lk.Dao.Interface.StudentDaoInterface;
import com.lk.Model.Student;

/**
 * @author 刘坤
 *
 */
@Repository
public class StudentDaoImp implements StudentDaoInterface {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from student";
		return jdbcTemplate.query(sql, new StudentMapper());
	}

}
