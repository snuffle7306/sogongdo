package sogongdo.facilityManagement;

public class Facility 
{   
    private String facilityName;
    private String facilityCode;
    private String workPlace;
    private String operatingTime;
    private String operatingDay;

    public Facility(){}

    public void setFacilityNmae(String facilityName){this.facilityName = facilityName;}
    public void setFacilityCode(String facilityCode){this.facilityCode =facilityCode;}
    public void setWorkPlace(String workPlace){this.workPlace = workPlace;}
    public void setOperatingTime(String operatingTime){this.operatingTime = operatingTime;}
    public void setOperatingDay(String operatingDay){this.operatingDay = operatingDay;}

    public String getFacilityName()
    {
        return facilityName;
    }
    public String getFacilityCode()
    {
        return facilityCode;
    }
    public String getWorkPlace()
    {
        return workPlace;
    }
    public String getOperatingTime()
    {
        return operatingTime;
    }
    public Strubg getOperatingDay()
    {
        return operatingDay;
    }
    
}