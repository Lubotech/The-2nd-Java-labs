package ru.vlsu.ispi.dao;

import ru.vlsu.ispi.beans.*;
import java.util.*;

public interface StudentDAO {
	public void create(Student student);
	
	public void update(Student student);
	public void delete(long id);
	public Student getById(long id);
	public List<Student> getAll();
}