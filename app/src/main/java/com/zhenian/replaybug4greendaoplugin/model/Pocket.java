package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;

/**
 */
@Entity
public class Pocket {
    @Id
    private long pocketId;
    private long accountId;
    private Date createTime;
    private String name;
    private int count;
    private int typeId; // 火袋typeId,1为漫画,2为小说,3为音频/视频

    public long getPocketId() {
        return pocketId;
    }

    public void setPocketId(long pocketId) {
        this.pocketId = pocketId;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public static Pocket build(JSONObject data){
        Pocket pocket = new Pocket();
        pocket.setPocketId(data.optLong("pocketId"));
        pocket.setAccountId(data.optLong("accountId"));
        pocket.setName(data.optString("name"));
        pocket.setTypeId(data.optInt("typeId"));

        JSONObject expand = data.optJSONObject("expand");
        if(expand != null){
            JSONArray list = null;
            // 火袋typeId,1为漫画,2为小说,3为音频/视频
            if(pocket.getTypeId() == 1){
                list = expand.optJSONArray("comics");
            }else if(pocket.getTypeId() == 2){
                list = expand.optJSONArray("novels");
            }else if(pocket.getTypeId() == 3){
                list = expand.optJSONArray("albums");
            }
            if(list != null){
                pocket.setCount(list.length());
            }
        }


        return pocket;
    }
}
