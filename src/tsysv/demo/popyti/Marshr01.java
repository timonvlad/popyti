package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class Marshr01 extends Activity {
	
	ImageView im11,im12,im13;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.marshr01);
		
	//	RelativeLayout ll = (RelativeLayout) findViewById(R.id.f02);
	//	ll.setBackgroundResource(R.drawable.f02);
		
		im11 = (ImageView) findViewById(R.id.marshr010);
		im12 = (ImageView) findViewById(R.id.marshr011);
		im13 = (ImageView) findViewById(R.id.marshr012);
		
		
		im11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				//Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_LONG).show();
				Log.v("Mmarshr01", " 1 button");
				 Intent ii = new Intent(getApplicationContext(), Marshr02.class);
	                startActivity(ii);
	 
	                // close this activity
	                finish();
			}
		});

		
		im12.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				//Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_LONG).show();
				Log.v("Mmarshr01", " 2 button");
				 Intent ii = new Intent(getApplicationContext(), Marshr05.class);
	                startActivity(ii);
	 
	                // close this activity
	                finish();
			}
		});

		
		im13.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				//Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_LONG).show();
				Log.v("Mmarshr01", " 3 button");
				 Intent ii = new Intent(getApplicationContext(), Marshr03.class);
	              startActivity(ii);
	 
	                // close this activity
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
