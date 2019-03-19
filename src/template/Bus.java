package template;

/**
 * Created by mzcsh on 2019/3/19.
 */
public class Bus extends Bubus{

    private  boolean needVehicleFlag =false;

    public Bus(boolean needVehicleFlag){
        this.needVehicleFlag = needVehicleFlag;
    }

    @Override
    void chooseTransportation() {
        System.out.println("坐大巴");
    }

    @Override
    protected boolean needVehicleFlag() {
        return this.needVehicleFlag;
    }
}
