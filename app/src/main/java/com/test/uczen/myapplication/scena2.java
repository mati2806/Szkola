package com.test.uczen.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by uczen on 2017-03-09.
 */

public class scena2 extends AppCompatActivity {

    Button powrot;
    TextView text1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scena2);

    powrot = (Button) findViewById(R.id.button5);
        text1 = (TextView) findViewById(R.id.textView5);
        text1.setText("");



        powrot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            text1.setText("NIESPODZIANKA!" );
            text1.setTextColor(Color.RED);


        }


    });
}
}

