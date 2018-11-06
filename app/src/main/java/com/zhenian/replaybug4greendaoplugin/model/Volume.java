package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;

@Entity
public class Volume {
    @Id
    private long volumeId;
    private String title;
    private double sno;
    @Index
    private long novelId;
    private boolean local;//是否本地上传 1 是 0 否
    private long pos;// 本地 txt 图书 中的位置

    public long getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(long volumeId) {
        this.volumeId = volumeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSno() {
        return sno;
    }

    public void setSno(double sno) {
        this.sno = sno;
    }

    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public boolean isLocal() {
        return local;
    }

    public void setLocal(boolean local) {
        this.local = local;
    }

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public boolean getLocal() {
        return this.local;
    }
}
