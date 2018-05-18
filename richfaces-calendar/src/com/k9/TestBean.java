package com.k9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class TestBean {

	private Date selectedDate;
	private TimeZone timeZone;
	private String displayDate;

	public Date getSelectedDate() {
		return selectedDate;
	}

	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = TimeZone.getDefault();
	}

	public String getDisplayDate() {
		return displayDate;
	}

	public void setDisplayDate(String displayDate) {
		this.displayDate = displayDate;
	}

	public String display() {
		System.out.println(selectedDate);
		DateFormat dateFormat = new SimpleDateFormat("MMM-dd-yyyy");
		displayDate = dateFormat.format(selectedDate);
		return "second";
	}

}
