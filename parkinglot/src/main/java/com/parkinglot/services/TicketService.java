package com.parkinglot.services;
import com.parkinglot.exceptions.InvalidGateException;
import com.parkinglot.models.Gate;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.VehicleType;
import com.parkinglot.repositories.GateRepository;
import java.util.Date;
import java.util.Optional;


public class TicketService {
    private GateRepository gateRepository;

    public TicketService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public Ticket issueTicket(Long gateId, String vehicleNumber, VehicleType vehicleType, String ownerName) throws InvalidGateException {
        class InvalidGateException extends Throwable {
            public InvalidGateException(String message) {
                super(message);
            }
        }

        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepository.findById(gateId);

        if (optionalGate.isEmpty()) {
            throw new InvalidGateException("Invalid gate Id");
        }

        Gate gate = optionalGate.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());




        return null;
    }
}
