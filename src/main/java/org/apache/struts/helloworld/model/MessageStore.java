
package org.apache.struts.helloworld.model;

/**
 *
 * @author BETZABET
 */
public class MessageStore {
        private String message;

    public MessageStore() {
        setMessage("BIENVENIDO ");
    }

    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String toString() {
        return message + " es una cadena";
    }
}
