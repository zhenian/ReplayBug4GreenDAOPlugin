package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Transient;

import java.util.HashMap;

/**
 */

@Entity
public class MyVolume {
    @Id
    private long volumeId;
    private String title;
    private double sno;
    @Transient
    private HashMap<String,String> draftList = new HashMap<>();//key:noveleId_volmeId_no, value:title#content


    public HashMap<String, String> getDraftList() {
        return draftList;
    }

    public void setDraftList(HashMap<String, String> draftList) {
        this.draftList = draftList;
    }

    // no是自增,从0开始
    @Index
    private long novelId;

    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }
    public double getSno() {
        return this.sno;
    }
    public void setSno(double sno) {
        this.sno = sno;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public long getVolumeId() {
        return this.volumeId;
    }
    public void setVolumeId(long volumeId) {
        this.volumeId = volumeId;
    }
}
