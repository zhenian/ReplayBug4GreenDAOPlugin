package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class CachedAlbum {
    @Id
    private long albumId;           //专辑ID
    private String albumCover;      //专辑封面
    private String albumSmallCover; //专辑小封面
    private String albumName;       //音频名称
    public long getAlbumId() {
        return this.albumId;
    }
    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }
    public String getAlbumCover() {
        return this.albumCover;
    }
    public void setAlbumCover(String albumCover) {
        this.albumCover = albumCover;
    }
    public String getAlbumSmallCover() {
        return this.albumSmallCover;
    }
    public void setAlbumSmallCover(String albumSmallCover) {
        this.albumSmallCover = albumSmallCover;
    }
    public String getAlbumName() {
        return this.albumName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

}
