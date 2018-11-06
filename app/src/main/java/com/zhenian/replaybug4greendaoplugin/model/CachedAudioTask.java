package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class CachedAudioTask {
    @Id
    private long audioId;            //音频ID
    private int taskId;             //下载任务id
    private String songPath;        //音频本地路径
    private String songUrl;         //音频下载链接
    private String name;            //音频名称  注意，这里只是文件名
    private long albumId;           //专辑ID
    private int status;             //下载的状态
    private long progress;          //下载的进度
    private long size;              //音频的总大小

    public long getAudioId() {
        return this.audioId;
    }
    public void setAudioId(long audioId) {
        this.audioId = audioId;
    }
    public int getTaskId() {
        return this.taskId;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    public String getSongPath() {
        return this.songPath;
    }
    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }
    public String getSongUrl() {
        return this.songUrl;
    }
    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getAlbumId() {
        return this.albumId;
    }
    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public long getProgress() {
        return this.progress;
    }
    public void setProgress(long progress) {
        this.progress = progress;
    }
    public long getSize() {
        return this.size;
    }
    public void setSize(long size) {
        this.size = size;
    }


}
