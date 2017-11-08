package cn.codingblock.reference.weakhashmap;

public class Element {
    public String id;
    public Element(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Element && id.equals(((Element)obj).id);
    }

    @Override
    public String toString() {
        return "Element{" +
                "id='" + id + '\'' +
                '}';
    }
}
