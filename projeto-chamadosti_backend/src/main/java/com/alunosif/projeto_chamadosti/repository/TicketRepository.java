package com.alunosif.projeto_chamadosti.repository;

import com.alunosif.projeto_chamadosti.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
