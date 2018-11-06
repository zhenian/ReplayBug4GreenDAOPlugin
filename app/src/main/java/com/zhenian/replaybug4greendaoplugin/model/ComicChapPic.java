package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.json.JSONArray;
import org.json.JSONException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 */

@Entity
public class ComicChapPic {

    public static String buildId(long comicId, String pathName){
        return new StringBuilder().append(comicId).append("_").append(pathName).toString();
    }
    @Id
    private String id; // comicId + "_" + pathName
    private long comicId;
    private String pathName;
    private String pics; // ["",""] pic json string
    private long sno; // 序号
    private boolean isVip;// = true;//pxhwin 赋值为true 测试用

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public long getComicId() {
        return this.comicId;
    }
    public void setComicId(long comicId) {
        this.comicId = comicId;
    }
    public String getPathName() {
        return this.pathName;
    }
    public void setPathName(String pathName) {
        this.pathName = pathName;
    }
    public String getPics() {
        return this.pics;
    }
    public void setPics(String pics) {
        this.pics = pics;
    }
    public long getSno() {
        return this.sno;
    }
    public void setSno(long sno) {
        this.sno = sno;
    }
    public boolean getIsVip() {
        return this.isVip;
    }
    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }


    @Transient
    private String path;

    public String getLocalPath() {
        return path;
    }

    public int getPicsCount(){
        if(pics == null){
            return 0;
        }
        return getPicList().size();
    }

    public List<String> getPicList(){
        if(this.pics == null){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        try{
            JSONArray jsonArray = new JSONArray(this.pics);
            for(int i=0; i<jsonArray.length();i++){
                String str = jsonArray.optString(i);
                if(str != null){
                    list.add(str);
                }
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        return list;
    }

    public boolean checkCached(){
        String p = this.getLocalPath();
        if(p == null){
            return false;
        }
        File f = new File(p);
        File[] fs = f.listFiles();

        int count = 0;
        if(fs != null){
            for(File file : fs){
                if(file.isFile()){
                    count++;
                }
            }
        }
//        L.d("-------->>>> chech comic %d chap %s cache, image count: %d, files count: %d", this.getComicId(), this.getPathName(), this.getPicsCount(), fs.length);
        return count == this.getPicsCount();
    }

}
