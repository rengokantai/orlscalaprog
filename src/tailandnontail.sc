//non-tail, causes stackoverflow

def estimate(n:Int):Double={
  def helper(n:Int):Double={
    if(n<1)0else{
      val x = math.random
      val y = math.random
      (if(x*x+y*y<1) 1 else 0)+helper(n-1)
    }
  }
  helper(n)/n*4
}
estimate(1000)


//tail-recursive
def estimate1(n:Int):Double={
  def helper(n:Int, sum:Int):Double={
    if(n<1) sum else{
      val x = math.random
      val y = math.random
      helper(n-1,(if(x*x+y*y<1) 1 else 0))
    }
  }
  helper(n,0)/n*4
}
estimate1(1000)