/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program_5;

/**
 *
 * @author WINDOWS 10
 */
public class Stack {
    int tos = -1,temp;
    int[] stck = new int[3];
    
    public void push(int el){
        
        try{
            if(tos == 2)
                throw new StackFull("Stack is Full");
            else 
            {
                tos++;
                stck[tos] = el;
            }
        }
        
        catch(StackFull Sf){
            
            Sf.printStackTrace();
        }
    }
    
    public void pop(){
        
        try{
            if(tos == -1)
                throw new StackEmpty("Stack is Empty");
            else 
            {
                temp = stck[tos];
                tos--;
                System.out.println("Element on top of Stack: " + temp);
            }
        }
        
        catch(StackEmpty Se){
            
            Se.printStackTrace();
        }
    }
    
    public void print(){
        
        System.out.println("Stack: ");
        int i = tos;    
        while(i >= 0)
        {
            System.out.println(stck[i]);
            i--;
        }       
    }
}
