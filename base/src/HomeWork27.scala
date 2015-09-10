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


  //2 一个空的表达式{} 他的值是 (),类型肯定是 Unit
  //3 指出Scala中何种情况下赋值语句x=y=1 是合法的(提示:给x找一个合适的类型定义) ?

  //4  10到0 循环打印每个数字
//  var n=10
//  while(n>=0){
//    println(n)
//    n-=1
//  }
//  for(i<- -10 to 0) println(Math.abs(i))

  //5
  def countdown(n:Int): Unit ={
    for(i<- -n to 0) println(Math.abs(i))
  }

  //6

  //10
  var x=3
//  def mee(n:Int,var x): Int ={
//    val y=if(n%2==0&&n>0){
//      mee(n+2)
//    }
//    x
//
//  }
  def main(args: Array[String]): Unit = {
    countdown(11)


  }
}
