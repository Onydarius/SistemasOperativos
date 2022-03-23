package entity;

import java.io.Serializable;
import java.time.LocalTime;

public class MessageEntity implements Serializable{
    
    String user;
    String text;
    LocalTime time;
    String ip;
    int port;

    public MessageEntity(String user, String text, String ip, int puerto) {
        this.user = user;
        this.text = text;
        this.time = LocalTime.now();
        this.ip = ip;
        this.port = puerto;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setPort(int port) {
        this.port = port;
    }
    public int getPort() {
        return port;
    }
}
