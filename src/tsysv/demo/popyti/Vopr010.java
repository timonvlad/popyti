package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class Vopr010 extends Activity {
	
	ImageView im11, im12;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.vopr010);
		
	//	RelativeLayout ll = (RelativeLayout) findViewById(R.id.f02);
	//	ll.setBackgroundResource(R.drawable.f02);
		
		im11 = (ImageView) findViewById(R.id.vopr10);

		
		
		im11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			//	 Intent ii = new Intent(getApplicationContext(), Profile22.class);
	        //        startActivity(ii);
				//Toast.makeText(getApplicationContext(), "First", Toast.LENGTH_LONG).show();
				Log.v("vopr1", " 1 button");
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
