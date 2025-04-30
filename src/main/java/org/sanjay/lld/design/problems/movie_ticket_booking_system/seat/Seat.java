package org.sanjay.lld.design.problems.movie_ticket_booking_system.seat;

public class Seat {
    private final String id;
    private final int row;
    private final int column;
    private final SeatType seatType;
    private final double price;
    private SeatStatus status;

    public Seat(String id, int row, int column, SeatType type, double price, SeatStatus status) {
        this.id = id;
        this.row = row;
        this.column = column;
        seatType = type;
        this.price = price;
        this.status = status;
    }
    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public double getPrice() {
        return price;
    }

    public SeatStatus getStatus() {
        return status;
    }
}
