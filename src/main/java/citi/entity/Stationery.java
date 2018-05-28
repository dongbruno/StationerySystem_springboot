package citi.entity;
// Generated 2018-5-28 2:23:42 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Stationery generated by hbm2java
 */
@Entity
@Table(name = "STATIONERY", schema = "PUBLIC", catalog = "SSDB")
public class Stationery implements java.io.Serializable {

	private int stationeryid;
	private String kind;
	private String name;
	private String standard;
	private BigDecimal price;
	private Set<Orders> orderses = new HashSet<Orders>(0);

	public Stationery() {
	}

	public Stationery(int stationeryid) {
		this.stationeryid = stationeryid;
	}

	public Stationery(int stationeryid, String kind, String name, String standard, BigDecimal price,
			Set<Orders> orderses) {
		this.stationeryid = stationeryid;
		this.kind = kind;
		this.name = name;
		this.standard = standard;
		this.price = price;
		this.orderses = orderses;
	}

	@Id

	@Column(name = "STATIONERYID", unique = true, nullable = false)
	public int getStationeryid() {
		return this.stationeryid;
	}

	public void setStationeryid(int stationeryid) {
		this.stationeryid = stationeryid;
	}

	@Column(name = "KIND", length = 35)
	public String getKind() {
		return this.kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STANDARD", length = 15)
	public String getStandard() {
		return this.standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	@Column(name = "PRICE", precision = 65535, scale = 32767)
	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "stationery")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}