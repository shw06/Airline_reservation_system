package com.menu.model;

public class Reservation {
	
	private int id;
	private String name;
	private String contact;
	private String source;
	private String destination;
	
	public int getId() {
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", name=" + name + ", contact=" + contact + ", source=" + source
				+ ", destination=" + destination + "]";
	}
	public Reservation(String name, String contact, String source, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.source = source;
		this.destination = destination;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
