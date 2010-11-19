package edu.calpoly.csc123.BoulderBuddies;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;

public class DesignActivity extends Activity 
{ 
	DrawView drawView;
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        //Rock rock = new Rock();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
      	drawView = new DrawView(this);
      	setContentView(drawView);
      	drawView.requestFocus();
    }
}

