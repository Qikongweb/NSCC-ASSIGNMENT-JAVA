package ca.prog1400.Classes;

public abstract class Character {
    private String name;
    private int hp;
    private int defense;
    private int agility;
    private int baseAttack;



    private String type;
    //constructor for random stats
    public Character(String name) {
        this.name = name;
    }

    public Character(String name,String type) {
        this.name = name;
        this.type = type;
    }
    //
    public Character(String name, String type,int hp, int defense, int agility, int baseAttack) {
        this.name = name;
        this.hp = hp;
        this.defense = defense;
        this.agility = agility;
        this.baseAttack = baseAttack;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", defense=" + defense +
                ", agility=" + agility +
                ", baseAttack=" + baseAttack +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getDefense() {
        return defense;
    }

    public int getAgility() {
        return agility;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public String getType() {
        return type;
    }

    public void doRandomAbility(){
        this.hp = getRandomBetweenRange(1,100);
        this.defense = getRandomBetweenRange(1,100);
        this.agility = getRandomBetweenRange(1,100);
        this.baseAttack = getRandomBetweenRange(1,100);
    }

    private  int getRandomBetweenRange(int min, int max){
        return (int)((Math.random()*((max-min)+1))+min);
    }




}
