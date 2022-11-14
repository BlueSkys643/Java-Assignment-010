import java.util.concurrent.TimeUnit;

public class Dog {
    public Dog (String Breed, String Size, String Color, int Age) {
        String breed = Breed;
        String size = Size;
        String color = Color;
        int age = Age;

    }
    //instance methods
    public void Eat () { //check to see if their is enough food and if there is we eat it
        if (food > 0) {
            System.out.println("Nom Nom nomnomnomnomnomnomnom");
            food--;
            System.out.printf("There is %d food left\n", food);
        } else {
            System.out.println("There is no food ;-;");
        }
    }
    public void Run () {
        //kinda wanna look into drawing a canvas and moving an image across the canvas
        //can you even make a canvas in intelliJ
        System.out.println("the dog runs");
        //create canvas
        //place dog image on canvas
        //move dog
        //dog.x += 5; or something like that
    }
    public void Sleep () { //dog slep
        System.out.println("ZzzZzzZzz");
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println("ZzzZzzZzz");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void Name () { //ask user to name the dog?
        System.out.println("What would you like to name them? ");
        //use scanner
        //add variable called name to this.dog
    }

    public static int food = 5;
    public static void main(String[] args) {
        //let's let ourselves know how much food we have
        System.out.printf("We have %d food\n", food);
        //create the dogs
        Dog dog1 = new Dog("Shiba Inu", "Small", "Grey", 1);
        Dog dog2 = new Dog("Chihuahua", "Small", "Blonde", 11);
        Dog dog3 = new Dog("German Shepard mixed", "Medium", "Red", 4);

        //now let's do stuff
        dog1.Eat();
        dog2.Eat();
        dog3.Eat();
        dog2.Sleep();
        dog3.Name();
        dog1.Run();
    }
}
