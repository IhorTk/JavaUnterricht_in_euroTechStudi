package day_45_Review_Week11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Room {
    private String name;
    private int windows;

    public Room(String name, int windows) {
        this.name = name;
        this.windows = windows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return windows == room.windows && Objects.equals(name, room.name);
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", windows=" + windows +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, windows);
    }

    public static void main(String[] args) {
        Room room = new Room("Waiting Room", 2);
        Room room1 = new Room("Waiting Room", 2);

        System.out.println("room  =" + room);
        System.out.println("room1  =" + room1);

        System.out.println("room.hashCode()   ="+room.hashCode());
        System.out.println("room1.hashCode()   ="+room1.hashCode());

        System.out.println("room.equals(room1)  ="+ room.equals(room1));

        System.out.println("room.hashCode()==room1.hashCode()  "+ (room.hashCode()==room1.hashCode()));

        List<Room> rooms =new ArrayList<>();
        rooms.add(room);
        rooms.add(room1);

        if(rooms.get(0).equals(rooms.get(1))){
            System.out.println("Равны");
        }else {
            System.out.println("Не равны");
        }

        int[][] a={{2,4,5,6},{7,8,9,0}};
        System.out.println("a[0][3] = " + a[0][3]);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();

        }


    }
}
