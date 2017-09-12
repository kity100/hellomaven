package hellomaven;

import asg.cliche.Command;

public class HelloMavin {
    @Command
    public String hello() {
        return "Hello, World!";
    }
    @Command
    public int add (int a, int b){
        return a+b;
    }
    @Command
    public String wer (String name){
        return "Hello " + name;
    }
}
