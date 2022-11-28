package org.example.Residence.Hotel;
import org.example.Person.Owner;
import org.example.Person.Tourist;

public class Room extends Hotel{
    private int initialDate;
    private int finalDate;
    private Tourist tourist;

    public Room(int initialDate, int finalDate){
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }
}
