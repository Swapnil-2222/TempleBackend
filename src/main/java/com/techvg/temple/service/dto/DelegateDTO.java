package com.techvg.temple.service.dto;

import com.techvg.temple.domain.enumeration.Gender;
import jakarta.persistence.Lob;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A DTO for the {@link com.techvg.temple.domain.Delegate} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DelegateDTO implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private String nationality;

    private String countryOfResidence;

    private LocalDate dateOfBirth;

    private String citizenship;

    private Long mobileNo;

    private String emailId;

    private String emergencyContactName;

    private String emergencyContactRelationship;

    private Long emergencyContactNo;

    private String countryOfBirth;

    private String cityOfResidence;

    private String stateOfResidence;

    private String districtOfResidence;

    private Instant departureDate;

    private String departurePlace;

    private Instant arrivalDate;

    private String arrivalPlace;

    private String status;

    private Instant lastModified;

    private String lastModifiedBy;

    private Boolean isTaxReceipt;

    @Lob
    private byte[] profilePhoto;

    private String profilePhotoContentType;
    private String profilePhotoContentType;

    @Lob
    private byte[] passportImage;

    private String passportImageContentType;
    private String passportImageContentType;

    private String conferenceName;

    private String freeField1;

    private String freeField2;

    private String freeField3;

    private String freeField4;

    private Long freeField5;

    private Long freeField6;

    private Instant freeField7;

    private Instant freeField8;

    private Boolean freeField9;

    private Boolean freeField10;

    @Lob
    private byte[] freeField11;

    private String freeField11ContentType;

    @Lob
    private byte[] freeField12;

    private String freeField12ContentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    public void setEmergencyContactRelationship(String emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    public Long getEmergencyContactNo() {
        return emergencyContactNo;
    }

    public void setEmergencyContactNo(Long emergencyContactNo) {
        this.emergencyContactNo = emergencyContactNo;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public void setCountryOfBirth(String countryOfBirth) {
        this.countryOfBirth = countryOfBirth;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }

    public String getStateOfResidence() {
        return stateOfResidence;
    }

    public void setStateOfResidence(String stateOfResidence) {
        this.stateOfResidence = stateOfResidence;
    }

    public String getDistrictOfResidence() {
        return districtOfResidence;
    }

    public void setDistrictOfResidence(String districtOfResidence) {
        this.districtOfResidence = districtOfResidence;
    }

    public Instant getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Instant departureDate) {
        this.departureDate = departureDate;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public Instant getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Instant arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Boolean getIsTaxReceipt() {
        return isTaxReceipt;
    }

    public void setIsTaxReceipt(Boolean isTaxReceipt) {
        this.isTaxReceipt = isTaxReceipt;
    }

    public byte[] getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(byte[] profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public String getProfilePhotoContentType() {
        return profilePhotoContentType;
    }

    public void setProfilePhotoContentType(String profilePhotoContentType) {
        this.profilePhotoContentType = profilePhotoContentType;
    }

    public String getProfilePhotoContentType() {
        return profilePhotoContentType;
    }

    public void setProfilePhotoContentType(String profilePhotoContentType) {
        this.profilePhotoContentType = profilePhotoContentType;
    }

    public byte[] getPassportImage() {
        return passportImage;
    }

    public void setPassportImage(byte[] passportImage) {
        this.passportImage = passportImage;
    }

    public String getPassportImageContentType() {
        return passportImageContentType;
    }

    public void setPassportImageContentType(String passportImageContentType) {
        this.passportImageContentType = passportImageContentType;
    }

    public String getPassportImageContentType() {
        return passportImageContentType;
    }

    public void setPassportImageContentType(String passportImageContentType) {
        this.passportImageContentType = passportImageContentType;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public String getFreeField1() {
        return freeField1;
    }

    public void setFreeField1(String freeField1) {
        this.freeField1 = freeField1;
    }

    public String getFreeField2() {
        return freeField2;
    }

    public void setFreeField2(String freeField2) {
        this.freeField2 = freeField2;
    }

    public String getFreeField3() {
        return freeField3;
    }

    public void setFreeField3(String freeField3) {
        this.freeField3 = freeField3;
    }

    public String getFreeField4() {
        return freeField4;
    }

    public void setFreeField4(String freeField4) {
        this.freeField4 = freeField4;
    }

    public Long getFreeField5() {
        return freeField5;
    }

    public void setFreeField5(Long freeField5) {
        this.freeField5 = freeField5;
    }

    public Long getFreeField6() {
        return freeField6;
    }

    public void setFreeField6(Long freeField6) {
        this.freeField6 = freeField6;
    }

    public Instant getFreeField7() {
        return freeField7;
    }

    public void setFreeField7(Instant freeField7) {
        this.freeField7 = freeField7;
    }

    public Instant getFreeField8() {
        return freeField8;
    }

    public void setFreeField8(Instant freeField8) {
        this.freeField8 = freeField8;
    }

    public Boolean getFreeField9() {
        return freeField9;
    }

    public void setFreeField9(Boolean freeField9) {
        this.freeField9 = freeField9;
    }

    public Boolean getFreeField10() {
        return freeField10;
    }

    public void setFreeField10(Boolean freeField10) {
        this.freeField10 = freeField10;
    }

    public byte[] getFreeField11() {
        return freeField11;
    }

    public void setFreeField11(byte[] freeField11) {
        this.freeField11 = freeField11;
    }

    public String getFreeField11ContentType() {
        return freeField11ContentType;
    }

    public void setFreeField11ContentType(String freeField11ContentType) {
        this.freeField11ContentType = freeField11ContentType;
    }

    public byte[] getFreeField12() {
        return freeField12;
    }

    public void setFreeField12(byte[] freeField12) {
        this.freeField12 = freeField12;
    }

    public String getFreeField12ContentType() {
        return freeField12ContentType;
    }

    public void setFreeField12ContentType(String freeField12ContentType) {
        this.freeField12ContentType = freeField12ContentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelegateDTO)) {
            return false;
        }

        DelegateDTO delegateDTO = (DelegateDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, delegateDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DelegateDTO{" +
            "id=" + getId() +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", gender='" + getGender() + "'" +
            ", nationality='" + getNationality() + "'" +
            ", countryOfResidence='" + getCountryOfResidence() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", citizenship='" + getCitizenship() + "'" +
            ", mobileNo=" + getMobileNo() +
            ", emailId='" + getEmailId() + "'" +
            ", emergencyContactName='" + getEmergencyContactName() + "'" +
            ", emergencyContactRelationship='" + getEmergencyContactRelationship() + "'" +
            ", emergencyContactNo=" + getEmergencyContactNo() +
            ", countryOfBirth='" + getCountryOfBirth() + "'" +
            ", cityOfResidence='" + getCityOfResidence() + "'" +
            ", stateOfResidence='" + getStateOfResidence() + "'" +
            ", districtOfResidence='" + getDistrictOfResidence() + "'" +
            ", departureDate='" + getDepartureDate() + "'" +
            ", departurePlace='" + getDeparturePlace() + "'" +
            ", arrivalDate='" + getArrivalDate() + "'" +
            ", arrivalPlace='" + getArrivalPlace() + "'" +
            ", status='" + getStatus() + "'" +
            ", lastModified='" + getLastModified() + "'" +
            ", lastModifiedBy='" + getLastModifiedBy() + "'" +
            ", isTaxReceipt='" + getIsTaxReceipt() + "'" +
            ", profilePhoto='" + getProfilePhoto() + "'" +
            ", profilePhotoContentType='" + getProfilePhotoContentType() + "'" +
            ", passportImage='" + getPassportImage() + "'" +
            ", passportImageContentType='" + getPassportImageContentType() + "'" +
            ", conferenceName='" + getConferenceName() + "'" +
            ", freeField1='" + getFreeField1() + "'" +
            ", freeField2='" + getFreeField2() + "'" +
            ", freeField3='" + getFreeField3() + "'" +
            ", freeField4='" + getFreeField4() + "'" +
            ", freeField5=" + getFreeField5() +
            ", freeField6=" + getFreeField6() +
            ", freeField7='" + getFreeField7() + "'" +
            ", freeField8='" + getFreeField8() + "'" +
            ", freeField9='" + getFreeField9() + "'" +
            ", freeField10='" + getFreeField10() + "'" +
            ", freeField11='" + getFreeField11() + "'" +
            ", freeField12='" + getFreeField12() + "'" +
            "}";
    }
}
