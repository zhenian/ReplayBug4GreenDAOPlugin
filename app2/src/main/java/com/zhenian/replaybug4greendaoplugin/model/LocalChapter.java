package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class LocalChapter {
    @Id
    private String chapId;
    private String novelId;
    private String volumeId;
    private String path;
    private double csno; // chapter sno
    private double vsno;// volume sno
    private String title;
    private long charCount;
    private long pos;
    private boolean isDownload;
    public String getChapId() {
        return this.chapId;
    }
    public void setChapId(String chapId) {
        this.chapId = chapId;
    }
    public String getVolumeId() {
        return this.volumeId;
    }
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
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
    public long getCharCount() {
        return this.charCount;
    }
    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }
    public long getPos() {
        return this.pos;
    }
    public void setPos(long pos) {
        this.pos = pos;
    }
    public String getNovelId() {
        return this.novelId;
    }
    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }
    public boolean getIsDownload() {
        return this.isDownload;
    }
    public void setIsDownload(boolean isDownload) {
        this.isDownload = isDownload;
    }

}
