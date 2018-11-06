package com.zhenian.replaybug4greendaoplugin.model;

import android.support.v4.util.LongSparseArray;
import android.text.TextUtils;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.Transient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;

/**
 */
@Entity
public class ChapterContent {
    @Id
    private long chapId;
    @Index
    private long novelId;
    private String content;
    private boolean isVip;
    private long needFireMoney;
    private long charCount;
    private double sno;
    private boolean format;
    private long originNeedFireMoney; //原需要的火券数
    private String jsonTsukkomi;//tsukkomi Json字符串
    private Date updateTime;

    public long getChapId() {
        return this.chapId;
    }
    public void setChapId(long chapId) {
        this.chapId = chapId;
    }
    public long getNovelId() {
        return this.novelId;
    }
    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean isVip() {
        return this.isVip;
    }
    public void setVip(boolean isVip) {
        this.isVip = isVip;
    }
    public long getNeedFireMoney() {
        return this.needFireMoney;
    }
    public void setNeedFireMoney(long needFireMoney) {
        this.needFireMoney = needFireMoney;
    }
    public long getCharCount() {
        return this.charCount;
    }
    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }
    public double getSno() {
        return this.sno;
    }
    public void setSno(double sno) {
        this.sno = sno;
    }
    public boolean getFormat() {
        return this.format;
    }
    public void setFormat(boolean format) {
        this.format = format;
    }
    public long getOriginNeedFireMoney() {
        return this.originNeedFireMoney;
    }
    public void setOriginNeedFireMoney(long originNeedFireMoney) {
        this.originNeedFireMoney = originNeedFireMoney;
    }
    public String getJsonTsukkomi() {
        return this.jsonTsukkomi;
    }
    public void setJsonTsukkomi(String jsonTsukkomi) {
        this.jsonTsukkomi = jsonTsukkomi;
        this.tsukkomiNumMap = null;
    }
    public Date getUpdateTime() {
        return this.updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    public boolean getIsVip() {
        return this.isVip;
    }
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }


    @Transient
    private LongSparseArray<Integer> tsukkomiNumMap;
    public LongSparseArray<Integer> getTsukkomiMap(){
        if(this.tsukkomiNumMap == null){
            this.tsukkomiNumMap = new LongSparseArray<>();
            if (!TextUtils.isEmpty(this.jsonTsukkomi)) {
                try {
                    JSONArray jsonArray = new JSONArray(this.jsonTsukkomi);
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject obj = jsonArray.getJSONObject(i);
                        if (obj != null) {
                            int row = obj.optInt("row");
                            int count = obj.optInt("count");
                            this.tsukkomiNumMap.put(row, count);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return this.tsukkomiNumMap;
    }

}
