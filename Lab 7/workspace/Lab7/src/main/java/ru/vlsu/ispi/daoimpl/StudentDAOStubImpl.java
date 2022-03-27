package ru.vlsu.ispi.daoimpl;

import ru.vlsu.ispi.beans.*;
import ru.vlsu.ispi.dao.*;
import java.util.*;

public class StudentDAOStubImpl implements StudentDAO{
	
	private final DBImpl impl;
	
	public StudentDAOStubImpl(DBImpl impl){
		this.impl = impl;
	}
	public void create(Student student){
		impl.students.put(student.getId(), student);
	}
	
	public void update(Student student){
		impl.students.put(student.getId(), student);
	}
	public void delete(long id){
		impl.students.remove(id);
	}
	
	public Student getById(long id){
		return impl.students.get(id);
	}
	
	public List<Student> getAll(){
		ArrayList<Student> list = new ArrayList<>(impl.students.values());
		return list;
	}
}