package products;


import javax.persistence.*;

@Entity
@Table(name = "pets", schema = "pets", catalog = "")
public class Pet {
    public Pet(int id, String type, String name, int age) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "type", nullable = true, length = 255)
    private String type;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;

    public Pet(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;

    }

    public Pet() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
