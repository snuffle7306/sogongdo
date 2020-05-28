package sogongdo.productPackageManagement.entity;

public class ProductPackage {
    private int id;
    private int quantity;
    private String facilityCode;
    private String managerId;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public String getManagerId() {
        return managerId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
