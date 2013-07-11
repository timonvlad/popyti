package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class Menu00 extends Activity {
	
	ImageView im11,im12,im13,im14;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu00);
		
	//	RelativeLayout ll = (RelativeLayout) findViewById(R.id.f02);
	//	ll.setBackgroundResource(R.drawable.f02);
		
		im11 = (ImageView) findViewById(R.id.menu02);
		im12 = (ImageView) findViewById(R.id.menu03);
		im13 = (ImageView) findViewById(R.id.menu04);
		im14 = (ImageView) findViewById(R.id.menu05);

		
		
		im11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v("menu00", " 1 button");
				 Intent ii = new Intent(getApplicationContext(), Profile20.class);
	                startActivity(ii);
	                finish();
			}
		});
		
		
		im12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v("menu00", " 2 button");
				 Intent ii = new Intent(getApplicationContext(), Menu10.class);
	                startActivity(ii);
	                finish();
			}
		});
		
		
		im13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v("menu00", " 3 button");
				 Intent ii = new Intent(getApplicationContext(), Menu20.class);
	                startActivity(ii);
	                finish();
			}
		});
		
		
		im14.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v("menu00", " 4 button");
				 Intent ii = new Intent(getApplicationContext(), Menu30.class);
	                startActivity(ii);
	                finish();
			}
		});
		

		
			
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
