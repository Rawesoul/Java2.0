
package jsonClasses;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Organization {

    @SerializedName("Short name")
    private String shortName;
    @SerializedName("Name")
    private String name;
    @SerializedName("Foundation date")
    private Date foundationDate;
    @SerializedName("Address")
    private String address;
    @SerializedName("Phone")
    private String phone;
    @SerializedName("INN")
    private String iNN;
    @SerializedName("OGRN")
    private String oGRN;
    @SerializedName("Securities")
    private List<Security> securities = null;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFoundationDate() {
        return foundationDate;
    }

    public void setFoundationDate(Date foundationDate) {
        this.foundationDate = foundationDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getINN() {
        return iNN;
    }

    public void setINN(String iNN) {
        this.iNN = iNN;
    }

    public String getOGRN() {
        return oGRN;
    }

    public void setOGRN(String oGRN) {
        this.oGRN = oGRN;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

    @Override
    public String toString() {
        String str;
        str = this.name + " " + new SimpleDateFormat("dd.MM.yyyy").format(this.foundationDate);
        return str;
    }
}
