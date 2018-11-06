package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 *
 */
@Entity
public class LocalNovel {
    @Id
    private long novelId;
    private String name;  // filename
    private String path;  // filename.txt
    private String cover;
    private Date createTime;
    private Date updateTime;
    private long pos;
    private long types; // typo 键入错误，已经写到数据库了。就不更正了。 bytes
    private String size;


    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public long getPos() {
        return pos;
    }

    public void setPos(long pos) {
        this.pos = pos;
    }

    public long getTypes() {
        return types;
    }

    public void setTypes(long types) {
        this.types = types;
    }

    public long getBytes() {
        return types;
    }

    public void setBytes(long bytes) {
        this.types = bytes;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
