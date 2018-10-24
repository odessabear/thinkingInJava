
class Exercise {
    String name;
    int age;


    public Exercise(String nameValue) {
        nameValue = name;
    }

    public Exercise(String name, int age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public static void main(String[] args) {
        Exercise man = new Exercise("John",37);
        System.out.println(man);
    }
}