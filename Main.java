public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int number = 10;
        if(number < 1){
            System.out.println("invalid");
        }else{
            for(int i = 1; i<= number; i++){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}