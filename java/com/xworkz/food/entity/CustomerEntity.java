package com.xworkz.food.entity;

public class CustomerEntity {
	private String name;
	private String loction;
	private int phoneNo;
	private int rating;
	private int age;
	private String emailId;
	
	public CustomerEntity() {
		System.out.println("invoked CustomerEntity"+this.getClass().getSimpleName());
	}

	public CustomerEntity(String name, String loction, int phoneNo, int rating, int age, String
			
			string) {
		super();
		this.name = name;
		this.loction = loction;
		this.phoneNo = phoneNo;
		this.rating = rating;
		this.age = age;
		this.emailId = emailId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((emailId == null) ? 0 : emailId.hashCode());
		result = prime * result + ((loction == null) ? 0 : loction.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + phoneNo;
		result = prime * result + rating;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerEntity other = (CustomerEntity) obj;
		if (age != other.age)
			return false;
		if (emailId == null) {
			if (other.emailId != null)
				return false;
		} else if (!emailId.equals(other.emailId))
			return false;
		if (loction == null) {
			if (other.loction != null)
				return false;
		} else if (!loction.equals(other.loction))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerEntity [name=" + name + ", loction=" + loction + ", phoneNo=" + phoneNo + ", rating=" + rating
				+ ", age=" + age + ", emailId=" + emailId + "]";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoction() {
		return loction;
	}

	public void setLoction(String loction) {
		this.loction = loction;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
