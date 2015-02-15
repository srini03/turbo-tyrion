package hello;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");

	      StudentTemplate StudentTemplate = 
	      (StudentTemplate)context.getBean("studentDao");	
	      
	      System.out.println("--------Records Created------------");
	      StudentTemplate.insert("Srini ",31,14);
	      StudentTemplate.insert("Srini1",26,10);
	      StudentTemplate.insert("Srini2",28,11);
	      StudentTemplate.insert("Srini3",29,12);
	      StudentTemplate.insert("Srini3",30,13);
	      
	      System.out.println("----Listing Record with ID = 10 -----" );
	    
	      student student = StudentTemplate.getstudent(10);
	      
	      System.out.println("-----Print Records---------");
	      System.out.println("Age " + student.getAge());
	      System.out.println("Age " + student.getId());
	      System.out.println("Name " + student.getName());
	      
	      System.out.println("--------Records Updated------------");
	      StudentTemplate.update(10);
	      
          student student1 = StudentTemplate.getstudent(10);
	      
	      System.out.println("-----Print Updated Records---------");
	      System.out.println("Age " + student1.getAge());
	      System.out.println("Age " + student1.getId());
	      System.out.println("Name " + student1.getName());
	      
	      
	      
	      
	      System.out.println("-----Print Lists records---------");
	      
          List<student> students =  StudentTemplate.listStudents();
          
 
        	  for (student record : students) {
        	         System.out.print("ID : " + record.getId() );
        	         System.out.print(", Name : " + record.getName() );
        	         System.out.println(", Age : " + record.getAge());
        	      }

	      
	}
}
