package citi.entity;
// Generated 2018-5-28 2:23:42 by Hibernate Tools 5.0.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Systeminfo generated by hbm2java
 */
@Entity
@Table(name = "SYSTEMINFO", schema = "PUBLIC", catalog = "SSDB")
public class Systeminfo implements java.io.Serializable {

	private int systemid;
	private String note;
	private Date startdate;
	private Date deadline;
	private Date update;
	private String operator;

	public Systeminfo() {
	}

	public Systeminfo(int systemid) {
		this.systemid = systemid;
	}

	public Systeminfo(int systemid, String note, Date startdate, Date deadline, Date update, String operator) {
		this.systemid = systemid;
		this.note = note;
		this.startdate = startdate;
		this.deadline = deadline;
		this.update = update;
		this.operator = operator;
	}

	@Id

	@Column(name = "SYSTEMID", unique = true, nullable = false)
	public int getSystemid() {
		return this.systemid;
	}

	public void setSystemid(int systemid) {
		this.systemid = systemid;
	}

	@Column(name = "NOTE")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "STARTDATE", length = 23)
	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DEADLINE", length = 23)
	public Date getDeadline() {
		return this.deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE", length = 23)
	public Date getUpdate() {
		return this.update;
	}

	public void setUpdate(Date update) {
		this.update = update;
	}

	@Column(name = "OPERATOR", length = 25)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "Systeminfo [systemid=" + systemid + ", note=" + note + ", startdate=" + startdate + ", deadline="
				+ deadline + ", update=" + update + ", operator=" + operator + "]";
	}
	
	

}
