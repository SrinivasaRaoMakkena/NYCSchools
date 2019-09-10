
package com.example.nycschools.models;


import com.google.gson.annotations.SerializedName;

public class School {
    private static  School mSchool=null;

    public static School getInstance(){
        if (mSchool != null){
            mSchool = new School();
        }
        return mSchool;
    }

    @SerializedName("academicopportunities1")
    private String mAcademicopportunities1;
    @SerializedName("academicopportunities2")
    private String mAcademicopportunities2;
    @SerializedName("admissionspriority11")
    private String mAdmissionspriority11;
    @SerializedName("admissionspriority21")
    private String mAdmissionspriority21;
    @SerializedName("admissionspriority31")
    private String mAdmissionspriority31;
    @SerializedName("attendance_rate")
    private String mAttendanceRate;
    @SerializedName("bbl")
    private String mBbl;
    @SerializedName("bin")
    private String mBin;
    @SerializedName("boro")
    private String mBoro;
    @SerializedName("borough")
    private String mBorough;
    @SerializedName("building_code")
    private String mBuildingCode;
    @SerializedName("bus")
    private String mBus;
    @SerializedName("census_tract")
    private String mCensusTract;
    @SerializedName("city")
    private String mCity;
    @SerializedName("code1")
    private String mCode1;
    @SerializedName("community_board")
    private String mCommunityBoard;
    @SerializedName("council_district")
    private String mCouncilDistrict;
    @SerializedName("dbn")
    private String mDbn;
    @SerializedName("directions1")
    private String mDirections1;
    @SerializedName("ell_programs")
    private String mEllPrograms;
    @SerializedName("extracurricular_activities")
    private String mExtracurricularActivities;
    @SerializedName("fax_number")
    private String mFaxNumber;
    @SerializedName("finalgrades")
    private String mFinalgrades;
    @SerializedName("grade9geapplicants1")
    private String mGrade9geapplicants1;
    @SerializedName("grade9geapplicantsperseat1")
    private String mGrade9geapplicantsperseat1;
    @SerializedName("grade9gefilledflag1")
    private String mGrade9gefilledflag1;
    @SerializedName("grade9swdapplicants1")
    private String mGrade9swdapplicants1;
    @SerializedName("grade9swdapplicantsperseat1")
    private String mGrade9swdapplicantsperseat1;
    @SerializedName("grade9swdfilledflag1")
    private String mGrade9swdfilledflag1;
    @SerializedName("grades2018")
    private String mGrades2018;
    @SerializedName("interest1")
    private String mInterest1;
    @SerializedName("latitude")
    private String mLatitude;
    @SerializedName("location")
    private String mLocation;
    @SerializedName("longitude")
    private String mLongitude;
    @SerializedName("method1")
    private String mMethod1;
    @SerializedName("neighborhood")
    private String mNeighborhood;
    @SerializedName("nta")
    private String mNta;
    @SerializedName("offer_rate1")
    private String mOfferRate1;
    @SerializedName("overview_paragraph")
    private String mOverviewParagraph;
    @SerializedName("pct_stu_enough_variety")
    private String mPctStuEnoughVariety;
    @SerializedName("pct_stu_safe")
    private String mPctStuSafe;
    @SerializedName("phone_number")
    private String mPhoneNumber;
    @SerializedName("primary_address_line_1")
    private String mPrimaryAddressLine1;
    @SerializedName("program1")
    private String mProgram1;
    @SerializedName("requirement1_1")
    private String mRequirement11;
    @SerializedName("requirement2_1")
    private String mRequirement21;
    @SerializedName("requirement3_1")
    private String mRequirement31;
    @SerializedName("requirement4_1")
    private String mRequirement41;
    @SerializedName("requirement5_1")
    private String mRequirement51;
    @SerializedName("school_10th_seats")
    private String mSchool10ThSeats;
    @SerializedName("school_accessibility_description")
    private String mSchoolAccessibilityDescription;
    @SerializedName("school_email")
    private String mSchoolEmail;
    @SerializedName("school_name")
    private String mSchoolName;
    @SerializedName("school_sports")
    private String mSchoolSports;
    @SerializedName("seats101")
    private String mSeats101;
    @SerializedName("seats9ge1")
    private String mSeats9ge1;
    @SerializedName("seats9swd1")
    private String mSeats9swd1;
    @SerializedName("state_code")
    private String mStateCode;
    @SerializedName("subway")
    private String mSubway;
    @SerializedName("total_students")
    private String mTotalStudents;
    @SerializedName("website")
    private String mWebsite;
    @SerializedName("zip")
    private String mZip;

    public String getAcademicopportunities1() {
        return mAcademicopportunities1;
    }

    public void setAcademicopportunities1(String academicopportunities1) {
        mAcademicopportunities1 = academicopportunities1;
    }

    public String getAcademicopportunities2() {
        return mAcademicopportunities2;
    }

