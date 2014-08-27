
//debug this, go to debug view and try to stop at once more then one thread...
object Main extends App {
  val threads = (1 to 4).map(_ => new ThreadJob())
  threads.foreach(_.start())
  threads.head.join()
}

class ThreadJob extends Thread{
  override def run(): Unit = {
    while(true){
      println("Working: " + getName())
      Thread.sleep(1000)
    }
  }
}