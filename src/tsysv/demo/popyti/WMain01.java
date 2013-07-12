package tsysv.demo.popyti;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class WMain01 extends Activity {
	
	ImageView main01, main02, main03, main04, karta01, rezhim01,mess01,actmar01;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wmain01);
		
		main01 = (ImageView) findViewById(R.id.wmain01);
		main02 = (ImageView) findViewById(R.id.wmain02);
		main03 = (ImageView) findViewById(R.id.wmain03);
		main04 = (ImageView) findViewById(R.id.wmain04);
		karta01 = (ImageView) findViewById(R.id.wkarta01);
		rezhim01 = (ImageView) findViewById(R.id.wrezhim01);
		mess01 = (ImageView) findViewById(R.id.wmess01);
		actmar01 = (ImageView) findViewById(R.id.wactmar01);
		
		
		main01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 1 button");
				 Intent ii = new Intent(getApplicationContext(), Vopr01.class);
	                startActivity(ii);
			} 
		});
   
		
		
		main02.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 2 button");
				 Intent ii = new Intent(getApplicationContext(), Sloi01.class);
	                startActivity(ii);
			}
		});

		
		main03.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 3 button marshr");
				 Intent ii = new Intent(getApplicationContext(), Marshr01.class);
	                startActivity(ii);
			}
		});

		
		main04.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " 4 button");
				 Intent ii = new Intent(getApplicationContext(), Menu00.class);
	                startActivity(ii);
			}
		});



		
		karta01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " KARTA");
				 Intent ii = new Intent(getApplicationContext(), WKarta01.class);
	                startActivity(ii);
			}
		});

		
		rezhim01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " REZHIM");
				 Intent ii = new Intent(getApplicationContext(), Main01.class);
	                startActivity(ii);
	                finish();
			}
		});
		
		mess01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " MESSAGES");
				 Intent ii = new Intent(getApplicationContext(), Mess01.class);
	                startActivity(ii);
			}
		});
		
		actmar01.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Log.v("Main01", " ACTIVE MARSHR");
				 Intent ii = new Intent(getApplicationContext(), Marshr03.class);
	              startActivity(ii);
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
