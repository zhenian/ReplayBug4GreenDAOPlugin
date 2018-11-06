package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

import java.util.Date;

/**
 */

@Entity
public class MyChapterContent {
    @Id
    private long chapId;
    @Index
    private long novelId;
    private String content;
    private boolean isVip;
    private long needFireMoney;
    private long charCount;
    private double sno;
    private Date updateTime;

    public long getChapId() {
        return this.chapId;
    }
    public void setChapId(long chapId) {
        this.chapId = chapId;
    }
    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean getIsVip() {
        return this.isVip;
    }
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }
    public long getNeedFireMoney() {
        return this.needFireMoney;
    }
    public void setNeedFireMoney(long needFireMoney) {
        this.needFireMoney = needFireMoney;
    }
    public long getCharCount() {
        return this.charCount;
    }
    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }
    public double getSno() {
        return this.sno;
    }
    public void setSno(double sno) {
        this.sno = sno;
    }
    public Date getUpdateTime() {
        return this.updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
