package com.auto.code.generator.specification;

import java.util.HashMap;

import javax.validation.constraints.NotBlank;

/**
 * @author Anshu Mishra
 *
 */
public class ApiSpecification {
	@NotBlank
	private String apiUrl;
	@NotBlank
	private String apiMethodType;
	private BusinessClassSpecification service;
	private BusinessClassSpecification dao;
	private BusinessClassSpecification controller;
	private RequestSepecification apiRequest;
	@NotBlank
	private ResponseSpecification apiResponse;
	private HashMap<String, String> queryParams;
	private String apiName;

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getApiMethodType() {
		return apiMethodType;
	}

	public void setApiMethodType(String apiMethodType) {
		this.apiMethodType = apiMethodType;
	}

	public BusinessClassSpecification getService() {
		return service;
	}

	public void setService(BusinessClassSpecification service) {
		this.service = service;
	}

	public BusinessClassSpecification getController() {
		return controller;
	}

	public void setController(BusinessClassSpecification controller) {
		this.controller = controller;
	}

	public void setDao(BusinessClassSpecification dao) {
		this.dao = dao;
	}

	public BusinessClassSpecification getDao() {
		return dao;
	}

	public RequestSepecification getApiRequest() {
		return apiRequest;
	}

	public void setApiRequest(RequestSepecification apiRequest) {
		this.apiRequest = apiRequest;
	}

	public ResponseSpecification getApiResponse() {
		return apiResponse;
	}

	public void setApiResponse(ResponseSpecification apiResponse) {
		this.apiResponse = apiResponse;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public HashMap<String, String> getQueryParams() {
		return queryParams;
	}

	public void setQueryParams(HashMap<String, String> queryParams) {
		this.queryParams = queryParams;
	}

}
