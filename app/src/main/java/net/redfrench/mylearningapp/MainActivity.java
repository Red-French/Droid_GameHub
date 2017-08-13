package net.redfrench.mylearningapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.util.Log;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "RedsMsg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i(TAG, "onCreate");

        super.onCreate(savedInstanceState);

        final LinearLayout linLayout = new LinearLayout(this);

        final Button btn1 = new Button(this);
        btn1.setText("Button 1");
        linLayout.addView(btn1);

        final Button btn2 = new Button(this);
        btn2.setText("Button 2");
        linLayout.addView(btn2);

        final Button btn3 = new Button(this);
        btn3.setText("Button 3");
        linLayout.addView(btn3);

        setContentView(R.layout.content_main);


//        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int btnWidth = btn1.getMeasuredWidth();
                int btnHeight = btn1.getMeasuredHeight();
                System.out.println("btnWidth = " + btnWidth + " " + btnHeight);

                LinearLayout.LayoutParams LP = new LinearLayout.LayoutParams(284, 176);
                btn1.setLayoutParams(LP);

                LP = new LinearLayout.LayoutParams(234, 126);
                btn2.setLayoutParams(LP);

                LP = new LinearLayout.LayoutParams(234, 126);
                btn3.setLayoutParams(LP);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams LP = new LinearLayout.LayoutParams(234, 126);
                btn1.setLayoutParams(LP);

                LP = new LinearLayout.LayoutParams(284, 176);
                btn2.setLayoutParams(LP);

                LP = new LinearLayout.LayoutParams(234, 126);
                btn3.setLayoutParams(LP);
            }
        });



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LinearLayout.LayoutParams LP = new LinearLayout.LayoutParams(234, 126);
                btn1.setLayoutParams(LP);

                LP = new LinearLayout.LayoutParams(234, 126);
                btn2.setLayoutParams(LP);

                LP = new LinearLayout.LayoutParams(284, 176);
                btn3.setLayoutParams(LP);
            }
        });

         Button beginPlayBtn = (Button) findViewById(R.id.beginPlayBtn);
        beginPlayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                linLayout.setBackgroundColor(Color.parseColor("#003399"));
                linLayout.setGravity(Gravity.CENTER_HORIZONTAL);
                setContentView(linLayout);
            }
        });

    } // end onCreate()


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
