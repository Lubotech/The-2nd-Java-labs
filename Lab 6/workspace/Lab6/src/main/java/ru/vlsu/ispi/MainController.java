package ru.vlsu.ispi;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ru.vlsu.ispi.beans.Group;
import ru.vlsu.ispi.dao.GroupDAO;

@Controller
public class MainController {
	
	@Autowired
	private GroupDAO groupDAO;
	
	
	  @GetMapping("/hello/{id}")
	  public String handle(@PathVariable String id, @RequestParam(required = false, name="petId") Integer petId,  Model model)
	  {
		  System.out.println("id: = " + id);
		  System.out.println("petId: = " + petId);
		  
		  model.addAttribute("message", "Hello World!");
	  
		  Group group = new Group();
		  group.setId(18);
		  group.setName("The Main Man");
		  model.addAttribute(group);
		  List<Group> groups = new ArrayList<Group>();
		  groups.add(group);
		  model.addAttribute(groups);
		  
		  return "index";
	  }
	  
	  @GetMapping("/group")
	  public String grouForm(@RequestParam(required = false, name="id") Integer id, Model model) {
		  if(id == null) {
			  model.addAttribute("isCreate", true);
			  model.addAttribute("group", new Group());
			  
		  }else {
			  model.addAttribute("isCreate", false);
			  model.addAttribute("group", groupDAO.getById(id));
		  }
		  return "group";
	  }
	  
	  @PostMapping("/group")
	  public String groupSubmit(@ModelAttribute Group group, Model model) {
		  System.out.println("DAO IS NULL " + groupDAO == null);
		  groupDAO.create(group);
		  System.out.println(groupDAO.getAll().size());
		  model.addAttribute(groupDAO.getAll());
		  return "groups";
	  }
	  

	  @GetMapping("/group/{id}")
	  public String deleteGroup(@PathVariable long id, Model model)
	  {
		  System.out.println("id: = " + id);
		  groupDAO.delete(id);
		  System.out.println(groupDAO.getAll().size());
		  model.addAttribute(groupDAO.getAll());
		  return "groups";
	  }
	  
	  /*
	  @GetMapping("/group/{id}")
	  public String getGroup(@PathVariable long id, Model model)
	  { 
		  System.out.println("id: = " + id);
		  System.out.println("Group Name: " + groupDAO.getById(id).getName());
		  return "groups";
	  }*/
		 
}
