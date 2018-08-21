package fs.dao;

import java.sql.Date;

public class MSTCUSTOMER implements Comparable<MSTCUSTOMER> {

	String s_customerID;
	String s_customerName;
	String s_sex;
	Date s_birthday;
	String s_address;
	String s_email;
	Date d_updateYMD;
	Date d_insertYMD;
	Date d_deleteYMD;
	
	public MSTCUSTOMER() {
	}


	public MSTCUSTOMER(String s_customerID, String s_customerName, String s_sex, Date s_birthday, String s_address,
			String s_email, Date d_updateYMD, Date d_insertYMD, Date d_deleteYMD) {
		this.s_customerID = s_customerID;
		this.s_customerName = s_customerName;
		this.s_sex = s_sex;
		this.s_birthday = s_birthday;
		this.s_address = s_address;
		this.s_email = s_email;
		this.d_updateYMD = d_updateYMD;
		this.d_insertYMD = d_insertYMD;
		this.d_deleteYMD = d_deleteYMD;
	}


	public String getS_customerID() {
		return s_customerID;
	}

	public void setS_customerID(String s_customerID) {
		this.s_customerID = s_customerID;
	}

	public String getS_customerName() {
		return s_customerName;
	}

	public void setS_customerName(String s_customerName) {
		this.s_customerName = s_customerName;
	}

	public String getS_sex() {
		return s_sex;
	}

	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}

	public Date getS_birthday() {
		return s_birthday;
	}

	public void setS_birthday(Date s_birthday) {
		this.s_birthday = s_birthday;
	}

	public String getS_address() {
		return s_address;
	}

	public void setS_address(String s_address) {
		this.s_address = s_address;
	}

	public String getS_email() {
		return s_email;
	}

	public void setS_email(String s_email) {
		this.s_email = s_email;
	}

	public Date getD_updateYMD() {
		return d_updateYMD;
	}

	public void setD_updateYMD(Date d_updateYMD) {
		this.d_updateYMD = d_updateYMD;
	}

	public Date getD_insertYMD() {
		return d_insertYMD;
	}

	public void setD_insertYMD(Date d_insertYMD) {
		this.d_insertYMD = d_insertYMD;
	}

	public Date getD_deleteYMD() {
		return d_deleteYMD;
	}

	public void setD_deleteYMD(Date d_deleteYMD) {
		this.d_deleteYMD = d_deleteYMD;
	}

	@Override
	public String toString() {
		return "MSTCUSTOMER [s_customerID=" + s_customerID + ", s_customerName=" + s_customerName + ", s_sex=" + s_sex
				+ ", s_birthday=" + s_birthday + ", s_address=" + s_address + ", s_email=" + s_email + ", d_updateYMD="
				+ d_updateYMD + ", d_insertYMD=" + d_insertYMD + ", d_deleteYMD=" + d_deleteYMD + "]";
	}

	@Override
	public int compareTo(MSTCUSTOMER o) {
		return this.s_customerID.compareTo(o.s_customerID);
	}


	
	
}
