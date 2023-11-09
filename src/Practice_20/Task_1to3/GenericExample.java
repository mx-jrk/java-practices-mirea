package Practice_20.Task_1to3;

import Practice_12.Task_3.Animation;

import java.io.Serializable;

public class GenericExample <T extends Comparable, V extends GenericExample.Animal & Serializable, K>{
    private final T generalizedValue;
    private final V meaning;
    private final K key;

    public GenericExample(T generalizedValue, V meaning, K key) {
        this.generalizedValue = generalizedValue;
        this.meaning = meaning;
        this.key = key;
    }

    public T getGeneralizedValue() {
        return generalizedValue;
    }

    public V getMeaning() {
        return meaning;
    }

    public K getKey() {
        return key;
    }

    public void printClassesNames(){
        System.out.println(generalizedValue.getClass());
        System.out.println(meaning.getClass());
        System.out.println(key.getClass());
    }

    static class Animal {
        private final String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    static class Dog extends Animal{

        public Dog(String name) {
            super(name);
        }
    }

    public static void main(String[] args) {
        Integer i = 3;
        Dog d = new Dog("Bob");
        String s = "Hello";
        GenericExample genericExample = new GenericExample(i, d, s);
        System.out.println(genericExample.getGeneralizedValue());
        System.out.println(genericExample.getMeaning());
        System.out.println(genericExample.getKey());
        genericExample.printClassesNames();
    }
}
