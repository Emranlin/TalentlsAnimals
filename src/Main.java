import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark("Brighty", 30, "Sharks have a sixth sense"),
                new Shark("Light", 20, "Sharks do not have bones"),
                new Eagle("Papuan", 20, "Their Grip is up to 10 Times Stronger than Humans"),
                new Eagle("Golden ", 30, "Eagles can see up to 3 kilometers away."),
                new Turtle("Donatello", 150, "One sea turtle species nests during the day."),
                new Turtle("Black Widow", 100, "Sea turtles are deep divers and can stay underwater for long periods of time.")
        };
        for (Animal animal : animals) {
            System.out.println(animal);
            if (animal.getClass().equals(Shark.class)) animal.attack();
            if (animal.getClass().equals(Eagle.class)) animal.fly();
            if (animal.getClass().equals(Turtle.class)) animal.swim();
        }
        System.out.println("___________________");

        separateAnimals(animals);

    }
       public static void separateAnimals(Animal[] animals) {
            int sharkCounter = 0;
            int eagleCounter = 0;
            int turtleCounter = 0;
            for (Animal animal : animals) {
                if (animal instanceof Shark) {
                    sharkCounter++;
                } else if (animal instanceof Eagle) {
                    eagleCounter++;
                } else if (animal instanceof Turtle ){
                    turtleCounter++;
                }
            }

            Animal[] sharks = new Animal[sharkCounter];
            Animal[] eagles = new Animal[eagleCounter];
            Animal[] turtle = new Animal[turtleCounter];

            for (int i = 0; i < animals.length; i++) {
                for (int s = 0; s < sharks.length; s++) {
                    if (animals[i] instanceof Shark) sharks[s] = animals[i];

                    for (int e = 0; e < eagles.length; e++) {
                        if (animals[i] instanceof Eagle) eagles[e] = animals[i];

                        for (int t = 0; t < turtle.length; t++) {
                            if (animals[i] instanceof Turtle) turtle[t] = animals[i];
                        }
                    }
                }

            }

           System.out.println("sharks = " + Arrays.toString(sharks));
           System.out.println("eagles = " + Arrays.toString(eagles));
           System.out.println("turtle = " + Arrays.toString(turtle));

       }




            }









