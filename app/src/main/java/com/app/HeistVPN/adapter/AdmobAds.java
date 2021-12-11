package com.app.HeistVPN.adapter;

import android.app.Activity;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.app.HeistVPN.R;


public class AdmobAds {


    public static void loadBanner(Activity activity) {
        AdView adView = new AdView(activity);

        adView.setAdUnitId(activity.getString(R.string.admob_banner_id));
        adView.setAdSize(AdSize.SMART_BANNER);
        ((LinearLayout) activity.findViewById(R.id.admob_banner)).addView(adView);
        AdRequest build = new AdRequest.Builder().build();
        adView.loadAd(build);
    }


}