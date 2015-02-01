package com.epitech.casoni_f.epiandroid;

import java.util.List;

/**
 * Created by matthieu on 01/02/2015.
 */
public class Board {
    private List activites;
    private List modules;
    private List notes;
    private List projets;
    private List stages;
    private List susies;
    private List tickets;

    public List getActivites(){
        return this.activites;
    }
    public void setActivites(List activites){
        this.activites = activites;
    }
    public List getModules(){
        return this.modules;
    }
    public void setModules(List modules){
        this.modules = modules;
    }
    public List getNotes(){
        return this.notes;
    }
    public void setNotes(List notes){
        this.notes = notes;
    }
    public List getProjets(){
        return this.projets;
    }
    public void setProjets(List projets){
        this.projets = projets;
    }
    public List getStages(){
        return this.stages;
    }
    public void setStages(List stages){
        this.stages = stages;
    }
    public List getSusies(){
        return this.susies;
    }
    public void setSusies(List susies){
        this.susies = susies;
    }
    public List getTickets(){
        return this.tickets;
    }
    public void setTickets(List tickets){
        this.tickets = tickets;
    }
}
