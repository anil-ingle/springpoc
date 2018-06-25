package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {
	@Autowired
	private WishService service;
	
	/*@RequestMapping("/wish.htm")
	public ModelAndView process(){
		String wMsg=null;
		//use service class
		wMsg=service.generateWishMessage();
		//create and MAV
		return new ModelAndView("result","wMsg",wMsg);
	}//method
*/
/*	@RequestMapping("/wish.htm")
	public ModelAndView process(HttpServletRequest req,HttpServletResponse res){
		String wMsg=null;
		//use service class
		wMsg=service.generateWishMessage();
		//create and MAV
		return new ModelAndView("result","wMsg",wMsg);
	}//method
*/	
	/*@RequestMapping("/wish.htm")
	public String process(Map<String,Object> map){
		String wMsg=null;
		//use service class
		wMsg=service.generateWishMessage();
		map.put("wMsg",wMsg);
		return "result";
	}//method
*/	
/*	@RequestMapping("/wish.htm")
	public String process(Model model){
		String wMsg=null;
		//use service class
		wMsg=service.generateWishMessage();
		model.addAttribute("wMsg",wMsg);
		return "result";
	}//method
	*/
	
/*	@RequestMapping("/wish.htm")
	public String process(ModelMap model){
		String wMsg=null;
		//use service class
		wMsg=service.generateWishMessage();
		model.addAttribute("wMsg",wMsg);
		return "result";
	}//method
*/
	
	/*@RequestMapping("/wish.htm")
	public Map<String,Object> process(){
		String wMsg=null;
		Map<String,Object> map=null;
		//use service class
		wMsg=service.generateWishMessage();
		//create Map obj
		map=new HashMap<String,Object>();
		map.put("wMsg",wMsg);
		return map;
	}//method
	*/
	
/*	@RequestMapping("/wish.htm")
	public Model process(){
		String wMsg=null;
		Model model=null;
		//use service class
		wMsg=service.generateWishMessage();
		//create Map obj
		model=new ExtendedModelMap();
		model.addAttribute("wMsg",wMsg);
		return model;
	}//method
	*/
	
	/*@RequestMapping("/wish.htm")
	public ModelMap process(){
		String wMsg=null;
		ModelMap map=null;
		//use service class
		wMsg=service.generateWishMessage();
		//create Map obj
		map=new ModelMap();
		map.addAttribute("wMsg",wMsg);
		return map;
	}//method
*/	
	
	@RequestMapping("/wish.htm")
	public void process(Map<String,Object> map){
		String wMsg=null;
		//use service class
		wMsg=service.generateWishMessage();
		//create Map obj
		map.put("wMsg",wMsg);
	}//method

	
	
}//class
