class Gorilla extends Mammal {
    public int throwSomething(){
        energyLevel -= 5;
        System.out.println("Gorilla threw something!: " +energyLevel);
        return energyLevel;
    }

    public  int eatBananas(){
        energyLevel += 10;
        System.out.println("Gorilla ate bananas: " +energyLevel);
        return energyLevel;
    }

    public int climb(){
        energyLevel -= 20;
        System.out.println("Gorilla  climbed a tree!: " +energyLevel);
        return energyLevel;
    }
}