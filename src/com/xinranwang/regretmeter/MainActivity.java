package com.xinranwang.regretmeter;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity implements OnClickListener {
	Button addButton; 
	ListView stillRegrettingList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addButton = (Button) this.findViewById(R.id.add_button);
		stillRegrettingList = (ListView) this.findViewById(R.id.regreting_view);
		
		addButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if(v == addButton) {
			Intent i = new Intent(this, AddRegret.class);
			startActivity(i);
		}
	}

}
