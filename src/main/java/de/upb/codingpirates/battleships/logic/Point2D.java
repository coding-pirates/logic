package de.upb.codingpirates.battleships.logic;

public class Point2D {
    private int X;
    private int Y;
    private boolean isHit;
    private Ship ship;

    public Point2D(int x, int y) {
        X = x;
        Y = y;
        isHit=false;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setIshit(boolean ishit) {
        this.isHit = ishit;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Point2D north(){
        Point2D upperPoint = new Point2D(this.getX(), this.getY()+1);
        return upperPoint;
    }

    public Point2D west(){
        Point2D leftPoint = new Point2D(this.getX()-1, this.getY());
        return leftPoint;
    }

    public Point2D south(){
        Point2D lowerPoint = new Point2D(this.getX(), this.getY()-1);
        return lowerPoint;
    }

    public Point2D east(){
        Point2D rightPoint = new Point2D(this.getX()+1, this.getY());
        return rightPoint;
    }


    public boolean isHit() {
        return isHit;
    }

    public void hit(){
        ship.hitShip(this);
    }
}
