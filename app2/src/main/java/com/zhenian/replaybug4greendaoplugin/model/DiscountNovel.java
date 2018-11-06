package com.zhenian.replaybug4greendaoplugin.model;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Date;

/**
 */

@Entity
public class DiscountNovel {
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


    public long getNovelId() {
        return novelId;
    }

    public void setNovelId(long novelId) {
        this.novelId = novelId;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getCharCount() {
        return charCount;
    }

    public void setCharCount(long charCount) {
        this.charCount = charCount;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public long getMarkCount() {
        return markCount;
    }

    public void setMarkCount(long markCount) {
        this.markCount = markCount;
    }

    public String getNovelCover() {
        return novelCover;
    }

    public void setNovelCover(String novelCover) {
        this.novelCover = novelCover;
    }

    public String getNovelName() {
        return novelName;
    }

    public void setNovelName(String novelName) {
        this.novelName = novelName;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public long getTypeId() {
        return typeId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public long getViewTimes() {
        return viewTimes;
    }

    public void setViewTimes(long viewTimes) {
        this.viewTimes = viewTimes;
    }

    public String getBgBanner() {
        return bgBanner;
    }

    public void setBgBanner(String bgBanner) {
        this.bgBanner = bgBanner;
    }

    public long getFav() {
        return fav;
    }

    public void setFav(long fav) {
        this.fav = fav;
    }

    public long getTicket() {
        return ticket;
    }

    public void setTicket(long ticket) {
        this.ticket = ticket;
    }

    public long getPointCount() {
        return pointCount;
    }

    public void setPointCount(long pointCount) {
        this.pointCount = pointCount;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

    public String getSignLevel() {
        return signLevel;
    }

    public void setSignLevel(String signLevel) {
        this.signLevel = signLevel;
    }

    public String getSysTags() {
        return sysTags;
    }

    public void setSysTags(String sysTags) {
        this.sysTags = sysTags;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public long getUnlockHours() {
        return unlockHours;
    }

    public void setUnlockHours(long unlockHours) {
        this.unlockHours = unlockHours;
    }

    public boolean isAllowDown() {
        return allowDown;
    }

    public void setAllowDown(boolean allowDown) {
        this.allowDown = allowDown;
    }

    public boolean isAutoOrder() {
        return autoOrder;
    }

    public void setAutoOrder(boolean autoOrder) {
        this.autoOrder = autoOrder;
    }

    public Date getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(Date readingTime) {
        this.readingTime = readingTime;
    }

    public String getSingStatus() {
        return singStatus;
    }

    public void setSingStatus(String singStatus) {
        this.singStatus = singStatus;
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public void setChapterCount(int chapterCount) {
        this.chapterCount = chapterCount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public boolean getIsFinish() {
        return this.isFinish;
    }

    public void setIsFinish(boolean isFinish) {
        this.isFinish = isFinish;
    }

    public boolean getAllowDown() {
        return this.allowDown;
    }

    public boolean getAutoOrder() {
        return this.autoOrder;
    }

    public static DiscountNovel build(JSONObject data){

        /*{
        "novelName":"菲菲的幻想世界之蔡牧传",
        "authorName":"妄动",
        "point":7.2,
        "novelCover":"http://rs.sfacg.com/web/DiscountNovel/images/NovelCover/Big/8bee1a10-95f8-4881-a399-7ac415866262.jpg",
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
        DiscountNovel discountNovel = new DiscountNovel();
        discountNovel.setNovelId(data.optLong("novelId"));
        discountNovel.setNovelName(data.optString("novelName"));
        discountNovel.setAuthorName(data.optString("authorName"));
        discountNovel.setPoint(data.optString("point"));
        discountNovel.setNovelCover(data.optString("novelCover"));
        discountNovel.setCharCount(data.optLong("charCount"));
        discountNovel.setIsFinish(data.optBoolean("isFinish"));
        discountNovel.setViewTimes(data.optLong("viewTimes"));
        discountNovel.setMarkCount(data.optLong("markCount"));
        discountNovel.setAuthorId(data.optLong("authorId"));
        discountNovel.setTypeId(data.optLong("typeId"));
        discountNovel.setAllowDown(data.optBoolean("allowDown"));
        discountNovel.setSingStatus(data.optString("signStatus"));
        discountNovel.setBgBanner(data.optString("bgBanner"));
        discountNovel.setWeight(data.optInt("weight"));

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

            double discount = 0.0d;
            Date discountExpireDate = null;
            try{
                discount = Double.parseDouble(strDiscount);
            }catch (NumberFormatException e){}
            String strDiscountExpireDate = expand.optString("discountExpireDate");

            discountNovel.setIntro(intro);
            discountNovel.setTicket(ticket);
            discountNovel.setFav(fav);
            discountNovel.setTypeName(typeName);
            discountNovel.setUnlockHours(unlockHours);
            discountNovel.setPointCount(pointCount);
            discountNovel.setChapterCount(chapterCount);
            discountNovel.setSysTags(sysTags);
            discountNovel.setSignLevel(signLevel);
            discountNovel.setDiscount(discount);
            discountNovel.setDiscountExpireDate(discountExpireDate);
            discountNovel.setOriginTotalNeedFireMoney(originTotalNeedFireMoney);
            discountNovel.setTotalNeedFireMoney(totalNeedFireMoney);

            if (tags != null){
                String strTag = "";
                for (int i=0;i < tags.length();i++){
                    if (i > 0) strTag += " / ";
                    strTag += tags.optString(i);
                }
                discountNovel.setTags(strTag);
            }
        }
        return discountNovel;
    }

    public static Novel buildToNovel(DiscountNovel discountNovel){
        Novel novel = new Novel();
        novel.setNovelId(discountNovel.getNovelId());
        novel.setNovelName(discountNovel.getNovelName());
        novel.setAuthorName(discountNovel.getAuthorName());
        novel.setPoint(discountNovel.getPoint());
        novel.setNovelCover(discountNovel.getNovelCover());
        novel.setCharCount(discountNovel.getCharCount());
        novel.setIsFinish(discountNovel.getIsFinish());
        novel.setViewTimes(discountNovel.getViewTimes());
        novel.setMarkCount(discountNovel.getMarkCount());
        novel.setAuthorId(discountNovel.getAuthorId());
        novel.setTypeId(discountNovel.getTypeId());
        novel.setLastUpdateTime(discountNovel.getLastUpdateTime());
        novel.setAllowDown(discountNovel.getAllowDown());
        novel.setSingStatus(discountNovel.getSingStatus());
        novel.setBgBanner(discountNovel.getBgBanner());
        novel.setWeight(discountNovel.getWeight());
        novel.setIntro(discountNovel.getIntro());
        novel.setTicket(discountNovel.getTicket());
        novel.setFav(discountNovel.getFav());
        novel.setTypeName(discountNovel.getTypeName());
        novel.setUnlockHours(discountNovel.getUnlockHours());
        novel.setPointCount(discountNovel.getPointCount());
        novel.setChapterCount(discountNovel.getChapterCount());
        novel.setSysTags(discountNovel.getSysTags());
        novel.setSignLevel(discountNovel.getSignLevel());
        novel.setDiscount(discountNovel.getDiscount());
        novel.setDiscountExpireDate(discountNovel.getDiscountExpireDate());
        novel.setOriginTotalNeedFireMoney(discountNovel.getOriginTotalNeedFireMoney());
        novel.setTotalNeedFireMoney(discountNovel.getTotalNeedFireMoney());
        novel.setTags(discountNovel.getTags());
        novel.setReadingTime(discountNovel.getReadingTime());
        return novel;
    }

    public static DiscountNovel buildToDiscountNovel(Novel novel){
        DiscountNovel discountNovel = new DiscountNovel();
        discountNovel.setNovelId(novel.getNovelId());
        discountNovel.setNovelName(novel.getNovelName());
        discountNovel.setAuthorName(novel.getAuthorName());
        discountNovel.setPoint(novel.getPoint());
        discountNovel.setNovelCover(novel.getNovelCover());
        discountNovel.setCharCount(novel.getCharCount());
        discountNovel.setIsFinish(novel.getIsFinish());
        discountNovel.setViewTimes(novel.getViewTimes());
        discountNovel.setMarkCount(novel.getMarkCount());
        discountNovel.setAuthorId(novel.getAuthorId());
        discountNovel.setTypeId(novel.getTypeId());
        discountNovel.setLastUpdateTime(novel.getLastUpdateTime());
        discountNovel.setAllowDown(novel.getAllowDown());
        discountNovel.setSingStatus(novel.getSingStatus());
        discountNovel.setBgBanner(novel.getBgBanner());
        discountNovel.setWeight(novel.getWeight());
        discountNovel.setIntro(novel.getIntro());
        discountNovel.setTicket(novel.getTicket());
        discountNovel.setFav(novel.getFav());
        discountNovel.setTypeName(novel.getTypeName());
        discountNovel.setUnlockHours(novel.getUnlockHours());
        discountNovel.setPointCount(novel.getPointCount());
        discountNovel.setChapterCount(novel.getChapterCount());
        discountNovel.setSysTags(novel.getSysTags());
        discountNovel.setSignLevel(novel.getSignLevel());
        discountNovel.setDiscount(novel.getDiscount());
        discountNovel.setDiscountExpireDate(novel.getDiscountExpireDate());
        discountNovel.setOriginTotalNeedFireMoney(novel.getOriginTotalNeedFireMoney());
        discountNovel.setTotalNeedFireMoney(novel.getTotalNeedFireMoney());
        discountNovel.setTags(novel.getTags());
        discountNovel.setReadingTime(novel.getReadingTime());
        return discountNovel;
    }
}
