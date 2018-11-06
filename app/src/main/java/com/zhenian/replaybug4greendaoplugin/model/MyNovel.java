package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;

/**
 */
@Entity
public class MyNovel {
    @Id
    private long novelId;
    private long authorId;
    private Date lastUpdateTime;
    private long markCount;
    private String novelCover;
    private String novelName;
    private String point;
    private boolean isFinish;
    private String authorName;
    private long charCount;
    private long viewTimes;
    private long typeId;
    private boolean allowDown;
    private String signStatus;//VIP,签约
    private long ticket;
    private String applyStatus;
    private int intApplyStatus;
    private String intro;
    private String typeName;


    public String getSignStatus() {
        return this.signStatus;
    }
    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }
    public boolean getAllowDown() {
        return this.allowDown;
    }
    public void setAllowDown(boolean allowDown) {
        this.allowDown = allowDown;
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
    public long getCharCount() {
        return this.charCount;
    }
    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public boolean getIsFinish() {
        return this.isFinish;
    }
    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }
    public String getPoint() {
        return this.point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    public String getNovelName() {
        return this.novelName;
    }
    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }
    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }
    public String getNovelCover() {
        return this.novelCover;
    }
    public void setNovelCover(String novelCover) {
        this.novelCover = novelCover;
    }
    public long getMarkCount() {
        return this.markCount;
    }
    public void setMarkCount(long markCount) {
        this.markCount = markCount;
    }
    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    public long getAuthorId() {
        return this.authorId;
    }
    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
    public String getApplyStatus() {
        return this.applyStatus;
    }
    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }
    public long getTicket() {
        return this.ticket;
    }
    public void setTicket(long ticket) {
        this.ticket = ticket;
    }
    public int getIntApplyStatus() {
        return this.intApplyStatus;
    }
    public void setIntApplyStatus(int intApplyStatus) {
        this.intApplyStatus = intApplyStatus;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getTypeName() {
        return this.typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }


}
