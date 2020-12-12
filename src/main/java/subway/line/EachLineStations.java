package subway.line;

import subway.station.Station;

import java.util.ArrayList;
import java.util.List;

public class EachLineStations {
    private List<Station> stations;

    public EachLineStations() {
        this.stations = new ArrayList<>();
    }

    public EachLineStations(List<Station> stations) {
        this.stations = stations;
    }

    public void addStation(Station station) {
        stations.add(station);
    }
}
