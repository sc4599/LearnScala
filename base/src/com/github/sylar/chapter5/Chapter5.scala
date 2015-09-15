package com.github.sylar.chapter5

/**
 * Created by SylarSong on 2015/9/14.
 */
object Chapter5 {

  val myCounter = new Counter //或者 new Counter()

  myCounter.increment()
  //或者 myCounter.increment    调用无参方法可以不加括号
  println(myCounter.current)
  //官方建议: 对改值器使用() ,  对取值器不使用()
  //鉴于以上建议:你可以通过
  //class Counter{
  //  def current=value //定义中不带()
  //} 这样一来  类 的使用者就必须使用 myCounter.current, 不带圆括号.


  //Scala 中 getter 和setter 分别叫做 age 和 age_=  例如:
//  val fred = new Person(21)
//  println(fred.age) //调用  fred.age()
//  fred.age = 21 //将调用 fred.age=(21)
//  println(fred.age)

  //调用  fred.age()

  //Scala允许你讲访问权赋予制定的类.  private[类名] 修饰符可以定义仅有指定类的方法可以方位给定的字段.
  //这里的  类名  必须是当前定义的类,[this] 或者是包含该类外部类

  //9输出 0到100所有的偶数
  for(i<- 0 to 100 if (i%2==0))println(i)


  def main(args: Array[String]) {
    val sylar = new Person("Sylar Song")
    println(sylar.firstName+sylar.lastName)
  }
}
