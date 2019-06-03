package ru.my.patterns.creational.builder;

public class Breakfast {

    public String drink;
    public int eggs;
    public String girlName;
    public boolean needBread;
    public boolean needMilk;

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getEggs() {
        return eggs;
    }

    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public String getGirlName() {
        return girlName;
    }

    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    public boolean isNeedBread() {
        return needBread;
    }

    public void setNeedBread(boolean needBread) {
        this.needBread = needBread;
    }

    public boolean isNeedMilk() {
        return needMilk;
    }

    public void setNeedMilk(boolean needMilk) {
        this.needMilk = needMilk;
    }

    @Override
    public String toString() {
        return "Breakfast{" +
                "drink='" + drink + '\'' +
                ", eggs=" + eggs +
                ", girlName='" + girlName + '\'' +
                ", needBread=" + needBread +
                ", needMilk=" + needMilk +
                '}';
    }
}
