package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class AlbumCmt {
    @Id
    private long commentId;
    private int replyNum;
    private int extType;
    private int vipLevel;
    private int favNum;
    private String avatar;
    private String displayName;
    private String content;
    private String createTime;
    private String roleName;
    private boolean isZhiDing;//是否置顶
    private long accountId;
    private int verifyType;
    private long entityId;//标识当前评论的源作品ID

    public long getCommentId() {
        return this.commentId;
    }
    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }
    public int getReplyNum() {
        return this.replyNum;
    }
    public void setReplyNum(int replyNum) {
        this.replyNum = replyNum;
    }
    public int getExtType() {
        return this.extType;
    }
    public void setExtType(int extType) {
        this.extType = extType;
    }
    public int getVipLevel() {
        return this.vipLevel;
    }
    public void setVipLevel(int vipLevel) {
        this.vipLevel = vipLevel;
    }
    public int getFavNum() {
        return this.favNum;
    }
    public void setFavNum(int favNum) {
        this.favNum = favNum;
    }
    public String getAvatar() {
        return this.avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getDisplayName() {
        return this.displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getCreateTime() {
        return this.createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getRoleName() {
        return this.roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public boolean getIsZhiDing() {
        return this.isZhiDing;
    }
    public void setIsZhiDing(boolean isZhiDing) {
        this.isZhiDing = isZhiDing;
    }
    public long getAccountId() {
        return this.accountId;
    }
    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }
    public int getVerifyType() {
        return this.verifyType;
    }
    public void setVerifyType(int verifyType) {
        this.verifyType = verifyType;
    }

    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }
}
