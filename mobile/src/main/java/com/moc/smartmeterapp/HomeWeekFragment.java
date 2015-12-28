package com.moc.smartmeterapp;

/**
 * Created by Philipp Kamps on 23.11.15.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moc.smartmeterapp.ui.MeterView;

public class HomeWeekFragment extends Fragment {
    private MeterView meterView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_week_fragment_layout,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        meterView = (MeterView) view.findViewById(R.id.week_meterview);
        meterView.setOffsetAngle(45);
    }
}