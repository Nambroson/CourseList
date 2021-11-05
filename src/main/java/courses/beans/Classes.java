package courses.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
@Entity
public class Classes {
	@Id
	@GeneratedValue
	private long id;
	private String className;
	private String subject;
	private String term;
	private String number;
	@Autowired
	private Teacher teacher;
	
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(String className) {
		super();
		this.className = className;
	}

	public Classes(String className, String subject, String term, String number) {
		super();
		this.className = className;
		this.subject = subject;
		this.term = term;
		this.number = number;
	}

	public Classes(long id, String className, String subject, String term, String number) {
		super();
		this.id = id;
		this.className = className;
		this.subject = subject;
		this.term = term;
		this.number = number;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTerm() {
		return term;
	}

	public void setTerm(String term) {
		this.term = term;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes [id=" + id + ", className=" + className + ", subject=" + subject + ", term=" + term + ", number=" + number
				+ ", teacher=" + teacher + "]";
	}


	
	
}
