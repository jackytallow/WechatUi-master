package com.example.mychat_master.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mychat_master.R;


/**
 * Created by Jacky on 2018/10/21.
 */

public class ContactlistFragment  extends Fragment {



    /**
     * 先暂时存在数组里面，后期会使用数据库
     */
    private String[] constactsName;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_contactlist,container,false);
        return view;
    }



}
