package Oct.ex_17112024_polyANDEnc;

public class BoxConstOverloading {
    double x,y,z;
    BoxConstOverloading()
    {
        x=y=z=0;
    }
    BoxConstOverloading(double x1, double y1, double z1)
    {
        x=x1;
        y=y1;
        z=z1;
    }
    double Volume()
    {
        return (x*y*z);
    }
}
