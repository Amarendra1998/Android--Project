package com.example.amarendra.newconditioner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Adapter;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;


public class Sale extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {
       TextView selection,selection2,selection3;
       EditText e2;
    Button b;
    String[]model={"medium (2000 rupees)","small(1000 rupees)","long(4000 rupees)"};
    String[]company={"xiomi","nokia","micromax"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale);
        addListenerOnButton();

        selection=(TextView)findViewById(R.id.textView4);
        Spinner spin =(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter <String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,model);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


        selection2=(TextView)findViewById(R.id.textView5);
        Spinner sp =(Spinner)findViewById(R.id.spinner2) ;
        sp.setOnItemSelectedListener(this);
        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter <String> bb = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,company);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        sp.setAdapter(bb);

    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(),model[position] ,Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),company[position] ,Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        Toast.makeText(getApplicationContext(),"you didn't select any item" ,Toast.LENGTH_LONG).show();

    }
    public void addListenerOnButton(){
        e2=(EditText)findViewById(R.id.editText);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view) {
                String value = e2.getText().toString();
                Toast.makeText(getApplicationContext(),"you have purchased your clicked items" ,Toast.LENGTH_LONG).show();
            }

        });
    }

    }

