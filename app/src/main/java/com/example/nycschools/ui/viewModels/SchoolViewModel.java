package com.example.nycschools.ui.viewModels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.nycschools.BR;
import com.example.nycschools.contracts.SchoolsContract;
import com.example.nycschools.models.School;

/**
 * Created by Srinivas on 4/15/2018.
 */

public class SchoolViewModel extends BaseObservable {

    public SchoolViewModel(School mSchool, SchoolsContract contract) {
        this.mSchool = mSchool;
        this.mSchoolContract = contract;
    }

    public void OnViewDetails() {
        mSchoolContract.onItemClick(mSchool);
    }

    @Bindable
    public School getmSchool() {
        return mSchool;
    }

    public void setmSchool(School mSchool) {
        this.mSchool = mSchool;
        notifyPropertyChanged(BR.mSchool);
    }


    private School mSchool;
    private SchoolsContract mSchoolContract;

}
