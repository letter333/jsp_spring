package com.lecspring.myspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public ModelAndView create() {
		
		// book폴더의 create.jsp를 리턴
		return new ModelAndView("book/create");
	}
}
