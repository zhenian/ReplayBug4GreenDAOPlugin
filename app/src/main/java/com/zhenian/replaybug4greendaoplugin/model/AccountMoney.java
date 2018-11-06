package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

/**
 */
@Entity
public class AccountMoney {
    @Id
    private long accountId;
    private long rmbCost;
    private long fireMoneyUsed;
    private long fireMoneyRemain;
    private long vipLevel;
    private long couponsRemain;

    public long getCouponsRemain() {
        return couponsRemain;
    }

    public void setCouponsRemain(long couponsRemain) {
        this.couponsRemain = couponsRemain;
    }

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public long getRmbCost() {
        return rmbCost;
    }

    public void setRmbCost(long rmbCost) {
        this.rmbCost = rmbCost;
    }

    public long getFireMoneyUsed() {
        return fireMoneyUsed;
    }

    public void setFireMoneyUsed(long fireMoneyUsed) {
        this.fireMoneyUsed = fireMoneyUsed;
    }

    public long getFireMoneyRemain() {
        return fireMoneyRemain;
    }

    public void setFireMoneyRemain(long fireMoneyRemain) {
        this.fireMoneyRemain = fireMoneyRemain;
    }

    public long getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(long vipLevel) {
        this.vipLevel = vipLevel;
    }

    public String getVipValue(){
        String vipValue = "普通用户";
        if(vipLevel > 0){
            vipValue = "VIP "+vipLevel;
        }
        return vipValue;
    }

}
