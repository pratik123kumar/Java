//  Marks checker


import java.util.* ;


class marks_checker{
    public static void main(String[] args) {
         
        
        System.out.println("Please select a number from below : \n ");
        System.out.println("1. Please enter your marks ");
        System.out.println("2. Quit");
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        if( a == 1){
            System.out.println("Now enter your marks");
            
            int Marks = sc.nextInt();
            
            if(Marks >=90){
             System.out.println("This is very good");
            } else if (  Marks >=60 && Marks <=89){
                System.out.println("This is good");
            } else if (  Marks <= 59 ){
                System.out.println(" You need more hard work");
            }else{
                System.out.println("Inavlid operation");
            }
             
            
            
            
        }else if ( a == 2 ){
            System.out.println("You chose to exit ");
        }else{
            System.out.println("Invalid operation");
        }
        
        
         
    }
}
