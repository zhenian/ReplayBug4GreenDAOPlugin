package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */
@Entity
public class Account {
    @Id
    private long accountId;
    private String avatar;
    private String email;
    private long fireCoin;
    private boolean isAuthor;
    private String userName; //帐号
    private String nickName; //昵称,不重复
    private String roleName;
    private String phoneNum;

    //expand
    private String intro; //简介
    private long level;
    private long point;
    private long nextLevelPoint;
    public long getAccountId() {
        return this.accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public String getAvatar() {
        return this.avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public long getFireCoin() {
        return this.fireCoin;
    }
    public void setFireCoin(long fireCoin) {
        this.fireCoin = fireCoin;
    }
    public boolean getIsAuthor() {
        return this.isAuthor;
    }
    public void setIsAuthor(boolean isAuthor) {
        this.isAuthor = isAuthor;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getNickName() {
        return this.nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public String getRoleName() {
        return this.roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getPhoneNum() {
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public long getLevel() {
        return this.level;
    }
    public void setLevel(long level) {
        this.level = level;
    }
    public long getPoint() {
        return this.point;
    }
    public void setPoint(long point) {
        this.point = point;
    }
    public long getNextLevelPoint() {
        return this.nextLevelPoint;
    }
    public void setNextLevelPoint(long nextLevelPoint) {
        this.nextLevelPoint = nextLevelPoint;
    }

}
