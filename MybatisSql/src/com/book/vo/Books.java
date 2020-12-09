package com.book.vo;

public class Books {
	 @Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", bauthor=" + bauthor + ", bdesc=" + bdesc + ", bdescc="
				+ bnames + "]";
	}
	private int	bid;
	 private String bname;
	 private String bauthor;	
	 private String bdesc;
	 
	 
	 private Bookss bnames;
	 
	 public Bookss getBnames() {
		return bnames;
	}


	public void setBnames(Bookss bnames) {
		this.bnames = bnames;
	}
	
	

	 public int getBid() {
		return bid;
	}
	 
	 
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public String getBdesc() {
		return bdesc;
	}
	public void setBdesc(String bdesc) {
		this.bdesc = bdesc;
	}
	
}
