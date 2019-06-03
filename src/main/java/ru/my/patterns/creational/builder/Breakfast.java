package ru.my.patterns.creational.builder;

class Breakfast {

    private String drink;
    private int eggs;
    private String girlName;
    private boolean needBread;
    private boolean needMilk;

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
