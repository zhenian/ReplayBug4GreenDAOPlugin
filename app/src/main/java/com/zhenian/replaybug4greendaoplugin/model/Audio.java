package com.zhenian.replaybug4greendaoplugin.model;

import android.text.TextUtils;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;

import java.io.File;

/**
 */
@Entity
public class Audio {
    @Id
    private long chapterId;
    private long albumId;
    private long volumeId;
    private long novelChapterId;
    private long visitTimes;
    private long fileSize;
    private long duration;
    private String fileName;
    private String chapterTitle;
    private String cover;
    private long sno;
    private String intro;
    private boolean isVip;
    private long needFireMoney;

    public long getChapterId() {
        return this.chapterId;
    }
    public void setChapterId(long chapterId) {
        this.chapterId = chapterId;
    }
    public long getAlbumId() {
        return this.albumId;
    }
    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }
    public long getVolumeId() {
        return this.volumeId;
    }
    public void setVolumeId(long volumeId) {
        this.volumeId = volumeId;
    }
    public long getNovelChapterId() {
        return this.novelChapterId;
    }
    public void setNovelChapterId(long novelChapterId) {
        this.novelChapterId = novelChapterId;
    }
    public long getVisitTimes() {
        return this.visitTimes;
    }
    public void setVisitTimes(long visitTimes) {
        this.visitTimes = visitTimes;
    }
    public long getFileSize() {
        return this.fileSize;
    }
    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }
    public long getDuration() {
        return this.duration;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public String getFileName() {
        return this.fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getChapterTitle() {
        return this.chapterTitle;
    }
    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }
    public String getCover() {
        return this.cover;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public long getSno() {
        return this.sno;
    }
    public void setSno(long sno) {
        this.sno = sno;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public boolean getIsVip() {
        return this.isVip;
    }
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }
    public long getNeedFireMoney() {
        return this.needFireMoney;
    }
    public void setNeedFireMoney(long needFireMoney) {
        this.needFireMoney = needFireMoney;
    }


    @Transient
    private String path;

    public String getPath() {
        return path;
    }


    public String getVipFileName(){
        return new StringBuilder("").append(this.getAlbumId()).append("_").append(this.getChapterId()).append(".mp3").toString();
    }

    /**
     * 是否在本地路径中存在这个音频文件
     *
     * @param song
     * @return
     */
    public static boolean isExitSongFromPath(Audio song) {
        if (song == null || TextUtils.isEmpty(song.getPath())) return false;
        File file = new File(song.getPath());
        return file.exists() && file.isFile();
    }
}
