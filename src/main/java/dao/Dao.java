package dao;

public interface Dao<T> {
    void save (T t);
    void printAll();
}
