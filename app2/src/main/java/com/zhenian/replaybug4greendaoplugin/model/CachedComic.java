package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class CachedComic {
    @Id
    private long comicId;   //漫画ID
    private String comicName;      //	漫画名称
    private String comicCover;	//	封面大图地址

    public long getComicId() {
        return this.comicId;
    }
    public void setComicId(long comicId) {
        this.comicId = comicId;
    }
    public String getComicName() {
        return this.comicName;
    }
    public void setComicName(String comicName) {
        this.comicName = comicName;
    }
    public String getComicCover() {
        return this.comicCover;
    }
    public void setComicCover(String comicCover) {
        this.comicCover = comicCover;
    }

    public CachedComic(Comic comic){
        comicId = comic.getComicId();
        comicName = comic.getComicName();
        comicCover = comic.getComicCover();
    }

}
