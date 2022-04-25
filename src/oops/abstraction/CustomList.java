package oops.abstraction;

public interface CustomList {
    void add(Object obj);

    void delete(Object obj);

    default void search(Object obj){
        System.out.println("Defalut implementation for all child classes");
    }
}
