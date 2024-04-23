package models;

public class StudentEagerSingletonFactory{
    private static StudentEagerSingletonFactory instance = new StudentEagerSingletonFactory();
    public static StudentEagerSingletonFactory getInstance(){
        return instance;
    }

    public Student getObject(String csv){
        return new Student(csv);     
    }

}
