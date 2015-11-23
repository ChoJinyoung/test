package com.dorothy.test.controller;

import java.io.IOException;
import java.net.URLDecoder;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.XmlMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dorothy.test.service.convert.MarShallingConverter;
import com.dorothy.test.service.serviceItf.RestTemplateService;
import com.dorothy.test.vo.SearchResultTbCase;

@Controller
@RequestMapping("/main")
public class OpenApiController {

	@Autowired
	@Resource(name = "restTemplateService")
	private RestTemplateService restTemplateService;

	@Autowired
	@Resource(name = "marshallingConverter")
	MarShallingConverter marshallingConverter;

	@RequestMapping("/searchForm")
	public String searchForm(Model model) throws XmlMappingException, IOException {
		String ServiceKey=URLDecoder.decode("Y%2F%2B8QM9fybwGiks8s1VgspVQNert5%2FG4DhQhS0LvXzCuOmCpubrUUs%2BR5OoOE4UwSbgAwOUrRxXMzbYnuPP7Jw%3D%3D","UTF-8");
		//ServiceKey=URLEncoder.encode(ServiceKey,"UTF-8");
		String url="http://openapi.tago.go.kr/openapi/service/TrainInfoService/getCtyCodeList?serviceKey="+ServiceKey;
		
		StreamSource streamSourceResult = restTemplateService.getRestDataXml(
				url, StreamSource.class);
		SearchResultTbCase vo = marshallingConverter.unmarshalling(streamSourceResult);
		
		model.addAttribute("vo", vo);
		
		
		return "/ecgSearchForm";
	}
}
