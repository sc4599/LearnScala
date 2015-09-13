package com.github.syalr

import scala.collection.mutable.ArrayBuffer

/**
 * Created by SylaySong on 2015/9/11.
 */
object Chapter3 {
  var startTime = 0l;
  var endTime=0l;
  //fixed-length
  //10个整型数组,初始所有都是0
//  val nums=new Array[Int](10)
  //10个元素字符串数组,所有元素初始化都是null
//  val a=new Array[String](10)
  //长度为2的array[String] 类型是推断出来的
  val s=Array("hello","world")

  //变长数组:数组缓冲
  val b=ArrayBuffer[Int]()
  //或者 new ArrayBuffer[Int]
  //一个空的数组缓冲,准备存放整数
  b+=1
  //ArrayBuffer(1)
  //用 +=在尾部追加一个元素
  b+=(1,2,3,5)
  //ArrayBuffer(1,1,2,3,5)
  //在尾部追加多个元素,以括号包起来
  b++=Array(8,13,21)
  //ArrayBuffer(1,1,2,3,5,8,13,21)
  //可以使用 ++= 操作符追加任何集合
  b.trimEnd(5)
  //ArrayBuffer(1,1,2)
  //移除最后5个元素
  //尾部添加或移除是高效的,但是插入的低效的
  b.insert(2,6)
  //ArrayBuffer(1,1,6,2)
  //在下标2之前插入
  b.insert(2,7,8,9)
  //ArrayBuffer(1,1,7,8,9,6,2)
  //可以通过insert(position:Int,ele*)的模式插入多个元素
  b.remove(2,3)
  //ArrayBuffer(1,1,2)
  //第二个参数的含义是要移除多个元素

  b.toArray
  //将变长转为定长,
  b.toBuffer
  //将定长转为变长.

  for(i<- 0 until b.length){
    println(i+":"+b(i))
  }
  // until 是RichInt 类的方法,返回所有小于(但不包括)上限的数字
  // to   返回所有小于等于上限的数字

  0 until (10,2)
  //表示2个元素一跳

  for(elem<-b)
    println(elem)
  //增强版 for循环  for-each  循环打印出数组每个元素

  val a =Array(1,2,3,4)
  val r=for(elem<-a)yield elem*2
  for(elem<-r)print(elem+",")
  println()
  //结果包含tield之后的表达式的值,每次迭代对应一个
  //如果编译一个集合,想处理那些满足特定条件的元素.这个需求可以通过守卫: for中的 if 来实现
  val r2=for(elem<-a if elem%2==0) yield elem*2
  //方法2
  a.filter(_%2==0).map(2*_)
  //或
  a.filter{_%2==0}map{2*_}



  //给定一个数组缓冲,我们想要移除 第一个负数以外的所有负数
  var w=ArrayBuffer(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5,643563456,634,342,43,4,4,44,65,-11,6,6,7,7,78,8,8,84,5,6)
  var first = true
  //方法一===========================================================================
  startTime = System.currentTimeMillis();
  var n=w.length
  var i=0
  while(i<n){
    if(w(i)>=0) i+=1
    else{
      if (first) {first=false;i+=1}
      else{w.remove(i);n-=1}
    }
  }
  endTime=System.currentTimeMillis();
  println("数组排序(方法一耗时"+(endTime-startTime)+"毫秒)="+w.mkString(","))
  //官方建议方法:===========================================================================
  w=ArrayBuffer(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5,643563456,634,342,43,4,4,44,65,-11,6,6,7,7,78,8,8,84,5,6)
  first = true
  startTime = System.currentTimeMillis();
  //首先收集需要保留的下标
  val indexes = for(i<- 0 until w.length if first||w(i)>=0) yield {
    if(w(i)<0 )first=false;
    i
  }
  //然后将元素移动到该去的位置
  for(j<- 0 until indexes.length) w(j)=w(indexes(j))
  //截断尾部元素
  w.trimEnd(w.length-indexes.length)
  endTime=System.currentTimeMillis();
  println("数组排序(官方的耗时"+(endTime-startTime)+"毫秒)="+w.mkString(","))
  //这里的关键点是,拿到所有下标,在通过下标排序数组,将最后的删除尾部(高效)的方式截取数组.
  //方法三 ==========================================================================================
  w=ArrayBuffer(1,2,5,56,3,-54,3,0,87,-5,6,1,2,5,643563456,634,342,43,4,4,44,65,-11,6,6,7,7,78,8,8,84,5,6)
  first = true
  startTime = System.currentTimeMillis();
  val indexes2 = (for(i<- 0 until(w.length);if w(i)<0)yield i).reverse.dropRight(1)
  for(j<-indexes2){
    w.remove(j)
  }
  endTime=System.currentTimeMillis();
  println("数组排序(方法三耗时"+(endTime-startTime)+"毫秒)="+w.mkString(","))



  //求和
  Array(1,7,2,9).sum   //结果是19  对ArrayBuffer同样适用.
  //但是如果使用 sum 方法, 元素类型必须是数值型(整型,浮点,或BigInteger/BigDecimal)

  ArrayBuffer("aaa","bbb","csdfssdfs","wwwww").max
  //获得数组缓冲中字符最多的元素

  val bb = ArrayBuffer(1,7,2,9)
//  val bbsorted = bb.sorted( _ > _ )

  def main(args: Array[String]) {
    println(s(0))
  }
}
