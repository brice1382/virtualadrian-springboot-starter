package com.virtualadrian.featuregroup.company.model;

public class CompanyModel {

  private long id;

  private String companyName;

  private String companyHqLat;

  private String companyHqLng;

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
