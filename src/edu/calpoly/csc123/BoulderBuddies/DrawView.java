package edu.calpoly.csc123.BoulderBuddies;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
public class DrawView extends View implements OnTouchListener 
{
	int testchange;
	Bitmap bitmapOrg;
	Bitmap designBG;
	Bitmap purpleRock;
    Paint paint = new Paint();
    Point[] points = new Point[5];
    Point point = new Point();
    Context context;
    DesignActivity designActivity;
    boolean hasClickedList = false;
    Button b;
    public DrawView(Context contextt) 
    {
        super(contextt);
        context=contextt;
        points[0] = new Point();
        points[1] = new Point();
        points[2] = new Point();
        points[3] = new Point();
        points[4] = new Point();
        Rock rock = new Rock();
        bitmapOrg = BitmapFactory.decodeResource(getResources(), R.drawable.eye_1a);
        designBG = BitmapFactory.decodeResource(getResources(), R.drawable.designbg);
        purpleRock = BitmapFactory.decodeResource(getResources(), R.drawable.body_1);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.setOnTouchListener(this);
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
    }
    @Override
    public void onDraw(Canvas canvas) 
    {
        paint.setColor(Color.BLACK);
        Matrix m = new Matrix();
        canvas.drawRect(0, 0, 320, 480, paint);
        Rect srcA = new Rect(0, 0, 320, 480);
        Rect dstA = new Rect(0, 0, 320, 480);
        Rect src = new Rect(0, 0, 200, 200);
        Rect dst = new Rect((320/2)-100, 100, (320/2)-100+200, 300);
        canvas.drawBitmap(designBG, srcA, dstA, paint);
        canvas.drawBitmap(purpleRock, src, dst, paint);
        paint.setColor(Color.WHITE);
        canvas.drawRect(0,0,100,40, paint);
        canvas.drawRect(320-100-10, 0, 320-10, 40, paint);
        paint.setColor(Color.BLACK);
        canvas.drawText("List Features", 25, 25, paint);
        paint.setColor(Color.GREEN);
        canvas.drawLine(320-10-70, 20, 320-10-49, 30, paint);
        canvas.drawLine(320-10-50, 30, 320-10-30, 5, paint);
        canvas.drawLine(320-10-70, 21, 320-10-49, 31, paint);
        canvas.drawLine(320-10-50, 31, 320-10-30, 6, paint);
        for (int i=0; i<points.length; i++) 
        {
            Rect src2 = new Rect(0, 0, 34, 34);
            if(points[0].y-17>40)
            {
            	Rect dst2 = new Rect((int)points[0].x-17-45, (int)points[0].y-17, (int)points[0].x-17+34-45, (int)points[0].y-17+34);
            	Rect dst3 = new Rect((int)points[0].x-17+90-45, (int)points[0].y-17, (int)points[0].x-17+34+90-45, (int)points[0].y-17+34);
            	canvas.drawBitmap(bitmapOrg, src2, dst2, paint);
            	canvas.drawBitmap(bitmapOrg, src2, dst3, paint);
            }
            else
            {
            	Rect dst2 = new Rect((int)points[0].x-17-45, 40, (int)points[0].x-17+34-45, 40+34);
            	Rect dst3 = new Rect((int)points[0].x-17+90-45, 40, (int)points[0].x-17+34+90-45, 40+34);
            	canvas.drawBitmap(bitmapOrg, src2, dst2, paint);
            	canvas.drawBitmap(bitmapOrg, src2, dst3, paint);
            }
        }
    }
    public void setDesignActivity(DesignActivity design)
    {
    	designActivity = design;
    }
    public boolean onTouch(View view, MotionEvent event) 
    {
    	point.x = event.getX();
    	point.y = event.getY();
        points[0] = new Point();
        points[0].x = event.getX();
        points[0].y = event.getY();
        if(points[0].x<100 && points[0].y<40)
        {
        	viewItemsButtonPressed();
        	hasClickedList=true;
        }
        invalidate();
        return true;
    }
    public boolean hasClickedList()
    { 
    	if(hasClickedList==true)
    	{
    		hasClickedList=false;
    		return true;
    	}
    	return false;
    }
    public void viewItemsButtonPressed()
    {
		context.startActivity(new Intent("edu.calpoly.csc123.BoulderBuddies.ItemsChoicesListActivity"));
    }
}