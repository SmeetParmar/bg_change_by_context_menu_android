package com.au.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity 
{
        ConstraintLayout cl;
        TextView tv;
        
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl=findViewById(R.id.cl);
        tv=findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose A Color");
        menu.add(0,v.getId(),0,"Cyan");
        menu.add(0,v.getId(),0,"Yellow");
        menu.add(0,v.getId(),0,"Red");
        menu.add(0,v.getId(),0,"Green");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {
        if(item.getTitle()=="Cyan")
        {
            cl.setBackgroundColor(Color.CYAN);
        }
        else if(item.getTitle()=="Yellow")
        {
            cl.setBackgroundColor(Color.YELLOW);
        }
        else if(item.getTitle()=="Red")
        {
            cl.setBackgroundColor(Color.RED);
        }
        else if(item.getTitle()=="Green")
        {
            cl.setBackgroundColor(Color.GREEN);
        }
        return true;
    }
}
