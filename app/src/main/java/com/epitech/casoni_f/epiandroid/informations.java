package com.epitech.casoni_f.epiandroid;

/**
 * Created by matthieu on 01/02/2015.
 */
public class Informations {
    private Infos infos;
    private String ip;
    private Board board;
    //private Current current;

    public Infos getInfos(){
        return this.infos;
    }
    public void setInfos(Infos infos){
        this.infos = infos;
    }
    public String getIp(){
        return this.ip;
    }
    public void setIp(String ip){
        this.ip = ip;
    }
    public Board getBoard(){
        return this.board;
    }
    public void setBoard(Board board){
        this.board = board;
    }
   /* public Current getCurrent(){
        return this.current;
    }
    public void setCurrent(Current current){
        this.current = current;
    }*/
}
