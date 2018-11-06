package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONObject;

import java.util.Date;

/**
 */
@Entity
public class NovelViews {
    @Id
    private long novelId;
    private long accountId;
    private long chapterId;
    private Date lastViewTime;


    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getChapterId() {
        return chapterId;
    }

    public void setChapterId(long chapterId) {
        this.chapterId = chapterId;
    }

    public Date getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Date lastViewTime) {
        this.lastViewTime = lastViewTime;
    }

    public static NovelViews build(JSONObject data){
        //{"accountId":2303575,"novelId":41791,"chapterId":809338,"audioId":0,"lastViewTime":"2016-09-18T17:22:24","lastListenTime":"0001-01-01T00:00:00"}
        NovelViews novelViews = new NovelViews();
        novelViews.setNovelId(data.optLong("novelId"));
        novelViews.setAccountId(data.optLong("accountId"));
        novelViews.setChapterId(data.optLong("chapterId"));
        return novelViews;
    }
}
