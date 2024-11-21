
package org.apache.struts.register.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.register.model.Person;
import org.apache.struts2.interceptor.parameter.StrutsParameter;

/**
 *
 * @author BETZABET
 */
//fuertes apaza betzabet
public class Register extends ActionSupport{
     private static final long serialVersionUID = 1L;
    
    private Person personBean;


     @Override
    public String execute() throws Exception {
        //call Service class to store personBean's state in database
        
        return SUCCESS;
    }

    @StrutsParameter(depth = 1)
    public Person getPersonBean() {
        return personBean;
    }
    
    public void setPersonBean(Person person) {
        personBean = person;
    }
}
