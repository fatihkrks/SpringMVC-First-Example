package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.MyService;

@Controller
public class SpringMVCController {
	
		@Autowired
		private MyService myService;
		

//		public void setMyService(MyService myService) {
//			this.myService = myService;
//		}

		@RequestMapping(value = "/message",method = RequestMethod.GET)
		public String message(ModelMap modelMap) {
			String msg=myService.Message();
			modelMap.addAttribute("myMessage",msg);
			return "helloPage";
		}
}