    public void setAcademicopportunities2(String academicopportunities2) {
        mAcademicopportunities2 = academicopportunities2;
    }

    public String getAdmissionspriority11() {
        return mAdmissionspriority11;
    }

    public void setAdmissionspriority11(String admissionspriority11) {
        mAdmissionspriority11 = admissionspriority11;
    }

    public String getAdmissionspriority21() {
        return mAdmissionspriority21;
    }

    public void setAdmissionspriority21(String admissionspriority21) {
        mAdmissionspriority21 = admissionspriority21;
    }

    public String getAdmissionspriority31() {
        return mAdmissionspriority31;
    }

    public void setAdmissionspriority31(String admissionspriority31) {
        mAdmissionspriority31 = admissionspriority31;
    }

    public String getAttendanceRate() {
        return mAttendanceRate;
    }

    public void setAttendanceRate(String attendanceRate) {
        mAttendanceRate = attendanceRate;
    }

    public String getBbl() {
        return mBbl;
    }

    public void setBbl(String bbl) {
        mBbl = bbl;
    }

    public String getBin() {
        return mBin;
    }

    public void setBin(String bin) {
        mBin = bin;
    }

    public String getBoro() {
        return mBoro;
    }

    public void setBoro(String boro) {
        mBoro = boro;
    }

    public String getBorough() {
        return mBorough;
    }

    public void setBorough(String borough) {
        mBorough = borough;
    }

    public String getBuildingCode() {
        return mBuildingCode;
    }

    public void setBuildingCode(String buildingCode) {
        mBuildingCode = buildingCode;
    }

    public String getBus() {
        return mBus;
    }

    public void setBus(String bus) {
        mBus = bus;
    }

    public String getCensusTract() {
        return mCensusTract;
    }

    public void setCensusTract(String censusTract) {
        mCensusTract = censusTract;
    }

    public String getCity() {
        return mCity;
    }

    public void setCity(String city) {
        mCity = city;
    }

    public String getCode1() {
        return mCode1;
    }

    public void setCode1(String code1) {
        mCode1 = code1;
    }

    public String getCommunityBoard() {
        return mCommunityBoard;
    }

    public void setCommunityBoard(String communityBoard) {
        mCommunityBoard = communityBoard;
    }

    public String getCouncilDistrict() {
        return mCouncilDistrict;
    }

    public void setCouncilDistrict(String councilDistrict) {
        mCouncilDistrict = councilDistrict;
    }

    public String getDbn() {
        return mDbn;
    }

    public void setDbn(String dbn) {
        mDbn = dbn;
    }

    public String getDirections1() {
        return mDirections1;
    }

    public void setDirections1(String directions1) {
        mDirections1 = directions1;
    }

    public String getEllPrograms() {
        return mEllPrograms;
    }

    public void setEllPrograms(String ellPrograms) {
        mEllPrograms = ellPrograms;
    }

    public String getExtracurricularActivities() {
        return mExtracurricularActivities;
    }

    public void setExtracurricularActivities(String extracurricularActivities) {
        mExtracurricularActivities = extracurricularActivities;
    }

    public String getFaxNumber() {
        return mFaxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        mFaxNumber = faxNumber;
    }

    public String getFinalgrades() {
        return mFinalgrades;
    }

    public void setFinalgrades(String finalgrades) {
        mFinalgrades = finalgrades;
    }

    public String getGrade9geapplicants1() {
        return mGrade9geapplicants1;
    }

    public void setGrade9geapplicants1(String grade9geapplicants1) {
        mGrade9geapplicants1 = grade9geapplicants1;
    }

    public String getGrade9geapplicantsperseat1() {
        return mGrade9geapplicantsperseat1;
    }

    public void setGrade9geapplicantsperseat1(String grade9geapplicantsperseat1) {
        mGrade9geapplicantsperseat1 = grade9geapplicantsperseat1;
    }

    public String getGrade9gefilledflag1() {
        return mGrade9gefilledflag1;
    }

    public void setGrade9gefilledflag1(String grade9gefilledflag1) {
        mGrade9gefilledflag1 = grade9gefilledflag1;
    }

    public String getGrade9swdapplicants1() {
        return mGrade9swdapplicants1;
    }

    public void setGrade9swdapplicants1(String grade9swdapplicants1) {
        mGrade9swdapplicants1 = grade9swdapplicants1;
    }

    public String getGrade9swdapplicantsperseat1() {
        return mGrade9swdapplicantsperseat1;
    }

    public void setGrade9swdapplicantsperseat1(String grade9swdapplicantsperseat1) {
        mGrade9swdapplicantsperseat1 = grade9swdapplicantsperseat1;
    }

    public String getGrade9swdfilledflag1() {
        return mGrade9swdfilledflag1;
    }

    public void setGrade9swdfilledflag1(String grade9swdfilledflag1) {
        mGrade9swdfilledflag1 = grade9swdfilledflag1;
    }

