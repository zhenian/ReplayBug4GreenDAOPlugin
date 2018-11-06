package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class PlayAudioHistory {
    @Id
    private long albumId;//专辑ID
    private long audioId;//当前播放的歌曲ID
    private int playerState;//播放状态
    private long currentPosition;//当前播放位置
    private long duration;//用时
    private String loginId;//登录用户
    private String title;//标题
    private String intro;//简介
    private String albumPic;//封面图片，大图
    private String lastViewTime;//上次听的时间


    public long getAlbumId() {
        return this.albumId;
    }
    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }
    public long getAudioId() {
        return this.audioId;
    }
    public void setAudioId(long audioId) {
        this.audioId = audioId;
    }
    public int getPlayerState() {
        return this.playerState;
    }
    public void setPlayerState(int playerState) {
        this.playerState = playerState;
    }
    public long getCurrentPosition() {
        return this.currentPosition;
    }
    public void setCurrentPosition(long currentPosition) {
//        if (currentPosition == 0) {
//            L.d("++++setCurrentPosition = "+currentPosition);
//        }
        this.currentPosition = currentPosition;
    }
    public long getDuration() {
        return this.duration;
    }
    public void setDuration(long duration) {
//        if (duration < 0) {
//            L.d("++++setCurrentPosition = "+duration);
//        }
        this.duration = duration;
    }
    public String getLoginId() {
        return this.loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getIntro() {
        return this.intro;
    }
    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getAlbumPic() {
        return this.albumPic;
    }
    public void setAlbumPic(String albumPic) {
        this.albumPic = albumPic;
    }
    public String getLastViewTime() {
        return this.lastViewTime;
    }
    public void setLastViewTime(String lastViewTime) {
        this.lastViewTime = lastViewTime;
    }

    public PlayAudioHistory cloneAudioHistory() {
        PlayAudioHistory temp = new PlayAudioHistory();
        temp.setAlbumId(albumId);
        temp.setAlbumPic(albumPic);
        temp.setCurrentPosition(currentPosition);
        temp.setDuration(duration);
        temp.setIntro(intro);
        temp.setPlayerState(playerState);
        temp.setAudioId(audioId);
        temp.setTitle(title);
        temp.setLoginId(loginId);
        temp.setLastViewTime(lastViewTime);
        return temp;
    }


}
