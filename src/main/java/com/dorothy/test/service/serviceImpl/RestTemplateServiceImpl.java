package com.dorothy.test.service.serviceImpl;

import java.util.Map;

import javax.annotation.Resource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dorothy.test.service.serviceItf.RestTemplateService;

@Service("restTemplateService")
public class RestTemplateServiceImpl implements RestTemplateService {
	@Resource(name="restTemplate")
	private RestTemplate restTemplate;
	
	@Override
	public StreamSource getRestDataXml(String url, Class<StreamSource> responseType)
	{
		StreamSource streamSourceResult = restTemplate.getForObject(url, responseType);
		return streamSourceResult;
	}
	
	@Override
	public String getRestDataJson(String url, Class<String> responseType, Map<String, String> urlVariables)
	{
		String jsonResult = restTemplate.getForObject(url, responseType, urlVariables);
		
		return jsonResult;
	}
}
