package sogongdo.reservationManagement.entity;

import java.util.Date;

public class Reservation {
	private int reservationNumber;
	private String facilityCode;
	private String memberId;
	private Date reservationDate;
	private int personnel;
	private Date paymentDate;
	private int paymentAmount;
	private int payentStatus;
	private Date checkIn;
	private Date checkOut;
	
	public int getReservationNumber() {
		return reservationNumber;
	}
	
	public String getFacilityCode() {
		return facilityCode;
	}
	
	public String getMemberId() {
		return memberId;
	}
	
	public Date getReservationDate() {
		return reservationDate;
	}
	
	public int getPersonnel() {
		return personnel;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	public int getPaymentAmount() {
		return paymentAmount;
	}
	
	public int getPayentStatus() {
		return payentStatus;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public void setReservationNumber(int reservationNumber) {
		this.reservationNumber = reservationNumber;
	}
	
	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}
	
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	
	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}
	
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	public void setPaymentAmount(int paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	public void setPayentStatus(int payentStatus) {
		this.payentStatus = payentStatus;
	}
	
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
}
