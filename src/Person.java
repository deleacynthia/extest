public class Person implements Comparable<Person>{
    private String  givenName;
    private String familyName;
    private int age;

    public Person(String givenName, String familyName, int age) {
        this.givenName = givenName;
        this.familyName = familyName;
        this.age = age;
    }

    @Override
    public int compareTo(Person other){
        return this.age - other.age;
    }

    @Override
    public String toString(){
        return familyName + givenName;
    }
}
