package section.streams;

import java.util.Random;

public record SeatTO(char rowMarker, int seatNumber, boolean isReserved) {

    public SeatTO(char rowMarker, int seatNumber) {
        this(rowMarker, seatNumber, new Random().nextBoolean());
    }
}
