package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class Menu13 extends Activity {
	
	ImageView im11;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu13);
		
	//	RelativeLayout ll = (RelativeLayout) findViewById(R.id.f02);
	//	ll.setBackgroundResource(R.drawable.f02);
		
		im11 = (ImageView) findViewById(R.id.menu13);


		
		
		im11.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.v("menu13", " 1 button");
			//	 Intent ii = new Intent(getApplicationContext(), Menu13.class);
	        //        startActivity(ii);
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
