package ro.siit.homework10.exercitiuTest;

public class Sqare extends Shape{
    double perimetre, surface;
    double a, b;
    void calculate(){
        perimetre = 2*(a+b);
        surface = a*b;
    }
}
