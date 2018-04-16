package com.send.sendmail.Controller;



import com.send.sendmail.model.EmailAdr;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/send")
public class sendEmailController {

    @RequestMapping("dosend")
    public String dosend(String targetAddress,String title,String content){
        EmailAdr client=new EmailAdr();
        client.setSmtport(25);
        client.setHostName("smtp.qq.com");
        client.setUsername("769091562@qq.com");
        client.setPassword("gvpmdrhbxsvpbdih");//您的邮箱密码
        client.setSslOn(true);
        client.setFromAdress("769091562@qq.com");

        MultiPartEmail email=new MultiPartEmail();
        try {
            email.setAuthentication(client.getUsername(),client.getPassword());
            email.setCharset("utf-8");
            email.setSmtpPort(client.getSmtport());
            email.setHostName(client.getHostName());
            email.setSSLOnConnect(client.getSslOn());
            email.setFrom(client.getFromAdress());
            email.setSubject(title);
            email.setMsg(content);
            email.addTo(targetAddress/*"1809455381@qq.com"*/);
            email.send();
        } catch (EmailException e) {
            e.printStackTrace();
        }


        return " ";
    }


}
