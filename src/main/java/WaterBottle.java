public class WaterBottle {
    private int volume;

    public WaterBottle (){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

  //  Add a drink function that takes 10 from the volume each time it is called.

    public int drink(){
        return this.volume -= 10;
    }

   //Create an empty function that brings the volume down to 0

   public int empty(){
        return this.volume - this.volume;
   }

   // Create a fill function that fills the volume back to 100
    public int refill(){
        return this.volume = 100;
    }
}
