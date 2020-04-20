package com.pbasco.Counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
        Integer count = (Integer) session.getAttribute("count");
		count += 1;
		session.setAttribute("count", count);
		return "index.jsp";
	}
}
