

package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory{

    public static shape create(RegularShapeType type){
            switch (type) {
                case Triangle:
                return new Triangle();

                case Quadrilateral:
                return new Quadrilateral();

                case Pentagon:
                return new Pentagon();

                case Hexagon:
                return new Hexagon();

                default:
                throw new IllegalArgumentException("tipo figura desconocida: " + type);
            }
    }
}