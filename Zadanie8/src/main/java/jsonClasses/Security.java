package jsonClasses;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Security {

    @SerializedName("Id")
    private String id;
    @SerializedName("Currency")
    private String currency;
    @SerializedName("Code")
    private String code;
    @SerializedName("Expiration date")
    private Date expirationDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
