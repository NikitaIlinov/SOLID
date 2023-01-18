package Products;

public interface Rateable {
    //I- принцип сегрегации (разделения) интерфейса(Interface Segregation Principle)
    void addRating(int rating);
    int getRating();
}
