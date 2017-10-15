package com.example.paras.alertdialog;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog( View view)
    {
        MyAlertDialog myAlertDialog = new MyAlertDialog();
        myAlertDialog.setCancelable(false);
        FragmentManager fragmentManager = getSupportFragmentManager();
        myAlertDialog.show(fragmentManager,"alertDialog tag");
    }
}
