package com.epitech.casoni_f.epiandroid;

/**
 * Created by matthieu on 01/02/2015.
 */
public class Current {
    private Number achieved;
    private Number active_log;
    private Number credits_min;
    private Number credits_norm;
    private Number credits_obj;
    private Number failed;
    private Number inprogress;
    private String nslog_min;
    private String nslog_norm;
    private String semester_code;
    private String semester_num;

    public Number getAchieved(){
        return this.achieved;
    }
    public void setAchieved(Number achieved){
        this.achieved = achieved;
    }
    public Number getActive_log(){
        return this.active_log;
    }
    public void setActive_log(Number active_log){
        this.active_log = active_log;
    }
    public Number getCredits_min(){
        return this.credits_min;
    }
    public void setCredits_min(Number credits_min){
        this.credits_min = credits_min;
    }
    public Number getCredits_norm(){
        return this.credits_norm;
    }
    public void setCredits_norm(Number credits_norm){
        this.credits_norm = credits_norm;
    }
    public Number getCredits_obj(){
        return this.credits_obj;
    }
    public void setCredits_obj(Number credits_obj){
        this.credits_obj = credits_obj;
    }
    public Number getFailed(){
        return this.failed;
    }
    public void setFailed(Number failed){
        this.failed = failed;
    }
    public Number getInprogress(){
        return this.inprogress;
    }
    public void setInprogress(Number inprogress){
        this.inprogress = inprogress;
    }
    public String getNslog_min(){
        return this.nslog_min;
    }
    public void setNslog_min(String nslog_min){
        this.nslog_min = nslog_min;
    }
    public String getNslog_norm(){
        return this.nslog_norm;
    }
    public void setNslog_norm(String nslog_norm){
        this.nslog_norm = nslog_norm;
    }
    public String getSemester_code(){
        return this.semester_code;
    }
    public void setSemester_code(String semester_code){
        this.semester_code = semester_code;
    }
    public String getSemester_num(){
        return this.semester_num;
    }
    public void setSemester_num(String semester_num){
        this.semester_num = semester_num;
    }
}
