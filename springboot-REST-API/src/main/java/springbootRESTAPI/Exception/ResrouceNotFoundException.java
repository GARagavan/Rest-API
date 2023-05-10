package springbootRESTAPI.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResrouceNotFoundException extends RuntimeException {
	
	private String resourceName;
	private String fieldName;
	private Integer fieldValue;
	
	public ResrouceNotFoundException(String resourceName, String fieldName, Integer fieldValue) {
		super(String.format("%s not found with %s:'%s'",resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResourceName() {
		return resourceName;
	}

	

	public String getFieldName() {
		return fieldName;
	}

	

	public Integer getFieldValue() {
		return fieldValue;
	}

	
	
	

}
