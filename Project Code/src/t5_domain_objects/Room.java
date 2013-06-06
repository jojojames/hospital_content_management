package t5_domain_objects;

import java.util.HashMap;

public class Room {
    public Ward ward;
    private String reasonForNewRoom;
    public int roomNum;
    private int newRoom;

    /**
     *
     * @param reasonForNewRoom
     * @param roomNum
     * @param newRoom
     */
    public Room(String reasonForNewRoom, int roomNum, int newRoom) {
        this.reasonForNewRoom = reasonForNewRoom;
        this.roomNum = roomNum;
        this.newRoom = newRoom;
    }

    public Room(int roomNum){
        this.roomNum = roomNum;
    }
}
