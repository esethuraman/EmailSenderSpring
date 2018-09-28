package com.esethuraman.mailSender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailerController {

    private Logger logger = LoggerFactory.getLogger(MailerController.class);

    @Autowired
    private MailerService mailerService;

    @RequestMapping("/home")
    public String homePage(){
        return "my home page in mailer application...";
    }

    @RequestMapping("/sendMail")
    public String sendEmail(){
        try{
            mailerService.sendMail();
        }
        catch(Exception e){
            System.out.println("EXCEPTION CAUGHT -> "+ e.getMessage());
        }

        return "email sent!!";
    }
}
