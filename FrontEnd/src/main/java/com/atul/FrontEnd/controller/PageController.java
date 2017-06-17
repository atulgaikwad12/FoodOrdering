package com.atul.FrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atul.BackEnd.dao.CategoryDAO;
import com.atul.BackEnd.dao.ProductDAO;
import com.atul.BackEnd.dto.Category;
import com.atul.BackEnd.dto.Product;
import com.atul.FrontEnd.exception.ProductNotFoundException;

@Controller
public class PageController 
{
   //@RequestMapping(value="/")
	//public String index()
	//{
	//	return "page";
	//}
   @Autowired
   private CategoryDAO categoryDAO;
   
   @Autowired
   private ProductDAO productDAO;
   @RequestMapping(value= {"/","/home","/index"})
   public ModelAndView index()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Home");
	 mv.addObject("userClickHome",true);
	 return mv;
   }
   @RequestMapping(value= "/about")
   public ModelAndView about()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","About Us");
	 mv.addObject("userClickAbout",true);
	 return mv;
   }
   @RequestMapping(value= "/show/all/products")
   public ModelAndView showAllProducts()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Menu Items");
	//passing list of category
     mv.addObject("categories",categoryDAO.list());
	 mv.addObject("userClickAllProducts",true);
	 return mv;
   }
   @RequestMapping(value= "/show/category/{id}/products")
   public ModelAndView showCategoryProducts(@PathVariable("id") int id)
   {
	 ModelAndView mv=new ModelAndView("page");
	 //category DAO to fetch single category
	 Category category =null;
	 category = categoryDAO.get(id);
	 mv.addObject("title",category.getCatname());
	//passing list of category
     mv.addObject("categories",categoryDAO.list());
   //passing single category
     mv.addObject("category",category);
	 mv.addObject("userClickCategoryProducts",true);
	 return mv;
   }
   @RequestMapping(value= "/contact")
   public ModelAndView contact()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Contact Us");
	 mv.addObject("userClickContact",true);
	 return mv;
   }
   @RequestMapping(value= {"/services","service"})
   public ModelAndView service()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Our Services");
	//passing list of category
     mv.addObject("categories",categoryDAO.list());
	 mv.addObject("userClickService",true);
	 return mv;
   }
   @RequestMapping(value= "/categories")
   public ModelAndView blogs()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Categories Page");
	 mv.addObject("userClickBlog",true);
	 return mv;
   }
   @RequestMapping(value= "/main")
   public ModelAndView main()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Home Page");
	 mv.addObject("userClickMain",true);
	 return mv;
   }
   @RequestMapping(value= "/book")
   public ModelAndView book()
   {
	 ModelAndView mv=new ModelAndView("page");
	 mv.addObject("title","Booking Page");
	 mv.addObject("userClickBook",true);
	 return mv;
   }
  
   
   @RequestMapping(value= "/show/{id}/product")
   public ModelAndView shoSingleProduct(@PathVariable("id") int id)throws ProductNotFoundException
   {
	 ModelAndView mv=new ModelAndView("page");
	 //product DAO to fetch single category
	 Product product =null;
	 product = productDAO.get(id);
	 if(product == null)
		 throw new ProductNotFoundException();
	 //Updating views of product
	product.setViews(product.getViews()+1);
	productDAO.update(product);
	//-------------------------
	mv.addObject("title",product.getName());
	mv.addObject("product",product);
	mv.addObject("userClickShowProduct",true);
	 return mv;
   }

   @RequestMapping(value= "/login")
   public ModelAndView login(@RequestParam(name="error", required = false)String error)
   {
	 ModelAndView mv=new ModelAndView("login");
	 if(error!=null){
		 mv.addObject("message","Invalid username and password");
	 }
	 mv.addObject("title","Login page");
	 return mv;
   }
   
   @RequestMapping(value= "/access-denied")
   public ModelAndView accessDenied()
   {
	 ModelAndView mv=new ModelAndView("error");
	 mv.addObject("title","403 -Access Denied");
	 mv.addObject("errorTitle","Aha! Caught you");
	 mv.addObject("errorDescription","You are not authorized to view this page!");
	 return mv;
   }
   
}