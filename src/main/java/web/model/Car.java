package web.model;

public class Car {
    private Long id;
    private String model;
    private int series;

    public Car(Long id, String model, int series) {
        this.id = id;
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID " + getId() + " Model " + getModel() + " Series " + getSeries();
    }

}