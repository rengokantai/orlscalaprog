//They are same
def g(name:String){
  println(s"$name")
}
def k(name:String)={
  println(s"$name")
}
def l(name:String):Unit={
  println(s"$name")
}
def factorial(i:Int):Int={
  if(i<2)1 else i*factorial(i-1)
}
factorial(5)
