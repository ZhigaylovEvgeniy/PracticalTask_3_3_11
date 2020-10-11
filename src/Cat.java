public class Cat {
    String name;

    Cat(String name) {
        this.name = name;
    }

    public void sayHello(Cat cat) {
        System.out.println(cat.name + ":\tМяу!");
    }
}
