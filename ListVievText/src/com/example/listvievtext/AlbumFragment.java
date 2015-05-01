package com.example.listvievtext;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class AlbumFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
		TextView textView = new TextView(getActivity());
		textView.setText("Album Fragment");
		textView.setGravity(Gravity.CENTER_HORIZONTAL);
		LinearLayout layout = new LinearLayout(getActivity());
		LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
		layout.addView(textView,params);
		return layout;
	}

}