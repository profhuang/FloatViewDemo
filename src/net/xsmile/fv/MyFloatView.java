package net.xsmile.fv;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.ImageView;

public class MyFloatView extends ImageView {
	private float mTouchStartX;
    private float mTouchStartY;
    private float x;
    private float y;
    
    
    private WindowManager wm=(WindowManager)getContext().getApplicationContext().getSystemService("window");
    
    
    private WindowManager.LayoutParams wmParams = ((MyApplication)getContext().getApplicationContext()).getMywmParams();

	public MyFloatView(Context context) {
		super(context);		
	
	}
	
	 @Override
	 public boolean onTouchEvent(MotionEvent event) {
		 
		 
		 
	     x = event.getRawX();   
	     y = event.getRawY()-25;   
	     Log.i("currP", "currX"+x+"====currY"+y);
	     switch (event.getAction()) {
	        case MotionEvent.ACTION_DOWN:
	        	
	        	mTouchStartX =  event.getX();  
                mTouchStartY =  event.getY();
                
	            Log.i("startP", "startX"+mTouchStartX+"====startY"+mTouchStartY);
	            
	            break;
	        case MotionEvent.ACTION_MOVE:	            
	            updateViewPosition();
	            break;

	        case MotionEvent.ACTION_UP:
	        	updateViewPosition();
	        	mTouchStartX=mTouchStartY=0;
	        	break;
	        }
	        return true;
		}
	 
	 private void updateViewPosition(){
		
		wmParams.x=(int)( x-mTouchStartX);
		wmParams.y=(int) (y-mTouchStartY);
	    wm.updateViewLayout(this, wmParams);
	    
	 }

}
