package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

/**
 */

@Entity
public class ComicChap {
    public static String buildId(long comicId, String pathName){
        return new StringBuilder().append(comicId).append("_").append(pathName).toString();
    }
    @Id
    private String id; // comicId + "_" + pathName
    private long comicId;
    private String chapterTitle;
    private String pathName;
    private long serialId;
    private long sno; // 序号

    private long chapterId;//有可能是0
    private boolean isVip;// = true;//pxhwin 赋值为true 测试用
    private long needFireMoney;//需要的火券数
    private String addDate;//漫画章节最后更新时间

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
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
    public String getChapterTitle() {
        return this.chapterTitle;
    }
    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }
    public String getPathName() {
        return this.pathName;
    }
    public void setPathName(String pathName) {
        this.pathName = pathName;
    }
    public long getSerialId() {
        return this.serialId;
    }
    public void setSerialId(long serialId) {
        this.serialId = serialId;
    }
    public long getSno() {
        return this.sno;
    }
    public void setSno(long sno) {
        this.sno = sno;
    }
    public boolean getIsVip() {
        return this.isVip;
    }
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public long getChapterId() {
        return chapterId;
    }

    public void setChapterId(long chapterId) {
        this.chapterId = chapterId;
    }

    public long getNeedFireMoney() {
        return needFireMoney;
    }

    public void setNeedFireMoney(long needFireMoney) {
        this.needFireMoney = needFireMoney;
    }

    @Transient
    private String path;


}
