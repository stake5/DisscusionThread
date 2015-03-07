/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.james.discussionthread.files;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author stake
 */
public class DateTime {
 
  public static String getDateTime() {
 
	   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
 
	   //get current date time with Calendar()
	   Calendar cal = Calendar.getInstance();
	   return (dateFormat.format(cal.getTime()));
  }

}
