package sogondo.workplaceManagement.entity;

public class WorkPlace {
	private String workPlaceName;
	private String managerId;
	private String workPlaceCode;
	private String workPlaceLocation;
	
	public String getWorkPlaceName() {
		return workPlaceName;
	}
	
	public String getManagerId() {
		return managerId;
	}
	
	public String getWorkPlaceCode() {
		return workPlaceCode;
	}
	
	public String getWorkPlaceLocation() {
		return workPlaceLocation;
	}
	
	public void setWorkPlaceName(String workPlaceName) {
		this.workPlaceName = workPlaceName;
	}
	
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	
	public void setWorkPlaceCode(String workPlaceCode) {
		this.workPlaceCode = workPlaceCode;
	}
	
	public void setWorkPlaceLocation(String workPlaceLocation) {
		this.workPlaceLocation = workPlaceLocation;
	}
}
