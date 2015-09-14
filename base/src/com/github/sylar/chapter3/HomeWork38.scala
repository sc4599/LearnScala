package com.github.sylar.chapter3

import java.awt.datatransfer._

import scala.collection.mutable.ArrayBuffer
/**
 * Created by SylarSong on 2015/9/13.
 */
object HomeWork38 {

  //1
  def createArray(n:Int): Unit ={
    val arr=new Array[Int](n)
    for(i<-0 until arr.length){
      arr(i)=util.Random.nextInt(n)
    }
    println("第一题"+arr.mkString(","))
  }

  //2
  var a=Array(1,2,3,4,5)
  for(i<- 0 until (a.length,2)){
    var c=a(i);
    if(i<a.length-1){
      a(i)=a(i+1)
      a(i+1)=c
    }
  }
  println("第二道题:" + a.mkString(","))


  //3
  a=Array(1,2,3,4,5)
  val b=for(i<- 0 until (a.length))yield {
    var t=a(i)
    if(i%2==0&&i<a.length-2){
      t=a(i+1)
    }
    else if(i<a.length-1){
      t=a(i-1)
    }
    t
  }
  println("第三道题:" + b.mkString(","))

  //4给定一个整数数组，产出一个新的数组，包含元数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列
  def sortMy(arr:Array[Int]): Array[Int] ={
    val arr2=new ArrayBuffer[Int]()
    val arrFu=new ArrayBuffer[Int]()
    for(i<- 0 until(arr.length-1)){
      if(arr(i)>0){
        arr2+=arr(i)
      }else{
        arrFu+=arr(i)
      }
    }
    arr2++=arrFu
    arr2.toArray
  }
  def sortMy2(arr: Array[Int]): Array[Int] = {
    val arrbuffer = new ArrayBuffer[Int]()
    arrbuffer++=(for(i<- arr;if i>0)yield i)
    arrbuffer++=(for(i<- arr;if i<=0)yield i)
    arrbuffer.toArray
  }

  //5  计算 Array[Double] 的平均值
  def arrayAVG(arr:Array[Double]): Unit ={
    println("第五题:"+arr.sum/arr.length)
  }

  //6 :如何重新组织Array[Int]的元素将它们反序排列？对于ArrayBuffer[Int]你又会怎么做呢？
  def reverse(arr:Array[Int]):Unit ={
    println("第6题:"+arr.reverse.mkString(","))
  }
  def reverse(arr:ArrayBuffer[Int]): Unit ={
    println("第6题:"+arr.reverse.mkString(","))
  }

  //8
  var w=ArrayBuffer(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5,643563456,634,342,43,4,4,44,65,-11,6,6,7,7,78,8,8,84,5,6)
  var first = true
  var startTime = System.currentTimeMillis();
  val indexes2 = (for(i<- 0 until(w.length);if w(i)<0)yield i).reverse.dropRight(1)
  for(j<-indexes2){
    w.remove(j)
  }
  var endTime=System.currentTimeMillis();
  println("第8题:(方法三耗时"+(endTime-startTime)+"毫秒)="+w.mkString(","))


  //9
  val timeZone = java.util.TimeZone.getAvailableIDs()
  var aaa=new ArrayBuffer[String]()
  for(i<- timeZone){
    if(i.contains("America/")){
      aaa+=i.drop(8)
    }
  }
  println(timeZone.mkString(",\t"))
  println(aaa.mkString(",\t"))

  val tem =for(i<-timeZone;if i.startsWith("America/"))yield{
    i.drop("America/".length)
  }
  println(tem.mkString(",\t"))
  //10
  val flavors= SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
  val buf= flavors.getNativesForFlavor(DataFlavor.imageFlavor)
  println("第10题:"+buf)

  def main(args: Array[String]) {
    createArray(10)
    val arrTest=Array(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5)
    println("第4题:"+sortMy2(arrTest).mkString(","))
    val arrDouble=Array(1.2,2.4,3.6)
    arrayAVG(arrDouble)
    val arrBufferTest=ArrayBuffer(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5)
    reverse(arrTest)
    reverse(arrBufferTest)

    println("第7题:"+arrTest.distinct.mkString(","))
  }

}
