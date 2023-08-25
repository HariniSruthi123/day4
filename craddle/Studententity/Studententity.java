package com.example.craddle.Studententity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttable")
public class Studententity {
	@Id
	private int id;
	private String name;
	private String stream;
	public Studententity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studententity(int id, String name, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
	}
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
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	

}