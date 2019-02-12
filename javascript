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


