def hanoi(n:Int, from:Char='A', work:Char='A', dest:Char='C'):Unit = {
  if(n>=1){
    hanoi(n-1, from, dest, work) 
    println(from + "から" + dest + "へ")
    hanoi(n-1, work, from, dest)
  }
}
