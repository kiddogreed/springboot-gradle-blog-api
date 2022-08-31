package blog.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//call ResponseStatus annotation
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcemption extends RuntimeException{
  
  private String resourceName;
  private String fieldName;
  private String fieldValue;
   

  //generate contructor
  public ResourceNotFoundExcemption(String resourceName, String fieldName, String fieldValue) {

    //add template string using super class
    super(String.format("%s not found with %s: '%s'",resourceName,fieldName,fieldValue ));
    this.resourceName = resourceName;
    this.fieldName = fieldName;
    this.fieldValue = fieldValue;
  }

 //generate getters for the following variables 
  public String getResourceName() {
    return resourceName;
  }


  public String getFieldName() {
    return fieldName;
  }


  public String getFieldValue() {
    return fieldValue;
  }

 
  

  
}
