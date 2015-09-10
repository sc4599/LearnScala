/**
 * Created by Administrator on 2015/9/10.
 */
object HelloScala {
  def HelloScala: Unit ={
    print("hello Scala")
  }

  def sum(args:Int*): Int ={//变长参数
    var r=0;
    for(arg<-args){
      r+=arg
      println(r)
    }
    //for循环累加得到结果r
    r//方法最后一个表达式就是函数返回值
  }

  def main(args: Array[String]): Unit = {
//    println("hello")
//    val ss=new Test().ppp("song");
//    println(ss)

    val s=sum(3,3,5,3,3,12);
    print(s);
  }
}
