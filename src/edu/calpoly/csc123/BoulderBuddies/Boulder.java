package edu.calpoly.csc123.BoulderBuddies;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.view.KeyEvent;
import android.content.Intent;

public class Boulder extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //<ImageView android:id="@+id/ImageView01" android:layout_width="wrap_content" android:layout_height="wrap_content" android:background="@drawable/boulderbuddy" android:layout_marginLeft="70px"></ImageView>
        setContentView(R.layout.main);
        final Button button1 = (Button) findViewById(R.id.CreateNewRockButton);
        button1.setOnClickListener(new OnClickListener() {
        //@Override
        public void onClick(View v) 
        {
               // Perform action on click
        		Intent intent = new Intent(Boulder.this, DesignActivity.class);
        		startActivity(intent);
        		//setContentView(R.layout.design);
           }
        });
        final Button button2 = (Button) findViewById(R.id.LoadRockButton);
        button2.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) 
        {
               // Perform action on click
        		//Load l = new Load();
        		//setContentView(R.layout.load);
        	  Intent intent = new Intent(Boulder.this, LoadListActivity.class);
        	  startActivity(intent);
           }
        });
        final Button button3 = (Button) findViewById(R.id.AboutButton);
        button3.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) 
        {
               // Perform action on click
    			Intent intent = new Intent(Boulder.this, About.class);
    			startActivity(intent);
           }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_MENU)) 
        {
            setContentView(R.layout.main);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}