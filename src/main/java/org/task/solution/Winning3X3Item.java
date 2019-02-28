package org.task.solution;

enum Winning3X3Item {
    X00(0,0),
    X01(0,1),
    X02(0,2),
    X10(1,0),
    X20(2,0);

    private int positionX;
    private int positionY;

    Winning3X3Item(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}
