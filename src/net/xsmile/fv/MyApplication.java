package net.xsmile.fv;

import android.app.Application;
import android.view.WindowManager;

public class MyApplication extends Application {
	
	//aa883455688u
	private WindowManager.LayoutParams wmParams=new WindowManager.LayoutParams();

	public WindowManager.LayoutParams getMywmParams(){
		return wmParams;
	}
}
