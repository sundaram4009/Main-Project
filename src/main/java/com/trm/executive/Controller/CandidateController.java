package com.trm.executive.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.trm.executive.Model.Candidate;
import com.trm.executive.service.CandidateServiceImpl;


@RequestMapping("/candidate")
@Controller
public class CandidateController {

	 @Autowired
	 private CandidateServiceImpl CandidateService;


	 @RequestMapping(value="/insert")
	 public ModelAndView saveOrUpdate(@ModelAttribute("candidateForm") Candidate candidate) {
		 
		 
		  CandidateService.addCandidate(candidate);
		  System.out.print("called save");
		  List<Candidate> list1 = CandidateService.getCandidates();
		  ModelAndView modelAndView = new ModelAndView("show");
		  modelAndView.addObject("list1", list1);
		  return modelAndView;
	 }
	 
	 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	 public ModelAndView deletecandidate(@PathVariable("id") int id) {
		 //delete object by id database using this sample
		 System.out.print(id);
		 CandidateService.deleteCandidate(id);  
		 List<Candidate> list1 = CandidateService.getCandidates();
		  ModelAndView modelAndView = new ModelAndView("show");
		  modelAndView.addObject("list1", list1);
		  return modelAndView;
	 }
	 @RequestMapping(value= {"/add"}, method=RequestMethod.GET)
	 public ModelAndView getAllcandidates() {
	  List<Candidate> list = CandidateService.getCandidates();
	  ModelAndView modelAndView = new ModelAndView("index");
	  //modelAndView.addObject("list", list);
	  return modelAndView;
	  //get all data using this sample code
	 }
	 
	 @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	 public ModelAndView editcandidate(@PathVariable int id) {
	  Candidate candidate = CandidateService.findCandidateById(id);
	  ModelAndView modelAndView = new ModelAndView("update");
	  modelAndView.addObject("train", candidate);
	  return modelAndView;
	  //update object by id database using this sample
	 }
	 @RequestMapping(value="/up",method=RequestMethod.POST)
	 public ModelAndView update(@ModelAttribute("trainingForm") Candidate training) {
		 CandidateService.updateCandidate(training);
		  List<Candidate> list1 = CandidateService.getCandidates();
		  ModelAndView modelAndView = new ModelAndView("candidate");
		  modelAndView.addObject("list1", list1);
		  return modelAndView;
	 }
	 
	 @RequestMapping(value="/show")
	 public ModelAndView showalldata() {
		
		  
		  List<Candidate> list1 = CandidateService.getCandidates();
		  ModelAndView modelAndView = new ModelAndView("candidate");
		  modelAndView.addObject("list1", list1);
		  
		  return modelAndView;
	 }
}
