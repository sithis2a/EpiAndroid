package com.epitech.casoni_f.epiandroid;

import java.util.List;

/**
 * Created by matthieu on 01/02/2015.
 */
public class Planning {

    private String acti_title;
    private boolean allow_register;
    private boolean allow_token;
    private String allowed_planning_end;
    private String allowed_planning_start;
    private String codeacti;
    private String codeevent;
    private String codeinstance;
    private String codemodule;
    private String dates;
    private String end;
    private String event_registered;
    private boolean in_more_than_one_month;
    private String instance_location;
    private String is_rdv;
    private boolean module_available;
    private boolean module_registered;
    private Number nb_group;
    private String nb_hours;
    private String nb_max_students_projet;
    private Number num_event;
    private boolean past;
    private List<Prof_inst> prof_inst;
    private boolean project;
    private String rdv_group_registered;
    private String rdv_indiv_registered;
    private boolean register_month;
    private boolean register_prof;
    private boolean register_student;
    private String rights;
    private String scolaryear;
    private Number semester;
    private String start;
    private String status_manager;
    private String title;
    private String titlemodule;
    private Number total_students_registered;
    private String type_code;
    private String type_title;

    public String getActi_title(){
        return this.acti_title;
    }
    public void setActi_title(String acti_title){
        this.acti_title = acti_title;
    }
    public boolean getAllow_register(){
        return this.allow_register;
    }
    public void setAllow_register(boolean allow_register){
        this.allow_register = allow_register;
    }
    public boolean getAllow_token(){
        return this.allow_token;
    }
    public void setAllow_token(boolean allow_token){
        this.allow_token = allow_token;
    }
    public String getAllowed_planning_end(){
        return this.allowed_planning_end;
    }
    public void setAllowed_planning_end(String allowed_planning_end){
        this.allowed_planning_end = allowed_planning_end;
    }
    public String getAllowed_planning_start(){
        return this.allowed_planning_start;
    }
    public void setAllowed_planning_start(String allowed_planning_start){
        this.allowed_planning_start = allowed_planning_start;
    }
    public String getCodeacti(){
        return this.codeacti;
    }
    public void setCodeacti(String codeacti){
        this.codeacti = codeacti;
    }
    public String getCodeevent(){
        return this.codeevent;
    }
    public void setCodeevent(String codeevent){
        this.codeevent = codeevent;
    }
    public String getCodeinstance(){
        return this.codeinstance;
    }
    public void setCodeinstance(String codeinstance){
        this.codeinstance = codeinstance;
    }
    public String getCodemodule(){
        return this.codemodule;
    }
    public void setCodemodule(String codemodule){
        this.codemodule = codemodule;
    }
    public String getDates(){
        return this.dates;
    }
    public void setDates(String dates){
        this.dates = dates;
    }
    public String getEnd(){
        return this.end;
    }
    public void setEnd(String end){
        this.end = end;
    }
    public String getEvent_registered(){
        return this.event_registered;
    }
    public void setEvent_registered(String event_registered){
        this.event_registered = event_registered;
    }
    public boolean getIn_more_than_one_month(){
        return this.in_more_than_one_month;
    }
    public void setIn_more_than_one_month(boolean in_more_than_one_month){
        this.in_more_than_one_month = in_more_than_one_month;
    }
    public String getInstance_location(){
        return this.instance_location;
    }
    public void setInstance_location(String instance_location){
        this.instance_location = instance_location;
    }
    public String getIs_rdv(){
        return this.is_rdv;
    }
    public void setIs_rdv(String is_rdv){
        this.is_rdv = is_rdv;
    }
    public boolean getModule_available(){
        return this.module_available;
    }
    public void setModule_available(boolean module_available){
        this.module_available = module_available;
    }
    public boolean getModule_registered(){
        return this.module_registered;
    }
    public void setModule_registered(boolean module_registered){
        this.module_registered = module_registered;
    }
    public Number getNb_group(){
        return this.nb_group;
    }
    public void setNb_group(Number nb_group){
        this.nb_group = nb_group;
    }
    public String getNb_hours(){
        return this.nb_hours;
    }
    public void setNb_hours(String nb_hours){
        this.nb_hours = nb_hours;
    }
    public String getNb_max_students_projet(){
        return this.nb_max_students_projet;
    }
    public void setNb_max_students_projet(String nb_max_students_projet){
        this.nb_max_students_projet = nb_max_students_projet;
    }
    public Number getNum_event(){
        return this.num_event;
    }
    public void setNum_event(Number num_event){
        this.num_event = num_event;
    }
    public boolean getPast(){
        return this.past;
    }
    public void setPast(boolean past){
        this.past = past;
    }
    public List getProf_inst(){
        return this.prof_inst;
    }
    public void setProf_inst(List prof_inst){
        this.prof_inst = prof_inst;
    }
    public boolean getProject(){
        return this.project;
    }
    public void setProject(boolean project){
        this.project = project;
    }
    public String getRdv_group_registered(){
        return this.rdv_group_registered;
    }
    public void setRdv_group_registered(String rdv_group_registered){
        this.rdv_group_registered = rdv_group_registered;
    }
    public String getRdv_indiv_registered(){
        return this.rdv_indiv_registered;
    }
    public void setRdv_indiv_registered(String rdv_indiv_registered){
        this.rdv_indiv_registered = rdv_indiv_registered;
    }
    public boolean getRegister_month(){
        return this.register_month;
    }
    public void setRegister_month(boolean register_month){
        this.register_month = register_month;
    }
    public boolean getRegister_prof(){
        return this.register_prof;
    }
    public void setRegister_prof(boolean register_prof){
        this.register_prof = register_prof;
    }
    public boolean getRegister_student(){
        return this.register_student;
    }
    public void setRegister_student(boolean register_student){
        this.register_student = register_student;
    }
    public String getRights(){
        return this.rights;
    }
    public void setRights(String rights){
        this.rights = rights;
    }
    public String getScolaryear(){
        return this.scolaryear;
    }
    public void setScolaryear(String scolaryear){
        this.scolaryear = scolaryear;
    }
    public Number getSemester(){
        return this.semester;
    }
    public void setSemester(Number semester){
        this.semester = semester;
    }
    public String getStart(){
        return this.start;
    }
    public void setStart(String start){
        this.start = start;
    }
    public String getStatus_manager(){
        return this.status_manager;
    }
    public void setStatus_manager(String status_manager){
        this.status_manager = status_manager;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitlemodule(){
        return this.titlemodule;
    }
    public void setTitlemodule(String titlemodule){
        this.titlemodule = titlemodule;
    }
    public Number getTotal_students_registered(){
        return this.total_students_registered;
    }
    public void setTotal_students_registered(Number total_students_registered){
        this.total_students_registered = total_students_registered;
    }
    public String getType_code(){
        return this.type_code;
    }
    public void setType_code(String type_code){
        this.type_code = type_code;
    }
    public String getType_title(){
        return this.type_title;
    }
    public void setType_title(String type_title){
        this.type_title = type_title;
    }
}
