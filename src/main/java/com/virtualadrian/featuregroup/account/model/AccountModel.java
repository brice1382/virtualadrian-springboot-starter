package com.virtualadrian.featuregroup.account.model;

import java.util.Date;

public class AccountModel {


    public long id;

    public Date activeDT;

    public String content;

    public String template_name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getActiveDT() {
        return activeDT;
    }

    public void setActiveDT(Date activeDT) {
        this.activeDT = activeDT;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTemplate_name() {
        return template_name;
    }

    public void setTemplate_name(String template_name) {
        this.template_name = template_name;
    }

}
