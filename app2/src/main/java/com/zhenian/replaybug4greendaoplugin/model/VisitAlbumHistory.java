package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;


@Entity
public class VisitAlbumHistory {
    @Id
    private long albumId;
    private long authorId;
    private String authorName;
    private long charCount;
    private boolean isFinish;
    private Date lastUpdateTime;
    private long markCount;
    private String albumCover;
    private String albumName;
    private String point;
    private long typeId;
    private long viewTimes;
    //expand
    private long fav;
    private long ticket;
    private String typeName;
    private String tagString;

    private String tags;
    private String intro;
    private long unlockHours;
    private boolean allowDown;
    private boolean autoOrder;
    // local data
    private Date readingTime;
    private boolean select;

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
    public String getAuthorName() {
        return this.authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public long getCharCount() {
        return this.charCount;
    }
    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }
    public boolean getIsFinish() {
        return this.isFinish;
    }
    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public long getMarkCount() {
        return this.markCount;
    }
    public void setMarkCount(long markCount) {
        this.markCount = markCount;
    }
    public String getAlbumCover() {
        return this.albumCover;
    }
    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }
    public String getAlbumName() {
        return this.albumName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getPoint() {
        return this.point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    public long getTypeId() {
        return this.typeId;
    }
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }
    public long getViewTimes() {
        return this.viewTimes;
    }
    public void setViewTimes(long viewTimes) {
        this.viewTimes = viewTimes;
    }
    public long getFav() {
        return this.fav;
    }
    public void setFav(long fav) {
        this.fav = fav;
    }
    public long getTicket() {
        return this.ticket;
    }
    public void setTicket(long ticket) {
        this.ticket = ticket;
    }
    public String getTypeName() {
        return this.typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getTagString() {
        return this.tagString;
    }
    public void setTagString(String tagString) {
        this.tagString = tagString;
    }
    public String getTags() {
        return this.tags;
    }
    public void setTags(String tags) {
        this.tags = tags;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public long getUnlockHours() {
        return this.unlockHours;
    }
    public void setUnlockHours(long unlockHours) {
        this.unlockHours = unlockHours;
    }
    public boolean getAllowDown() {
        return this.allowDown;
    }
    public void setAllowDown(boolean allowDown) {
        this.allowDown = allowDown;
    }
    public boolean getAutoOrder() {
        return this.autoOrder;
    }
    public void setAutoOrder(boolean autoOrder) {
        this.autoOrder = autoOrder;
    }
    public Date getReadingTime() {
        return this.readingTime;
    }
    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }
    public boolean getSelect() {
        return this.select;
    }
    public void setSelect(boolean select) {
        this.select = select;
    }
}
