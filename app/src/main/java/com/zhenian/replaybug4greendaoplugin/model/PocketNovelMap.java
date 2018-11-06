package com.zhenian.replaybug4greendaoplugin.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.PatternSyntaxException;

/**
 */
@Entity
public class PocketNovelMap {
    @Id
    private long pocketId;
    private String ids;


    public long getPocketId() {
        return pocketId;
    }

    public void setPocketId(long pocketId) {
        this.pocketId = pocketId;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setIdsList(List<Long> list){
        if(list == null | list.size() == 0){
            ids = "";
        }else{
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if(i!=0){
                    sb.append(",");
                }
                sb.append(list.get(i));
            }
            ids = sb.toString();
        }
    }

    public List<Long> getIdsList(){
        List<Long> list = new ArrayList<>();
        if (ids != null) {
            try{
                String[] is = ids.split(",");
                if(is != null){
                    for (String s:is) {
                        try {
                            long i = Long.parseLong(s);
                            list.add(i);
                        }catch (NumberFormatException e){
                        }
                    }
                }
            }catch (PatternSyntaxException e){
            }

        }
        return list;
    }
}
