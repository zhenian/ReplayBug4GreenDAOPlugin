package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 */

@Entity
public class ComicProgress {
    @Id
    private long comicId;
    private long accountId;
    private String chapterPath;
    private String serialPath;
    private int index; //  chapter 中第 index 张图
    private Date lastVisitTime;
    public long getComicId() {
        return this.comicId;
    }
    public void setComicId(long comicId) {
        this.comicId = comicId;
    }
    public long getAccountId() {
        return this.accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public String getChapterPath() {
        return this.chapterPath;
    }
    public void setChapterPath(String chapterPath) {
        this.chapterPath = chapterPath;
    }
    public String getSerialPath() {
        return this.serialPath;
    }
    public void setSerialPath(String serialPath) {
        this.serialPath = serialPath;
    }
    public int getIndex() {
        return this.index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public Date getLastVisitTime() {
        return this.lastVisitTime;
    }
    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }


}
