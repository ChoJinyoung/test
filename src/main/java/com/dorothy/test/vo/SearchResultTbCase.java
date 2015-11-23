package com.dorothy.test.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="response")
public class SearchResultTbCase {
	
	@XmlElement(name="body")
	private ItemsVo section;
	
	@XmlElement(name="header")
	private ResultVo resultVo;
	
	
	public ItemsVo getSection() {
		return section;
	}

	public void setSection(ItemsVo section) {
		this.section = section;
	}

	public ResultVo getResultVo() {
		return resultVo;
	}

	public void setResultVo(ResultVo resultVo) {
		this.resultVo = resultVo;
	}
	
	
}
