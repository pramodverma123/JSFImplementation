package com.k9;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class TestBean {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
