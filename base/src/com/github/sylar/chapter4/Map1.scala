package com.github.sylar.chapter4

/**
 * Created by SylarSong on 2015/9/13.
 */
object Map1 {
  //不可变map[String:Int]
  val scores= Map("song"->30,"qiu"->23,"xiong"->22)

  //可变 映射
  val scores2=scala.collection.mutable.Map("song"->30,"qiu"->23,"xiong"->22)
  //其中  -> 操作符 表示用来创建对偶

  val songsScores=scores("song")//这样就从 scores中去除了键为"song"的对应值

  val qiusScores = if(scores.contains("qiu"))scores("qiu")else 0 // 这么写保证了如果没有为"qiu"的键 则 会返回0
  //由于以上写法十分普遍,所以就出现了如下的简便写法
  val xiongsScores = scores.getOrElse("xiong",0)

  var scores3= Map("song"->30,"qiu"->23,"xiong"->22)
  scores3=scores3+("song"->31,"pipi"->4)
  //处理更改了原来 "song" 的值  还新增了 "pipi" 这个键值对

  //迭代映射 如下这段简单的循环即可遍历映射中所有的键值对偶
  // for( (k,v)<-映射) 处理K和v
  scores.keySet // 返回一个类似 Set("song","qiu","xiong") 这样的集合

  //得到一个不可变的树形映射 而不是哈希映射的话
  val scores4 = scala.collection.immutable.SortedMap ("song"->30,"qiu"->23,"xiong"->22)


  //元组===========================
  (1,3.14,"sylay") //这就是一个元组 其类型是:
//  (Int,Double,java.lang.String)
  val t=(1,3.14,"sylay")
  //可以使用_1,_2,_3 访问其元组,比如
  val second = t._2 // 即为 3.14

  //通常可以使用模式匹配来获取元组的组元,例如:
  val (first,second2,_)=t
  //这样 first = 1, second2=3.14  ,    _ 表示不需要的部件.

  //元组可以用于函数需要返回不止一个值的情况,例如: StringOps 的 partition方法返回一对字符串,分别是满足条件的和不满足条件的字符

  "Hello World".partition(_.isUpper) //输出 ("HW","ello orld")

  //多个值一起绑定 使用zip
  val symbols = Array("<","-",">")
  val counts =  Array(2,10,2)
  val pairs  =  symbols.zip(counts) // 批量绑定
  //遍历数组
  for((s,n)<-pairs) {print(s*n)}// 打印<<---------->>

  def main(args: Array[String]) {

//    println(pairs.mkString(" "))
  }




}
