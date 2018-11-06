package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONObject;


@Entity
public class SysTag {
    @Id
    private long sysTagId;
    private long refferTimes;
    private String tagName;
    public long getSysTagId() {
        return this.sysTagId;
    }
    public void setSysTagId(long sysTagId) {
        this.sysTagId = sysTagId;
    }
    public long getRefferTimes() {
        return this.refferTimes;
    }
    public void setRefferTimes(long refferTimes) {
        this.refferTimes = refferTimes;
    }
    public String getTagName() {
        return this.tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public static SysTag build(JSONObject jo){
        SysTag tag = new SysTag();
        tag.setSysTagId(jo.optLong("sysTagId"));
        tag.setRefferTimes(jo.optLong("refferTimes"));
        tag.setTagName(jo.optString("tagName"));
        return tag;
    }
}
