package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class Karta021 extends Activity {
	
	ImageView im11;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.karta021);
		

		
		im11 = (ImageView) findViewById(R.id.karta0210);

		
		
		im11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			
				//Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_LONG).show();
				Log.v("KArTa021", " 1 button");
				 Intent ii = new Intent(getApplicationContext(), Karta022.class);
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
