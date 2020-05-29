package facilityCostManagement.entity;

public class FacilityCost {
	private String facilityCode;
	private String workplaceCode;
	private String facilityName;
	private String operatingTime;
	private String operatingDay;
	
	public String getFacilityCode() {
		return facilityCode;
	}
	
	public void setFacilityCode(String facilityCode) {
		this.facilityCode = facilityCode;
	}
	
	public String getWorkplaceCode() {
		return workplaceCode;
	}
	
	public void setWorkplaceCode(String workplaceCode) {
		this.workplaceCode = workplaceCode;
	}
	
	public String getFacilityName() {
		return facilityName;
	}
	
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}
	
	public String getOperatingTime() {
		return operatingTime;
	}
	
	public void setOperatingTime(String operatingTime) {
		this.operatingTime = operatingTime;
	}
	
	public String getOperatingDay() {
		return operatingDay;
	}
	
	public void setOperatingDay(String operatingDay) {
		this.operatingDay = operatingDay;
	}
}
