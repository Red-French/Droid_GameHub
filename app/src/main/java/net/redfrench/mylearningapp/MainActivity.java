package net.redfrench.mylearningapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

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
                setContentView(linLayout);
            }
        });

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
