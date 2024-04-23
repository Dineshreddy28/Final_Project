package models;

public class ClassroomEagerSingletonFactory{
    private ClassroomEagerSingletonFactory(){

    }
    private static ClassroomEagerSingletonFactory instance = new ClassroomEagerSingletonFactory();
    public static ClassroomEagerSingletonFactory getInstance(){
        return instance;
    }

    public Classroom getObject(int cid,int low,int high, int size, int number){
        return new Classroom(cid,low,high,size,number);
    }

}
