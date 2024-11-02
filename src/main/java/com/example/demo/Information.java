package com.example.demo;



public class Information {
	
	private int id;

	private String Email;
	private String Passward;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassward() {
		return Passward;
	}
	public void setPassward(String passward) {
		Passward = passward;
	}

	@Override
	public String toString() {
		return "Information [id=" + id + ", Email=" + Email + ", Passward=" + Passward + "]";
	}
	

}
