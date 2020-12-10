package slr.oneshot;

/**
 *
 * @author Carlos Varela
 */
public class DSY {

    double[] dataY;

    // Constructor for data set Y  obtained from https://www.displayr.com/what-is-linear-regression/

    public DSY(double[] _dataY) {
        this.dataY = _dataY;
    }

    public double[] getDataY() {
        return dataY;
    }

    public void setDataY(double[] dataY) {
        this.dataY = dataY;
    }
}
