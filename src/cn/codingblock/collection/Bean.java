package cn.codingblock.collection;

public class Bean {
    public int id;
    public String info;

    public Bean(int id, String info) {
        this.id = id;
        this.info = info;
    }

    public Bean(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Bean && (id == ((Bean)obj).id);
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "id=" + id +
                ", info='" + info + '\'' +
                '}';
    }
}
