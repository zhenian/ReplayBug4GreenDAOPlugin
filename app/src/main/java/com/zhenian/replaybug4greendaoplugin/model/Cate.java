package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */
@Entity
public class Cate {
    @Id
    private String id;
    private long novelId;
    private long chapterId;
    private int begin;
    private int end;
    private String volTitle;
    private String chapterTitle;
    private String content;
    private String time;
    private String jindu;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getChapterId() {
        return chapterId;
    }

    public void setChapterId(long chapterId) {
        this.chapterId = chapterId;
    }

    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getVolTitle() {
        return volTitle;
    }

    public void setVolTitle(String volTitle) {
        this.volTitle = volTitle;
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getJindu() {
        return jindu;
    }

    public void setJindu(String jindu) {
        this.jindu = jindu;
    }
}
