package com.example.chinmoy.customgridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        GridView gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(new MyAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                switch(position)
                {
                    case 0:
                        Intent new0Activity = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(new0Activity);
                        break;
                    case 1:
                        Intent new1Activity = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(new1Activity);
                        break;

                    case 2:
                        Intent new2Activity = new Intent(MainActivity.this,MainActivity.class);
                        startActivity(new2Activity);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Wrong Input", Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}
