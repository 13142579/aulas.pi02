package ifrn.pi.Eventos.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Chamou o método index");
		return "redirect:/eventos";
		
		
	}

}
