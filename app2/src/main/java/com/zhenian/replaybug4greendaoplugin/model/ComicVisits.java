package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONObject;

import java.util.Date;

/**
 */

@Entity
public class ComicVisits {
    @Id
    private long comicId;
    private long accountId;
    private String chapterPath;
    private String serialPath;
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
    public Date getLastVisitTime() {
        return this.lastVisitTime;
    }
    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }


    public static ComicVisits build(JSONObject data){
        ComicVisits  comicVisits = new ComicVisits();
        comicVisits.setComicId(data.optLong("comicId"));
        comicVisits.setChapterPath(data.optString("chapterPath"));
        comicVisits.setSerialPath(data.optString("serialPath"));
        comicVisits.setAccountId(data.optLong("accountId"));
        return comicVisits;
    }
}
