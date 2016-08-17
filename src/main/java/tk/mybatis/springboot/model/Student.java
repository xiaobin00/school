package tk.mybatis.springboot.model;

import java.util.Date;

public class Student {
	
	private String studentNo;
	
	private String phone;
	
	private String password;
	
	private String salt;
	
	private String RePassword;
	
	private int status;
	
	private Date createTime;

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getRePassword() {
		return RePassword;
	}

	public void setRePassword(String rePassword) {
		RePassword = rePassword;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
