package com.spmia.licenseservice.common.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "licenses")
public class License {
  @Id
  @Column(name = "license_id", nullable = false)
  private String id;

  @Column(nullable = false)
  private String organizationId;

  @Column(nullable = false)
  private String productName;

  private String licenseType;

  private String comment;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getLicenseType() {
    return licenseType;
  }

  public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
  }

  private void setComment(String comment) {
    this.comment = comment;
  }

  public String getComment() {
    return comment;
  }

  public License withId(String id) {
    this.setId(id);
    return this;
  }

  public License withOrganizationId(String organizationId) {
    this.setOrganizationId(organizationId);
    return this;
  }

  public License withProductName(String productName) {
    this.setProductName(productName);
    return this;
  }

  public License withLicenseType(String licenseType) {
    this.setLicenseType(licenseType);
    return this;
  }

  public License withComment(String comment) {
    setComment(comment);
    return this;
  }
}
