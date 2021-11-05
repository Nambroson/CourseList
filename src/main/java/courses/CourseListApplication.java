package courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import courses.beans.Classes;
import courses.beans.Teacher;
import courses.controller.BeanConfiguration;
import courses.repository.ClassesRepository;

@SpringBootApplication
public class CourseListApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseListApplication.class, args);
	}

	@Autowired
	ClassesRepository repo;

	public void run(String... args) throws Exception{

		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);

		Classes c = appContext.getBean("classes", Classes.class);
		c.setClassName("Java II");
		repo.save(c);

		Classes d = new Classes("Chemistry", "SCI", "Fall 2021", "101");
		Teacher t = new Teacher("Ambroson, Hayley", "hrambroson@dmacc.edu");
		d.setTeacher(t);
		repo.save(d);

		List<Classes> allMyClasses = repo.findAll();
		for(Classes chosenClass: allMyClasses) {
			System.out.println(chosenClass.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}
}
