package com.tugrul.android.countdowntimer;

/**
 * @author Tugrul Asik
 * @Date 06-JULY-2013
 */

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CountdownActivity extends Activity implements OnClickListener {

	private CountDownTimer geriyeSayici;	
	
	//Ne kadar sure geriye sayacak
	private final long baslangic = 10 * 1000;
	
	//Hangi araliklarla gosterecek
	private final long aralik = 1 * 1000;
	
	private boolean baslatildi = false;
	private Button btn_baslat;
	public TextView tv_kalanSure;
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_countdown);
		
		btn_baslat = (Button) this.findViewById(R.id.button);
		btn_baslat.setOnClickListener(this);
		
		tv_kalanSure = (TextView) this.findViewById(R.id.timer);
		
		
		geriyeSayici = new MyCountDownTimer(baslangic, aralik);
		tv_kalanSure.setText(tv_kalanSure.getText() + String.valueOf(baslangic / 1000));

	}

	

	public class MyCountDownTimer extends CountDownTimer {
		public MyCountDownTimer(long startTime, long interval) {
			super(startTime, interval);
		}

		/*
		 * Zaman bittiginde calisir
		 */
		@Override
		public void onFinish() {
			
			tv_kalanSure.setText("Zaman Bitti ! - Time is UP !");
		}

		@Override
		public void onTick(long millisUntilFinished) {
			//Saniye olarak goster  1 saniye = 1000 millis
			tv_kalanSure.setText("" + millisUntilFinished / 1000);
		}
	}

	@Override
	public void onClick(View v) {
		if (!baslatildi) {
			geriyeSayici.start();
			baslatildi = true;
			btn_baslat.setText("DUR");
		} else {
			geriyeSayici.cancel();
			baslatildi = false;
			btn_baslat.setText("YENIDEN BASLAT");
		}
	}

}
