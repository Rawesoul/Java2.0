
package jsonClasses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("Quantity")
    private Integer quantity;
    @SerializedName("Organizations")
    private List<Organization> organizations = null;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    @Override
    public String toString() {
        return "Data{" +
                "quantity=" + quantity +
                ", organizations=" + organizations +
                '}';
    }
}
