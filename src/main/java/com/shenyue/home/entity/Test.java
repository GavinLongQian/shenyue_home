package com.shenyue.home.entity;

/**
 * @PackageName: com.shenyue.home.entity
 * @Description:
 * @author: 罗绂威
 * @date: 2019/6/13
 */
public class Test {
    private Long id;
    private String userName;
    private String passWord;
    private String userSex;
    private String nickName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userSex='" + userSex + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
