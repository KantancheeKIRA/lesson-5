public class methpds {

    //Method with no parameters
    //Always put this aboove the run deu=beg thing
    public static void exampleMethod(){
        System.out.println("Ken smells like doodoo");

        //Void () between those u can write anything else not just the main thing
        //access mod is the public or private (mostly priavet)
        
    }

    //Method with parameters
    public static void printAddition(int num1, int num2){
        System.out.println(num1+num2);
            
    }

    //Method with return type
    public static String capitliString(String string){

        return string.toUpperCase();
    }
    
    //Method with DELAY
    public static void DELAY(int mileseconds){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        

    }

    


    //
        


public static void main(String[] args ){





}

}