package template;

/**
 * Created by mzcsh on 2019/3/19.
 * 模板有一个或多个为实现方法
 * 而且这几个未实现方法有固定执行顺序
 */
public  abstract class Bubus {

    protected  final void createFare(){
        //1.拿出身份证
        this.takeCard();

        //买票
        this.buytickets();

        //过安检

        this.goThroughSecurity();

        //上车
        this.getOn();

        //找位置
        this.findPosition();
        //坐下
        this.sitDown();




    //选择交通工具
    //有高铁坐高铁，没有就坐汽车
    if(needVehicleFlag()){
        chooseTransportation();
    }
    }
    abstract void chooseTransportation();

    //钩子方法:实现流程的微调
    protected  boolean needVehicleFlag(){
        return  false;
    }

    final void goThroughSecurity(){
        System.out.println("拿出身份证");
    };

    final void buytickets(){
        System.out.println("买票");
    };

    final  void takeCard(){
        System.out.println("过安检");
    };

    final  void getOn(){
        System.out.println("上车");
    };

    final  void findPosition(){
        System.out.println("找位置");
    };
    final  void sitDown(){
        System.out.println("坐下");
    };


}
