package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_after_occupancyShouldBeTrue(){
        //arrange
        Room r= new Room(1, 150);

        //act
        r.checkIn();
        //assert
        assertTrue(r.isOccupied());
    }
    @Test
    public void checkIn_after_dirtyShouldBeTrue(){
        //arrange
        Room r= new Room(1, 150);

        //act
        r.checkIn();
        //assert
        assertTrue(r.isDirty());

    }
    @Test
    public void checkIn_after_availableShouldBeFalse(){
        //arrange
        Room r= new Room(1, 150);

        //act
        r.checkIn();
        //assert
        assertFalse(r.isAvailable());
    }
    @Test
    public void checkOut_after_occupancyShouldBeFalse(){
        //arrange
        Room r= new Room(1, 150);
        r.checkIn();

        //act
        r.checkOut();

        //assert
        assertFalse(r.isOccupied());

    }
    @Test
    public void checkOut_after_dirtyShouldBeTrue(){
        //arrange
        Room r= new Room(1, 150);
        r.checkIn();

        //act
        r.checkOut();

        //assert
        assertTrue(r.isDirty());
    }
    @Test
    public void checkOut_after_availableShouldBeFalse(){
        //arrange
        Room r= new Room(1, 150);
        r.checkIn();
        //act
        r.checkOut();

        //assert
        assertFalse(r.isAvailable());
    }
    @Test
    public void cleanRoom_after_occupancyShouldBeFalse(){
        //arrange
        Room r= new Room(1, 150);
        r.checkIn();
        r.checkOut();
        //act
        r.cleanRoom();

        //assert
        assertFalse(r.isOccupied());
    }
    @Test
    public void cleanRoom_after_dirtyShouldBeFalse(){
        //arrange
        Room r= new Room(1, 150);
        r.checkIn();
        r.checkOut();

        //act
        r.cleanRoom();

        //assert
        assertFalse(r.isDirty());
    }
    @Test
    public void cleanRoom_after_availableShouldBeTrue(){
        //arrange
        Room r= new Room(1, 150);
        r.checkIn();
        r.checkOut();
        //act
        r.cleanRoom();

        //assert
        assertTrue(r.isAvailable());
    }

    @Test
    public void checkIn_when_roomIsOccupied() {
        //arrange
        Room r = new Room(1, 150);
        r.checkIn();

        //act
        r.checkIn();

        //assert
        assertFalse(r.isAvailable());


    }




}