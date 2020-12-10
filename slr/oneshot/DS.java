package slr.oneshot;

/**
 *
 * @author Carlos Varela
 */
public class DS {

    double[] dataX;

    // Constructor for data set X  obtained from https://www.displayr.com/what-is-linear-regression/
    public DS(double[] _dataX) {
        this.dataX = _dataX;
    }

    public double[] getDataX() {
        return dataX;
    }

    public void setDataX(double[] dataX) {
        this.dataX = dataX;
    }
}
