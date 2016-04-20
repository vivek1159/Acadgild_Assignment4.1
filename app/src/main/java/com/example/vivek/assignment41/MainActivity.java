package com.example.vivek.assignment41;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter ad;
    String Months [] = {"January","February","March","April","May","June","July","August",
            "September","October","November","December"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listView=(ListView)findViewById(R.id.listView);

        ad = new ArrayAdapter(this,R.layout.list_view_layout,Months);
        listView.setAdapter(ad);
    }


    public void onClickAscending(View v)
    {
        Arrays.sort(Months);
        listView.setAdapter(ad);
    }

    public void onClickDescending(View v)
    {
        ArrayList<String> MonthList = new ArrayList<String>();
        MonthList.addAll(Arrays.asList(Months));

        Collections.sort(MonthList, Collections.reverseOrder());

        ArrayAdapter desc = new ArrayAdapter(this,R.layout.list_view_layout,MonthList);
        listView.setAdapter(desc);
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
