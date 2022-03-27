package ru.vlsu.ispi.beans;

import javax.validation.constraints.NotNull;

public class BaseBean{
	
	@NotNull(message="Id shouldn't be null!")
	private Long id;
	
	public void setId(Long id){
		this.id = id;
	}
	public Long getId(){
		return this.id;
	}
}