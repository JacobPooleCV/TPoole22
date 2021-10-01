class starter{
    public static void main(String[] args){
        /*
        - Create a program that takes two input integers.
        - First check if each of these integers are odd or even. Output if they are or not.
        - Then check if they're divisible by 3, 4, and 5. Make sure ALL of these are checked. 
        - Otherwise, output it's not divisible by the following.
        */
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        boolean threeFlag = false;
        boolean fourFlag = false;
        boolean fiveFlag = false;
        
        
        if(x % 2 == 0){
            System.out.println("This is even");
        }
        else{
            System.out.println("This is odd");
        }
        if(y % 2 == 0){
            System.out.println("This is even");
        }
        else{
            System.out.println("This is odd");
        }
        
        if(x % 3 == 0){
            System.out.println("X is divisible by 3");
            threeFlag = true;
        }
        if(x % 4 == 0){
            System.out.println("X is divisible by 4");
            fourFlag = true;
        }
        if(x % 5 == 0){
            System.out.println("X is divisible by 5");
            fiveFlag = true;
        }
        
        if(!threeFlag && !fourFlag && !fiveFlag){
            System.out.println("X is not divisible by 3, 4, or 5.");
        }
        
        
    }
    
    
    
}