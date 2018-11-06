package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 */
@Entity
public class ReadLocalNovelProgress {
    @Id
    private String id; // local novel set path, online novel set novelId
    private String novelId; // local novel, novelId < 0
    private String path;
    private Date readingTime;
    private String title;
    private String chapterId;
    private long startPosition;
    private long endPosition;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNovelId() {
        return this.novelId;
    }
    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }
    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public Date getReadingTime() {
        return this.readingTime;
    }
    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getChapterId() {
        return this.chapterId;
    }
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }
    public long getStartPosition() {
        return this.startPosition;
    }
    public void setStartPosition(long startPosition) {
        this.startPosition = startPosition;
    }
    public long getEndPosition() {
        return this.endPosition;
    }
    public void setEndPosition(long endPosition) {
        this.endPosition = endPosition;
    }
}