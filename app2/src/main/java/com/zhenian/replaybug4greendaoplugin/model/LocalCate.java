package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class LocalCate {
    @Id
    private String id;
    private String novelId;
    private String chapterId;
    private int begin;
    private int end;
    private String volTitle;
    private String chapterTitle;
    private String content;
    private String time;
    private String jindu;
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
    public String getChapterId() {
        return this.chapterId;
    }
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId;
    }
    public int getBegin() {
        return this.begin;
    }
    public void setBegin(int begin) {
        this.begin = begin;
    }
    public int getEnd() {
        return this.end;
    }
    public void setEnd(int end) {
        this.end = end;
    }
    public String getVolTitle() {
        return this.volTitle;
    }
    public void setVolTitle(String volTitle) {
        this.volTitle = volTitle;
    }
    public String getChapterTitle() {
        return this.chapterTitle;
    }
    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getTime() {
        return this.time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getJindu() {
        return this.jindu;
    }
    public void setJindu(String jindu) {
        this.jindu = jindu;
    }
}
