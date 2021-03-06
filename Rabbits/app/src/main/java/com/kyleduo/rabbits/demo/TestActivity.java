package com.kyleduo.rabbits.demo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.kyleduo.rabbits.Rabbit;
import com.kyleduo.rabbits.annotations.Page;
import com.kyleduo.rabbits.demo.base.BaseActivity;

@Page(name = "TEST")
public class TestActivity extends BaseActivity {

	@SuppressLint("SetTextI18n")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);

		TextView tv = (TextView) findViewById(R.id.params_tv);
		tv.setText("testing: " + getIntent().getStringExtra("testing"));

		findViewById(R.id.back_home_bt).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Rabbit.from(TestActivity.this)
						.to("")
						.clearTop()
						.start();
			}
		});
	}
}
