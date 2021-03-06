package citi.entity;
// Generated 2018-5-28 2:23:42 by Hibernate Tools 5.0.6.Final


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name="ORDERS"
    ,schema="PUBLIC"
    ,catalog="SSDB"
)
public class Orders  implements java.io.Serializable {


     private String ordersid;
     private Staff staff;
     private Stationery stationery;
     private Integer quantity;
     private Date update;

    public Orders() {
    }

	
    public Orders(String ordersid, Staff staff, Stationery stationery) {
        this.ordersid = ordersid;
        this.staff = staff;
        this.stationery = stationery;
    }
    public Orders(String ordersid, Staff staff, Stationery stationery, Integer quantity, Date update) {
       this.ordersid = ordersid;
       this.staff = staff;
       this.stationery = stationery;
       this.quantity = quantity;
       this.update = update;
    }
   
     @Id 

    
    @Column(name="ORDERSID", unique=true, nullable=false, length=36)
    public String getOrdersid() {
        return this.ordersid;
    }
    
    public void setOrdersid(String ordersid) {
        this.ordersid = ordersid;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SOEID", nullable=false)
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="STATIONERYID", nullable=false)
    public Stationery getStationery() {
        return this.stationery;
    }
    
    public void setStationery(Stationery stationery) {
        this.stationery = stationery;
    }

    
    @Column(name="QUANTITY")
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="UPDATE", length=23)
    public Date getUpdate() {
        return this.update;
    }
    
    public void setUpdate(Date update) {
        this.update = update;
    }




}


