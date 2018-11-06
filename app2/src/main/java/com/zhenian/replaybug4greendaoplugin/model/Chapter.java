package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

import java.util.Date;

/**
 */
@Entity
public class Chapter {
    @Id
    private long chapId;
    @Index
    private long novelId;
    @Index
    private long volumeId;
    private double csno; // chapter sno
    private double vsno;// volume sno
    private String title;
    private boolean isDownload;
    private long needFireMoney;
    private long charCount;
    private boolean isVip;

    private boolean locale;
    private long pos;
    private Date addTime;
    private Date updateTime;

    private long originNeedFireMoney;


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

    public boolean isDownload() {
        return isDownload;
    }

    public void setDownload(boolean download) {
        isDownload = download;
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

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public boolean isLocale() {
        return locale;
    }

    public void setLocale(boolean locale) {
        this.locale = locale;
    }

    public long getPos() {
        return this.pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public Date getAddTime() {
        return this.addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getOriginNeedFireMoney() {
        return this.originNeedFireMoney;
    }

    public void setOriginNeedFireMoney(long originNeedFireMoney) {
        this.originNeedFireMoney = originNeedFireMoney;
    }

    public boolean getIsDownload() {
        return this.isDownload;
    }

    public void setIsDownload(boolean isDownload) {
        this.isDownload = isDownload;
    }

    public boolean getIsVip() {
        return this.isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public boolean getLocale() {
        return this.locale;
    }

}
