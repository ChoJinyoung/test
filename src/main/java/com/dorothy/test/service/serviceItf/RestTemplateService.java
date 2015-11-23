package com.dorothy.test.service.serviceItf;

import java.util.Map;

import javax.xml.transform.stream.StreamSource;

public interface RestTemplateService
{
	public StreamSource getRestDataXml(String url, Class<StreamSource> responseType);
	public String getRestDataJson(String url, Class<String> responseType, Map<String, String> urlVariables);
}
