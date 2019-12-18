package org.chromium.chrome.browser.ntp.sponsored;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.FrameLayout;

import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetBehavior;
import android.view.ViewTreeObserver;
import org.chromium.chrome.R;

public class RewardsBottomSheetDialogFragment extends BottomSheetDialogFragment{

	public static final int BR_OFF = 1;
	public static final int BR_ON_ADS_OFF = 2;
	public static final int BR_ON_ADS_ON = 3;

	public static final String NTP_TYPE = "ntp_type";

    public static RewardsBottomSheetDialogFragment newInstance() {
        return new RewardsBottomSheetDialogFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

    	int ntpType = 0;

    	if (getArguments()!=null) {
    		ntpType = getArguments().getInt(NTP_TYPE,1);
    	}

    	switch (ntpType) {
    		case BR_OFF:
    			return inflater.inflate(R.layout.ntp_rewards_off_bottom_sheet, container,false);
    		case BR_ON_ADS_OFF:
    			return inflater.inflate(R.layout.ntp_rewards_on_ads_off_bottom_sheet, container,false);
    		case BR_ON_ADS_ON:
    			return inflater.inflate(R.layout.ntp_rewards_on_ads_on_bottom_sheet, container,false);
    		default : 
    			return inflater.inflate(R.layout.ntp_rewards_off_bottom_sheet, container,false);
    	}
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                BottomSheetDialog dialog = (BottomSheetDialog) getDialog();
                FrameLayout bottomSheet = (FrameLayout) dialog.findViewById(android.support.design.R.id.design_bottom_sheet);
                BottomSheetBehavior behavior = BottomSheetBehavior.from(bottomSheet);
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });

        ImageView btnClose = view.findViewById(R.id.ntp_bottom_sheet_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}