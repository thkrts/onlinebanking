package com.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Document("Registration")
public class Registration implements UserDetails {

	// @Id
	private String username;

	private String title;
	private String firstname;
	private String middlename;
	private String lastname;
	private String fathername;
	private long mobno;
	private String eid;
	private long adhaar;
	private String dob;

	private String ral1;
	private String ral2;
	private String ralandmark;
	private String rastate;
	private String racity;
	private int rapin;

	private String pal1;
	private String pal2;
	private String palandmark;
	private String pastate;
	private String pacity;
	private int papincode;

	private String occtyp;
	private String soi;
	private float gai;

	public Registration(String username, String title, String firstname, String middlename, String lastname,
			String fathername, long mobno, String eid, long adhaar, String dob, String ral1, String ral2,
			String ralandmark, String rastate, String racity, int rapin, String pal1, String pal2, String palandmark,
			String pastate, String pacity, int papincode, String occtyp, String soi, float gai) {
		this.username = username;
		this.title = title;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mobno = mobno;
		this.eid = eid;
		this.adhaar = adhaar;
		this.dob = dob;
		this.ral1 = ral1;
		this.ral2 = ral2;
		this.ralandmark = ralandmark;
		this.rastate = rastate;
		this.racity = racity;
		this.rapin = rapin;
		this.pal1 = pal1;
		this.pal2 = pal2;
		this.palandmark = palandmark;
		this.pastate = pastate;
		this.pacity = pacity;
		this.papincode = papincode;
		this.occtyp = occtyp;
		this.soi = soi;
		this.gai = gai;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAccountno() {
		return this.username;
	}

	public void setAccountno(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return this.middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFathername() {
		return this.fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public long getMobno() {
		return this.mobno;
	}

	public void setMobno(long mobno) {
		this.mobno = mobno;
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public long getAdhaar() {
		return this.adhaar;
	}

	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}

	public String getDob() {
		return this.dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getRal1() {
		return this.ral1;
	}

	public void setRal1(String ral1) {
		this.ral1 = ral1;
	}

	public String getRal2() {
		return this.ral2;
	}

	public void setRal2(String ral2) {
		this.ral2 = ral2;
	}

	public String getRalandmark() {
		return this.ralandmark;
	}

	public void setRalandmark(String ralandmark) {
		this.ralandmark = ralandmark;
	}

	public String getRastate() {
		return this.rastate;
	}

	public void setRastate(String rastate) {
		this.rastate = rastate;
	}

	public String getRacity() {
		return this.racity;
	}

	public void setRacity(String racity) {
		this.racity = racity;
	}

	public int getRapin() {
		return this.rapin;
	}

	public void setRapin(int rapin) {
		this.rapin = rapin;
	}

	public String getPal1() {
		return this.pal1;
	}

	public void setPal1(String pal1) {
		this.pal1 = pal1;
	}

	public String getPal2() {
		return this.pal2;
	}

	public void setPal2(String pal2) {
		this.pal2 = pal2;
	}

	public String getPalandmark() {
		return this.palandmark;
	}

	public void setPalandmark(String palandmark) {
		this.palandmark = palandmark;
	}

	public String getPastate() {
		return this.pastate;
	}

	public void setPastate(String pastate) {
		this.pastate = pastate;
	}

	public String getPacity() {
		return this.pacity;
	}

	public void setPacity(String pacity) {
		this.pacity = pacity;
	}

	public int getPapincode() {
		return this.papincode;
	}

	public void setPapincode(int papincode) {
		this.papincode = papincode;
	}

	public String getOcctyp() {
		return this.occtyp;
	}

	public void setOcctyp(String occtyp) {
		this.occtyp = occtyp;
	}

	public String getSoi() {
		return this.soi;
	}

	public void setSoi(String soi) {
		this.soi = soi;
	}

	public float getGai() {
		return this.gai;
	}

	public void setGai(float gai) {
		this.gai = gai;
	}

	@Override
	public String toString() {
		return "{" +
				" accountno='" + getAccountno() + "'" +
				", firstname='" + getFirstname() + "'" +
				", middlename='" + getMiddlename() + "'" +
				", lastname='" + getLastname() + "'" +
				", fathername='" + getFathername() + "'" +
				", mobno='" + getMobno() + "'" +
				", eid='" + getEid() + "'" +
				", adhaar='" + getAdhaar() + "'" +
				", dob='" + getDob() + "'" +
				", ral1='" + getRal1() + "'" +
				", ral2='" + getRal2() + "'" +
				", ralandmark='" + getRalandmark() + "'" +
				", rastate='" + getRastate() + "'" +
				", racity='" + getRacity() + "'" +
				", rapin='" + getRapin() + "'" +
				", pal1='" + getPal1() + "'" +
				", pal2='" + getPal2() + "'" +
				", palandmark='" + getPalandmark() + "'" +
				", pastate='" + getPastate() + "'" +
				", pacity='" + getPacity() + "'" +
				", papincode='" + getPapincode() + "'" +
				", occtyp='" + getOcctyp() + "'" +
				", soi='" + getSoi() + "'" +
				", gai='" + getGai() + "'" +
				"}";
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
