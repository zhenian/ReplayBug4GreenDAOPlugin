package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */
@Entity
public class LocalVolume {
    @Id
    private String volumeId;
    private String novelId;
    private String title;
    private String path;
    private double sno;
    private long pos;// 本地 txt 图书 中的位置
    public String getVolumeId() {
        return this.volumeId;
    }
    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }
    public String getNovelId() {
        return this.novelId;
    }
    public void setNovelId(String novelId) {
        this.novelId = novelId;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPath() {
        return this.path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    public double getSno() {
        return this.sno;
    }
    public void setSno(double sno) {
        this.sno = sno;
    }
    public long getPos() {
        return this.pos;
    }
    public void setPos(long pos) {
        this.pos = pos;
    }
}
