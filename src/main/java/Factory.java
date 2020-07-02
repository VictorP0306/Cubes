import control.Cube333Control;
import control.CubeControl;
import model.Cube333Model;
import model.CubeModel;
import view.Cube333View;
import view.CubeView;

public class Factory {
    public static CubeModel getModel(CubeType cubeType) {
        CubeModel cubeModel = null;
        switch (cubeType) {
            default: {
                cubeModel = (CubeModel) new Cube333Model();
            }
        }
        return cubeModel;
    }
    public static CubeView getView(CubeType cubeType) {
        CubeView cubeView = null;
        switch (cubeType) {
            default: {
                cubeView = (CubeView) new Cube333View();
            }
        }
        return cubeView;
    }
    public static CubeControl getControl(CubeType cubeType) {
        CubeControl cubeControl = null;
        switch (cubeType) {
            default: {
                cubeControl = (CubeControl) new Cube333Control();
            }
        }
        return cubeControl;
    }
}
