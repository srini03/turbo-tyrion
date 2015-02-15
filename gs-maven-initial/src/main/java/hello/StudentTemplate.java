package hello;
import javax.sql.DataSource;

import java.util.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentTemplate implements StudentDAO{

private JdbcTemplate jdbcTemplateObject;
private DataSource datasource;

public void setDataSource(DataSource ds){
  this.datasource = ds;
  this.jdbcTemplateObject = new JdbcTemplate(ds);
}
	
public void update(int id)
{
  String sql="UPDATE STUDENT SET AGE=25 WHERE ID=?";
  jdbcTemplateObject.update(sql,10);
	
};

public void insert(String name, int age, int id)
{
	String sql="Insert into Student(id,name,age) values (?,?,?)";
	jdbcTemplateObject.update(sql,id,name,age);
}

public student getstudent(int id)
{	
	String SQL = "select * from Student where id = ?";
    student student = jdbcTemplateObject.queryForObject(SQL, 
                      new Object[]{id}, new StudentMapper());
    return student;
}

public List<student> listStudents() {
    String SQL = "select * from Student";
    List <student> students = jdbcTemplateObject.query(SQL, 
                              new StudentMapper());
    return students;
 }
	
}
