package ca.prog1400;

public abstract class Character {
    private String name;
    private int hp;
    private int defense;
    private int agility;
    private int baseAttack;



    private String type;

    public Character(String name) {
        this.name = name;
        this.hp = getRandomBetweenRange(1,300);
        this.defense = getRandomBetweenRange(1,300);
        this.agility = getRandomBetweenRange(1,300);
        this.baseAttack = getRandomBetweenRange(1,300);
    }

    public Character(String name,String type) {
        this.name = name;
        this.type = type;
        this.hp = getRandomBetweenRange(1,300);
        this.defense = getRandomBetweenRange(1,300);
        this.agility = getRandomBetweenRange(1,300);
        this.baseAttack = getRandomBetweenRange(1,300);
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
        this.hp = getRandomBetweenRange(1,300);
        this.defense = getRandomBetweenRange(1,300);
        this.agility = getRandomBetweenRange(1,300);
        this.baseAttack = getRandomBetweenRange(1,300);
    }

    private  int getRandomBetweenRange(int min, int max){
        return (int)((Math.random()*((max-min)+1))+min);
    }




}
