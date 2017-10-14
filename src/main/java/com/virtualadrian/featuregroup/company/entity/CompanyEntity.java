package com.virtualadrian.featuregroup.company.entity;

import com.virtualadrian.base.BaseEntity;

import javax.persistence.*;

@Entity
@Table(name="company")
public class CompanyEntity extends BaseEntity {

  @Id
  @Column(name="id")
  private long id;

  @Column(name="company_name")
  private String companyName;

  @Column(name="company_hq_lat")
  private String companyHqLat;

  @Column(name="company_hq_lng")
  private String companyHqLng;

  @Column(name="company_hq_addr")
  private String companyHqAddr;


  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getCompanyHqLat() {
    return this.companyHqLat;
  }

  public void setCompanyHqLat(String companyHqLat) {
    this.companyHqLat = companyHqLat;
  }

  public String getCompanyHqLng() {
    return this.companyHqLng;
  }

  public void setCompanyHqLng(String companyHqLng) {
    this.companyHqLng = companyHqLng;
  }

  public String getCompanyHqAddr() {
    return this.companyHqAddr;
  }

  public void setCompanyHqAddr(String companyHqAddr) {
    this.companyHqAddr = companyHqAddr;
  }
}
