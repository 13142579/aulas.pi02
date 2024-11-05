package ifrn.pi.Eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.Eventos.models.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}