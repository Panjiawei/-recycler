package com.example.diversityrecycler.bean;

import java.util.ArrayList;
import java.util.List;



public class SwipeCardBean {
    private int postition;
    private String url;
    private String name;

    public SwipeCardBean(int postition, String url, String name) {
        this.postition = postition;
        this.url = url;
        this.name = name;
    }

    public int getPostition() {
        return postition;
    }

    public SwipeCardBean setPostition(int postition) {
        this.postition = postition;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SwipeCardBean setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getName() {
        return name;
    }

    public SwipeCardBean setName(String name) {
        this.name = name;
        return this;
    }

    public static List<SwipeCardBean> initDatas() {
        List<SwipeCardBean> datas = new ArrayList<>();
        int i = 1;
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863351962&di=2eb054cb7004497ec53a61af2c3fb8e1&imgtype=0&src=http%3A%2F%2Fimga.mumayi.com%2Fandroid%2Fwallpaper%2F2011%2F10%2F06%2Fsl_600_2011100611113498856101.jpg", "多种type1"));
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863351961&di=0d3c0ccb6ff5db98f03567c9b19bf1d4&imgtype=0&src=http%3A%2F%2Fimg.ewebweb.com%2Fuploads%2F20191203%2F18%2F1575369915-sjERXNLVWb.jpg", "多种type2"));
        datas.add(new SwipeCardBean(i++, "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=2433540234,3071973675&fm=11&gp=0.jpg", "多种type3"));
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863351961&di=cd2018b32c110b9d5651a0c4a69ea58b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201809%2F09%2F20180909131355_nqqpc.thumb.700_0.jpeg", "多种type4"));
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863351959&di=4ae2d1a2cab40c376902115d05b6b37b&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201507%2F05%2F20150705192758_tWSYC.jpeg", "多种type5"));
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863351957&di=a19f7110147ceec2f777d7410418ea6c&imgtype=0&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201502%2F20%2F20150220115736_RcPTy.thumb.700_0.jpeg", "多种type6"));
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863351957&di=f31d5cd4ada8f2efa31b3912bc6d7ef8&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201607%2F12%2F20160712102905_MGkhX.jpeg", "多种type7"));
        datas.add(new SwipeCardBean(i++, "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1584863487120&di=82dc480de0e9024ff6ae35c989ced749&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201805%2F14%2F20180514193743_ityfh.jpg", "多种type8"));
        return datas;
    }
}
