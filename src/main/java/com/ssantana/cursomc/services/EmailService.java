package com.ssantana.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.ssantana.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
