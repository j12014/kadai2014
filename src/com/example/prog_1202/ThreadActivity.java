package com.example.prog_1202;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.SurfaceHolder;

public class ThreadActivity extends Activity implements Runnable,SurfaceHolder.Callback{
	private Thread MainLoop;
	private SurfaceHolder holder;
	private Drawable img;
	private int x=0,y=0;
	
	public ThreadActivity(Context context){
		super(context);
		init(context);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thread);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.thread, menu);
		return true;
	}

	@Override
	public void run() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
