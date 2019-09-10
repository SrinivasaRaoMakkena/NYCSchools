package com.example.nycschools.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by prc3198 on 4/16/2018.
 */

public class SatScores {

    @SerializedName("dbn")
    private String dbn;
    @SerializedName("num_of_sat_test_takers")
    private String num_of_sat_test_takers;
    @SerializedName("sat_critical_reading_avg_score")
    private String sat_critical_reading_avg_score;
    @SerializedName("sat_math_avg_score")
    private String sat_math_avg_score;
    @SerializedName("sat_writing_avg_score")
    private String sat_writing_avg_score;
    @SerializedName("school_name")
    private String school_name;


    public String getDbn() {
        return this.dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }


    public String getNumOfSatTestTakers() {
        return this.num_of_sat_test_takers;
    }

    public void setNumOfSatTestTakers(String num_of_sat_test_takers) {
        this.num_of_sat_test_takers = num_of_sat_test_takers;
    }


    public String getSatCriticalReadingAvgScore() {
        return this.sat_critical_reading_avg_score;
    }

    public void setSatCriticalReadingAvgScore(String sat_critical_reading_avg_score) {
        this.sat_critical_reading_avg_score = sat_critical_reading_avg_score;
    }


    public String getSatMathAvgScore() {
        return this.sat_math_avg_score;
    }

    public void setSatMathAvgScore(String sat_math_avg_score) {
        this.sat_math_avg_score = sat_math_avg_score;
    }


    public String getSatWritingAvgScore() {
        return this.sat_writing_avg_score;
    }

    public void setSatWritingAvgScore(String sat_writing_avg_score) {
        this.sat_writing_avg_score = sat_writing_avg_score;
    }


    public String getSchoolName() {
        return this.school_name;
    }

    public void setSchoolName(String school_name) {
        this.school_name = school_name;
    }


}
