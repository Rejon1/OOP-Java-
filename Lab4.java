public class Lab4 
{ 
    public static void main(String[] args)  
    { 
        int a = 14; 
        int b = 60;//Q-4: Swap two variable without using a third variable. 
         
        System.out.println("Before Swapping."); 
        System.out.println ("a = " +a); 
        System.out.println ("b = " +b); 
         
        a = a+b; 
        b = a-b; 
        a = a-b; 
         
        System.out.println("After Swapping."); 
        System.out.println ("a = " +a); 
        System.out.println ("b = " +b); 
    }   
}
