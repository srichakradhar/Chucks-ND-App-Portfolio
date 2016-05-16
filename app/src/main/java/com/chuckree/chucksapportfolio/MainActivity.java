package com.chuckree.chucksapportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPopularMovies = (Button) findViewById(R.id.button_popular_movies);
        Button buttonStockHawk = (Button) findViewById(R.id.button_stock_hawk);
        Button buttonBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
        Button buttonMakeYourAppMaterial = (Button) findViewById(R.id.button_make_your_app_material);
        Button buttonGoUbiquitous = (Button) findViewById(R.id.button_go_ubiquitous);
        Button buttonCapstone = (Button) findViewById(R.id.button_capstone);

        buttonPopularMovies.setOnClickListener(this);
        buttonStockHawk.setOnClickListener(this);
        buttonBuildItBigger.setOnClickListener(this);
        buttonMakeYourAppMaterial.setOnClickListener(this);
        buttonGoUbiquitous.setOnClickListener(this);
        buttonCapstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v instanceof Button) {
            Toast.makeText(getApplicationContext(), "This button will launch my " + ((Button) v).getText() + " Project!", Toast.LENGTH_SHORT).show();
        }
    }
}
