package com.example.application.selectors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SwitchCompat toggle;
    AppCompatCheckBox checkbox;
    RadioGroup genders_radios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggle =(SwitchCompat) findViewById(R.id.switch_id);
        checkbox =(AppCompatCheckBox) findViewById(R.id.checkbox_id);
        genders_radios =(RadioGroup) findViewById(R.id.gender_radios);


        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    makeToast("ON");
                }
                else{
                    makeToast("OFF");
                }

            }
        });

        checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    makeToast("Checked");
                }
                else{
                    makeToast("Unchecked");
                }
            }
        });

        genders_radios.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == R.id.gender_male){
                    makeToast("MALE");
                }
                else{
                    makeToast("FEMALE");
                }

            }
        });


    }

    public void makeToast(String title){
        Toast.makeText(getApplicationContext(), title, Toast.LENGTH_LONG).show();
    }


}
