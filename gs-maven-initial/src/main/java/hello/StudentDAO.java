package hello;

import java.util.List;

import javax.sql.DataSource;

public interface StudentDAO {

public void setDataSource(DataSource ds);
public void update(int id);
public void insert(String name,int age, int id);
public student getstudent(int id);
public List<student> listStudents();
}
