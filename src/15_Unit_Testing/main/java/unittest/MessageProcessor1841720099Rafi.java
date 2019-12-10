/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

/**
 *
 * @author Ivan Abdurrafie
 */
public class MessageProcessor1841720099Rafi {
    private String sender, recipient, message;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String messageFormatRafi(){ 
        String message = String.format("Hai %s, you have message from %s.\n The Message as Follows  : %s", this.recipient,this.sender,this.message);
        return message;
    }
    
    public void showMessageRafi(){
        System.out.println(messageFormatRafi());
    }
    
}
