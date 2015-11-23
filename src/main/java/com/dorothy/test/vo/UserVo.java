package com.dorothy.test.vo;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="users")
public class UserVo {
	
	@XmlElement(name="user")
	private List<ElementVo> list;

	public List<ElementVo> getList() {
		return list;
	}

	public void setList(List<ElementVo> list) {
		this.list = list;
	}
	
	
	
	
}
