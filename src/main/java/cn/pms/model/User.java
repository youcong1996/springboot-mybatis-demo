package cn.pms.model;

/**
 * 用户类
 */
public class User {
	private Integer Id;
	private String user_No;
	private String user_Name;
	private String password;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getUser_No() {
		return user_No;
	}
	public void setUser_No(String user_No) {
		this.user_No = user_No;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}