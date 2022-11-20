public class car {
    private int power;
    private int speed;
    private String name;

    car (){};

    car (int power, int speed, String name ){
        this.power = power;
        this.speed = speed;
        this.name = name;

    }
    void getPower(){
        System.out.println(power);
    }
    void getSpeed(){
        System.out.println(speed);
    }
    void getName(){
        System.out.println(name);
    }
}
