import java.util.Random;

class Main {
  public static void main(String[] args) {
    Random r = new Random();
    
// Generates the random number
    int randomNum = r.nextInt(50) +1;
    int countDown;
    System.out.println("The Random number is:" +randomNum);
    //Save generated number
    countDown = randomNum;
    
if (countDown >=0){
    while(randomNum >=0 ){
      System.out.println(randomNum);
      randomNum--;
    }
}
    //0-5 msg
    if (countDown <= 5){
      
      System.out.println("Ahoy Mateys!");
    }
    //25-42 msg
    else if (countDown >25 & countDown < 42){
      System.out.println("Cannonball!");
    }
    //if its not in either of those msg
    else {
      System.out.println("Blast Off!");
    }

  }
}