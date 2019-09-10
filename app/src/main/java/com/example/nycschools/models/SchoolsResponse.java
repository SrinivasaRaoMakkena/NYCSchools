package com.example.nycschools.models;

import java.util.List;

/**
 * Created by Srinivas on 4/14/2018.
 */

public class SchoolsResponse {
    private School [] schools;

    public School[] getSchools() {
        return schools;
    }

    public void setSchools(School[] schools) {
        this.schools = schools;
    }

    public SchoolsResponse(School[] schools) {
        this.schools = schools;
    }
}
