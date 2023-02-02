package perfectnumber;

public class examp {
    public static void main(String[] args){
        //Write java code to find perfect numbers from 1 to 500.
        int number = 1;
        while (number <= 500){
            int sun = 0;
            for(int i = 1; i < number; i++){
                if(number % i ==0) {
                    sun += i;

                }



            }
            if(sun == number){
                System.out.println(number + "Mükemmel Sayıdır");

            }
            number++;
        }






    }
}
