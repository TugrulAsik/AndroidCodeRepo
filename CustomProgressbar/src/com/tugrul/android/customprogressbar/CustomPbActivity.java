package com.tugrul.android.customprogressbar;

/**
 * @author Tugrul Asik
 * @Date 07.07.2013
 */

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CustomPbActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custompb);
		
		/*
		 * Progressbar nesnesini ve text'i burada istediginiz duruma gore duzenleyebilirsiniz.
		 * Ornegin arka planda calisan bir islem sonlandiktan sonra pb ve textview'i dismiss yapabilirsiniz
		 */
	}



}
