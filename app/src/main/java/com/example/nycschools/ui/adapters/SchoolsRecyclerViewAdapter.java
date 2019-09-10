package com.example.nycschools.ui.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.nycschools.R;
import com.example.nycschools.contracts.SchoolsContract;
import com.example.nycschools.databinding.ItemSchoolBinding;
import com.example.nycschools.models.School;
import com.example.nycschools.ui.viewModels.SchoolViewModel;

import java.util.List;


/**
 * Created by Srinivas on 4/15/2018.
 */

public class SchoolsRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private List<School> mSchools;
    private Context mContext;
    private SchoolsContract  mContract;

    public SchoolsRecyclerViewAdapter(Context context,List<School> schools,SchoolsContract contract) {
        this.mContext = context;
        this.mSchools = schools;
        this.mContract = contract;

        System.out.println("length adapter constructor"+mSchools.size());
        //this.mSchoolsContract=sContract;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        System.out.println("length adapter create "+mSchools.size());
                ItemSchoolBinding itemSchoolBinding =
                        DataBindingUtil.inflate(inflater, R.layout.item_school, parent,
                                false);
                viewHolder = new SchoolViewHolder(mContext,itemSchoolBinding);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SchoolViewHolder schoolsViewHolder = (SchoolViewHolder) holder;

        schoolsViewHolder.bind((School) mSchools.get(position),mContract);
        System.out.println("length adapter bind "+mSchools.size());

    }

    @Override
    public int getItemCount() {
        System.out.println("length adapter item 1  "+mSchools.size());
        if (mSchools.size()>0){
            System.out.println("length adapter item 2 "+mSchools.size());
            return mSchools.size();
        }
        return 0;
    }

    public static class SchoolViewHolder extends RecyclerView.ViewHolder {

        public SchoolViewHolder(Context context, ItemSchoolBinding itemVehicleBinding) {
            super(itemVehicleBinding.getRoot());
            this.mItemVehicleBinding = itemVehicleBinding;
            this.mContext = context;
        }

        void bind(School school,SchoolsContract contract) {
            if (null == mItemVehicleBinding.getData()) {
                mItemVehicleBinding.setData(
                        new SchoolViewModel(school,contract)
                );
            } else {
                mItemVehicleBinding.getData()
                        .setmSchool(school);
            }
        }

        private ItemSchoolBinding mItemVehicleBinding;
        private Context mContext;
    }
}