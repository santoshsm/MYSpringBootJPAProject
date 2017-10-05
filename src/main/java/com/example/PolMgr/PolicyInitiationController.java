package com.example.PolMgr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PolMgr.model.Person;
import com.example.PolMgr.model.PersonRepo;

@RestController
public class PolicyInitiationController {
	@Autowired
	PersonRepo  personRepo;
	
	@RequestMapping(value="/getPolicyStatus",method=RequestMethod.GET,produces="application/json")
	public @ResponseBody String getPolicyStatus(){
		Person p = personRepo.findOne(new Long(1));
		System.out.println(p.getPersnFirstName()+" "+p.getPersnLastName());
		return "SUCCESS";
	}

}
