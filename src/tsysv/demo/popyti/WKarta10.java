package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class WKarta10 extends Activity {
	
	ImageView im11;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wkarta010);
		
	//	RelativeLayout ll = (RelativeLayout) findViewById(R.id.f02);
	//	ll.setBackgroundResource(R.drawable.f02);
		
		im11 = (ImageView) findViewById(R.id.wkarta0100);
		

		
		
		im11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//	 Intent ii = new Intent(getApplicationContext(), Karta010.class);
	        //        startActivity(ii);
				//Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_LONG).show();
				 Intent ii = new Intent(getApplicationContext(), WKarta11.class);
	               startActivity(ii);
				Log.v("wKArTa10", " 1 button");
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
