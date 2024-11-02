package com.alunosif.projeto_chamadosti.service;

import com.alunosif.projeto_chamadosti.model.Ticket;
import com.alunosif.projeto_chamadosti.model.User;
import com.alunosif.projeto_chamadosti.model.enuns.TicketStatus;
import com.alunosif.projeto_chamadosti.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;


    public Ticket insert(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket findById(Integer id) {
        return ticketRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Ticket não encontrado"));
    }

    public Ticket updateStatusTicket(Ticket ticket) {
        ticket.setStatus(TicketStatus.CLOSED);
        return ticketRepository.save(ticket);
    }

}
