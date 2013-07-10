package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class Main01 extends Activity {
	
	ImageView main01, main02, main03, main04;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main01);
		
		main01 = (ImageView) findViewById(R.id.main01);
		main02 = (ImageView) findViewById(R.id.main02);
		main03 = (ImageView) findViewById(R.id.main03);
		main04 = (ImageView) findViewById(R.id.main04);
		
		main01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 1 button");
			} 
		});
   
		
		
		main02.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 2 button");
			}
		});

		
		main03.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 3 button");
			}
		});

		
		main04.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 4 button");
			}
		});


		
		
	//	RelativeLayout ll = (RelativeLayout) findViewById(R.id.f02);
	//	ll.setBackgroundResource(R.drawable.f02);
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
