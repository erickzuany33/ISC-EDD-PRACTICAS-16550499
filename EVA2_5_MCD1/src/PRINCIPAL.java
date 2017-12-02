/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class PRINCIPAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(MCD(180,48));
        
        
        
    }
    public static int MCD(int iDiv, int iDivisor){
        
        if(iDivisor==0){
            
            return iDiv;
            
        }else{
            int residuo;
            residuo=iDiv%iDivisor;
            return MCD(iDivisor, residuo);
           
        }
        
    }
}
    
    
