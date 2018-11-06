package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class CacheChapterTask {
    @Id
    private long chapId;
    private long novelId;
    private long priority;
    private int status;// 0 wait 1 in caching 2 cached


    public long getChapId() {
        return chapId;
    }

    public void setChapId(long chapId) {
        this.chapId = chapId;
    }

    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getPriority() {
        return priority;
    }

    public void setPriority(long priority) {
        this.priority = priority;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
