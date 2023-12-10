public class Puppy {
    public Puppy(String name) {
        System.out.println("Puppy constructor");
        System.out.println("Puppy name: " + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("Tommy");
    }
}

Object newPoppy = new Puppy("Tommy");

System.out.println(newPoppy.name);

