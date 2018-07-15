def fib(n:Int): Int = {
  @annotation.tailrec
  def loop(n: Int, a: Int, b: Int): Int =
    if(n == 0) a
    else loop(n - 1, b, a + b)
  loop(n, 0, 1)
}
