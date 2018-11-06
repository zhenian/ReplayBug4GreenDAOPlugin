package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */
@Entity
public class LocalChapterContent {
    @Id
    private String chapId;
    private String path;
    private String content;
    private long charCount;
    private double sno;

    public String getChapId() {
        return this.chapId;
    }
    public void setChapId(String chapId) {
        this.chapId = chapId;
    }
    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
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

}