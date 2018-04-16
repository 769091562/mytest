package com.send.sendmail.model;

public class EmailAdr {
    private String hostName;//发送端得

    private int smtport; //发送端口

    private String username; //发送账户名

    private String password;// 账户密码

    private String fromAdress; //发送邮件得地址

    private Boolean SslOn =true; //ssl

    private static final String DEFUALT_CHARSET="utf-8";

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public int getSmtport() {
        return smtport;
    }

    public void setSmtport(int smtport) {
        this.smtport = smtport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFromAdress() {
        return fromAdress;
    }

    public void setFromAdress(String fromAdress) {
        this.fromAdress = fromAdress;
    }

    public Boolean getSslOn() {
        return SslOn;
    }

    public void setSslOn(Boolean sslOn) {
        SslOn = sslOn;
    }
}
