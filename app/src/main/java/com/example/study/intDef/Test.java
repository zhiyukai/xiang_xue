package com.example.study.intDef;

import androidx.annotation.DrawableRes;
import androidx.annotation.IntDef;

import com.example.study.R;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test {


  private static final int SUNDAY = 0;
  private static final int MONDAY = 1;
  private static WeekDay mCurrentDay;
//  @WekDay
  private static int mCurrentIntDay;

  //每一个成员就是一个Wek对象
  enum WeekDay {
    SUNDAY, MONDAY
  }

//  @IntDef({SUNDAY, MONDAY})
//  @Target({ElementType.FIELD, ElementType.PARAMETER})
//  @Retention(RetentionPolicy.SOURCE)
//  @interface WekDay {  //注解
//
//  }


  public static void setCurrentDay(WeekDay currentDay) {
    mCurrentDay = currentDay;
  }

  public static void setDrawable(@DrawableRes int id) {

  }

  public static void main(String[] args) {
//    setDrawable(111);
    setDrawable(R.drawable.ic_launcher_background);
  }
}
