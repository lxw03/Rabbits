package com.kyleduo.rabbits.demo;

import android.app.Application;

import com.kyleduo.rabbits.Rabbit;

/**
 * Created by kyle on 2016/12/8.
 */

public class DemoApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Rabbit.setup(this, "demo");
	}
}
