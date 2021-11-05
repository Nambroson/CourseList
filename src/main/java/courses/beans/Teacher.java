package courses.beans;

import javax.persistence.Embeddable;

/**
 * @author Nick - ntambroson
 * CIS175 - Fall 2021
 * Nov 4, 2021
 */
@Embeddable
public class Teacher {
	private String name;
	private String email;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", email=" + email + "]";
	}

	
}
