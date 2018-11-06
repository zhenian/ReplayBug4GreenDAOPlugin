package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;

/**
 */

@Entity
public class Novel  {
    @Id
    private long novelId;
    private long authorId;
    private String authorName;
    private long charCount;
    private boolean isFinish;
    private Date lastUpdateTime;
    private long markCount;
    private String novelCover;
    private String novelName;
    private String point;
    private long typeId;
    private long viewTimes;
    private String bgBanner;//小说s级才有的大图背景
    //expand
    private long fav;
    private long ticket;
    private long pointCount;
    private String typeName;
    private String tagString;
    private String signLevel;//none,normal,vipB,vipA,vipS

    private String sysTags;
    private String tags;
    private String intro;
    private long unlockHours;
    private boolean allowDown;
    private boolean autoOrder;
    // local data
    private Date readingTime;
    private String singStatus;
    private int chapterCount;
    private int weight;//权重属性，用于排序

    private double discount;//折扣率 1.0=没折扣
    private Date discountExpireDate;//1970-01-01T00:00:00
    private long totalNeedFireMoney;
    private long originTotalNeedFireMoney;

    public long getTotalNeedFireMoney() {
        return totalNeedFireMoney;
    }

    public void setTotalNeedFireMoney(long totalNeedFireMoney) {
        this.totalNeedFireMoney = totalNeedFireMoney;
    }

    public long getOriginTotalNeedFireMoney() {
        return originTotalNeedFireMoney;
    }

    public void setOriginTotalNeedFireMoney(long originTotalNeedFireMoney) {
        this.originTotalNeedFireMoney = originTotalNeedFireMoney;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Date getDiscountExpireDate() {
        return discountExpireDate;
    }

    public void setDiscountExpireDate(Date discountExpireDate) {
        this.discountExpireDate = discountExpireDate;
    }

    public long getNovelId() {
        return this.novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getCharCount() {
        return this.charCount;
    }

    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }

    public boolean getIsFinish() {
        return this.isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    public Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public long getMarkCount() {
        return this.markCount;
    }

    public void setMarkCount(long markCount) {
        this.markCount = markCount;
    }

    public String getNovelCover() {
        return this.novelCover;
    }

    public void setNovelCover(String novelCover) {
        this.novelCover = novelCover;
    }

    public String getNovelName() {
        return this.novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public String getPoint() {
        return this.point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public long getTypeId() {
        return this.typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public long getViewTimes() {
        return this.viewTimes;
    }

    public void setViewTimes(long viewTimes) {
        this.viewTimes = viewTimes;
    }

    public String getBgBanner() {
        return this.bgBanner;
    }

    public void setBgBanner(String bgBanner) {
        this.bgBanner = bgBanner;
    }

    public long getFav() {
        return this.fav;
    }

    public void setFav(long fav) {
        this.fav = fav;
    }

    public long getTicket() {
        return this.ticket;
    }

    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    public long getPointCount() {
        return this.pointCount;
    }

    public void setPointCount(long pointCount) {
        this.pointCount = pointCount;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTagString() {
        return this.tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public String getSignLevel() {
        return this.signLevel;
    }

    public void setSignLevel(String signLevel) {
        this.signLevel = signLevel;
    }

    public String getSysTags() {
        return this.sysTags;
    }

    public void setSysTags(String sysTags) {
        this.sysTags = sysTags;
    }

    public String getTags() {
        return this.tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getIntro() {
        return this.intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public long getUnlockHours() {
        return this.unlockHours;
    }

    public void setUnlockHours(long unlockHours) {
        this.unlockHours = unlockHours;
    }

    public boolean getAllowDown() {
        return this.allowDown;
    }

    public void setAllowDown(boolean allowDown) {
        this.allowDown = allowDown;
    }

    public boolean getAutoOrder() {
        return this.autoOrder;
    }

    public void setAutoOrder(boolean autoOrder) {
        this.autoOrder = autoOrder;
    }

    public Date getReadingTime() {
        return this.readingTime;
    }

    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }

    public String getSingStatus() {
        return this.singStatus;
    }

    public void setSingStatus(String singStatus) {
        this.singStatus = singStatus;
    }

    public int getChapterCount() {
        return this.chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    public static Novel build(JSONObject data){

        /*{
        "novelName":"菲菲的幻想世界之蔡牧传",
        "authorName":"妄动",
        "point":7.2,
        "novelCover":"http://rs.sfacg.com/web/novel/images/NovelCover/Big/8bee1a10-95f8-4881-a399-7ac415866262.jpg",
        "novelId":2657,
        "charCount":72050,
        "isFinish":false,
        "viewTimes":4954,
        "markCount":8,
        "authorId":2,
        "typeId":0,
        "lastUpdateTime":"2016-09-07T10:34:38",
        "allowDown":false
        "bgBanner":"http://rs...../4646.jpg"
        }*/
        Novel novel = new Novel();
        novel.setNovelId(data.optLong("novelId"));
        novel.setNovelName(data.optString("novelName"));
        novel.setAuthorName(data.optString("authorName"));
        novel.setPoint(data.optString("point"));
        novel.setNovelCover(data.optString("novelCover"));
        novel.setCharCount(data.optLong("charCount"));
        novel.setIsFinish(data.optBoolean("isFinish"));
        novel.setViewTimes(data.optLong("viewTimes"));
        novel.setMarkCount(data.optLong("markCount"));
        novel.setAuthorId(data.optLong("authorId"));
        novel.setTypeId(data.optLong("typeId"));
        novel.setAllowDown(data.optBoolean("allowDown"));
        novel.setSingStatus(data.optString("signStatus"));
        novel.setBgBanner(data.optString("bgBanner"));
        novel.setWeight(data.optInt("weight"));

        JSONObject expand = data.optJSONObject("expand");
        if(expand != null){
            String intro = expand.optString("intro");
            long ticket = expand.optLong("ticket");
            long fav = expand.optLong("fav");
            String typeName = expand.optString("typeName");
            JSONArray tags = expand.optJSONArray("tags");
            String sysTags = expand.optString("sysTags");
            long unlockHours = expand.optLong("unlockHours");
            long pointCount =  expand.optLong("pointCount");
            int chapterCount = expand.optInt("chapterCount");
            String signLevel = expand.optString("signLevel");
            String strDiscount = expand.optString("discount");//当有些接口没有添加expand = discount，接口有可能返回NaN字符串
            long originTotalNeedFireMoney = expand.optLong("originTotalNeedFireMoney");
            long totalNeedFireMoney = expand.optLong("totalNeedFireMoney");

            double discount = 0.0;
            Date discountExpireDate = null;
            try{
                discount = Double.parseDouble(strDiscount);
            }catch (NumberFormatException e){}
            String strDiscountExpireDate = expand.optString("discountExpireDate");

            novel.setIntro(intro);
            novel.setTicket(ticket);
            novel.setFav(fav);
            novel.setTypeName(typeName);
            novel.setUnlockHours(unlockHours);
            novel.setPointCount(pointCount);
            novel.setChapterCount(chapterCount);
            novel.setSysTags(sysTags);
            novel.setSignLevel(signLevel);
            novel.setDiscount(discount);
            novel.setDiscountExpireDate(discountExpireDate);
            novel.setOriginTotalNeedFireMoney(originTotalNeedFireMoney);
            novel.setTotalNeedFireMoney(totalNeedFireMoney);

            if (tags != null){
                String strTag = "";
                for (int i=0;i < tags.length();i++){
                    if (i > 0) strTag += " / ";
                    strTag += tags.optString(i);
                }
                novel.setTags(strTag);
            }
        }
        return novel;
    }
}
