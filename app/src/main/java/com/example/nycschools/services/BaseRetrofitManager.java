package com.example.nycschools.services;

import com.example.nycschools.models.School;
import com.example.nycschools.models.SchoolsResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Srinivas on 4/14/2018.
 */

public class BaseRetrofitManager {

    public static Retrofit getRetrofit() {
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .baseUrl(URL);

        OkHttpClient.Builder okHttpClientBuilder = new OkHttpClient.Builder();


        OkHttpClient okHttpClient = okHttpClientBuilder
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        retrofitBuilder.client(okHttpClient);

        return retrofitBuilder.build();
    }

   public static void callWebService(Observable observable, Subscriber<List<Object>> subscriber) {

         observable
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private static final String URL = "https://data.cityofnewyork.us/";
}