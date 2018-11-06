package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 */
@Entity
public class VisitNovelHistory {
    @Id
    private long novelId;
    private long authorId;
    private String authorName;
    private long charCount;
    private boolean isFinish;
    private Date lastUpdateTime;
    private long markCount;
    private String novelCover;
    private String novelName;
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

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getCharCount() {
        return charCount;
    }

    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public long getMarkCount() {
        return markCount;
    }

    public void setMarkCount(long markCount) {
        this.markCount = markCount;
    }

    public String getNovelCover() {
        return novelCover;
    }

    public void setNovelCover(String novelCover) {
        this.novelCover = novelCover;
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public long getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(long viewTimes) {
        this.viewTimes = viewTimes;
    }

    public long getFav() {
        return fav;
    }

    public void setFav(long fav) {
        this.fav = fav;
    }

    public long getTicket() {
        return ticket;
    }

    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public long getUnlockHours() {
        return unlockHours;
    }

    public void setUnlockHours(long unlockHours) {
        this.unlockHours = unlockHours;
    }

    public boolean isAllowDown() {
        return allowDown;
    }

    public void setAllowDown(boolean allowDown) {
        this.allowDown = allowDown;
    }

    public boolean isAutoOrder() {
        return autoOrder;
    }

    public void setAutoOrder(boolean autoOrder) {
        this.autoOrder = autoOrder;
    }

    public Date getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }

    public boolean getAutoOrder() {
        return this.autoOrder;
    }

    public boolean getAllowDown() {
        return this.allowDown;
    }

    public boolean getIsFinish() {
        return this.isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    public boolean getSelect() {
        return this.select;
    }
}
