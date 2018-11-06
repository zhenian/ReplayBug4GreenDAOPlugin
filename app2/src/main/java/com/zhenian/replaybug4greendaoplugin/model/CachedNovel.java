package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class CachedNovel {

    @Id
    private long novelId;           //小说ID
    private String novelName;       //小说名称
    private String novelCover;      //小说封面
    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }
    public String getNovelName() {
        return this.novelName;
    }
    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }
    public String getNovelCover() {
        return this.novelCover;
    }
    public void setNovelCover(String novelCover) {
        this.novelCover = novelCover;
    }

    public CachedNovel(Novel novel){
        novelId = novel.getNovelId();
        novelName = novel.getNovelName();
        novelCover = novel.getNovelCover();
    }
}
