package com.dorothy.test.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@XmlAccessorType(XmlAccessType.FIELD)
public class ItemsVo {
	
	@XmlElement(name="items")
	private ListVo items;

	public ListVo getItems() {
		return items;
	}

	public void setItems(ListVo items) {
		this.items = items;
	}
}
