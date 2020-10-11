public class Dog {
    String nickname;//кличка
    String breed;//порода
    String сolor;//окрас
    String feed;//корм(чем питается)
    String description;//описание
    String owner;//хозяин
    double years;//возрост
    String sex;//пол животного

    /**
     * КОНСТРУКТОРЫ
     */
    Dog(String name) {
        nickname = name;
    }

    /**
     * кличка, порода, окрас
     */
    Dog(String nickname, String breed, String color, String sex) {
        this.nickname = nickname;
        this.breed = breed;
        this.сolor = color;
        this.sex = sex;
    }
    /**
     * кличка, порода, окрас, чем питается, описание, хозяин, возрост, пол
     */
    Dog(String nickname, String breed, String color, String feed, String description, String owner, double years, String sex) {
        this.nickname = nickname;
        this.breed = breed;
        this.сolor = color;
        this.feed = feed;
        this.description = description;
        this.owner = owner;
        this.years = years;
        this.sex = sex;
    }


    /**
     * МЕТОДЫ
     */
    public void sayHello() {
        System.out.println("     Гав!");
    }
    /**
     * Метод определяет какая собака поймала какую кошку
     */
    public void catchCat(Cat cat) {
        System.out.print(this.owner + ":\t" + this.nickname + " Фас!!!))\n" + this.nickname + ":\t");
        sayHello();
        System.out.println(this.breed + " " + this.сolor + " " + this.nickname + " " +
                (sex == "сука" ? ("поймала ") : ("поймал ")) + "кошку " + cat.name);
        cat.sayHello(cat);
        System.out.println("");
    }
}

