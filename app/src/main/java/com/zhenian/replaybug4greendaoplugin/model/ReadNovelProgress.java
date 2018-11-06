package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 */

@Entity
public class ReadNovelProgress {
    @Id
    private String id; // local novel set path, online novel set novelId
    private long novelId; // local novel, novelId < 0
    private String path;
    private Date readingTime; // 阅读时间，翻页后产生
    private Date openTime; // 打开时间
    private String title;
    private long chapterId;
    private long startPosition;
    private long endPosition;
    private int scrollDy;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
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
    public Date getOpenTime() {
        return this.openTime;
    }
    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public long getChapterId() {
        return this.chapterId;
    }
    public void setChapterId(long chapterId) {
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
    public int getScrollDy() {
        return this.scrollDy;
    }
    public void setScrollDy(int scrollDy) {
        this.scrollDy = scrollDy;
    }


}
