package model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false, unique = true)
	private String personNummer;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserRole role;
	private String phoneNumber;
	private String address;
	private Date dotDate;
	
	
	
	public User() {
		super();
		
	}

	public User(String firstName, String lastName, String personNummer, String password, UserRole role, String phoneNumber,
			String address, Date dotDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.personNummer = personNummer;
		this.password = password;
		this.role = role;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.dotDate = dotDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPersonNummer() {
		return personNummer;
	}

	public void setPersonNummer(String personNummer) {
		this.personNummer = personNummer;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDotDate() {
		return dotDate;
	}

	public void setDotDate(Date dotDate) {
		this.dotDate = dotDate;
	}
	
}