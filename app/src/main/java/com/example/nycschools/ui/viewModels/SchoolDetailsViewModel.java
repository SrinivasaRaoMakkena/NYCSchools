package com.example.nycschools.ui.viewModels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

import com.example.nycschools.BR;
import com.example.nycschools.models.SatScores;
import com.example.nycschools.models.School;
import com.example.nycschools.services.SchoolsRetrofitManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import rx.Subscriber;


public class SchoolDetailsViewModel extends BaseObservable {

    public SchoolDetailsViewModel(String mSchoolName) {
        this.mSchoolName = mSchoolName;
        items = new ArrayList<>();
        isDataLoading.set(true);
    }


    @Bindable
    private String mSchoolName;

    @Bindable
    public String getmSchoolName() {
        return mSchoolName;
    }

    public void setmSchoolName(String mSchoolName) {
        this.mSchoolName = mSchoolName;
        notifyPropertyChanged(BR.mSchoolName);
    }


    public void getSatScoresOfSchool() {
        if (items != null && items.size() > 0) {
            return;
        }
        initSubscriber();
        SchoolsRetrofitManager.callWebService(SchoolsRetrofitManager.getSatScore(), mSatScoresSubscriber);
    }

    private void initSubscriber() {
        if (mSatScoresSubscriber != null) {
            mSatScoresSubscriber.unsubscribe();
            mSatScoresSubscriber = null;
        }


        mSatScoresSubscriber = new Subscriber<List<Object>>() {
            @Override
            public void onCompleted() {
                isDataLoading.set(false);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("length sat " + e);
                isDataLoading.set(false);
            }

            @Override
            public void onNext(List<Object> response) {
                if (response != null) {
                    isDataLoading.set(true);
                    System.out.println("length sat 2" + response.size());
                    int count = 0;
                    for (Object o : response) {
                        SatScores s = (SatScores) o;

                        System.out.println("school " + s.getSchoolName() + "    ----" + mSchoolName);
                        if (mSchoolName.toLowerCase().equals(s.getSchoolName().toLowerCase())) {
                            count++;
                            items.add(s);
                            mDBN.set("DBN: "+s.getDbn());
                            numOfSATTestTakers.set("Number of Test Takers: "+s.getNumOfSatTestTakers());
                            readingScore.set("Avg Reading Score: "+s.getSatCriticalReadingAvgScore());
                            writingScore.set("Avg Writing Score: "+s.getSatWritingAvgScore());
                            mathScore.set("Avg Math Score: "+s.getSatMathAvgScore());

                            break;
                        }
                    }

                    if (count == 0) {
                        mDBN.set("Not Available");
                        numOfSATTestTakers.set("Not Available");
                        readingScore.set("Not Available");
                        writingScore.set("Not Available");
                        mathScore.set("Not Available");
                    }
                    System.out.println("length next sat" + response.size());
                }
            }
        };


    }

    public Subscriber<List<Object>> getmSatScoresSubscriber() {
        return mSatScoresSubscriber;
    }

    public void setmSatScoresSubscriber(Subscriber<List<Object>> mSatScoresSubscriber) {
        this.mSatScoresSubscriber = mSatScoresSubscriber;
    }

    public List<SatScores> getItems() {
        return items;
    }

    public void setItems(List<SatScores> items) {
        this.items = items;
    }

    public String getmSchoolNam() {
        return mSchoolNam;
    }

    public void setmSchoolNam(String mSchoolNam) {
        this.mSchoolNam = mSchoolNam;
    }


    private Subscriber<List<Object>> mSatScoresSubscriber = null;
    private List<SatScores> items;
    private String mSchoolNam;

    public final ObservableBoolean isDataLoading = new ObservableBoolean(false);

    public final ObservableField<String> mDBN = new ObservableField<>("");

    public final ObservableField<String> numOfSATTestTakers = new ObservableField<>("");

    public final ObservableField<String> readingScore = new ObservableField<>("");

    public final ObservableField<String> mathScore = new ObservableField<>("");

    public final ObservableField<String> writingScore = new ObservableField<>("");
}
