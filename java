Java 基本数据类型
Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。
char a = 'S'; char 后面赋值要用单引号，因为是字符型数据类型

数值间的相互转换
byte（8）,short（16）,char（16）—> int（32） —> long（64）—> float（32） —> double（64） boolean(1)
类变量：独立于方法之外的变量，用 static 修饰。
实例变量：独立于方法之外的变量，不过没有 static 修饰。
局部变量：类的方法中的变量。

实例变量
实例变量声明在一个类中，但在方法、构造方法和语句块之外；
当一个对象被实例化之后，每个实例变量的值就跟着确定；
实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
实例变量可以声明在使用前或者使用后；
访问修饰符可以修饰实例变量；
静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。

选择语句  
if  普遍性高,万能
switch  使用局限性强，主要适用给变量做等值的分支判断
循环语句：

   1.while
   2.do-while    同  while    先执行代码  再 判断条件
   3.for   简洁  直观
当对基本数据类型做等值判断时，使用==即可
但当对字符串String类型做等值判断时，需要用equals();

基本数据类型 4类 ：  整数 byte short int long   小数  布尔 boolean  字符 char 
引用数据类型：  
char  必须用单引号  ‘’；

方法=函数
mian方法=main函数
使用方法的好处：  便捷灵活的调用代码
按键精灵  （外挂  可以体验）

方法： 
定义：具名的语句序列
意义：更便捷的执行一段代码
命名：单驼峰写法  
驼峰写法：单词首字母大写

访问修饰符
public  公开
static  静态 因为main是静态的
void    无返回值


定义方法：
public  【static】 【返回值类型】void【方法名】addGoods（）{ 
}  
sc  需要自己的类
编程开发的思路： 我们会经常使用一些已经写好的类使用调用类的diamante，代码被调用，
类写好之后可能被其他的类调用方法；

tips:运算符的优先级和结合性：
在一个方法内声明的变量，另外一个方法是读取不到的

方法的返回值：当方法执行完毕之后，很多时候我们希望把执行结果返回给调用方；返回值有用

方法使用意义： 
方法在实际编码中的具体使用：频繁使用；  代码使用方法中，需要合理使用方法，合理划分方法
内聚性；   
方法的定义语法：
方法参数的理解和使用；
变量：保存数据
*数组： 保存多条数据
  特点   元素 （数据）
         有序
         数组保存多个数据，并且定义之后数据无法更改长度无法更改，一个数组只能保留一组数据；
         数组在下标部分可以使用变量，可以使用表达式 只要是整形 就可以


OOP 面向对象编程   计算机编程架构
类  对象 属性 方法
要点  核心：类 对象
不停编写类以及对象
优点： 1.提升开发效率  降低编程人员负担
       2.开发大型项目不引入OOP架构模式很多功能点不好实现（基础支持）
       类：一系列具有相同特征和行为的对象的集合
       一个文件，可以写属性，可以写方法。
       属性： 变量 在理论层面表示类所具有的特征
       方法：本质就是方法，在理论层面，可以描述类所具有的行为，
       类的作用是用来创建对象的；
       
       语法： 类名 对象名=new  类名（）；
       对象： 对象非常之重要，对于java项目来说所有代码都编写在类文件中，
       类文件自身需要通过创建对象才能发挥作用，编写java项目的过程就是一个不停操作对象的过程
       对象之间 互不干扰；对象具有类中所定义的方法和属性
       包：以后写项目一定要创建包，本质就是一个文件夹
       
       1.先把希望外界赋值的值 进行私有变量操作。
       2.创建一个set方法，帮助外界为该变量赋值，创建一个set方法，
       3.形成规范，每次在类中编写不适合被外界直接访问的属性时，一律按照套路把属性设置为私有的
       this:这个关键字始终表示（调用当前的）当前的对象。
       构造方法：其实每个类都有隐形的默认的无参构造方法，实际上我们每次创建对象的 比如 GOO多少goods = new Goods()
       的一行代码，就是在调用类的构造方法创建对象实例。
       2.语法特点非常鲜明，构
       
       1.顾客出钱，金额减少
       2.商品库存余量会减一个
       
       传参过程中，在方法内修改参数的值
       1.让该参数直接重新赋值。无效
       2.更改该参数的属性的值。有效
       
       
       
       







