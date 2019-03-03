package ca.prog1400;

public class Main {
    public static void main(String[] args) {

    Animal [] zoo  = new Animal[3];
    Animal zebra = new Animal("Zebra",300,"Savanah",true);
    Animal gorilla = new Animal("Gorilla",400,"Jungle",false);
    Animal giraffe = new Animal("Giraffe",250,"Savanah",true);
    zoo[0] = zebra;
    zoo[1] = gorilla;
    zoo[2] = giraffe;

    for(Animal animal : zoo){
      if(animal.isEndagered()){
          System.out.println(animal.feed("Nice food"));
      }else{
          System.out.println(animal.makaASound());
      }
    }

 }

}
