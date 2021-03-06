package com.wordnik.petstore.model;

import java.util.Date;
public class Order {
  /* Unique identifier for the order */
  private Long id = null;
  /* ID of pet being ordered */
  private Long petId = null;
  /* Number of pets ordered */
  private Integer quantity = null;
  /* Status of the order */
  private String status = null;
  //public enum statusEnum { placed,  approved,  delivered, }; 
  /* Date shipped, only if it has been */
  private Date shipDate = null;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public Long getPetId() {
    return petId;
  }
  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public Date getShipDate() {
    return shipDate;
  }
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  petId: ").append(petId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  shipDate: ").append(shipDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

