/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Ivan Abdurrafie
 */


public class MessageProcessorTest1841720099Rafi {
    MessageProcessor1841720099Rafi mp;

    public MessageProcessorTest1841720099Rafi() {
        mp = new MessageProcessor1841720099Rafi();
        mp.setSender("Ronaldo");
        mp.setRecipient("Rafael");
        mp.setMessage("Whats up bro?");
    }
    
   @Test
    public void testShowMessageRafi(){
        String expectedResult = "Hai Rafael, you have message from ronaldo. \n The message as follows: whats up bro?";
        Assert.assertEquals(expectedResult, mp.messageFormatRafi());
    }
    
}
