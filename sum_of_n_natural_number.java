//  sum of n natural numbers


import java.util.* ;


class sum_of_n_natural_numbers {
    public static void main(String[] args) {
        System.out.println("Hello, World! "); 
        
        System.out.println("Enter your number below :");
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        int n = a * (a + 1) / 2 ;
        
        System.out.println(n);
    }
}
