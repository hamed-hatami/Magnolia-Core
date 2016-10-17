package ir.magnolia.core.model.objectValue;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookProperty {

    @JsonProperty(value = "FarsiLastName")
    private int farsiLastName;
    @JsonProperty(value = "AgeType")
    private String ageType;
    @JsonProperty(value = "EnglishName")
    private String englishName;
    @JsonProperty(value = "EnglishLastName")
    private String englishLastName;
    @JsonProperty(value = "SexType")
    private String sexType;
    @JsonProperty(value = "NationalCode")
    private String nationalCode;
    @JsonProperty(value = "BirthDay")
    private String birthDay;
    @JsonProperty(value = "PassNo")
    private String passNo;
    @JsonProperty(value = "Passport")
    private String passport;
    @JsonProperty(value = "FarsiName")
    private String farsiName;
    @JsonProperty(value = "AgeType")
    private String AgeType2;
    @JsonProperty(value = "Price")
    private String price;

    public BookProperty(int farsiLastName, String ageType, String englishName, String englishLastName, String sexType, String nationalCode, String birthDay, String passNo, String passport, String farsiName, String ageType2, String price) {
        this.farsiLastName = farsiLastName;
        this.ageType = ageType;
        this.englishName = englishName;
        this.englishLastName = englishLastName;
        this.sexType = sexType;
        this.nationalCode = nationalCode;
        this.birthDay = birthDay;
        this.passNo = passNo;
        this.passport = passport;
        this.farsiName = farsiName;
        AgeType2 = ageType2;
        this.price = price;
    }

    public int getFarsiLastName() {
        return farsiLastName;
    }

    public void setFarsiLastName(int farsiLastName) {
        this.farsiLastName = farsiLastName;
    }

    public String getAgeType() {
        return ageType;
    }

    public void setAgeType(String ageType) {
        this.ageType = ageType;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishLastName() {
        return englishLastName;
    }

    public void setEnglishLastName(String englishLastName) {
        this.englishLastName = englishLastName;
    }

    public String getSexType() {
        return sexType;
    }

    public void setSexType(String sexType) {
        this.sexType = sexType;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPassNo() {
        return passNo;
    }

    public void setPassNo(String passNo) {
        this.passNo = passNo;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getFarsiName() {
        return farsiName;
    }

    public void setFarsiName(String farsiName) {
        this.farsiName = farsiName;
    }

    public String getAgeType2() {
        return AgeType2;
    }

    public void setAgeType2(String ageType2) {
        AgeType2 = ageType2;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
