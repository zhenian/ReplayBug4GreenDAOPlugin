package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 */
@Entity
public class Album {
    @Id
    private long albumId;
    private long authorId;
    private String coverBig;
    private String coverSmall;
    private Date lastUpdateTime;
    private long latestChapterId;
    private long visitTimes;
    private String name;
    private long novelId;
    private String authoravatar;
    private String coverMedium;

    private String intro;
    private String authorName;
    private String authorIntro;
    private long chapterCount;
    private long markCount;
    private long fav;
    private long novelchaptercount;//貌似没用
    private String latestchaptitle;
    private String latestchapintro;
    // local data
    private Date listenTime;
    private int weight;//权重属性，用于排序
    public long getAlbumId() {
        return this.albumId;
    }
    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }
    public long getAuthorId() {
        return this.authorId;
    }
    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
    public String getCoverBig() {
        return this.coverBig;
    }
    public void setCoverBig(String coverBig) {
        this.coverBig = coverBig;
    }
    public String getCoverSmall() {
        return this.coverSmall;
    }
    public void setCoverSmall(String coverSmall) {
        this.coverSmall = coverSmall;
    }
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public long getLatestChapterId() {
        return this.latestChapterId;
    }
    public void setLatestChapterId(long latestChapterId) {
        this.latestChapterId = latestChapterId;
    }
    public long getVisitTimes() {
        return this.visitTimes;
    }
    public void setVisitTimes(long visitTimes) {
        this.visitTimes = visitTimes;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }
    public String getAuthoravatar() {
        return this.authoravatar;
    }
    public void setAuthoravatar(String authoravatar) {
        this.authoravatar = authoravatar;
    }
    public String getCoverMedium() {
        return this.coverMedium;
    }
    public void setCoverMedium(String coverMedium) {
        this.coverMedium = coverMedium;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorIntro() {
        return this.authorIntro;
    }
    public void setAuthorIntro(String authorIntro) {
        this.authorIntro = authorIntro;
    }
    public long getChapterCount() {
        return this.chapterCount;
    }
    public void setChapterCount(long chapterCount) {
        this.chapterCount = chapterCount;
    }
    public long getMarkCount() {
        return this.markCount;
    }
    public void setMarkCount(long markCount) {
        this.markCount = markCount;
    }
    public long getFav() {
        return this.fav;
    }
    public void setFav(long fav) {
        this.fav = fav;
    }
    public long getNovelchaptercount() {
        return this.novelchaptercount;
    }
    public void setNovelchaptercount(long novelchaptercount) {
        this.novelchaptercount = novelchaptercount;
    }
    public String getLatestchaptitle() {
        return this.latestchaptitle;
    }
    public void setLatestchaptitle(String latestchaptitle) {
        this.latestchaptitle = latestchaptitle;
    }
    public String getLatestchapintro() {
        return this.latestchapintro;
    }
    public void setLatestchapintro(String latestchapintro) {
        this.latestchapintro = latestchapintro;
    }
    public Date getListenTime() {
        return this.listenTime;
    }
    public void setListenTime(Date listenTime) {
        this.listenTime = listenTime;
    }
    public int getWeight() {
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }



}
