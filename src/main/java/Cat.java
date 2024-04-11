public class Cat {
    private String name;

    // Конструктор с одним параметром
    public Cat(String name) {
        this.name = name;
    }

    public Cat() {

    }

    // Геттер и сеттер для имени
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Метод toString для удобного вывода информации о коте
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

