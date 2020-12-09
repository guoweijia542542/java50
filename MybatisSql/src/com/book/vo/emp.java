package com.book.vo;

public class emp {

	
	private int	mepno;
	private String	ename;
	private String	job;
	private String	mgr;
	private int	sal;
	private int	deptno;
	
	private dept pt;
	
	@Override
	public String toString() {
		return "emp [mepno=" + mepno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", sal=" + sal
				+ ", deptno=" + deptno + "]";
	}
	public int getMepno() {
		return mepno;
	}
	public void setMepno(int mepno) {
		this.mepno = mepno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
}
