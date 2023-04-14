package net.codejava.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Login {
    private String userName;
    private String passWord;
    @Id
    private Long id;

    public Login() {
    }

    protected Login(String userName, String passWord)
    {
        super();
        this.userName = userName;
        this.passWord = passWord;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }


}
