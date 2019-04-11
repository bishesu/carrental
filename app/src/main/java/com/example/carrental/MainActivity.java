package com.example.carrental;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Year;

public class MainActivity extends AppCompatActivity {
    EditText make, year, color, price, engine;
    TextView resultmake, resultyear, resultcolor, resultpurchase, resultengine, scroll;
    Button createcar, createdisel;
    GetSet getSet = new GetSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        make = findViewById(R.id.et_make);
        year = findViewById(R.id.et_year);
        color = findViewById(R.id.et_color);
        price = findViewById(R.id.et_price);
        engine = findViewById(R.id.et_engine);

        createcar = findViewById(R.id.btn_createcar);
        createdisel = findViewById(R.id.btn_createdisel);
        scroll = findViewById(R.id.tv_scroll);

        createcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSet.setMake(make.getText().toString());
                getSet.setColor(color.getText().toString());
                getSet.setYear(year.getText().toString());
                getSet.setPrice(price.getText().toString());
                getSet.setEngine(engine.getText().toString());

                String values = "\r\n" +
                        "\r\n" + scroll.getText() +
                        "\r\n"  + " the Vechile is manufactured by :"+ getSet.getMake() +
                        "\r\n" + "Color :" + getSet.getColor() +
                        "\r\n" + "year manufactured :" + getSet.getYear() +
                        "\r\n" + "Price : " + getSet.getPrice() +
                        "\r\n" + "Petrol capacity : " + getSet.getEngine() +
                        "\r\n";

                scroll.setText(values);


            }
        });
    }
}
