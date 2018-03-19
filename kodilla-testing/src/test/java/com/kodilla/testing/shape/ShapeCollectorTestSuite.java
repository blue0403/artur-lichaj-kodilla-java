package com.kodilla.testing.shape;

import org.junit.*;

//Test suite for classes of shape
public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle();
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(1, shapeCollector.getShapesList().size());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Square square = new Square();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);
        //When
        boolean result = shapeCollector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(true, shapeCollector.getShapesList().isEmpty());
    }
    @Test
    public void testGetFigure(){
        //Given
        Triangle triangle = new Triangle();
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(triangle);
        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, retrievedShape);
    }
}
