package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

/**
 */

@Entity
public class MyDraftChapter {
    @Id
    private long chapId;
    @Index
    private long novelId;
    @Index
    private long volumeId;
    private double csno; // chapter sno
    private double vsno;// volume sno
    private String title;
    private String content;
    private boolean isDownload;
    private long needFireMoney;
    private long charCount;
    private boolean isVip;
    private boolean isDraft;//是否为草稿(默认为false)
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
    public long getVolumeId() {
        return this.volumeId;
    }
    public void setVolumeId(long volumeId) {
        this.volumeId = volumeId;
    }
    public double getCsno() {
        return this.csno;
    }
    public void setCsno(double csno) {
        this.csno = csno;
    }
    public double getVsno() {
        return this.vsno;
    }
    public void setVsno(double vsno) {
        this.vsno = vsno;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean getIsDownload() {
        return this.isDownload;
    }
    public void setIsDownload(boolean isDownload) {
        this.isDownload = isDownload;
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
    public boolean getIsVip() {
        return this.isVip;
    }
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }
    public boolean getIsDraft() {
        return this.isDraft;
    }
    public void setIsDraft(boolean isDraft) {
        this.isDraft = isDraft;
    }

    

}
