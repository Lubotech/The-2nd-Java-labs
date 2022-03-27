package ru.vlsu.ispi.daoimpl;

import ru.vlsu.ispi.beans.*;
import java.util.*;

public class DBImpl{
	public Map<Long, Group> groups;
	public Map<Long, Student> students;
	
	public DBImpl(){
		this.groups = new HashMap<Long, Group>();
		this.students = new HashMap<Long, Student>();
	}
}