package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    private ArrayList<Shape> shapesList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesList.contains(shape)){
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }
    public Shape getFigure(int n){
        return shapesList.get(n);
    }
    public void showFigures(){
        System.out.println("A list of shapes:");
        for (Shape shape : shapesList){
            System.out.println(shape);
        }
    }

    public ArrayList<Shape> getShapesList() {
        return shapesList;
    }
}
