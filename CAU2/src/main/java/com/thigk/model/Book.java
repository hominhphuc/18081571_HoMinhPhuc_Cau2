package com.thigk.model;



import lombok.Data;

@Data
public class Book {

	private int SubId;
	
	private String name;
	
	private String creadit;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getSubId() {
		return SubId;
	}

	public void setSubId(int subId) {
		SubId = subId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreadit() {
		return creadit;
	}

	public void setCreadit(String creadit) {
		this.creadit = creadit;
	}

	@Override
	public String toString() {
		return "Book [SubId=" + SubId + ", name=" + name + ", creadit=" + creadit + "]";
	}
	
	
}
