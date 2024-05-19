package section.abstraction.interface_classes.challenge01;

enum Geometry { LINE, POINT, POLYGON };
enum Color { BLACK, BLUE, GREEN, ORANGE, RED };
enum PointMarker { CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE }
enum LineMarker { DASHED, DOTTED, SOLID}

public interface Mappable {

    String JSON_PROPERTY = """
           "properties": {%s}
            """;

    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON() {
        return """
                "type": "%s", "label": "%s", "marker": "%s" """
                .formatted(getShape(), getLabel(), getMarker());
    }

    /**
     * Formatea primero el String estatico JSON_PROPERTY por la cadena obtenida del metodo toJSON.
     *
     * @param mappable
     */
    static void mapIt(Mappable mappable) {
        System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
    }
}
