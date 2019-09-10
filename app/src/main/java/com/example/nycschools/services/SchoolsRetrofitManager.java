package com.example.nycschools.services;

import com.example.nycschools.models.SatScores;
import com.example.nycschools.models.School;
import com.example.nycschools.models.SchoolsResponse;

import java.util.List;

import rx.Observable;
import rx.Subscriber;

/**
 * Created by Srinivas on 4/14/2018.
 */

public class SchoolsRetrofitManager extends BaseRetrofitManager {

    public static Observable<List<School>> getSchools() {
        Observable<List<School>> schoolsResponse;

        SchoolsService accountApiService
                = getRetrofit().create(SchoolsService.class);

        schoolsResponse
                = accountApiService.getNYCSchools();


        return schoolsResponse;
    }

    public static Observable<List<SatScores>> getSatScore() {
        Observable<List<SatScores>> satScoresResponse;

        SchoolsService accountApiService
                = getRetrofit().create(SchoolsService.class);

        satScoresResponse
                = accountApiService.getSatScores();


        return satScoresResponse;
    }
}
