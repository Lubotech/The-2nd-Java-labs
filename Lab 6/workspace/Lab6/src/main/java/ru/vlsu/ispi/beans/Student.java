package ru.vlsu.ispi.beans;

import java.util.Date;

public class Student extends BaseBean{
	private String name;
	private Date birthdate;
	private long groupId;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setBirthdate(Date birthdate){
		this.birthdate = birthdate;
	}
	public Date getBirthdate(){
		return this.birthdate;
	}
	public void setGroupId(long groupId){
		this.groupId = groupId;
	}
	public long getGroupId(){
		return this.groupId;
	}
	
	public String toString(){
		return getId() + " " + this.name + " " + this.birthdate;
	}

}