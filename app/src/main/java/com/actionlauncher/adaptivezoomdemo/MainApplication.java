package com.actionlauncher.adaptivezoomdemo;

import android.app.Application;
import android.os.SystemClock;

public class MainApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();

    // Stall this demo app's initial boot so the launch screen displays on screen for a time.
    // See https://twitter.com/anddev_badvice before copying this line into your app…
    SystemClock.sleep(1000);
  }

}
