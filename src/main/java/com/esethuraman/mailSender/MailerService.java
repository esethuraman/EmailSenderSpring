package com.esethuraman.mailSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailerService {

    @Autowired
    JavaMailSender javaMailSender;

    private Logger logger = LoggerFactory.getLogger(MailerService.class);

    public void sendMail(){

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setFrom("");
        mailMessage.setTo("");
        mailMessage.setSubject("Hola from Springboot");
        mailMessage.setText("Test message from my Springboot application.");
        try{
            javaMailSender.send(mailMessage);
        }
        catch(Exception e){
            logger.info("===> Exception caught -> " + e.getMessage());
        }

    }
}
