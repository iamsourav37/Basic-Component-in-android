package com.backpakcersourav.basiccomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    ToggleButton tb;
    TextView tv1,tv2,tv3;
    String diploma= "Diploma is unchecked",btech= "B Tech is unchecked",mtech= "M Tech is unchecked";
    CheckBox cbD,cbB,cbM;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn = findViewById(R.id.button);
        tb = findViewById(R.id.tbExpertPro);
        tb.setTextOff("NO");
        tb.setTextOn("YES");
        tb.setChecked(true);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        cbD = findViewById(R.id.cbDiploma);
        cbB = findViewById(R.id.cbBtech);
        cbM= findViewById(R.id.cbMtech);

        cbD.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cbD.isChecked())
                    diploma = "Diploma is checked";
                else
                    diploma = "Diploma is unchecked";
            }
        });
        cbB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cbB.isChecked())
                    btech = "B Tech is checked";
                else
                    btech = "B tech is unchecked";
            }
        });
        cbM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(cbM.isChecked())
                    mtech = "M Tech is checked";
                else
                    mtech = "M tech is unchecked";
            }
        });



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(diploma);
                tv2.setText(btech);
                tv3.setText(mtech);

            }
        });

    }



}
