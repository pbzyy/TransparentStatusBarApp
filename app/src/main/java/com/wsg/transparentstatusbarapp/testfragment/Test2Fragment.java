package com.wsg.transparentstatusbarapp.testfragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.wsg.transparentstatusbarapp.TestActivity;
import com.wsg.transparentstatusbarapp.R;
import com.wsg.transparentstatusbarapp.base.BaseFragmentV4;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Test2Fragment
 * desc:
 * 
 * 
 * Created by wushange on 2016/9/5 16:27.
 */

public class Test2Fragment extends BaseFragmentV4 {

    @BindView(R.id.bt_login)
    Button login;

    @Override
    public int bindLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public View bindView() {
        return null;
    }

    @Override
    public void initParms(Bundle parms) {

    }

    @Override
    public void initView(View view) {
    }

    @Override
    public void doBusiness(Context mContext) {
    }

    @Override
    public void lazyInitBusiness(Context mContext) {

    }

    @OnClick(R.id.bt_login)
    public void setLogin(View v) {
        startActivity(new Intent(getActivity(), TestActivity.class));
    }
}