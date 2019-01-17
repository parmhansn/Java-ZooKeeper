class Bat extends Mammal {
    public Bat(){
        this.energyLevel = 300;
        super.displayEnergy();
    }

    public int fly(){
        energyLevel -= 50;
        System.out.println("The sound of a bat taking off! " + energyLevel);
        return energyLevel;
    }

    public int eatHumans(){
        energyLevel += 25;
        System.out.println("The so- well, never mind " + energyLevel);
        return energyLevel;
    }

    public int attackTown(){
        energyLevel -= 100;
        System.out.println("The sound of a town on fire! " + energyLevel);
        return energyLevel;
    }

}