
package entity;

public class userEntity {
    String user;
    String ip;
    int port;

    public userEntity(String user, String ip, int port) {
        this.user = user;
        this.ip = ip;
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
