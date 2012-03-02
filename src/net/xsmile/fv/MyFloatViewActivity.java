package net.xsmile.fv;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

public class MyFloatViewActivity extends Activity {
    /** Called when the activity is first created. */
	
	private WindowManager wm=null;
	private WindowManager.LayoutParams wmParams=null;
	
	private MyFloatView myFV=null;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        createView();
    
    }
        
  
    
    private void createView(){
    	myFV=new MyFloatView(getApplicationContext());
    	myFV.setImageResource(R.drawable.andy);
    	
    	wm=(WindowManager)getApplicationContext().getSystemService("window");
    	wmParams = ((MyApplication)getApplication()).getMywmParams();

 
        wmParams.type=LayoutParams.TYPE_PHONE;   
        wmParams.format=PixelFormat.RGBA_8888;   
 
        wmParams.flags=LayoutParams.FLAG_NOT_TOUCH_MODAL
                              | LayoutParams.FLAG_NOT_FOCUSABLE;
  
        
        
        wmParams.gravity=Gravity.LEFT|Gravity.TOP;   

        wmParams.x=0;
        wmParams.y=0;
        
 
        wmParams.width=40;
        wmParams.height=40;
    
        wm.addView(myFV, wmParams);
    	
    }
    
    @Override
    public void onDestroy(){
    	super.onDestroy();

    	wm.removeView(myFV);
    }
    
   
    
}