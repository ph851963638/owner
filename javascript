toFixed(3);    保留三位小数
函数： 高内聚 弱耦合  减少重复代码
小头封：  第一个单词小写后面大写

1.命名函数表达式

var test =function abc(){

document.write('a');
}
test();


2.匿名函数表达式
var demo=function (){
document.write('b');
}
demo();



形式参数 ：方法体内的参数    任意值
实际参数 ：方法体外的参数    唯一值
function sum(a,b){
   var c=a+b;
   document.write(c);
  //求实参
  for(var i=0;i<arguments.length;i++){
  console.log(arguments[i]);
  console.log(sum.length); //求形参
  }
  
}

sum(1,3,4, 5,)；
typeof（ ）//中间可以加空格 或者加括号


//预编译文件命令
函数声明整体提升，无论函数在哪里调用，都会提前调用；
变量  声明提升
 1.imply golbal 暗示全局变量： 即任何变量，未经声明就赋值，此变量就为全局对象所有。

 2.一切声明的全局变量，全是window的属性。  
 var a=123;===> window.a=123;
 
 window 就是全局
 var a=123;
 console.log(a);--> console.log(window.a);
 
 
 var  a=123;
 console.log(a);
 window{
 a:123;
 b:
 c:
 }
 
    //预编译发生在函数执行的前一刻

1.创建AO (Active Object)
2.找形参和变量声明，将变量和形参名作为AO属性名，值为undefined
3.将形参值和形参统一
4.在函数体里面找函数声明，值赋予函数体

被提上去的有关声明皆被忽略
AO{
a:123
b:function {}
d:function d{}

}


CSS中 display的属性有几种？

display :block;
display:inline;
display: inline-block;
null;

















