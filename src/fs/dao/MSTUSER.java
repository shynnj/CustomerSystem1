package fs.dao;

import java.util.Date;

public class MSTUSER implements Comparable<MSTUSER>{

	String s_psn_id;
	public String getS_psn_id() {
		return s_psn_id;
	}

	public void setS_psn_id(String s_psn_id) {
		this.s_psn_id = s_psn_id;
	}

	String s_userid;
	String s_username;
	Date d_updateYMD;
	Date d_insertYMD;
	Date d_deleteYMD;
	
	

	public MSTUSER() {
	}

	public MSTUSER(String s_psn_id, String s_userid, String s_username, Date d_updateYMD, Date d_insertYMD,
			Date d_deleteYMD) {
		this.s_psn_id = s_psn_id;
		this.s_userid = s_userid;
		this.s_username = s_username;
		this.d_updateYMD = d_updateYMD;
		this.d_insertYMD = d_insertYMD;
		this.d_deleteYMD = d_deleteYMD;
	}

	public String getS_userid() {
		return s_userid;
	}

	public void setS_userid(String s_userid) {
		this.s_userid = s_userid;
	}

	public String getS_username() {
		return s_username;
	}

	public void setS_username(String s_username) {
		this.s_username = s_username;
	}

	public Date getS_updateYMD() {
		return d_updateYMD;
	}

	public void setS_updateYMD(Date s_updateYMD) {
		this.d_updateYMD = s_updateYMD;
	}

	public Date getS_insertYMD() {
		return d_insertYMD;
	}

	public void setS_insertYMD(Date s_insertYMD) {
		this.d_insertYMD = s_insertYMD;
	}

	public Date getS_deleteYMD() {
		return d_deleteYMD;
	}

	public void setS_deleteYMD(Date s_deleteYMD) {
		this.d_deleteYMD = s_deleteYMD;
	}




	@Override
	public String toString() {
		return "MSTUSER [s_psn_id=" + s_psn_id + ", s_userid=" + s_userid + ", s_username=" + s_username
				+ ", d_updateYMD=" + d_updateYMD + ", d_insertYMD=" + d_insertYMD + ", d_deleteYMD=" + d_deleteYMD
				+ "]";
	}

	@Override
	public int compareTo(MSTUSER o) {
		return this.s_userid.compareTo(o.s_userid);
	}
	
	
}
