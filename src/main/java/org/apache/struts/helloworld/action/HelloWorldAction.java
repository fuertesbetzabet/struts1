
package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.MessageStore;

/**
 *
 * @author BETZABET
 */
public class HelloWorldAction extends ActionSupport {
     private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;

    public String execute() {
        messageStore = new MessageStore();
        if (userName != null) {
            messageStore.setMessage(messageStore.getMessage()+ " " + userName);
        }
        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }
    
    public int getHelloCount() {
        return helloCount;
    }
    
    public void setHelloCount(int helloCount) {
        HelloWorldAction.helloCount = helloCount;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUsername(String userName) {
        this.userName = userName;
    }

}
