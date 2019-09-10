package com.example.nycschools.services;

import com.example.nycschools.models.SatScores;
import com.example.nycschools.models.School;
import com.example.nycschools.models.SchoolsResponse;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by Srinivas on 4/14/2018.
 */

public interface SchoolsService {
    @GET("resource/97mf-9njv.json")
    Observable<List<School>> getNYCSchools();

    @GET("resource/734v-jeq5.json")
    Observable<List<SatScores>> getSatScores();



}
