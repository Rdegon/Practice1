package com.mycompany.practice1;


public class Person {
    private String name;
    private int age;
    
    public Person(String name){
        this.name=name;
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
        if(age<0 || age>150){
            this.age=18;
        }else{
            this.age=age;
            
        }
    }
    
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }    

   public void doSleep(int hours){
       System.out.println("Person sleep " + hours + " hours");
//       System.out.println(name + " " + age);
   }
   public void doEat(String[] foods){
       
   }
}
