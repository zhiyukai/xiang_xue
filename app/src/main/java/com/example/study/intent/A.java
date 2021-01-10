package com.example.study.intent;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.study.R;
import com.example.study.inject.InjectExtra;
import com.example.study.inject.InjectUtils;

import java.util.Arrays;

public class A extends Activity {

  private static final String TAG = A.class.getSimpleName();

  @InjectExtra("key1")
  String key1;

  @InjectExtra("")
  String key2;

  @InjectExtra("key3")
  String key3;

  @InjectExtra("key4")
  String key4;

  @InjectExtra("key5")
  String key5;

  @InjectExtra("")
  int[] array;

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_a);
    InjectUtils.injectAutowired(this);
    Log.d(TAG, toString());
  }

  @Override
  public String toString() {
    return "A{" +
            "key1='" + key1 + '\'' +
            ", key2='" + key2 + '\'' +
            ", key3='" + key3 + '\'' +
            ", key4='" + key4 + '\'' +
            ", key5='" + key5 + '\'' +
            ", array=" + Arrays.toString(array) +
            '}';
  }
}
