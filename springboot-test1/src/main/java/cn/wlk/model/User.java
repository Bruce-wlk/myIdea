package cn.wlk.model;

public class User {
    Integer id;
    String username;
    String passward;

    public User() {
    }

    public User(String username, String passward) {
        this.username = username;
        this.passward = passward;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return passward;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String passward) {
        this.passward = passward;
    }
}
