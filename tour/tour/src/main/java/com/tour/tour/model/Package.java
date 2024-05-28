package com.tour.tour.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Package {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String pname,duration,pamt,pinfo;
@ManyToMany(fetch = FetchType.EAGER,cascade =CascadeType.ALL)
@JoinTable(name="package_img",joinColumns = {
		@JoinColumn(name="package_id")
},
inverseJoinColumns = {
		@JoinColumn(name="image_id")
}
)
private Set<ImageModel> packageimages;
public Package() {
	super();
	// TODO Auto-generated constructor stub
}
public Package(String pname, String duration, String pamt, String pinfo, Set<ImageModel> packageimages) {
	super();
	this.pname = pname;
	this.duration = duration;
	this.pamt = pamt;
	this.pinfo = pinfo;
	this.packageimages = packageimages;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public String getPamt() {
	return pamt;
}
public void setPamt(String pamt) {
	this.pamt = pamt;
}
public String getPinfo() {
	return pinfo;
}
public void setPinfo(String pinfo) {
	this.pinfo = pinfo;
}
public Set<ImageModel> getPackageimages() {
	return packageimages;
}
public void setPackageimages(Set<ImageModel> packageimages) {
	this.packageimages = packageimages;
}


}
