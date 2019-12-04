package com.zhiyou.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String accounts;
	private Integer phone;
	private String password;
	private String nickname;
	private String birthday;
	private String address;
	private String imgurl;
	private Timestamp createtime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAccounts() {
		return accounts;
	}
	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public User(Integer id, String accounts, Integer phone, String password, String nickname, String birthday,
			String address, String imgurl, Timestamp createtime) {
		super();
		this.id = id;
		this.accounts = accounts;
		this.phone = phone;
		this.password = password;
		this.nickname = nickname;
		this.birthday = birthday;
		this.address = address;
		this.imgurl = imgurl;
		this.createtime = createtime;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", accounts=" + accounts + ", phone=" + phone + ", password=" + password
				+ ", nickname=" + nickname + ", birthday=" + birthday + ", address=" + address + ", imgurl=" + imgurl
				+ ", createtime=" + createtime + "]";
	}
	
}
