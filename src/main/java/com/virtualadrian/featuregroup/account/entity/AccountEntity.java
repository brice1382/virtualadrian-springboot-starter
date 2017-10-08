package com.virtualadrian.featuregroup.account.entity;

import com.virtualadrian.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="template")
public class AccountEntity extends BaseEntity {

    @Id
    @Column(name="id")
    private long id;

    @Column(name="activeDT")
    private Date activeDT;

    @Column(name="content")
    private String content;

    @Column(name="template_name")
    private String template_name;


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
