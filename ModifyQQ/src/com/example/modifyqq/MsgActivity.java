package com.example.modifyqq;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;

public class MsgActivity extends Activity{
	private EditText edit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.msg_activity);
		edit =(EditText)findViewById(R.id.input_message1);
		//String inputText = load();
		//if (!TextUtile.isEmpty)
	}
	@Override
	protected void onDestroy(){
		super.onDestroy();
		String inputText =edit.getText().toString();
		save(inputText);
	}
	
	public void save(String inputText){
		FileOutputStream out = null;
		BufferedWriter writer = null;
		try{
			out = openFileOutput("data",Context.MODE_PRIVATE);
			writer = new BufferedWriter(new OutputStreamWriter(out));
			writer.write(inputText);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				if(writer !=null){
					writer.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	

}
