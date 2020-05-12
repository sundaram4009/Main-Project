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
import com.trm.executive.Model.Training;
import com.trm.executive.Model.Trm;
import com.trm.executive.service.CandidateServiceImpl;
import com.trm.executive.service.TrainingServiceImpl;


@RequestMapping("/Training")
@Controller
public class TrainingController {

 @Autowired
 private TrainingServiceImpl TrainingService;

 
 @RequestMapping(value= {"/add"}, method=RequestMethod.GET)
 public ModelAndView getAllTrainings() {
  List<Training> list = TrainingService.getTrainings();
  ModelAndView modelAndView = new ModelAndView("index");
  //modelAndView.addObject("list", list);
  return modelAndView;
  //get all data using this sample code
 }
 
 @RequestMapping(value="/update/{id}", method=RequestMethod.GET)
 public ModelAndView editTraining(@PathVariable int id) {
  Training training = TrainingService.findTrainingById(id);
  ModelAndView modelAndView = new ModelAndView("update");
  modelAndView.addObject("train", training);
  return modelAndView;
  //update object by id database using this sample
 }
 
 
 @RequestMapping(value="/show")
 public ModelAndView showalldata() {
	
	  List<Training> list = TrainingService.getTrainings();
	  List<Candidate> list1 = TrainingService.getCandidates();
	  List<Trm> list2 = TrainingService.getTrm();
	  ModelAndView modelAndView = new ModelAndView("show");
	  modelAndView.addObject("list", list);
	  modelAndView.addObject("list1", list1);
	  modelAndView.addObject("list2", list2);
	  return modelAndView;
 }
 
 
 

 @RequestMapping(value="/up",method=RequestMethod.POST)
 public ModelAndView update(@ModelAttribute("trainingForm") Training training) {
	  TrainingService.updateTraining(training);
	  List<Training> list = TrainingService.getTrainings();
	  ModelAndView modelAndView = new ModelAndView("show");
	  modelAndView.addObject("list", list);
	  return modelAndView;
 }
// @RequestMapping(value="/trm",method=RequestMethod.POST)
// public ModelAndView updatetrm(@ModelAttribute("trainingForm") Trm training) {
//	  TrainingService.updateTrm(training);
//	  List<Training> list = TrainingService.getTrainings();
//	  List<Candidate> list1 = TrainingService.getCandidates();
//	  List<Trm> list2 = TrainingService.getTrm();
//	  ModelAndView modelAndView = new ModelAndView("show");
//	  modelAndView.addObject("list", list);
//	  modelAndView.addObject("list1", list1);
//	  modelAndView.addObject("list2", list2);
//	  return modelAndView;
// }

 
 @RequestMapping(value="/insert")
 public ModelAndView saveOrUpdate(@ModelAttribute("trainingForm") Training training) {
	 
	 
	  TrainingService.addTraining(training);
	  System.out.print("called save");
	  List<Training> list = TrainingService.getTrainings();
	  List<Candidate> list1 = TrainingService.getCandidates();
	  List<Trm> list2 = TrainingService.getTrm();
	  ModelAndView modelAndView = new ModelAndView("show");
	  modelAndView.addObject("list", list);
	  modelAndView.addObject("list1", list1);
	  modelAndView.addObject("list2", list2);
	  return modelAndView;
 }
 
 @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
 public ModelAndView deleteTraining(@PathVariable("id") int id) {
	 //delete object by id database using this sample
	 System.out.print(id);
	 TrainingService.deleteTraining(id);  
	 List<Training> list = TrainingService.getTrainings();
	  List<Candidate> list1 = TrainingService.getCandidates();
	  List<Trm> list2 = TrainingService.getTrm();
	  ModelAndView modelAndView = new ModelAndView("show");
	  modelAndView.addObject("list", list);
	  modelAndView.addObject("list1", list1);
	  modelAndView.addObject("list2", list2);
	  return modelAndView;
 }
}