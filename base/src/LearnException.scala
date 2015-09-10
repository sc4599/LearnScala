import java.net.URL

/**
 * Created by Administrator on 2015/9/10.
 */
object LearnException {

  var in = new URL("http://www.bzw.cn/").openStream()
  def main(args: Array[String]) {
    println(in.read())
  }
}
