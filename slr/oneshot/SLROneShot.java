/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slr.oneshot;

/**
 *
 * @author Carlos Chavarría
 */

import jade.core.Agent; 
import jade.core.behaviours.OneShotBehaviour;
        
public class SLROneShot extends Agent{
    
    private static final long serialVersionUID =1L;
    
    protected void setup(){
         System.out.println("Agent " + getLocalName() + "started.");
        addBehaviour(new MyOneShotBehaviour());
    }
    
    private class MyOneShotBehaviour extends OneShotBehaviour {
        
          private static final long serialVersionUID = 1L;
          
            public void action (){
                    
                // X: independent variables
                double[] independents = {23, 26, 30, 34, 43, 48, 52, 57, 58}; 
                //Y: dependent variables
                double[] dependents = {651, 762, 856, 1063, 1190, 1298, 1421, 1440, 1518}; 
                
                DS dsx = new DS(independents);
                DSY dsy = new DSY(dependents);
                Procedure slr = new Procedure(dsx, dsy);
                slr.Prediction();
            }    
          
        public int onEnd(){
            myAgent.doDelete();
            return super.onEnd();
        }  
    }
}
    