package sogongdo.authorityManagement.entity;

public class Authority
{
    private String authorityAttribute;
    private String managerId;
    private String employeeId;

    public String getAuthorityAttribute()
    {
        return authorityAttribute;
    }

    public String getManagerId()
    {
        return managerId;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setAuthorityAttribute(String authorityAttribute)
    {
        this.authorityAttribute = authorityAttribute;
    }

    public void setManagerId(String managerId)
    {
        this.managerId = managerId;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }
}
