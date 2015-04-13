package com.example.viet.cssapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class CourseActivity extends ActionBarActivity {

    private String mCourseID;
    static final String COURSE_ID = "courseID";
    private String mShortDecript;
    static final String SHORT_DESCRIPT = "shortdescripton";
    private String mLongDescript;
    static final String LONG_DESCRIPT = "longdescription";
    private String mPrerequisites;
    static final String PREREQUISITES = "Prerequisites";


    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        EditText edit = (EditText) findViewById(R.id.courseID);
        /*edit.addTextChangedListener(new TextWatcher() {

            public void afterTextChange(Editable s) {

            }
        });
        mCourseID = edit.getText().toString();*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_course, menu);
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

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
         savedInstanceState.putString(COURSE_ID, mCourseID);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        mCourseID = savedInstanceState.getString(COURSE_ID);
    }


}
