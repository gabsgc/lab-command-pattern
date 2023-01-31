package br.com.dio.labcommandpattern.model;

public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void move(String name){
        System.out.printf("The robot %s is moving...\n", name);
    }

    public void turn(){
        System.out.println("The robot turned");
    }

    public void beep(){
        System.out.println("Robot beeping");
    }
}
