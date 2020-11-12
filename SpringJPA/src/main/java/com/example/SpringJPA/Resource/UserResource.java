package com.example.SpringJPA.Resource;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJPA.Model.Users;
import com.example.SpringJPA.Repository.UserRepository;

@RestController
public class UserResource {
	
	@Autowired
	UserRepository usr;
	@GetMapping("/users")
	public List<Users> getInfo(){
		return usr.findAll() ;
	}
	@GetMapping(value= "/{name}")
	public Users findByName(@PathVariable final String name)
	{
		return usr.findByName(name);
	}
	
	@PostMapping(value="/load")
	public Users load(@RequestBody final Users user)
	{
		return usr.save(user);
		
	}
	

}
