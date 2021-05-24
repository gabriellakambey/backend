package com.digimaster.backendTraining;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_tbl")
public class PersonModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private int userId;
	@Column(name = "nama_user")
	private String userName;
	@Column(name = "email_user")
	private String userEmail;
	@Column(name = "password_user")
	private String userPassword;
	@Column(name = "nama_pasangan_user")
	private String userCouple; 
	@Column(name = "tgl_pernikahan")
	private String tglPernikahan;
	@Column(name = "nomorhp_user")
	private String nomorHp;
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserCouple() {
		return userCouple;
	}
	public void setUserCouple(String userCouple) {
		this.userCouple = userCouple;
	}
	public String getTglPernikahan() {
		return tglPernikahan;
	}
	public void setTglPernikahan(String tglPernikahan) {
		this.tglPernikahan = tglPernikahan;
	}
	public String getNomorHp() {
		return nomorHp;
	}
	public void setNomorHp(String nomorHp) {
		this.nomorHp = nomorHp;
	}
	
	
	
}
