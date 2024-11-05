package ifrn.pi.Eventos.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ifrn.pi.Eventos.models.Evento;
import ifrn.pi.Eventos.repositories.EventoRepository;

@Controller
public class EventosControllers {
	
	@Autowired
	private EventoRepository er; 

	@RequestMapping("/Eventos/form")
	public String form() {
		return "eventos/formEvento";
	}

	@PostMapping("/eventos")
	public String adicionar(Evento evento) {
		
		System.out.println(evento);
		er.save(evento);
		return "eventos/EventoAdicionado";
	}
}