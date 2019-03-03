package ca.prog1400;

/**
 *  Class of Animal in the zoo.
 */
public class Animal {
    private String species;  // required
    private double maxWeight; //not required. 0 / -1
    private String habitat;  // required
    private boolean isEndagered; // not required, defulat = false;


    // Default Constructor: supplying empty values.
    public Animal(){
        this.species = null;
        this.maxWeight = 0;
        this.habitat = null;
        this.isEndagered = false;
    }


    // Standard Constructor: parameters for each attribute
    public Animal(String species, double maxWeight, String habitat, boolean isEndagered) {
        this.species = species;
        this.maxWeight = maxWeight;
        this.habitat = habitat;
        this.isEndagered = isEndagered;
    }
    // Feed this aminal
    public String feed(String food){
        maxWeight += food.length();
        return String.format("NOM NOM NOM. I ate the %s",food);
    }
    // Make a sound
    public String makaASound(){
        return String.format("I am a %s and I made a sound.", this.species);
    }
    //To string
    public String toString(){
        String returnValue = "";
        returnValue = String.format("I am a %s tiger that lives in the %s. ",
                    this.species,this.habitat);

        if(isEndagered){
            returnValue = "I am an endangered species.";
        }

        return returnValue;
    }






    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if(species != null && !species.equals("")){
            this.species = species;
        }
    }
    // Max Weight is read-only.
    public double getMaxWeight() {
        return maxWeight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(habitat != null && !habitat.equals("")){
            this.habitat = habitat;
        }
    }

    public boolean isEndagered() {
        return isEndagered;
    }

    public void setEndagered(boolean endagered) {
        isEndagered = endagered;
    }
}
