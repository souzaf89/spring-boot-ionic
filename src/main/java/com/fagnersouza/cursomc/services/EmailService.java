package com.fagnersouza.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fagnersouza.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
