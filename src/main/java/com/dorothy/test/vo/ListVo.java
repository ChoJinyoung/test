package com.dorothy.test.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@XmlAccessorType(XmlAccessType.FIELD)
public class ListVo {
	

	@XmlElement(name="item")
	private List<RailVo> list;

	public List<RailVo> getList() {
		return list;
	}

	public void setList(List<RailVo> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ListVo [list=" + list + "]";
	}
	
	
}
