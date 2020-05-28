package sogongdo.memberManagememt.entity;

public class Member 
{
	private String memberid;
	private String memberpw;
	private String membername;
	private String phonenum;
	private String email;
	private String address;
	
	public String getId()
	{
		return memberid;		
	}
	public String getPw()
	{
		return memberpw;
	}
	public String getName()
	{
		return membername;
	}
	public String getPhonenum()
	{
		return phonenum;	
	}
	public String getEmail()
	{
		return email;		
	}
	public String getAddress()
	{
		return address;		
	}
	
	public void setId(String memberid)
	{
		this.memberid=memberid;		
	}
	public void setpw(String memberpw)
	{
		this.memberpw=memberpw;
	}
	public void setName(String membername)
	{
		this.membername=membername;
	}
	public void setPhonenum(String phonenum)
	{ this.phonenum=phonenum;
	}
	public void setEmail(String email)
	{
		this.email=email;		
	}
	public void setAddress(String address) { this.address=address; }
}
