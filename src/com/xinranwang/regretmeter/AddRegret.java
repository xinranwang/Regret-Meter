package com.xinranwang.regretmeter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddRegret extends Activity implements OnClickListener {
	
	EditText regret;
	Button cancelButton;
	Button addButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_regret);
		
		regret = (EditText) this.findViewById(R.id.regret_input);
		cancelButton = (Button) this.findViewById(R.id.cancel_input_regret_button);
		addButton = (Button) this.findViewById(R.id.add_regret_button);
		
		cancelButton.setOnClickListener(this);
		addButton.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_regret, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		if (v == cancelButton) {
			finish();
		} else if (v == addButton) {
			Toast t = Toast.makeText(this,"Add Button Clicked!",Toast.LENGTH_SHORT);
			t.show();
		}
		
	}

}
