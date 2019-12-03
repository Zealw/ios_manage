package domain;

public class QueryVO {
    private int startIndex;
    private int size;
    private Commodity commodity;

    public QueryVO(int startIndex, int size, Commodity commodity) {
        this.startIndex = startIndex;
        this.size = size;
        this.commodity = commodity;
    }

    public QueryVO() {
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }
}
