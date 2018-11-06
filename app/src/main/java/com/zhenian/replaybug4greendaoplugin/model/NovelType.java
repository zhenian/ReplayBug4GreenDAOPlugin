package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */

@Entity
public class NovelType {
    @Id
    private long typeId;
    private String typeName;
    public String getTypeName() {
        return this.typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public long getTypeId() {
        return this.typeId;
    }
    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

}
