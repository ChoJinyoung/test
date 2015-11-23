package com.dorothy.test.service.convert;

import java.io.IOException;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;

import com.dorothy.test.vo.ItemsVo;
import com.dorothy.test.vo.SearchResultTbCase;
import com.dorothy.test.vo.UserVo;

public class MarShallingConverter {
	
	
	@Resource(name="jaxb2Marshaller")
	private Marshaller marshaller;
	
	@Resource(name="jaxb2Marshaller")
	private Unmarshaller unmarshaller;
	
	public SearchResultTbCase unmarshalling(StreamSource streamSource) throws XmlMappingException, IOException
	{
		StreamSource source = streamSource;
		return (SearchResultTbCase) unmarshaller.unmarshal(source);
	}
}
