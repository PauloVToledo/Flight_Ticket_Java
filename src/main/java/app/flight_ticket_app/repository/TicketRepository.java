package app.flight_ticket_app.repository;

import app.flight_ticket_app.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// El <Ticket, Long> indica que gestionará la entidad Ticket y que el tipo de su ID es Long.
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // No necesitas escribir código, Spring Data JPA te da métodos como save(),
    // findAll(), etc.
}