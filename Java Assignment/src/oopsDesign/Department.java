package oopsDesign;

import oopsDesign.Lab;
import oopsDesign.Library;
import oopsDesign.MusicRoom;

public class Department {
	
	String deptName;
	Library deptLib;
	Lab deptLab;
	MusicRoom deptMusicRoom;

	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	public Department(String dName, Library dLib, MusicRoom dMusicRoom) {
		this.deptName = dName;
		this.deptLib = dLib;
		this.deptMusicRoom = dMusicRoom;
	}
	
	public Department(String dName, Library dLib, Lab dLab) {
		this.deptName = dName;
		this.deptLib = dLib;
		this.deptLab = dLab;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Library getDeptLib() {
		return deptLib;
	}

	public void setDeptLib(Library deptLib) {
		this.deptLib = deptLib;
	}

	public Lab getDeptLab() {
		return deptLab;
	}

	public void setDeptLab(Lab deptLab) {
		this.deptLab = deptLab;
	}

	public MusicRoom getDeptMusicRoom() {
		return deptMusicRoom;
	}

	public void setDeptMusicRoom(MusicRoom deptMusicRoom) {
		this.deptMusicRoom = deptMusicRoom;
	}
}
