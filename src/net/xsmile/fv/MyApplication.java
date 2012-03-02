package net.xsmile.fv;

import android.app.Application;
import android.view.WindowManager;

public class MyApplication extends Application {
	
	//aa
	private WindowManager.LayoutParams wmParams=new WindowManager.LayoutParams();

	public WindowManager.LayoutParams getMywmParams(){
		return wmParams;
	}
}
