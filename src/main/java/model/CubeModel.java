package model;

import view.CubeView;

public interface CubeModel {
    void init(CubeView view);
    void setValue(int x, int y, int z, int value);
    int getValue(int x, int y, int z);
    void move(int side, int modifer);
}
