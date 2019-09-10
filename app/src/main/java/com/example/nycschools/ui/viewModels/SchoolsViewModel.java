package com.example.nycschools.ui.viewModels;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.widget.Toast;

import com.example.nycschools.contracts.SchoolsContract;
import com.example.nycschools.models.School;
import com.example.nycschools.services.SchoolsRetrofitManager;
import com.example.nycschools.ui.adapters.SchoolsRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;

/**
 * Created by Srinivas on 4/15/2018.
 */

public class SchoolsViewModel extends BaseObservable {

    public interface ActionListener {

        public void notifyDataSetUpdate();
        //public void onDownLoadComplete(boolean complete);
    }

    public SchoolsViewModel(Context context, ActionListener listener, SchoolsContract contract) {
        this.mContext = context;
        this.mActionListener = listener;
        this.mSchoolContract = contract;
        items = new ArrayList<>();
        mSchoolsAdapter = new SchoolsRecyclerViewAdapter(mContext, items, mSchoolContract);
        isDataloading.set(true);

    }


    public void getNYSchools() {
        if (items != null && items.size() > 0) {
            return;
        }
        initSubscriber();
        SchoolsRetrofitManager.callWebService(SchoolsRetrofitManager.getSchools(), mSchoolsSubscriber);
    }

    private void initSubscriber() {
        if (mSchoolsSubscriber != null) {
            mSchoolsSubscriber.unsubscribe();
            mSchoolsSubscriber = null;
        }


        mSchoolsSubscriber = new Subscriber<List<Object>>() {
            @Override
            public void onCompleted() {

                isDataloading.set(false);
            }

            @Override
            public void onError(Throwable e) {
                isDataloading.set(false);
                System.out.println("length " + e);
                Toast.makeText(mContext,e.getMessage(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNext(List<Object> response) {
                isDataloading.set(true);
                items.clear();
                for (Object s : response) {
                    items.add((School) s);
                }
                mActionListener.notifyDataSetUpdate();
                String a = items.get(1).getSchoolName();
                System.out.println("length next" + items.size());
            }
        };


    }

    public LinearLayoutManager getLayoutManager() {
        return new LinearLayoutManager(mContext, OrientationHelper.VERTICAL, false);
    }

    public SchoolsRecyclerViewAdapter getAdapter() {
        return mSchoolsAdapter;
    }

    private Subscriber<List<Object>> mSchoolsSubscriber = null;

    public List<School> items;
    private Context mContext;
    private SchoolsRecyclerViewAdapter mSchoolsAdapter;
    private SchoolViewModel mSchoolViewModel;
    private ActionListener mActionListener;
    private SchoolsContract mSchoolContract;
    // private boolean completed;

    public final ObservableBoolean isDataloading = new ObservableBoolean(false);

}
