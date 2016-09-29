package com.itservz.android.swaisida;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view){
        if(view.getId() == R.id.go_to_current_place){
            startActivity(new Intent(this, CurrentPlaceActivity.class));
        } else if(view.getId() == R.id.go_to_last_location){
            startActivity(new Intent(this, LastLocationActivity.class));
        } else if(view.getId() == R.id.go_to_nearby){
        }
    }
}
