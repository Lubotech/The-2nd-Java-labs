package ru.vlsu.ispi.daoimpl;

import ru.vlsu.ispi.beans.*;
import ru.vlsu.ispi.dao.*;
import java.util.*;

public class GroupDAOStubImpl implements GroupDAO{
	private DBImpl impl;
	
	public void setImpl(DBImpl impl){
		this.impl = impl;
	}
	public void create(Group group){
		impl.groups.put(group.getId(), group);
	}
	
	public void update(Group group){
		impl.groups.put(group.getId(), group);
	}
	public void delete(long id){
		impl.groups.remove(id);
	}
	
	public Group getById(long id){
		return impl.groups.get(id);
	}
	
	public List<Group> getAll(){
		ArrayList<Group> list = new ArrayList<>(impl.groups.values());
		return list;
	}
}