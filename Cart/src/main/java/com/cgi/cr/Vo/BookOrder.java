package com.cgi.cr.Vo;




public class BookOrder {

	

	private String oid;

	private String bid;
	
	private String cid;
	
	private String custid;
	
	private String pmt;
	
	private int total;
	
	private int qty;

	private String st;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getPmt() {
		return pmt;
	}
	public void setPmt(String pmt) {
		this.pmt = pmt;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public BookOrder(String oid, String bid, String cid, String custid, String pmt, int total, int qty, String st) {
		super();
		this.oid = oid;
		this.bid = bid;
		this.cid = cid;
		this.custid = custid;
		this.pmt = pmt;
		this.total = total;
		this.qty = qty;
		this.st = st;
	}
	public BookOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", bid=" + bid + ", cid=" + cid + ", custid=" + custid + ", pmt=" + pmt
				+ ", total=" + total + ", qty=" + qty + ", st=" + st + "]";
	}
	
	
	
	
	
}
