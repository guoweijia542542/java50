package com.book.vo;

public class Bookss {
	
	private int	bidd;
	 private String bname;
	 private String  bdescc;
	 public String getBdescc() {
		return bdescc;
	}
	public void setBdesc(String bdescc) {
		this.bdescc = bdescc;
	}
	
	public int getBidd() {
		return bidd;
	}
	public void setBidd(int bidd) {
		this.bidd = bidd;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	
	
	@Override
	public String toString() {
		return "bookss [bid=" + bidd + ", bname=" + bname + ", bdesc=" + bdescc + "]";
	}
}
