package geekbrains.Java.level1;

import java.util.Random;

public class Animal {
    private String Name;
    private int minRun;
    private int maxRun;
    private int minSwim;
    private int maxSwim;
    private double minHeight;
    private double maxHeight;
    private double runningLength;
    private double swimmingLength;
    private double jumpHeight;
    Random rand = new Random();

    public Animal(String _Name, int _minRun, int _maxRun, int _minSwim, int _maxSwim, double _minHeight, double _maxHeight) {
        this.Name = _Name;
        this.minRun = _minRun;
        this.maxRun = _maxRun;
        this.minSwim = _minSwim;
        this.maxSwim = _maxSwim;
        this.minHeight = _minHeight;
        this.maxHeight = _maxHeight;
        runningLength = getRunningLenght();
        swimmingLength = getSwimmingLength();
        jumpHeight = getJumpHeight();
    }

    public void getInfoPet () {
        System.out.println (Name + ": ");
    }

    public int getRunningLenght () {
        int difference = maxRun - minRun;
        int res = rand.nextInt(difference + 1) + minRun;
        return res;
    }

    public int getSwimmingLength () {
        int difference = maxSwim - minSwim;
        int res = rand.nextInt(difference + 1) + minSwim;
        return res;
    }

    public double getJumpHeight () {
        double res = Math.random() * (maxHeight - minHeight) + minHeight;
        return res;
    }

    public boolean run (int distance) {
       if (distance <= runningLength) {
           System.out.print ("run:" + true);
           System.out.print (" ");
           return true;
       } else {
           return false;
       }
    }

    public boolean jump (float distance) {
        if (distance <= jumpHeight) {
            System.out.print ("jump:" + true);
            System.out.print (" ");
            return true;
        } else {
            return false;
        }
    }

    public boolean swim (int distance) {
        if (distance <= swimmingLength) {
            System.out.print ("swim:" + true);
            return true;
        } else {
            return false;
        }
    }

}


