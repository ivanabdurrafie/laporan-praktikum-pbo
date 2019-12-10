/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import backend.Anggota1841720099RafiTest;
import backend.Kategori1841720099RafiTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Ivan Abdurrafie
 */


public class TestRunner1841720099Rafi {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720099Rafi.class);
        showMessageResult(mResult, MessageProcessorTest1841720099Rafi.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720099RafiTest.class);
        showMessageResult(mResult, Kategori1841720099RafiTest.class.getSimpleName());
        
          mResult = JUnitCore.runClasses(Anggota1841720099RafiTest.class);
        showMessageResult(mResult, Anggota1841720099RafiTest.class.getSimpleName());
    }
    
    private static void showMessageResult(Result rs,String className){
        if(rs.wasSuccessful()){
            System.out.format("The Result Test From %s : %s\n",className,rs.wasSuccessful());
        }else {
            for (Failure failure : rs.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
