package com.trm.executive.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.trm.executive.Model.Assessment;
import com.trm.executive.Model.Candidate;
import com.trm.executive.Model.Training;
import com.trm.executive.Model.Trm;
import com.trm.executive.service.AssessmentServiceImpl;

@RequestMapping("/assessment")
@Controller
public class AssessmentController {

	@Autowired
	 private AssessmentServiceImpl AssessmentService;

	@RequestMapping(value="/show")
	 public ModelAndView showalldata() {
		
		  
		  List<Assessment> list1 = AssessmentService.getCandidates();
		  ModelAndView modelAndView = new ModelAndView("assessment");
		  modelAndView.addObject("list1", list1);
		  
		  return modelAndView;
	 }
	@RequestMapping(value="/insert")
	 public ModelAndView saveOrUpdate(@ModelAttribute("trainingForm") Assessment training) {
		 
		 
		AssessmentService.addAssessment(training);
		List<Assessment> list1 = AssessmentService.getCandidates();
		  ModelAndView modelAndView = new ModelAndView("assessment");
		  modelAndView.addObject("list1", list1);
		  
		  return modelAndView;
	 }
		   
			  
		 }