    public String getGrades2018() {
        return mGrades2018;
    }

    public void setGrades2018(String grades2018) {
        mGrades2018 = grades2018;
    }

    public String getInterest1() {
        return mInterest1;
    }

    public void setInterest1(String interest1) {
        mInterest1 = interest1;
    }

    public String getLatitude() {
        return mLatitude;
    }

    public void setLatitude(String latitude) {
        mLatitude = latitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    public String getLongitude() {
        return mLongitude;
    }

    public void setLongitude(String longitude) {
        mLongitude = longitude;
    }

    public String getMethod1() {
        return mMethod1;
    }

    public void setMethod1(String method1) {
        mMethod1 = method1;
    }

    public String getNeighborhood() {
        return mNeighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        mNeighborhood = neighborhood;
    }

    public String getNta() {
        return mNta;
    }

    public void setNta(String nta) {
        mNta = nta;
    }

    public String getOfferRate1() {
        return mOfferRate1;
    }

    public void setOfferRate1(String offerRate1) {
        mOfferRate1 = offerRate1;
    }

    public String getOverviewParagraph() {
        return mOverviewParagraph;
    }

    public void setOverviewParagraph(String overviewParagraph) {
        mOverviewParagraph = overviewParagraph;
    }

    public String getPctStuEnoughVariety() {
        return mPctStuEnoughVariety;
    }

    public void setPctStuEnoughVariety(String pctStuEnoughVariety) {
        mPctStuEnoughVariety = pctStuEnoughVariety;
    }

    public String getPctStuSafe() {
        return mPctStuSafe;
    }

    public void setPctStuSafe(String pctStuSafe) {
        mPctStuSafe = pctStuSafe;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        mPhoneNumber = phoneNumber;
    }

    public String getPrimaryAddressLine1() {
        return mPrimaryAddressLine1;
    }

    public void setPrimaryAddressLine1(String primaryAddressLine1) {
        mPrimaryAddressLine1 = primaryAddressLine1;
    }

    public String getProgram1() {
        return mProgram1;
    }

    public void setProgram1(String program1) {
        mProgram1 = program1;
    }

    public String getRequirement11() {
        return mRequirement11;
    }

    public void setRequirement11(String requirement11) {
        mRequirement11 = requirement11;
    }

    public String getRequirement21() {
        return mRequirement21;
    }

    public void setRequirement21(String requirement21) {
        mRequirement21 = requirement21;
    }

    public String getRequirement31() {
        return mRequirement31;
    }

    public void setRequirement31(String requirement31) {
        mRequirement31 = requirement31;
    }

    public String getRequirement41() {
        return mRequirement41;
    }

    public void setRequirement41(String requirement41) {
        mRequirement41 = requirement41;
    }

    public String getRequirement51() {
        return mRequirement51;
    }

    public void setRequirement51(String requirement51) {
        mRequirement51 = requirement51;
    }

    public String getSchool10ThSeats() {
        return mSchool10ThSeats;
    }

    public void setSchool10ThSeats(String school10ThSeats) {
        mSchool10ThSeats = school10ThSeats;
    }

    public String getSchoolAccessibilityDescription() {
        return mSchoolAccessibilityDescription;
    }

    public void setSchoolAccessibilityDescription(String schoolAccessibilityDescription) {
        mSchoolAccessibilityDescription = schoolAccessibilityDescription;
    }

    public String getSchoolEmail() {
        return mSchoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        mSchoolEmail = schoolEmail;
    }

    public String getSchoolName() {
        return mSchoolName;
    }

    public void setSchoolName(String schoolName) {
        mSchoolName = schoolName;
    }

    public String getSchoolSports() {
        return mSchoolSports;
    }

    public void setSchoolSports(String schoolSports) {
        mSchoolSports = schoolSports;
    }

    public String getSeats101() {
        return mSeats101;
    }

    public void setSeats101(String seats101) {
        mSeats101 = seats101;
    }

    public String getSeats9ge1() {
        return mSeats9ge1;
    }

    public void setSeats9ge1(String seats9ge1) {
        mSeats9ge1 = seats9ge1;
    }

    public String getSeats9swd1() {
        return mSeats9swd1;
    }

    public void setSeats9swd1(String seats9swd1) {
        mSeats9swd1 = seats9swd1;
    }

    public String getStateCode() {
        return mStateCode;
    }

    public void setStateCode(String stateCode) {
        mStateCode = stateCode;
    }

    public String getSubway() {
        return mSubway;
    }

    public void setSubway(String subway) {
        mSubway = subway;
    }

    public String getTotalStudents() {
        return mTotalStudents;
    }

    public void setTotalStudents(String totalStudents) {
        mTotalStudents = totalStudents;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public String getZip() {
        return mZip;
    }

    public void setZip(String zip) {
        mZip = zip;
    }

}
