package com.example.modifyqq;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main_activity);
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Toast.makeText(MainActivity.this,"Success sign in", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(MainActivity.this,ShowDetailActivity.class);
				startActivity(intent);
			}
		});
		Button button2 = (Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
			//	Intent intent = new Intent(Intent.ACTION_VIEW);
			//	intent.setData(Uri.parse("http:baidu.com"));
			//	startActivity(intent);
			}
		});
	}

}
