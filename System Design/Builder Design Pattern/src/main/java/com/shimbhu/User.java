package com.shimbhu;

public class User {

    private final String name;
    private int age;
    private String city;
    private String state;

    private User(UserBuilder userBuilder){
        this.name = userBuilder.name;
        this.age = userBuilder.age;
        this.city = userBuilder.city;
        this.state = userBuilder.state;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    static class UserBuilder{
        private final String name;
        private int age;
        private String city;
        private String state;

        public UserBuilder(String name){
            this.name = name;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setCity(String city){
            this.city = city;
            return this;
        }

        public UserBuilder setState(String state){
            this.state = state;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
