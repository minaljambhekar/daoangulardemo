package com.niit.daoangulardemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.angulardemo.dao.productdao;

import com.niit.angulardemo.dao.productdaoimpl;
import com.niitangularDemo.Model.Product;

@Controller
public class homecontroller {
	

	
	@RequestMapping("/")
	
	public ModelAndView products()
	{
		productdao productDAO=new productdaoimpl();
		List<Product> products=productDAO.getAllProducts();
		String productList=new Gson().toJson(products);
		ModelAndView model=new ModelAndView("index");
		model.addObject("productList", productList);
		
		return model;
		
	}
	
}



