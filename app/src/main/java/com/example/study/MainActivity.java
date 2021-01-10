package com.example.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.study.inject.InjectUtils;
import com.example.study.inject.InjectView;
import com.example.study.intent.A;
import com.example.study.zhujie.Test1Annotation;

@Test1Annotation(value = 1, id = "qaz")
public class MainActivity extends Activity {

  @InjectView(values = R.id.tv_test)
  TextView tv;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    InjectUtils.injectView(this);

    tv.setText("where are you.");

    Intent intent = new Intent(this, A.class);
    intent.putExtra("key1", "value1");
    intent.putExtra("key2", "value2");
    intent.putExtra("key3", "value3");
    intent.putExtra("key4", "value4");
    intent.putExtra("key5", "value5");
    intent.putExtra("key6", "value6");
    intent.putExtra("key7", "value7");
    intent.putExtra("array", new int[]{1, 2, 3, 4, 5, 6});
    startActivity(intent);
  }
}