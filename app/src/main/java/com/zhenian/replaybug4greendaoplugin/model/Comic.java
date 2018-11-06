package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;


/**
 */

@Entity
public class Comic {

    @Transient
    private String path;

    @Id
    private long comicId;   //漫画ID
    private int typeId;     //漫画分类ID
    private long authorId;   //	作者ID
    private double point; 	//	漫画评分
    private long viewTimes; //	访问次数
    private String comicName;      //	漫画名称
    private String folderName;	//	文件目录名
    private String comicCover;	//	封面大图地址
    private String latestChapterTitle;//最新章节标题
    private boolean isFinished;//是否完结
    private String lastUpdateTime;//上次更新世界

    private String intro;//漫画简介
    private String authorname;//作者名
    private String authorintro;//作者简介
    private String typename;//小说类别
    private int markcount;//收藏数量
    private int fav;//点赞数
    private String tags;//标签集合
    private String originalauthor;//原著
    private String authoravater;//作者头像
    private int weight;//权重属性，用于排序

    public String getAuthoravater() {
        return this.authoravater;
    }
    public void setAuthoravater(String authoravater) {
        this.authoravater = authoravater;
    }
    public String getOriginalauthor() {
        return this.originalauthor;
    }
    public void setOriginalauthor(String originalauthor) {
        this.originalauthor = originalauthor;
    }
    public String getTags() {
        return this.tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public int getFav() {
        return this.fav;
    }
    public void setFav(int fav) {
        this.fav = fav;
    }
    public int getMarkcount() {
        return this.markcount;
    }
    public void setMarkcount(int markcount) {
        this.markcount = markcount;
    }
    public String getTypename() {
        return this.typename;
    }
    public void setTypename(String typename) {
        this.typename = typename;
    }
    public String getAuthorintro() {
        return this.authorintro;
    }
    public void setAuthorintro(String authorintro) {
        this.authorintro = authorintro;
    }
    public String getAuthorname() {
        return this.authorname;
    }
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public boolean getIsFinished() {
        return this.isFinished;
    }
    public void setIsFinished(boolean isFinished) {
        this.isFinished = isFinished;
    }
    public String getLatestChapterTitle() {
        return this.latestChapterTitle;
    }
    public void setLatestChapterTitle(String latestChapterTitle) {
        this.latestChapterTitle = latestChapterTitle;
    }
    public String getComicCover() {
        return this.comicCover;
    }
    public void setComicCover(String comicCover) {
        this.comicCover = comicCover;
    }
    public String getFolderName() {
        return this.folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public String getComicName() {
        return this.comicName;
    }
    public void setComicName(String comicName) {
        this.comicName = comicName;
    }
    public long getViewTimes() {
        return this.viewTimes;
    }
    public void setViewTimes(long viewTimes) {
        this.viewTimes = viewTimes;
    }
    public double getPoint() {
        return this.point;
    }
    public void setPoint(double point) {
        this.point = point;
    }
    public long getAuthorId() {
        return this.authorId;
    }
    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
    public int getTypeId() {
        return this.typeId;
    }
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
    public long getComicId() {
        return this.comicId;
    }
    public void setComicId(long comicId) {
        this.comicId = comicId;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

}
