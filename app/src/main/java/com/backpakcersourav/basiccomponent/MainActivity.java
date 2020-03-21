package com.backpakcersourav.basiccomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView tvShow;
    RadioGroup rgCourses;
    RadioButton rbCourseSelected;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        btn = findViewById(R.id.button);
        rgCourses = findViewById(R.id.rgCourses);
        tvShow = findViewById(R.id.tvShow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    int checkedId = rgCourses.getCheckedRadioButtonId();
                    Log.d("myapp","id is : "+checkedId);
                    if(checkedId != -1){
                        rbCourseSelected = findViewById(checkedId);
                        String str = rbCourseSelected.getText().toString();
                        tvShow.setText(str);
                    }else {
                        tvShow.setText("Not Selected");
                    }


            }
        });

    }



}
