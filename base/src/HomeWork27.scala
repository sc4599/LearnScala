/**
 * Created by Administrator on 2015/9/10.
 */
object HomeWork27 {
// 1
  def signum(a:Int): Int ={
    if(a>0){
      1
    }else if (a==0){
      0
    }else {
      -1
    }
  }


  //2 一个空的表达式{} 他的值是 (),类型肯定是 Unit=====================================================================
  //3 指出Scala中何种情况下赋值语句x=y=1 是合法的(提示:给x找一个合适的类型定义) ?======================================
  //题目已经给了明确的提示了。本章节中已经说过了，在scala中的赋值语句是Unit类型。所以只要x为Unit类型就可以了
  var y=0
  var x={}
  x=y=7

  //4  10到0 循环打印每个数字=========================================================================================
//  var n=10
//  while(n>=0){
//    println(n)
//    n-=1
//  }
//  for(i<- -10 to 0) println(Math.abs(i))
  // reverse 反向排列序列
//  for(i<- 0 to 10 reverse)println(i)

  //5编写一个过程countdown(n:Int)，打印从n到0的数字 这个就是将上面的循环包装到过程中而已。还是换个写法吧============
//  def countdown(n:Int): Unit ={
//    for(i<- -n to 0) println(Math.abs(i))
//  }
//  def countdown2(n:Int): Unit ={
//    for(i<- 0 to n reverse)println(i)
//  }


  //6编写一个for循环,计算字符串中所有字母的Unicode代码的乘积。举例来说，"Hello"中所有字符串的乘积为9415087488L=========
//  var t:Long=1L
//  for(i<-"Hello"){
//    t=i.toLong*t
//  }
//  println(t)
  //7同样是解决前一个练习的问题，但这次不使用循环。（提示：在Scaladoc中查看StringOps）
//  t=1
//  "Hello".foreach(t*=_.toLong)
  //  print(t)
  //8将上面封装成一个方法
  def product(s:String): Unit ={
    var t:Long=1
    for(i<-s){
      t*=i.toLong
    }
    print(t)
  }
  def product2(s:String): Unit ={
    var t:Long=1
    s.foreach(t*=_.toLong)
    print(t)
  }
  //9 上面的函数改成递归
  var t:Long=1
  def product3(s:String): Long ={
    if(s.length==1)return s.take(1).toLong
    else s.take(1).charAt(0).toLong*product3(s.drop(1))
  }
  //10 编写函数计算xn,其中n是整数，使用如下的递归定义:
  //  xn=y2,如果n是正偶数的话，这里的y=x(n/2)
  //  xn = x*x(n-1),如果n是正奇数的话
  //  x0 = 1
  //   xn = 1/x(-n),如果n是负数的话
 // 不得使用return语句
  def mi(x:Int,n:Int): Double ={
    if(n==0)1
    else if(n>0&& n%2==0) mi(x,n/2)*mi(x,n/2)
    else if(n>0&& n%2==1) x*mi(x,n-1)
    else 1/mi(x,-n)
  }


  def main(args: Array[String]): Unit = {
//    product3("Hello")
//    val s:String="Hello"
//    println(s.take(1).toLong)
    println("hello world")
  }
}
