package com.example.nycschools.ui.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.nycschools.R;

import com.example.nycschools.contracts.SchoolsContract;
import com.example.nycschools.constants.SchoolConstants;
import com.example.nycschools.databinding.ActivityMainBinding;
import com.example.nycschools.models.School;

import com.example.nycschools.ui.viewModels.SchoolsViewModel;


public class MainActivity extends AppCompatActivity {
    private SchoolsViewModel mSchoolsViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mSchoolsViewModel = new SchoolsViewModel(this, new SchoolsViewModel.ActionListener() {
            @Override
            public void notifyDataSetUpdate() {
                System.out.println("length size " + mSchoolsViewModel.items.size());

                mSchoolsViewModel.getAdapter().notifyDataSetChanged();


            }

        }, new SchoolsContract() {
            @Override
            public void onItemClick(School school) {
                openSchoolDetails(school);

            }
        });


        mActivityMainBinding.setViewModel(mSchoolsViewModel);

    }

    private void openSchoolDetails(School school) {

        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra(SchoolConstants.SCHOOL_NAME, school.getSchoolName());
        startActivity(intent);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mSchoolsViewModel.getNYSchools();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }


}
