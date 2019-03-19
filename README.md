模板方法模式的优点：

1.利用模板方法将相同的处理逻辑的代码放到抽象父类中，可提高代码的复用性。

2.通过子类的扩展增加新的行为，提高代码的扩展性。

3.把不变的行为写在父类上，去除子类的重复代码，提供一个很好的代码复用平台，符合开闭原则。

缺点：

1.类的数目增加，每一个抽象类都需要一个子类来实现，这样导致类的个数增加。

2.类的数量增加，间接地增加系统实现的复杂度。

3.继承关系自身缺点，如果父类添加新的抽象方法，所有的子类都要改一遍。


思考：模板模式除了继承以外，还有那些实现方式？

答：接口默认实现，在java8中允许接口中包含带有具体实现的方法，使用default修饰。

interface A{
  default String getName(){
      return "a";
    }
}
