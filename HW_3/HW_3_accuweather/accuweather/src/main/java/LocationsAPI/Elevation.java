package LocationsAPI;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Elevation {
    @JsonProperty("Metric")
    private Metric metric;

    @JsonProperty("Imperial")
    private Imperial imperial;

    public Metric getMetric() {
        return metric;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

    public Imperial getImperial() {
        return imperial;
    }

    public void setImperial(Imperial imperial) {
        this.imperial = imperial;
    }
}
