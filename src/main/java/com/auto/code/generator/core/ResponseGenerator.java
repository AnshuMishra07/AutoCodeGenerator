package com.auto.code.generator.core;

import com.auto.code.generator.specification.ApiSpecification;
import com.sun.codemodel.JCodeModel;

/**
 * @author Anshu Mishra
 *
 */
public class ResponseGenerator extends BaseDomainGenerator {

	public void generateResponse(JCodeModel codeModel, ApiSpecification specification, String basePackage,
			String autoGeneRatedFilePath) throws Exception {
		// Create a new package
		if (specification != null && specification.getApiResponse() != null) {
			String className = specification.getApiName() + "Response";
			generateCore(codeModel, className, specification.getApiResponse().getFields(), basePackage, specification,
					autoGeneRatedFilePath);

		}
	}

}
