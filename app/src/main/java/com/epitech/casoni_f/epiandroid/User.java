package com.epitech.casoni_f.epiandroid;

/**
 * Created by matthieu on 01/02/2015.
 */
public class User {

    private String picture;
    private String title;
    private String url;

    public String getPicture(){
        return this.picture;
    }
    public void setPicture(String picture){
        this.picture = picture;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

}
