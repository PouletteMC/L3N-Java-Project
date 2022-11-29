package org.example.Buildings;
import org.example.Person.Resident;
import org.example.Person.Person;

import java.util.Arrays;

enum Music {
    ROCK,
    POP,
    JAZZ,
    CLASSIC,
    ELECTRONIC,
    HIPHOP,
    RAP,
    METAL,
    REGGAE,
    BLUES,
    COUNTRY,
    FOLK,
    SOUL,
    DISCO,
    FUNK,
    PUNK,
    INDIE,
    RNB
}

public class Bar extends Buildings {
    private String name;
    private int capacity;
    private int minAge;
    private Music[] musicStyle;
    private Resident[] staff;

    public Bar(String name, int area, String address, int capacity, int minAge, Music[] musicStyle, Resident[] staff) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
        this.musicStyle = musicStyle;
        this.staff = staff;
    }

    public Bar(String name, int area, String address, int capacity, int minAge, Music[] musicStyle, Resident[] staff, Resident resident) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
        this.musicStyle = musicStyle;
        this.staff = staff;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMinAge() {
        return minAge;
    }

    public Music[] getMusicStyle() {
        return musicStyle;
    }

    public Resident[] getStaff() {
        return staff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setMusicStyle(Music[] musicStyle) {
        this.musicStyle = musicStyle;
    }

    public void setStaff(Resident[] staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return name + "has a capacity of " + capacity + " people and is located at " + address + "." + " The minimum age is " + minAge + " and the music style is " + Arrays.toString(musicStyle) + "." + " The staff is comprised of " + Arrays.toString(staff) + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bar bar = (Bar) o;
        return capacity == bar.capacity && minAge == bar.minAge && name.equals(bar.name) && Arrays.equals(musicStyle, bar.musicStyle) && Arrays.equals(staff, bar.staff);
    }

    @Override
    public double getTax() {
        if(capacity >= 100) return rateA * area;
        return rateB * area;
    }

    public void addStaff(Resident resident) {
        Resident[] newStaff = new Resident[staff.length + 1];
        System.arraycopy(staff, 0, newStaff, 0, staff.length);
        newStaff[newStaff.length - 1] = resident;
        staff = newStaff;
    }

    public void removeStaff(Resident resident) {
        Resident[] newStaff = new Resident[staff.length - 1];
        int index = 0;
        for (Resident r : staff) {
            if(r != resident) {
                newStaff[index++] = r;
            }
        }
        staff = newStaff;
    }

    public void addMusicStyle(Music music) {
        Music[] newMusicStyle = new Music[musicStyle.length + 1];
        System.arraycopy(musicStyle, 0, newMusicStyle, 0, musicStyle.length);
        newMusicStyle[newMusicStyle.length - 1] = music;
        musicStyle = newMusicStyle;
    }

    public void removeMusicStyle(Music music) {
        Music[] newMusicStyle = new Music[musicStyle.length - 1];
        int index = 0;
        for (Music m : musicStyle) {
            if(m != music) {
                newMusicStyle[index++] = m;
            }
        }
        musicStyle = newMusicStyle;
    }
}
