
public class Tute_1 {

    public static String q1_num(int value) {
        String number = "";
        switch(value) {
            case 0:
                number = "Zero";
                break;
            case 1:
                number = "One";
                break;
            case 2:
                number = "Two";
                break;
            case 3:
                number = "Three";
                break; 
            case 4:
                number = "Four";
                break;
            case 5:
                number = "Five";
                break;
            case 6:
                number = "Six";
                break;    
            case 7:
                number = "Seven";
                break;
            case 8:
                number = "Eight";
                break;
            case 9:
                number = "Nine";
                break;  
            case 10:
                number = "Ten";
                break;      
            default:
              number = "?";
          }

        return number;
    }

    public static String q_1_num_stringarray(int value) {
        String[] string_array = {"Zero", "One", "Two", "Three", "Four", 
        "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        return string_array[value];
    }

    public static int fib(int value) {
           
        if (value <= 1){
            return value;
          }
          return fib(value-1) + fib(value-2);
    }

    public static void main( String args[] ) {
    //    String number_as_word = q1_num(11);
    //    System.out.println(number_as_word);
    String number_as_word = q_1_num_stringarray(4);
    System.out.println(number_as_word);

    }
        // int total = 4;
        //  for (int i= 0; i < total; i++)
        //     {System.out.print(fib(i) + " ");}
}




