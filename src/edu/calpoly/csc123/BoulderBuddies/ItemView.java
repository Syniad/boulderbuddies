package edu.calpoly.csc123.BoulderBuddies;
import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;

public class ItemView extends Activity 
{ 
	DrawView drawView;
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items);
        
      
    }
}

