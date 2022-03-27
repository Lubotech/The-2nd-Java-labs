package ru.vlsu.ispi.beans;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

public class Student extends BaseBean{
	
	@NotEmpty(message="Enter the name of the student")
	private String name;
	private Date birthdate;
	private String gender;
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
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return this.gender;
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