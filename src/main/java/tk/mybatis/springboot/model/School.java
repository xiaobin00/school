package tk.mybatis.springboot.model;

import java.util.Date;

public class School extends BaseEntity {
	
	private String schoolName;
	
	private String schoolAddress;
	
	private String schoolPic;
	
	private int schoolType;
	
	private int status;
	
	private Date createTime;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolPic() {
		return schoolPic;
	}

	public void setSchoolPic(String schoolPic) {
		this.schoolPic = schoolPic;
	}

	public int getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(int schoolType) {
		this.schoolType = schoolType;
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
