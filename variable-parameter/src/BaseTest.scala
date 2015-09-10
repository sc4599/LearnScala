/**
 * Created by Administrator on 2015/9/10.
 */
trait BaseTest {
  val oName=this.getClass.getName();
  def getCurrentName(name: String): Unit ={
    oName;
  }
}
