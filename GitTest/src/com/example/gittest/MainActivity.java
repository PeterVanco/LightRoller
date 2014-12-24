package com.example.gittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	int a = 5;
	int b = 6;
	int c;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// ZMENA 6
		
		c = a - b; // minus - prevzate z pullu
		c = a * a;
		
		int d; // lokalna zmena pred branchom a po edite na githube v mastrovi
		int masterBranch = 1;
		masterBranch--; // decrement
		
		boolean finallyMerged = true;
	}
	
	public void myBranchFunction() {
		b = 7;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(item);
	}

}
