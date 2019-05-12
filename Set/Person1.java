package Collections.Set;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-05-11
 * Time:16:09
 */
public class Person1 {
    private Integer age;
    private String name;
    private Integer scord;

    public Person1(Integer age, String name, Integer scord) {
        this.age = age;
        this.name = name;
        this.scord = scord;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getScord() {
        return scord;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScord(Integer scord) {
        this.scord = scord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person1 person1 = (Person1) o;

        if (!age.equals(person1.age)) return false;
        if (!name.equals(person1.name)) return false;
        return scord.equals(person1.scord);
    }

    @Override
    public int hashCode() {
        int result = age.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + scord.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", scord=" + scord +
                '}';
    }
}
