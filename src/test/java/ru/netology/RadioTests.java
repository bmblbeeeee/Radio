package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTests {

    @Test
    public void setStationNormal() {
        Radio station = new Radio();
        station.setStation(8);

        int expected = 8;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationAbove9() {
        Radio station = new Radio();
        station.setStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationBelow0() {
        Radio station = new Radio();
        station.setStation(-1);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation9() {
        Radio station = new Radio();
        station.setStation(9);

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStation0() {
        Radio station = new Radio();
        station.setStation(0);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNormal() {
        Radio station = new Radio();
        station.setStation(5);
        station.nextStation();

        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationBigger() {
        Radio station = new Radio();
        station.setStation(9);
        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationLess() {
        Radio station = new Radio();
        station.setStation(0);
        station.nextStation();

        int expected = 1;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationNormal() {
        Radio station = new Radio();
        station.setStation(5);
        station.prevStation();

        int expected = 4;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLess0() {
        Radio station = new Radio();
        station.setStation(0);
        station.prevStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationBig() {
        Radio station = new Radio();
        station.setStation(9);
        station.prevStation();

        int expected = 8;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setVolume(75);

        int expected = 75;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAbove() {
        Radio volume = new Radio();
        volume.setVolume(101);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelow() {
        Radio volume = new Radio();
        volume.setVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume100() {
        Radio volume = new Radio();
        volume.setVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume0() {
        Radio volume = new Radio();
        volume.setVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume99() {
        Radio volume = new Radio();
        volume.setVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume1() {
        Radio volume = new Radio();
        volume.setVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio volume = new Radio();
        volume.setVolume(75);
        volume.increaseVolume();

        int expected = 76;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume99() {
        Radio volume = new Radio();
        volume.setVolume(99);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume0() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume100() {
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume101() {
        Radio volume = new Radio();
        volume.setVolume(101);
        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeNormal() {
        Radio volume = new Radio();
        volume.setVolume(75);
        volume.decreaseVolume();

        int expected = 74;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume100() {
        Radio volume = new Radio();
        volume.setVolume(100);
        volume.decreaseVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolume() {
        Radio volume = new Radio();
        volume.setVolume(0);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotDecreaseVolumeMinus() {
        Radio volume = new Radio();
        volume.setVolume(-1);
        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
