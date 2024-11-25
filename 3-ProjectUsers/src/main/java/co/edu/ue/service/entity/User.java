package co.edu.ue.service.entity;

public class User {
	
	// 1. Declaracion de atributos
	private Integer id;
	private String name;
	private String lastName;
	private String mail;
	
	// 2. Contructor
	public User(int id, String name, String lastName, String mail) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
	}
	
	public User() {
		super();
	}
	
	// 3. Setters and Getters "Son los metodos de acceso a los atributos"																																													
	public Integer getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	//
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", mail=");
		builder.append(mail);
		builder.append("]");
		return builder.toString();
	}
}
