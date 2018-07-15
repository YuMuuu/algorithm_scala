def hanoi(n:Int, from:Char, work:Char, dest:Char):Unit = {
  if(n >= 2) hanoi(n-1, from, dest, work) 
  println(from + "から" + dest + "へ")
  if(n >= 2) hanoi(n-1, work, from, dest)
}
