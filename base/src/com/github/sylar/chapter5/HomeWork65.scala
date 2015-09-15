package com.github.sylar.chapter5

/**
 * Created by SylarSong on 2015/9/15.
 */
object HomeWork65 {
  //1
  val sylar=new Counter()
  sylar.increment()
  println(sylar.current)

  //2
  class BankAccount(val banlance:Int){ //主构建 传入val banlance:Int 字段私有,但是get方法为公有
    def deposit() ={    }
    def withDraw()={    }
  }
  //3
//  class Time(val hrs:Int,val min:Int){
//    def before(other:Time):Boolean={
//      if(other.hrs>hrs)true
//      else {
//        if(other.hrs==hrs&&other.min>min)true
//        else false
//      }
//    }
//  }
  //4
  class Time(val hrs:Int,val min:Int){
    val mins= hrs*60+min
    def before(other:Time):Boolean={
      if(other.mins>mins)true
      else  false
    }
  }
  //5


  //10
  class Employee {
    val name:String="John Q.Public"
    var salary:Double=0.0
    def this(name:String,salary:Double){
      this()
    }
  }

  def main(args: Array[String]) {
    val time1=new Time(12,22)
    val time2=new Time(10,59)
    val time3=new Time(22,1)
    println(time1.before(time2))
    println(time1.before(time3))

    val macan=new Car("aa","x-5",2005,"云AJ521F")
    print(macan.toString)
  }
}
