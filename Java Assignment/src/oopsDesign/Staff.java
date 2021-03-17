package oopsDesign;

import java.util.ArrayList;
import java.util.List;

public class Staff {
	String staffFName;
	String staffLName;
	int staffAge;
	
	public Staff() {
	}
	
	public Staff(String staffFName, String staffLName, int staffAge) {
		this.staffFName = staffFName;
		this.staffLName = staffLName;
		this.staffAge = staffAge;
	}

	public String getStaffFName() {
		return staffFName;
	}

	public void setStaffFName(String staffFName) {
		this.staffFName = staffFName;
	}

	public String getStaffLName() {
		return staffLName;
	}

	public void setStaffLName(String staffLName) {
		this.staffLName = staffLName;
	}

	public int getStaffAge() {
		return staffAge;
	}

	public void setStaffAge(int staffAge) {
		this.staffAge = staffAge;
	}

}
