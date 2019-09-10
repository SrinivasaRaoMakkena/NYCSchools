package com.example.nycschools.ui.activities;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nycschools.R;
import com.example.nycschools.constants.SchoolConstants;
import com.example.nycschools.databinding.ActivityDetailsBinding;

import com.example.nycschools.ui.viewModels.SchoolDetailsViewModel;

public class DetailsActivity extends AppCompatActivity {
    SchoolDetailsViewModel mSchoolDetailsViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("School's Avg Test Scores");
        ActivityDetailsBinding mActivityDetailsBinding = DataBindingUtil.setContentView(this, R.layout.activity_details);
        mSchoolDetailsViewModel = new SchoolDetailsViewModel(getIntent().getStringExtra(SchoolConstants.SCHOOL_NAME));

        mActivityDetailsBinding.setViewModel(mSchoolDetailsViewModel);


    }

    @Override
    protected void onResume() {
        super.onResume();
        mSchoolDetailsViewModel.getSatScoresOfSchool();
    }
}
