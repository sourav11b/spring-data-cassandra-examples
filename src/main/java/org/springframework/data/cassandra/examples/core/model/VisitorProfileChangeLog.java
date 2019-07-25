package org.springframework.data.cassandra.examples.core.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "visitor_profile_change_log")

public class VisitorProfileChangeLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	  private VisitorProfileChangeLogPK key;

	  @Column("optum_id")
	  private String optum_id;	  
	  @Column("email")
	  private String email;
	  @Column("first_name")
	  private String first_name;
	  @Column("last_name")
	  private String last_name;
	  @Column("nick_name")
	  private String nick_name;
	  @Column("site_id")
	  private String site_id;
	  @Column("created_by")
	  private String created_by;
	  @Column("last_modified_by")
	  private String last_modified_by;
	  @Column("plans_data")
	  private String plans_data;
	  @Column("providers_data")
	  private String providers_data;
	  @Column("drugs_data")
	  private String drugs_data;
	  @Column("last_modified_date")
	  private Date last_modified_date;
	public VisitorProfileChangeLogPK getKey() {
		return key;
	}
	public void setKey(VisitorProfileChangeLogPK key) {
		this.key = key;
	}
	public String getOptum_id() {
		return optum_id;
	}
	public void setOptum_id(String optum_id) {
		this.optum_id = optum_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getNick_name() {
		return nick_name;
	}
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}
	public String getSite_id() {
		return site_id;
	}
	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getLast_modified_by() {
		return last_modified_by;
	}
	public void setLast_modified_by(String last_modified_by) {
		this.last_modified_by = last_modified_by;
	}
	public String getPlans_data() {
		return plans_data;
	}
	public void setPlans_data(String plans_data) {
		this.plans_data = plans_data;
	}
	public String getProviders_data() {
		return providers_data;
	}
	public void setProviders_data(String providers_data) {
		this.providers_data = providers_data;
	}
	public String getDrugs_data() {
		return drugs_data;
	}
	public void setDrugs_data(String drugs_data) {
		this.drugs_data = drugs_data;
	}
	public Date getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(Date last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	@Override
	public String toString() {
		return "VisitorProfileChangeLog [key=" + key + ", optum_id=" + optum_id + ", email=" + email + ", first_name="
				+ first_name + ", last_name=" + last_name + ", nick_name=" + nick_name + ", site_id=" + site_id
				+ ", created_by=" + created_by + ", last_modified_by=" + last_modified_by + ", plans_data=" + plans_data
				+ ", providers_data=" + providers_data + ", drugs_data=" + drugs_data + ", last_modified_date="
				+ last_modified_date + "]";
	}
	  
	  
	 
	
}
