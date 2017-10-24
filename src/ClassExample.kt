/**
 * @author Alexander Kuleshov
 * @version 1.0
 * @since 24.10.2017
 *
 * Here are examples of classes
 */
//kotlin class (value object type of class)
class Person(val name: String)

//java class (equivalent the kotlin class above)
/*
public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
 */