package com.example.modifyqq;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ShowDetailActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.showdetail_activity);
		Button button = (Button) findViewById(R.id.Login);
		button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				switch(v.getId()){
				case R.id.Login:
					AlertDialog.Builder dialog = new AlertDialog.Builder(ShowDetailActivity.this);
					dialog.setTitle("This is a dialog");
					dialog.setMessage("进入聊天界面");
					dialog.setCancelable(false);
					dialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialog,int which){
							Intent intent = new Intent(ShowDetailActivity.this,MsgActivity.class);
							startActivity(intent);
						}
					});
					dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
						
						@Override
						public void onClick(DialogInterface dialog, int which) {
						}
					});
					dialog.show();
					break;
				default:
					break;
				}
				//Intent intent = new Intent(ShowDetailActivity.this,MsgActivity.class);
				//startActivity(intent);
			}
		});
		
		
	}

}
