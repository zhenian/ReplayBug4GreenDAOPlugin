package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class ComicChapPicTask {
    @Id
    private String id; // comicId + "_" + pathName
    private long comicId;
    private String pathName;
    private long seq;
    private int status; // 0 等待下载 1 下载中 2 下载完成
    private long sno; // 序号


    public long getSno() {
        return sno;
    }
    public void setSno(long sno) {
        this.sno = sno;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public long getComicId() {
        return this.comicId;
    }
    public void setComicId(long comicId) {
        this.comicId = comicId;
    }
    public String getPathName() {
        return this.pathName;
    }
    public void setPathName(String pathName) {
        this.pathName = pathName;
    }
    public long getSeq() {
        return this.seq;
    }
    public void setSeq(long seq) {
        this.seq = seq;
    }
}
