package com.rent.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rent.inter.IRentHouseOperation;
import com.rent.model.RentHouse;

@Controller
@RequestMapping("renthouse/")
public class RentHouseController {
	
	@Autowired
	IRentHouseOperation rentHouseMapper;
	
	@RequestMapping("/house")
	public ModelAndView findRentHouse(HttpServletRequest request,
									  HttpServletResponse response){
		RentHouse rentHouse = rentHouseMapper.selectHouseById(1L);
		ModelAndView mav = new ModelAndView("house_list");
		mav.addObject("rentHouse", rentHouse);
		return mav;
	}

}
