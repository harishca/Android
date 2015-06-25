package com.example.autoride;

import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class LaunchActivity extends AppCompatActivity implements OnItemSelectedListener,OnClickListener{
	Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_activity);
        go = (Button) findViewById(R.id.go);
        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        Spinner dropdown1 = (Spinner)findViewById(R.id.spinner2);
        List<String> items = new ArrayList<String>();
        items.add("KA");
        items.add("MY");
        List<String> numbers = new ArrayList<String>();
        Integer n = 00;
        while(n<100){
        	
        	numbers.add(String.format("%02d", n));
        	n++;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, items);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, numbers);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        dropdown1.setAdapter(adapter1);
        go.setOnClickListener(this);
        
    }

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		String item = parent.getItemAtPosition(position).toString();
		Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		startActivity(new Intent("com.example.autoride.DISPLAYACTIVITY"));
	}
}
